public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Contact contact1 = new Contact("Joday","jodya@cscc.edu");
        Contact contact2 = new Contact("Dow","dow@cscc.edu");
        Contact contact3 = new Contact("Randy","randy@cscc.edu");
        ContactCollection contacts = new ContactCollection();

        contacts.addContact(contact1);
        contacts.addContact(contact2);
        contacts.addContact(contact3);

        for(Contact contact : contacts){
            System.out.println(contact);
        }

    }
}