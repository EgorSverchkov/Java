package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExamFive {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Администратор\\IdeaProjects\\dz1\\src\\exam", "05.txt");
        try (Scanner sc = new Scanner(file)) {
            String original = sc.nextLine();
            char[] originalChar = original.toCharArray();

            List<Character> originalList = new ArrayList<>();

            for(char s : originalChar){
                originalList.add(s);
            }

            int counter = 0;
            while(counter < 50000) {
                for (int i = 0; i < originalList.size() - 1; i++) {
                    if (originalList.get(i).toString().equalsIgnoreCase(originalList.get(i + 1).toString())) {
                        if (originalList.get(i) != originalList.get(i + 1)) {
                            originalList.remove(i + 1);
                            originalList.remove(i);
                            counter++;
                        }
                    }
                }
                System.out.println(originalList.size());
            }
            System.out.println(originalList);
            System.out.println(counter);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
