import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, end, sum = 0;
        System.out.println("ВВедите x, х должен быть больше -1 и меньше либо равен 1");
        x = in.nextDouble();
        while((x<=-1)||(x>1)) {
            System.out.println("X больше -1 и меньше либо равен 1");
            x = in.nextDouble();
        }
        System.out.println("Введите конечный предел подсчета(влияет на точность измерений)");
        end = in.nextDouble();
        while (end <=0 ){
            System.out.println("Переменная должна быть больше 0");
            end = in.nextDouble();
        }


        for(double n = 0; n <= end;n++) {
            sum += (Math.pow(-1, n) * Math.pow(x, n+1)) / (n+1);

        }
        System.out.println("Ответ: " + sum);
    }
}