public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Для элемента 28: " + binarySearch(array, 55));
        System.out.println("Для элемента -13: " + binarySearch(array, -55));
    }

    private static int binarySearch(int[] array, int item) {
        int low = 0;  // левая граница массива
        int high = array.length - 1;  // правая граница массива
        while(low <= high) {
            int mid = (low + high) / 2;  // середина
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
