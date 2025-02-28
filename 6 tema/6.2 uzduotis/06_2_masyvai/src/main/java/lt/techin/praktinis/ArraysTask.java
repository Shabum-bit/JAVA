package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int firstElementMark = getFirstElement(arr);
        System.out.printf("First element mark: %d\n", firstElementMark);

        int lastElementMark = getLastElement(arr);
        System.out.printf("Last element mark: %d\n", lastElementMark);

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

        int maxMark = getMax(arr);
        System.out.printf("Max mark: %d\n", maxMark);

        int sumMark = getSum(arr);
        System.out.printf("Sum mark: %d\n", sumMark);

        int averageMark = getAverage(arr);
        System.out.printf("Average mark: %d\n", averageMark);

        int elementsMark = countElements(arr, 3);
        System.out.printf("Elements mark: %d\n", elementsMark);

        boolean containsMark = contains(arr, 5);
        System.out.println("Contains mark: " + containsMark);

        int lastIndexMark = lastIndexOf(arr, 1);
        System.out.println("Last index mark: " + lastIndexMark);


    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO

        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[5];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int min =arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
        sum += arr[i];
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static int getAverage(int[] arr) {
        //TODO
        double sum = 0;
        for (int i = 0 ; i < arr.length; i++){
            sum += arr[i];

        }
        return (int)sum / arr.length;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > n){
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;

            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        for (int i = arr.length -1; i >= 0; i--){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }






}
