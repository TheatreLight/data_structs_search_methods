import java.util.Comparator;

public class Arrays {
    static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static <T> int binarySearch(T[] a, T key, Comparator c) {
        return binarySearch(a, 0, a.length - 1, key, c);
    }

    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) {
        int low = fromIndex;
        int high = toIndex;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];
            if (c.compare(midVal, key) < 0)
                low = mid + 1;
            else if (c.compare(midVal, key) > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }
}
