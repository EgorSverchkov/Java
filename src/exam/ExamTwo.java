package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExamTwo {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Администратор\\IdeaProjects\\dz1\\src\\exam", "02.txt");
        int solution = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                List<Integer> sides = new ArrayList<>();

                String st = sc.nextLine();
                String[] nums = st.split("x");
                for (String s : nums) {
                    sides.add(Integer.parseInt(s));
                }

                int l = sides.get(0);
                int w = sides.get(1);
                int h = sides.get(2);
                int corobka = 2*l*w+2*w*h+2*h*l;

                Collections.sort(sides);
                int f = sides.get(0);
                int s = sides.get(1);
                int glob = corobka + f * s;
                solution = solution + glob;
                //2*l*w+2*w*h+2*h*l
            }
            System.out.println(solution);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
