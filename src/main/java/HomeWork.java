import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Grape");
        arrayList.add("Apple");
        arrayList.add("Pineapple");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Grape");
        arrayList.add("Watermelon");
        arrayList.add("Cherry");
        arrayList.add("Grape");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add("Kiwi");
        arrayList.add("Peach");
        arrayList.add("Apple");
        arrayList.add("Mango");
        System.out.println(arrayList);

        getInfoAboutWords(arrayList);
    }


    public static void getInfoAboutWords(ArrayList<String> arrayList) {

        Set<String> set = new LinkedHashSet<>(arrayList);
        System.out.println("Список уникальных слов (без дубликатов): " + set);

        ArrayList<String> uniqueWords = new ArrayList<>(set);
        for (int i = 0; i < uniqueWords.size(); i++) {
            int count = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                if(uniqueWords.get(i).equals(arrayList.get(j))) {
                    count += 1;
                }
            }
            System.out.println("Слово " + uniqueWords.get(i) + " встретилось " + count + " раз");
        }
    }
}