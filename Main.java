import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int dlina = in.nextInt();
        int[][] Massiv = new int[dlina][dlina];
        for (int i =0; i<dlina;i++){
            for (int j =0; j<dlina;j++){
                Massiv[i][j] = rand.nextInt(100);
            }
        }
        int [][] Massiv_1 = Massiv;
        System.out.println("Изначальный массив:");
        vivod(Massiv);
        insertionSort(Massiv_1);
        combSort(Massiv);
        System.out.println("Измененный массив сортировкой вставками:");
        vivod(Massiv_1);
        System.out.println("Измененный массив сортировкой расческой:");
        vivod(Massiv);


    }
    //сортировка вставкой
    public static void insertionSort(int[][] SortArr){
        int j;
        for (int i =0; i < SortArr.length;i++){
            int temp = SortArr[i][i];
            for (j =  i; j >0 && temp < SortArr[j-1][j-1]; j--){
                SortArr[j][j] = SortArr[j-1][j-1];
            }
            SortArr[j][j] = temp;
        }
    }

    public static void vivod(int[][] Arr){
        for (int i =0; i<Arr.length;i++){
            for (int j =0; j<Arr.length;j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    //расческа
    public static void combSort(int[][] values){
        double factor = 1.247;
        int step = values.length - 1;
        while(step >= 1){
            for (int i = 0; i + step < values.length; i++){
                if (values[i][i]> values[i + step][i + step]){
                    swap(values, i, i+step);
                }
            }
            step /= factor;
        }
    }
    static void swap(int[][] SortArr, int i, int j){
        int swap = SortArr[i][i];
        SortArr[i][i] = SortArr[j][j];
        SortArr[j][j] = swap;
    }
}


//Написать программу, сортирующую методом вставок главную диагональ двумерного массива целых чисел.