public class Main {
    public static void main(String[] args) {
        Contact.contacts.add(new Contact("Nigel", "12345678"));
        Contact.contacts.add(new Contact("Nigel", "1234568"));
        Contact.contacts.add(new Contact("Nig", "12378"));
        Contact.contacts.add(new Contact("Nel", "12678"));
        Contact.contacts.add(new Contact("igel", "12578"));
        System.out.println("Welcome to my contact manager:....");
        System.out.println("You have " + Contact.contacts.size() + " contacts in your list..");
    }
}
