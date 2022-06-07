package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Администратор\\IdeaProjects\\dz1\\src\\exam", "01.txt");
        try (Scanner sc = new Scanner(file)) {
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            int solution = 0;
            for (char c : ch) {
                if (c == '(') {
                    solution++;
                } else {
                    solution--;
                }
            }
            System.out.println(solution);

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
