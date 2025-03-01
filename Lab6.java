//лабораторная работа №6
import java.util.Scanner;
class Reader{
    String FIO;
    int Number;
    int facult;
    String birth;
    String Phone;
    Reader(String FIO, int Number, int facult, String birth, String Phone){
        this.FIO = FIO;
        this.Number = Number;
        this.facult = facult;
        this.birth = birth;
        this.Phone = Phone;
    }

    void takeBook(int Kol){
        if (Kol >= 10 && Kol <= 19 || Kol % 10 >= 5) {
            System.out.println(this.FIO + " взял " + Kol + " книг");
        }
        else if(Kol % 10 == 1){
            System.out.println(this.FIO + " взял " + Kol + " книгу");
        }
        else if (Kol % 10 >= 2 && Kol % 10 <= 4 ) {
            System.out.println(this.FIO + " взял " + Kol + " книги");
        }
    }
    void takeBook(String... Books){
        System.out.println(this.FIO + "взял книги:" + String.join(", " , Books));

    }
    void returnBook(int Kol){
        if (Kol >= 10 && Kol <= 19 || Kol % 10 >= 5) {
            System.out.println(this.FIO + " вернул " + Kol + " книг");
        }
        else if(Kol % 10 == 1){
            System.out.println(this.FIO + " вернул " + Kol + " книгу");
        }
        else if (Kol % 10 >= 2 && Kol % 10 <= 4 ) {
            System.out.println(this.FIO + " вернул " + Kol + " книги");
        }
    }
    void returnBook(String... Books){
        System.out.println(this.FIO + "вернул книги:" + String.join(", " , Books));

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int kol;
        Reader reader0 = new Reader("Иванов Д.Д.",1,4, "22.06.1994", "+71112221212");
        Reader reader1 = new Reader("Глазков А.А.",2,4, "24.12.1996", "+72221112121");
        Reader reader2 = new Reader("Гармаш М.К.",3,4, "07.03.1993", "+73331113131");
        Reader reader3 = new Reader("Щербина В.В.",4,4, "02.09.1993", "+77775552929");
        Reader reader4 = new Reader("Малофеев К.К.",5,4, "04.10.1995", "+78880003434");
        Reader[] list = {reader0, reader1, reader2, reader3, reader4};

        System.out.println("Введите номер билета того, кто взял количество книг");
        num = in.nextInt();
        for(int i = 0; i < list.length;i++){
            if(num == list[i].Number){
                System.out.println("Сколько книг было взято?");
                kol = in.nextInt();
                list[i].takeBook(kol);
                String[] Books = new String[kol];
                for(int j =0; j<kol;j++){
                    System.out.println("Какая книга была взята?");
                    Books[j] = in.next();
                }
                list[i].takeBook(Books);
                break;
            }
        }


        System.out.println("Введите номер билета того, кто вернул количество книг");
        num = in.nextInt();
        for(int i = 0; i < list.length;i++){
            if(num == list[i].Number){
                System.out.println("Сколько книг вернули?");
                kol = in.nextInt();
                list[i].returnBook(kol);
                String[] Books = new String[kol];
                for(int j =0; j<kol;j++){
                    System.out.println("Какую книгу вернули??");
                    Books[j] = in.next();
                }
                list[i].returnBook(Books);
                break;
            }
        }

    }
}