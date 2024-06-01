import java.util.*;

public class ListSetMap {
    public static void main(String[] args) {
        //All three are sub-classes in Java's collections interface.

        /* LIST
        - Index-based, able to add and remove.
        - Allow dupes, null.
        - Preserve insertion order.
        - Subtypes of this supertype: ArrayList, Vector, LinkedList.
        - Traversed by ListIterator.
         */

        //Declaring a List.
        List<String> smList = new ArrayList<>(); //or ArrayList<String> smList = new ArrayList<>();

        /*
        Polymorphism is exhibited here:
        List<String> smList provides a much more flexible implementation of List, in that

        List<String> smList = new ArrayList<>();
        List<String> smList = new Vector<>();
        List<String> smList = new LinkedList<>();

        are all valid.
         */

        for (String g : Arrays.asList("TVXQ", "Super Junior", "Girls' Generation", "SHINee", "EXO", "Red Velvet", "NCT", "æspa", "RIIZE")) {
            smList.add(g);
        }
        System.out.println(smList);

        /* SET
        - Able to add and remove.
        - Don't allow dupes.
        - Allow only one null.
        - Unordered.
        - Subtypes of this supertype: HashSet, LinkedHashSet, TreeSet.
        - Traversed by Iterator.
         */

        //Declaring a Set.
        Set<String> smSet = new HashSet<>();
        smSet.add("TVXQ");
        for (String g : Arrays.asList("TVXQ", "TVXQ", "Super Junior", "Girls' Generation", "SHINee", "EXO", "Red Velvet", "NCT", "æspa", "RIIZE")) {
            smSet.add(g);
        }
        System.out.println(smSet);

        /* MAP
        - Key - Value pairs.
        - Don't allow Key dupes.
        - Allow Value dupes, null.
        - Unordered.
        - Subtypes of this supertype: HashMap, HashTable, TreeMap, ConcurrentHashMap, LinkedHashMap.
        - Traversed by .entrySet(), .keySet(), .values().
         */

        Map<String, Integer> smMap = new HashMap<>();
        smMap.put("TVXQ", 0);
        smMap.put("TVXQ", 1); //override
        smMap.put("Super Junior", 2);
        smMap.put("Girls Generation", 3);
        smMap.put("SHINee", 4);
        smMap.put("EXO", 5);
        smMap.put("Red Velvet", 6);
        smMap.put("NCT", 7);
        smMap.put("æspa", 8);
        smMap.put("RIIZE", 9);
        System.out.println(smMap);
    }
}
