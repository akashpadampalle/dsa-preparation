package others;

public class KadaneAlgo {
    public static int maxSubArr(int[] arr) {

        int allMax = arr[0];
        int maxTillNow = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // is maxTillNow is negative then we start over
            if (maxTillNow < 0) {
                maxTillNow = 0;
            }

            // adding current element to maxTillNow
            maxTillNow += arr[i];

            // if maxTillNow sum is greater than current allMax then change allMax
            if (maxTillNow > allMax) {
                allMax = maxTillNow;
            }

        }

        return allMax;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, -5, 6, -7, 7, 2 };
        int max = maxSubArr(arr);
        System.out.println(max);
    }
}
