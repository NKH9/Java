import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.cert.CollectionCertStoreParameters;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String file = "C:\\Users\\User\\IdeaProjects\\HW05_NikaKhorbaladze\\src\\list.txt";
        ArrayList<Integer> list = new ArrayList<>();


        Scanner scn = null ;
        try {
            scn = new Scanner(new FileReader(file));
            while (scn.hasNextLine()) {
                String ln = scn.nextLine();
                int numb = Integer.parseInt(ln);
                list.add(numb);
            }
            System.out.println(list);
            Collections.sort(list);
            System.out.println("Sorted list by ascending: " + list);
            Collections.reverse(list);
            System.out.println("Reversed list: " + list);
            Collections.shuffle(list);
            System.out.println("Shuffled list: " + list);
            Set<Integer> newList = new LinkedHashSet<>(list);
            list.clear();
            list.addAll(newList);
            System.out.println("After Duplicates removed: " + list);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found ");
            e.printStackTrace();
        } finally {
            scn.close();
        }
    }
}