import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] argc){

    }
    public static int[] fromTxtToTab() throws Exception {
        int[] tab = new int[200];
        Scanner scanner = new Scanner(new File("C:\\Users\\Spinarak\\Desktop\\dane\\60\\liczby.txt"));
        for (int i = 0; i < 200; i++) {
                tab[i] = scanner.nextInt();
            }
        return tab;
    }
    public static int howManyLess(int[] tab){
        int[] lastLessThan = new int[2];
        int licznik = 0;
        int j = 0;
        for(int i = 200; i>0; i--){
            if(tab[i]<1000){
                licznik += 1;
                if(j<2) {
                    lastLessThan[j] = tab[i];
                    j++;
                }
            }
        }
        System.out.print(lastLessThan[1] + " " + lastLessThan[0]);
        return licznik;
    }
    public static void howManyDividers(int[] tab) {
        for (int j = 0; j < 200; j++) {
            int sumOfDividers = 0;
            for (int i = 1; i <= tab[j]; i++) {
                if (tab[j] % i == 0)
                    sumOfDividers += 1;
            }
            if (sumOfDividers == 18) {
                System.out.println(tab[j]);
                for (int i = 1; i <= tab[j]; i++) {
                    if (tab[j] % i == 0)
                        System.out.println(i);
                }
            }
        }
    }
    public static int nwd(int x, int y)
    {
        if (x < y)
            return nwd(y,x);
        if (y == 0)
            return x;
        return nwd(y,x%y);
    }
    public static int biggestPrime(int[] tab){
        int biggest = 0;
        for(int i=0; i<200; i++){
            boolean isCoprime = true;
            for(int j=0; j<200; j++) {
                if (i != j && nwd(tab[i], tab[j]) > 1) {
                    isCoprime = false;
                    break;
                }
            }
            if(tab[i] > biggest && isCoprime == true)
                biggest = tab[i];
        }
        return biggest;
    }
}//testy jednostkowe
