import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    List<State> stateList = new ArrayList<>();
    List<Character> alphabet = new ArrayList<>();
    final State start = new State();
    List<State> end = new ArrayList<>();
    HashMap<Pair<State, Character>, State> adjMap = new HashMap<>();

    static Flexer scanner = null;

    public static boolean hasE() {
        return scanner.sol.end.stream().anyMatch(p -> p.equals(scanner.sol.start));
    }

    public class Visitor {
        private Map<State, Boolean> visited;
        // invert edges and mark states visited
        private Map<State, Boolean> visitedInverted;
        private Map<State, List<State>> adjList;
        private Map<State, List<State>> adjListInverted;
        private Set<State> ans;
        private Solution sol;

        Visitor() {
            ans = new HashSet<>();
            visited = new HashMap<>();
            visitedInverted = new HashMap<>();
            adjList = new HashMap<>();
            adjListInverted = new HashMap<>();
            sol = scanner.sol;
            makeAdjList();
        }

        void makeAdjList() {
            for (HashMap.Entry<Pair<State, Character>, State> entry
                    : sol.adjMap.entrySet()) {
                State key = entry.getKey().first;
                if (adjList.containsKey(key)== false) {
                    adjList.put(key, new ArrayList<>());
                }
                adjList.get(key).add(entry.getValue());
            }

            // make inverted adj List aka m->b becomes b -> m
            for (HashMap.Entry<State, List<State>> entry
                    : adjList.entrySet()) {
                entry.getValue().forEach(
                        e -> {
                            if (!adjListInverted.containsKey((State) e)) {
                                adjListInverted.put(e, new ArrayList<>());
                            }
                            adjListInverted.get(e).add(entry.getKey());
                        }
                );
            }
        }

        ArrayList<State> getUtils() {
            visited.clear();
            ans.clear();
            DFS(sol.start);
            sol.end.forEach(e -> {
                DFSInverted(e);
            });
            return visited.entrySet().stream()
                    .map(e -> e.getKey()).filter(e -> visitedInverted.containsKey(e)).collect(Collectors.toCollection(ArrayList::new));
        }

        ArrayList<State> getAccessibleStates() {
            ans.clear();
            visited.clear();
            DFS(sol.start);
            return visited.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toCollection(ArrayList::new));
        }

        boolean isVoid() {
            ans.clear();
            visited.clear();
            DFS(sol.start);
            return !end.stream().anyMatch(e -> visited.containsKey((State)e));
        }

        /*
        * Tests if dfs starting from a node gets back to itself. - loop- not infinite
        *  To reduce number of fields visitedInverted will represent recStack.
         */
        boolean isFinite() {
            ans.clear();
            ArrayList<State> utils = getUtils();
            visited.clear();
            visitedInverted.clear();
            return !DFSLoop(sol.start, utils);
        }

        void DFS(State state) {
            visited.put(state, true);
            if (adjList.containsKey(state)) {
                for (State neigh : adjList.get(state)) {
                    if (!visited.getOrDefault(neigh, false)) {
                        DFS(neigh);
                    }
                }
            }
        }

        void DFSInverted(State state) {
            visitedInverted.put(state, true);
            if (adjListInverted.containsKey(state)) {
                for (State neigh : adjListInverted.get(state)) {
                    if (!visitedInverted.getOrDefault(neigh, false)) {
                        DFSInverted(neigh);
                    }
                }
            }
        }

        boolean DFSLoop(State state, ArrayList<State> utils) {
            /* Mark the current node as visited and
             part of recursion stack*/
            if (visitedInverted.getOrDefault(state, false) == true && utils.contains(state) == true)
                return true;

            if (visited.getOrDefault(state, false) == true)
                return false;

            visited.put(state, true);
            visitedInverted.put(state, true);

            if (adjList.containsKey(state)) {
                for (State neigh : adjList.get(state)) {
                    if (DFSLoop(neigh, utils)) {
                        return true;
                    }
                }
            }

            visitedInverted.put(state, false);

            return false;
        }
    }


    public static void print() {
        System.out.println(scanner.sol.adjMap);
    }

    /*
    * The program is made to answer just a question, not all at one run.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Argument error");
            System.exit(1);
        }
        int mode = -1;
        if (args[0].equals("-e")) {
            mode = 1;
        } else if (args[0].equals("-a")) {
            mode = 2;
        } else if (args[0].equals("-u")) {
            mode = 3;
        } else if (args[0].equals("-v")) {
            mode = 4;
        } else if (args[0].equals("-f")) {
            mode = 5;
        } else {
            System.err.println("Argument error");
            System.exit(1);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("dfa"));
            scanner = new Flexer(br);
            scanner.yylex();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Visitor visitor = scanner.sol.new Visitor();

        switch (mode) {
            case 1:
                System.out.println((hasE() ? "Yes\n" : "No\n"));
                break;
            case 2:
                visitor.getAccessibleStates().stream().sorted().forEach(System.out::println);
                break;
            case 3:
                visitor.getUtils().stream().sorted().forEach(System.out::println);
                break;
            case 4:
                System.out.println((visitor.isVoid() ? "Yes\n" : "No\n"));
                break;
            case 5:
                System.out.println((visitor.isFinite() ? "Yes\n" : "No\n"));
                break;
            default:
                System.err.println("Argument error");
                System.exit(1);
        }

    }
}
