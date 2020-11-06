package Problem1;

public class BinarySearch {
    // This is to be done recursivel
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        int l = data.length;
        int output = search(data, 0, data.length - 1, target);
        return output;
    }

    static int search(int[] data, int beg, int end, int target) {
        if (end >= beg) {
            int mid = beg + (end - beg) / 2;
            if (data[mid] == target) {
                return mid;
            }
            if (data[mid] > target)
                return search(data, beg, mid - 1, target);
            else {
                return search(data, mid + 1, end, target);
            }
        }
        return -1;
    }

}
