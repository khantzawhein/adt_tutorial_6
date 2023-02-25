import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        LinkedList<CovidVaccine> linkedList = new LinkedList<CovidVaccine>();

        linkedList.insert(new CovidVaccine("1", "Mg", "Mg", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("2", "Mg", "Aung", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("3", "Mg", "Myint", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("4", "Joy", "Ful", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("5", "Awgyi", "Nar Buu", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("6", "Win Naing", "Kyaw", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("7", "Kyaw", "Gyi", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("8", "Naw", "Awgyi", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("9", "Khant Zaw", "Hein", new String[] {"a", "a"}));
        linkedList.insert(new CovidVaccine("10", "Bon", "Hope", new String[] {"a", "a"}));

        linkedList.traversal();

        Random random = new Random();
        int firstRandom = random.nextInt(10);
        int secondRandom = random.nextInt(10);

        System.out.println("\nAfter randomly deleting index: " + firstRandom + " and " + secondRandom);
        linkedList.delete(firstRandom);
        linkedList.delete(secondRandom);

        linkedList.traversal();

        System.out.println("\nDeleting all...");

        linkedList.deleteAll();

        System.out.println();

        linkedList.traversal();

    }
}
