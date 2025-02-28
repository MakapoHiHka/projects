//Лабораторная работа №5
import java.util.Scanner;
class chet{
    double a;
    double b;
    double c;

    chet(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        //return (this.a* this.b / this.c);
    }
    double Podchet1(){
        return this.a * 3 + 5;
    }
    double Podchet2(){
        return (this.a + this.b)/(this.a - this.b);
    }
    double Podchet3(){
        return (this.a* this.b / this.c);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите a:");
        double a = in.nextDouble();
        System.out.println("ВВедите b:");
        double b = in.nextDouble();
        System.out.println("ВВедите c:");
        double c = in.nextDouble();
        chet o1 = new chet(a, b, c);
        chet o2 = new chet(b, c, a);
        chet o3 = new chet(c, a, b);
        System.out.println(o1.Podchet1());
        System.out.println(o2.Podchet2());
        System.out.println(o3.Podchet3());

    }
}