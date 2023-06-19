public class Main{

    public static void bubbleSort(int[] nums){
        bubbleSort(nums, false);
    }

    public static void bubbleSort(int[] nums, boolean isDescending){
        int length = nums.length;

        if(length < 2){
            return;
        }

        for(int i = length - 1 ; i >= 0; i--){
            for(int j = 0 ; j < i ; j++){
                
                // 
                if((nums[j] > nums[j+1] && !isDescending) || (nums[j] < nums[j+1] && isDescending)){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }

    public static void print(int[] nums){
        System.out.print("[ ");
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 2, 8, 6, 4};

        print(nums);
        bubbleSort(nums);
        print(nums);
    }
}
