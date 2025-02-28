//Лабораторная работа №7
import java.util.Scanner;
class Auto{
    String FIO;
    String Number_Bus;
    int Number_Way;
    String Marka;
    int Year;
    double Probeg;
    Auto(String FIO,String Number_Bus,int Number_Way,String Marka,int Year,double Probeg){
        this.FIO = FIO;
        this.Number_Bus = Number_Bus;
        this.Number_Way = Number_Way;
        this.Marka = Marka;
        this.Year = Year;
        this.Probeg = Probeg;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Auto A1 = new Auto("Петров А.С.", "ф113во", 39, "Lambibini", 1990, 3000);
        Auto A2 = new Auto("Скворцов И.Ю", "ж163лн", 41, "Икарбус ИК-201", 2005, 1100);
        Auto A3 = new Auto("Синичкина Л.С.", "с913лш", 41, "Икарбус ИК-201", 2006, 950.8);
        Auto A4 = new Auto("Ласточкин Р.А.", "з673хо", 21, "МАЗ-105", 2007, 811.7);
        Auto A5 = new Auto("Джамшут А.Л.", "д169аа", 33, "МАЗ-105", 2002, 2500.9);
        Auto[] Penza = {A1, A2, A3, A4, A5};

        System.out.println("Введите номер маршрута: ");
        int Num = in.nextInt();
        for(int i = 0; i<Penza.length; i++){
            if(Num == Penza[i].Number_Way){
                System.out.println("Автобус " + Penza[i].Number_Bus + " марки " + Penza[i].Marka);
            }
        }

        System.out.println("Введите пробег: ");
        double Way = in.nextDouble();
        for(int i = 0; i<Penza.length; i++){
            if(Way < Penza[i].Probeg){
                System.out.println("Автобус " + Penza[i].Number_Bus + " марки " + Penza[i].Marka);
            }
        }
    }
}
