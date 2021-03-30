import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> phoneBook = new HashMap<>();
    private List<String> phoneNumbers;

    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            phoneNumbers = phoneBook.get(surname);
            phoneNumbers.add(phoneNumber);
            phoneBook.put(surname, phoneNumbers);
        } else {
            phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(surname, phoneNumbers);
        }
    }

    public void get(String surname) {
        System.out.println(surname + " " + phoneBook.get(surname));
    }
}