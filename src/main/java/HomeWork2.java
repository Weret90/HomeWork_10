public class HomeWork2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Orlov", "41543");
        phoneBook.add("Ivanov", "78906");
        phoneBook.add("Ivanov", "56789");
        phoneBook.add("Petrov", "45678");
        phoneBook.add("Orlov", "22222");
        phoneBook.add("Krasnova", "98765");

        phoneBook.get("Krasnova");
        phoneBook.get("Ivanov");
        phoneBook.get("Petrov");
    }
}