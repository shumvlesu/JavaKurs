public class Array1 {
    public static void main (String args[]){

        int[] numbers = new int[5];

        for (int i=0; i<numbers.length; i++){
            numbers[i]=i*10;
            System.out.println("numbers = " + numbers[i]);
        }

        //Второй способ инициализации массива
        int[] numbers1 = {1,2,3};
        System.out.println();
        System.out.println("Второй массив");
        for (int i=0; i<numbers1.length; i++){
            System.out.println("numbers = " + numbers1[i]);
        }

    }

}
