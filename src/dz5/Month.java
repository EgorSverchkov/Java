package dz5;

public class Month {
    public static void month(int i){
        switch (i){
            case (1) :
                System.out.println("Январь: 31 день в этом месяце");
                break;
            case (2) :
                System.out.println("Февраль: 28 дней в этом месяце ");
                break;
            case (3) :
                System.out.println("Март: 31 дней в этом месяце ");
                break;
            case (4) :
                System.out.println("Апрель: 30 дней в этом месяце ");
                break;
            case (5) :
                System.out.println("Май: 31 дней в этом месяце ");
                break;
            case (6) :
                System.out.println("Июнь: 30 дней в этом месяце ");
                break;
            case (7) :
                System.out.println("Июль: 31 дней в этом месяце ");
                break;
            case (8) :
                System.out.println("Август: 31 дней в этом месяце ");
                break;
            case (9) :
                System.out.println("Сентябрь: 30 дней в этом месяце ");
                break;
            case (10) :
                System.out.println("Октябрь: 31 дней в этом месяце ");
                break;
            case (11) :
                System.out.println("Ноябрь: 30 дней в этом месяце ");
                break;
            case (12) :
                System.out.println("Декабрь: 31 дней в этом месяце ");
                break;
            default :
                System.out.println("Введите номер месяца от 1 до  12");
                break;
        }
    }
}


class MonthTest{
    public static void main(String[] args) {
        Month m1 = new Month();
        Month.month(3);
    }
}
