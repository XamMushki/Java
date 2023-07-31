public class BinarySearch {
    int[] array;

    BinarySearch() {
    }

    BinarySearch(int[] array) {
        this.array = array;
    }

    void setArray(int[] array) {
        this.array = array;
    }

    // returns index of the key if found else -1
    int search(int key) {
        int start = 0;
        int end = this.array.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (array[mid] == key) {
                return mid;
            }
            if (key < array[mid]) {
                end = mid - 1;
                // mid = (start + end) / 2;
            } else {
                start = mid + 1;
                // mid = (start + end) / 2;
            }
        }
        return (-1);
    }

    void printArray() {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7 };
        BinarySearch bs = new BinarySearch(arr);
        bs.printArray();

        System.out.println("Found at index: " + bs.search(1));
        System.out.println("Found at index: " + bs.search(2));
        System.out.println("Found at index: " + bs.search(3));
        System.out.println("Found at index: " + bs.search(13)); // -1
        System.out.println("Found at index: " + bs.search(7));
        System.out.println("Found at index: " + bs.search(5));
        System.out.println("Found at index: " + bs.search(-2)); // -1
    }

}
