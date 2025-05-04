import java.util.*;

public class PlanoOperadora {
    public static void main(String[] args) {
        // Array
        int[] array = { 1, 2, 3 };
        System.out.println("Array:");
        for (int i : array)
            System.out.print(i + " ");
        System.out.println("\n");

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C#");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("LinkedList: " + linkedList);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack (topo): " + stack.peek());

        // Queue (LinkedList)
        Queue<String> queue = new LinkedList<>();
        queue.offer("Maria");
        queue.offer("João");
        queue.offer("Ana");
        System.out.println("Queue (frente): " + queue.peek());

        // PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(3);
        System.out.println("PriorityQueue (menor valor): " + priorityQueue.peek());

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Maçã");
        hashSet.add("Banana");
        hashSet.add("Maçã"); // duplicado
        System.out.println("HashSet (sem ordem, sem duplicatas): " + hashSet);

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Maçã");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Abacaxi");
        System.out.println("LinkedHashSet (ordem de inserção): " + linkedHashSet);

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Gato");
        treeSet.add("Cachorro");
        System.out.println("TreeSet (ordenado): " + treeSet);

        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Um", 1);
        hashMap.put("Dois", 2);
        hashMap.put("Três", 3);
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Primeiro", 100);
        linkedHashMap.put("Segundo", 200);
        System.out.println("LinkedHashMap (ordem de inserção): " + linkedHashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        System.out.println("TreeMap (ordenado por chave): " + treeMap);
    }
}
