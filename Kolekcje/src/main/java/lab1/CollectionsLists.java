package lab1;

import java.util.*;

class CollectionLists {
    List<Book> MovieArrayList = new ArrayList<>();
    List<Book> MovieLinkedList = new LinkedList<>();

    Set<Book> MovieHashSet = new HashSet<>();
    Set<Book> MovieTreeSet = new TreeSet<>(new Tree_SetComparator());

    Map<Integer, Book> MovieHashMap = new HashMap();
    Map<Integer, Book> MovieTreeMap = new TreeMap<>();

    static class Tree_SetComparator implements Comparator<Book>
    {
        @Override
        public int compare(Book p1, Book p2)
        {
            return 0;
        }
    }
}