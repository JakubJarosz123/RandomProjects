package MY_OWN_COLLECTION;

public class Element {
    private String value;
    private Element next;
    private Element prev;

    //Konstruktor
    public Element(String value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    //Getter dla value
    public String getValue() {
        return value;
    }
    //Setter dla next
    public void setNext(Element next) {
        this.next = next;
    }

    //Getter dla next
    public Element getNext() {
        return next;
    }

    //Setter dla prev
    public void setPrev(Element prev) {
        this.prev = prev;
    }

    //Getter dla prev
    public Element getPrev() {
        return prev;
    }
}
