public class LastIndexOfOne {

    public static int findLastIndexOfOne(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] binaryArray = { 0, 0, 1, 0, 1, 0 };
        int lastIndex = findLastIndexOfOne(binaryArray);
        System.out.println("Last index of 1: " + lastIndex);
    }
}
