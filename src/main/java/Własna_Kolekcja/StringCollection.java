package Własna_Kolekcja;

public class StringCollection {
    private Element collectionHead;

    //Konstruktor - pierwsza linia jest pusta
    public StringCollection() {
        this.collectionHead = null;
    }

    //Metoda getElement
    public String getElement(int n){
        Element firstElement = collectionHead;     //Zaczynamy do początku listy
        int index = 0;                             //Definujemy licznik pozycji

        while (firstElement != null) {             //Dopóki nie dojdziemy do końca listy
            if (index == n) {                      //Jeżeli aktualny index == i
                return firstElement.getValue();    //Zwraca wartość elementu
            }
            firstElement = firstElement.getNext(); //Przechodzi do następnego elementu
            index++;                               //Zwiększająć index o 1
        }
        return null;                               //Jeżeli nie znajdzie elementu zwróci null
    }

    //Metoda addElement
    public void addElement(String s){
        Element firstElement = new Element(s);          //Tworzymy nowy wagonik w liście z wartością s

        if (collectionHead == null) {                   //Jeżeli lista jest pusta
            collectionHead = firstElement;              //To ustawiamy pierwszy element jako głowę
        }else {
            Element nextElement = collectionHead;       //Jeżeli nie to przechodzimy na koniec listy

            //Dołączamy element na końcu listy
            while (nextElement.getNext() != null) {     //Dopóki koniec listy nie jest pusty
                nextElement = nextElement.getNext();
            }
            nextElement.setNext(firstElement);          //Dopinamy ostatni element wskazujący jako nowy element
            firstElement.setPrev(nextElement);          //A nowy element wskazujemy jako poprzedni element
        }
    }

    public boolean removeElement(String s){
        Element firstElement = collectionHead;

        while (firstElement != null) {                                          //Przechodzimy po wszytskich elementach
            if (firstElement.getValue().equals(s)) {                            //Znaleziony element o wartości s

                //1 przypadek: usuwamy głowe listy
                if (firstElement.getPrev() != null) {                           //Jeżeli nie ma nic przed pierwszym elementem
                    collectionHead = firstElement.getNext();                    //Przesuwamy głowe na następny element
                    if (collectionHead != null) {                               //Jeżeli nowa głowa nie jest pusta
                        collectionHead.setPrev(null);                           //To ustawiamy poprzedni element jako null, aby nie miała poprzednika
                    }
                } else {
                    //2 przypadek: usuwamy element ze środka lub końca
                    firstElement.getPrev().setNext(firstElement.getNext());     //Ustawiamy poprzedni element o getNext()
                    if (firstElement.getNext() != null) {                       //Jeśli to nie był ostatni element
                        firstElement.getNext().setPrev(firstElement.getPrev()); //To ustawia ten element jako poprzedni
                    }
                }
                return true;                                                    //Zwraca true i usuwa
            }
            firstElement = firstElement.getNext();                              //Przechodzi do nastepnego elementu
        }
        return false;                                                           //Zwraca false jeżeli nie znaleziono elementu o wartości s
    }

}
