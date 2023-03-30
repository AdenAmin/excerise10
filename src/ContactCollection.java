import java.util.ArrayList;
import java.util.Iterator;

public class ContactCollection implements Iterable<Contact> {
    private ArrayList<Contact> contacts;

    public ContactCollection() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public Iterator<Contact> iterator() {
        return contacts.iterator();
    }
}
