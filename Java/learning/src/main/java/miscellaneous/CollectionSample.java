package miscellaneous;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class CollectionSample {

    public static void main(String[] args) {
        System.out.println("This is a sample class for demonstrating collections in Java.");

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
        LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>();
        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
        DelayQueue<Delayed> delayQueue = new DelayQueue<>();
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentLinkedDeque<String> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        ConcurrentSkipListMap<String, String> concurrentSkipListMap = new ConcurrentSkipListMap<>();
        ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();


        Collections.binarySearch(arrayList, "key");

    }
}
