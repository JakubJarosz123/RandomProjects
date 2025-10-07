package MY_OWN_COLLECTION;

public class Main {
    public static void main(String[] args) {
        StringCollection collection = new StringCollection();

        collection.addElement("Kuba");
        collection.addElement("ma");
        collection.addElement("psa");

        System.out.println(collection.getElement(0));
        System.out.println(collection.getElement(1));
        System.out.println(collection.getElement(2));

        collection.removeElement(collection.getElement(1));
        System.out.println("\n");

        System.out.println(collection.getElement(0));
        System.out.println(collection.getElement(1));
    }
}
