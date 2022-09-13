import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){

        int[] numbers = new int[] {54, 7, -41, 2, 4, 2, 89, 33, -5, 12};
        for (int i = 0; i < numbers.length; i++) //Инициализация массива
        {
        for (int j = 0; j < numbers.length - 1; j++) //Внутренний цикл который сравнивает до предыдущего элемента
        {
            if(numbers[j] > numbers[j + 1]) //Сравнение первой ячейки массива со следующей
            {
                int tmp = numbers[j];           // Перенос массива во временну переменную
                numbers[j] = numbers[j + 1];    //Пример как перелить стакан воды и стакан молока
                numbers[j + 1] = tmp;           //Для этого необходим 3 временный стакан (tmp)
            }
        }
        }
        System.out.print(Arrays.toString(numbers)); //Вывод массива после цикла
    }
}
