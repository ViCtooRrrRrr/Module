package Task_1;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {

        System.out.println("Введите оценку по Английскому");
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        System.out.println("Введите оценку по Математике");
        Scanner scan2 = new Scanner(System.in);
        Integer number2 = scan.nextInt();
        Integer midle = number+number2;
        midle= midle/=2;
        System.out.println("Средняя оценка"+" "+ midle);



    }




    }
