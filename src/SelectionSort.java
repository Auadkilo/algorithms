// Тема урока: Сортировка выбором. Сложность О(n^2)

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 7, 4, 8, 1, 2, 5, 9, 6, 10};
        selectionSort(array);

        // Вывод массива
        for(int elem : array) {
            System.out.print(elem + "   ");
        }
    }

    // Обмен элементов массива
    private static void swap(int[] array, int a, int b) {
        int swap = array[a];
        array[a] = array[b];
        array[b] = swap;
    }

    // Сортировка выбором
    private static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            // Находим индекс минимального элемента массива
            for(int j = i + 1; j < array.length; j++) {  // отсортированные элементы уже не трогаем
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);  // обмен элементов массива
        }
    }
}
