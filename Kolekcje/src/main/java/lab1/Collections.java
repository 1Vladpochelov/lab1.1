package lab1;


import java.util.*;

public class Collections {
    private static String Start =
            """
                      1.Wszystkie dane
                      2.Usuń
                      3.Konieć programu
                            """;
    private final String collectionChoice = """
    1. ArrayList
    2. LinkedList
    3. HashSet
    4. TreeSet
    5. HashMap
    6. TreeMap
    """;
    final List<Book> BookArrayList = new ArrayList<>();
    final List<Book> BookLinkedList = new LinkedList<>();

    final Set<Book> BookHashSet = new HashSet<>();
    final Set<Book> BookTreeSet = new TreeSet<>(new CollectionLists.Tree_SetComparator());

    final Map<Integer, Book> BookHashMap = new HashMap();
    final Map<Integer, Book> BookTreeMap = new TreeMap<>();

    public void RunProgram() {
        Book();
        int choice;

        Scanner s = new Scanner(System.in);

        do
        {
            System.out.println(Start);
            choice = s.nextInt();

            switch (choice)
            {
                case 1:
                    show();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }

    CollectionLists c = new CollectionLists();

    private void Book() {


        Book firstBook = new Book("The Hunger Games", "Suzanne Collins", 2008 );

        BookArrayList.add(firstBook);
        BookLinkedList.add(firstBook);
        BookHashSet.add(firstBook);
        BookTreeSet.add(firstBook);
        BookHashMap.put(1, firstBook);
        BookTreeMap.put(1, firstBook);

        Book secondBook = new Book("Divergent", "Veronica Roth", 2011);

        BookArrayList.add(secondBook);
        BookLinkedList.add(secondBook);
        BookHashSet.add(secondBook);
        BookTreeSet.add(secondBook);
        BookHashMap.put(2, secondBook);
        BookTreeMap.put(2, secondBook);


        Book thirdBook = new Book("Clockwork Angel", "Cassandra Clare", 2010);

        BookArrayList.add(thirdBook);
        BookLinkedList.add(thirdBook);
        BookHashSet.add(thirdBook);
        BookTreeSet.add(thirdBook);
        BookHashMap.put(3, thirdBook);
        BookTreeMap.put(3, thirdBook);

        Book fourthBook = new Book("Harry Potter and the Sorcerer’s Stone", "J.K. Rowling", 1997);

        BookArrayList.add(fourthBook);
        BookLinkedList.add(fourthBook);
        BookHashSet.add(fourthBook);
        BookTreeSet.add(fourthBook);
        BookHashMap.put(4, fourthBook);
        BookTreeMap.put(4, fourthBook);


        Book fifthBook = new Book("The Hunger Games", "R.J. Palacio", 2012);

        BookArrayList.add(fifthBook);
        BookLinkedList.add(fifthBook);
        BookHashSet.add(fifthBook);
        BookTreeSet.add(fifthBook);
        BookHashMap.put(5, fifthBook);
        BookTreeMap.put(5, fifthBook);
    }

    private void show() {
        Scanner s = new Scanner(System.in);
        String title = String.format("|%10s%10s%4s", "Bookname", "Author", "Release Date");
        String odd = "|\n|";
        System.out.println(collectionChoice);

        int choice = s.nextInt();

        switch (choice) {

            case 1:

                System.out.println(title);
                System.out.println(odd);

                for (var book : BookArrayList) {
                    String output = String.format("|%10s %10s %5d", book.getBookName(), book.getAuthor(), book.getReleaseDate());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 2:

                System.out.println(title);
                System.out.println(odd);

                for (var book : BookLinkedList) {
                    String output = String.format("|%10s %10s %5d", book.getBookName(), book.getAuthor(), book.getReleaseDate());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 3:

                System.out.println(title);
                System.out.println(odd);

                for (var book : BookHashSet) {
                    String output = String.format("|%10s %10s %5d", book.getBookName(), book.getAuthor(), book.getReleaseDate());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 4:

                System.out.println(title);
                System.out.println(odd);

                for (var book : BookTreeSet) {
                    String output = String.format("|%10s %10s %5d", book.getBookName(), book.getAuthor(), book.getReleaseDate());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 5:

                System.out.println(title);
                System.out.println(odd);

                for (int i = 1; i <= BookHashMap.size(); i++) {
                    String output = String.format("|%10s %10s %5d", BookHashMap.get(i).getBookName(), BookHashMap.get(i).getAuthor(), BookHashMap.get(i).getReleaseDate());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 6:

                System.out.println(title);
                System.out.println(odd);

                for (int i = 1; i <= BookTreeMap.size(); i++) {
                    String output = String.format("|%10s %10s %5d", BookHashMap.get(i).getBookName(), BookHashMap.get(i).getAuthor(), BookHashMap.get(i).getReleaseDate());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;
        }
    }

    private void remove() {
        Random rand = new Random();

        System.out.println(collectionChoice);

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        int collectionChoice = 0;

        switch (choice) {
            case 1:

                if (BookArrayList.size() > 0) {
                    collectionChoice = rand.nextInt(BookArrayList.size());
                    BookArrayList.remove(collectionChoice);
                } else
                    System.out.println("Error");

                break;

            case 2:

                if (BookLinkedList.size() > 0) {
                    collectionChoice = rand.nextInt(BookLinkedList.size());
                    BookLinkedList.remove(collectionChoice);
                } else
                    System.out.println("Error");

                break;

            case 3:

                if (BookHashSet.size() > 0) {
                    collectionChoice = rand.nextInt(BookHashSet.size());

                    Iterator<Book> iterHashSet = BookHashSet.iterator();

                    for (int i = 0; i < BookHashSet.size(); ) {
                        while (iterHashSet.hasNext()) {
                            Book next = iterHashSet.next();

                            if (i == collectionChoice) {
                                iterHashSet.remove();
                            }
                            i++;
                        }
                    }
                } else
                    System.out.println("Error");

                break;

            case 4:
                if (BookTreeSet.size() > 0) {
                    collectionChoice = rand.nextInt(BookTreeSet.size());

                    Iterator<Book> iterTreeSet = BookTreeSet.iterator();

                    for (int i = 0; i < BookTreeSet.size(); ) {
                        while (iterTreeSet.hasNext()) {

                            Book next = iterTreeSet.next();

                            if (i == collectionChoice) {
                                iterTreeSet.remove();
                            }

                            i++;
                        }
                    }
                } else
                    System.out.println("Error");

                break;

            case 5:

                if (BookHashMap.size() > 0) {
                    collectionChoice = rand.nextInt(BookHashMap.size());
                    BookHashMap.remove(collectionChoice);
                } else
                    System.out.println("Error");

                break;

            case 6:
                if (BookTreeMap.size() > 0) {
                    collectionChoice = rand.nextInt(BookTreeMap.size());
                    BookTreeMap.remove(collectionChoice);
                } else
                    System.out.println("Error");

                break;

        }
    }







}




