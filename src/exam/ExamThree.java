package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ExamThree {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Администратор\\IdeaProjects\\dz1\\src\\exam","03.txt");
        try (Scanner sc = new Scanner(file)) {
            SantaPosition sp = new SantaPosition();
            List<SantaPosition> positionHouse = new ArrayList<>();
            String map = sc.nextLine();
            //String map = "^^<<v<<v><v^^<><>^^<v<v^>";

            positionHouse.add(sp);
            char[] mapChar = map.toCharArray();
            int house = 1;
            for(char c : mapChar){
                if(c == '>'){
                 SantaPosition newSantaPos  = new SantaPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                 newSantaPos.right();
                 if(!positionHouse.contains(newSantaPos)){
                     house = house + 1;
                     positionHouse.add(newSantaPos);
                 } else {
                     positionHouse.add(newSantaPos);
                 }
                }

                if(c == '<'){
                    SantaPosition newSantaPos  = new SantaPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                    newSantaPos.left();
                    if(!positionHouse.contains(newSantaPos)){
                        house = house + 1;
                        positionHouse.add(newSantaPos);
                    } else {
                        positionHouse.add(newSantaPos);
                    }
                }

                if(c == '^'){
                    SantaPosition newSantaPos  = new SantaPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                    newSantaPos.up();
                    if(!positionHouse.contains(newSantaPos)){
                        house = house + 1;
                        positionHouse.add(newSantaPos);
                    } else {
                        positionHouse.add(newSantaPos);
                    }
                }

                if(c == 'v'){
                    SantaPosition newSantaPos  = new SantaPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                    newSantaPos.down();
                    if(!positionHouse.contains(newSantaPos)){
                        house = house + 1;
                        positionHouse.add(newSantaPos);
                    } else {
                        positionHouse.add(newSantaPos);
                    }
                }
            }
            System.out.println(house);
            System.out.println("");
            System.out.println(positionHouse);



        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}


class SantaPosition{
    public SantaPosition(){
        this.x = 0;
        this.y = 0;
    }
    public SantaPosition(int x,int y){
        this.x = x;
        this.y = y;
    }
    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void left(){
       x = x - 1;
    }

    public void right(){
        x = x + 1;
    }

    public void up(){
       y = y + 1;
    }

    public void down(){
        y = y - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SantaPosition that = (SantaPosition) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "SantaPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}




