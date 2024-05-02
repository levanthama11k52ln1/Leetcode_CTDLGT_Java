public class _941_Valid_Mountain_Array {
    
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        else {
            int index = index_max_arr(arr);
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == arr[i+1]) {
                    return false;
                }
            }
            if (index == 0 || index == arr.length-1) {
                return false;
            }
            for (int i = 0; i < index; i++) {
                if (arr[i] > arr[i+1]) {
                    return false;
                }
            }
            for (int i = index; i < arr.length-1; i++) {
                if (arr[i] < arr[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int index_max_arr(int[] a) {
        int max = a[0], index = 0;
        for (int j = 0; j < a.length; j++) {
            if (max < a[j]) {
                max = a[j];
                index = j;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,1};
        int[] arr2 = {3,5,5};
        int[] arr3 = {0,3,2,1};
        System.out.println(validMountainArray(arr2));
    }
}