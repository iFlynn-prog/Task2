public class Task2 {
    public static void main(String[] args){

        int[] numbers = new int[] {54, 7, -41, 2, 4, 2, 89, 33, -5, 12};
        for (int i = numbers.length - 1; i > 0; i--)
        {
        for (int j = 0; j < 1; j++)
        {
            if(numbers[i] > numbers[j + 1])
            {
                int tmp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j] = tmp;
            }

        }
            System.out.print(numbers[i]);
        }

    }
}
