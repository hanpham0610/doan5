package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
       /* for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
         // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/

        long timeStart = System.currentTimeMillis();
        StringBuffer primeNumber = new StringBuffer();
        for (int i = 0; i<19000000 ; i++){
            if (isSNT(i)){
                if(primeNumber.length()>0){
                    primeNumber.append(",");
                }
                primeNumber.append(i);
            }
        }
        System.out.println("snt "+ primeNumber);
        long timeEnd = System.currentTimeMillis();
        long totalTime = (timeEnd - timeStart);
        double  convertTime = totalTime/1000.0;
        System.out.println("tong time : "+ convertTime +"s");
    }
     private static boolean isSNT(int num){
        if (num<=1){
            return false;
        }
        for (int j = 2; j<Math.sqrt(num); j++){
            if (num % j == 0){
                return false;
            }
        }
        return true;
     }
}