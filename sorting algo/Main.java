
public class Main {

    // bubble sort with one argument
    public static void bubbleSort(int[] nums) {
        bubbleSort(nums, false);
    }

    // bubble sort
    public static void bubbleSort(int[] nums, boolean isDescending) {
        int length = nums.length;

        if (length < 2) {
            return;
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                // handle both the case is accending and descending scenarios
                if ((nums[j] > nums[j + 1] && !isDescending) || (nums[j] < nums[j + 1] && isDescending)) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }

    // insertion sort with one argument
    public static void insertionSort(int[] nums) {
        insertionSort(nums, false);
    }

    // insertion sort
    public static void insertionSort(int[] nums, boolean isDescending) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;

            while (j >= 0 && ((current < nums[j] && !isDescending) || (current > nums[j] && isDescending))) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = current;
        }
    }

    // merge two sorted array
    private static void mergeSortedArray(int[] arr, int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }

    }

    public static void mergeSort(int[] nums) {
        int length = nums.length;

        if (length < 2) {
            return;
        }

        int mid = length / 2;

        int[] part1 = new int[mid];
        int[] part2 = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            part1[i] = nums[i];
        }

        for (int i = mid; i < length; i++) {
            part2[i - mid] = nums[i];
        }

        mergeSort(part1);
        mergeSort(part2);

        mergeSortedArray(nums, part1, part2);

    }

    // selection sort with one argument
    public static void selectionSort(int[] nums) {
        selectionSort(nums, false);
    }

    // selection sort
    public static void selectionSort(int[] nums, boolean isDescending) {
        for (int i = 0; i < nums.length; i++) {

            // finding maximum element in unsorted array
            int target = i;
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[target] > nums[j] && !isDescending) || (nums[target] < nums[j] && isDescending)) {
                    target = j;
                }
            }

            // swapping max element with position of ith element
            int temp = nums[i];
            nums[i] = nums[target];
            nums[target] = temp;

        }
    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low + (high - low) / 2]; // Choose the pivot element

        // Divide into two arrays
        while (i <= j) {
            // Find elements to swap on the left and right side
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Recursively sort the sub-arrays
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (i < high) {
            quickSort(arr, i, high);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // print array
    public static void print(int[] nums) {
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 0, 2, 8, 6, 4 };

        print(nums);

        // bubbleSort(nums, true);
        // print(nums);

        // selectionSort(nums);
        // print(nums);

        // insertionSor

        // int[] newone = mergeSorted(nums, nums);
        // print(newone);

        // mergeSort(nums);
        // print(nums);

        quickSort(nums);
        print(nums);

    }
}
