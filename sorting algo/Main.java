public class Main{

    // bubble sort with one argument
    public static void bubbleSort(int[] nums){
        bubbleSort(nums, false);
    }

    // bubble sort
    public static void bubbleSort(int[] nums, boolean isDescending){
        int length = nums.length;

        if(length < 2){
            return;
        }

        for(int i = length - 1 ; i >= 0; i--){
            for(int j = 0 ; j < i ; j++){
                
                // handle both the case is accending and descending scenarios
                if((nums[j] > nums[j+1] && !isDescending) || (nums[j] < nums[j+1] && isDescending)){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }


    //selection sort with one argument
    public static void selectionSort(int[] nums){
        selectionSort(nums, false);
    }

    // selection sort
    public static void selectionSort(int[] nums, boolean isDescending){
        for(int i = 0 ; i < nums.length; i++){

            // finding maximum element in unsorted array
            int target = i;
            for(int j = i + 1; j < nums.length; j++){
                if((nums[target] > nums[j] && !isDescending) || (nums[target] < nums[j] && isDescending)){
                    target = j;
                }
            }

            // swapping max element with position of ith element
            int temp = nums[i];
            nums[i] = nums[target];
            nums[target] = temp;

        }
    }

    // print array
    public static void print(int[] nums){
        System.out.print("[ ");
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 0, 2, 8, 6, 4};

        print(nums);
        bubbleSort(nums, true);
        print(nums);
        // selectionSort(nums);
        // print(nums);
    }
}
