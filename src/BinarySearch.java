// Тема урока: Бинарный поиск. Сложность O(lon(n))
// Бинарный поиск выполняется в уже отсортированном массиве.

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.println("Для элемента 11: " + binarySearch(array, 11));
        System.out.println("Для элемента 12: " + binarySearch(array, 12));
    }

    // Бинарный поиск
    private static int binarySearch(int[] array, int item) {
        int low = 0;  // левая граница массива
        int high = array.length - 1;  // правая граница массива
        while(low <= high) {
            int mid = (low + high) / 2;  // поиск середины
            if(array[mid] == item) {  // элемент найден
                return mid;
            }
            if (array[mid] < item) {  // мало
                low = mid + 1;  // меняем левую границу
            }
            else {  // много
                high = mid - 1;  // меняем правую границу
            }
        }
        return -1;  // элемент не найден
    }
}
