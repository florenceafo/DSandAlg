class Array2 {

    private final int max_elements = 200;
    private int size = 0;
    private int[] arr;

    public Array2(int n) {
        if ((n < 0) || (n > max_elements)) {
            throw new IllegalArgumentException("Array size must be non-negative");
        }
        arr = new int[max_elements];
        size = n;
    }

    /**
     *
     * @return the size of the Array
     */
    public int size() {
        return size;
    }

    /**
     * Set the i-th element to x We are not checking whether the index is in bounds,
     * because dereferencing the array element does it for us.
     *
     * @param i the index of the element
     * @param x the element we're adding
     */
    public void set(int i, int x) {
        arr[i] = x;
    }

    /**
     * Get the i-th element, Again, we are not checking if the index is in bounds.
     *
     * @param i the index of the element to get
     * @return the element found
     */
    public int get(int i) {
        return arr[i];
    }

    /**
     *
     * @return the content of the array as a String
     */
    public String toString() {
        StringBuilder res = new StringBuilder("{");
        if (size > 0) {
            res.append(arr[0]);
            for (int i = 1; i < size; ++i) {
                res.append(", ");
                res.append(arr[i]);
            }
        }
        res.append("}");
        return res.toString();
    }

    /**
     * Hands on session 1 Exercise 1 - Insert element x at index i assuming i is max
     * the size of the array.
     *
     * @param i the index where to insert
     * @param x the element to insert
     */
    public void insert(int i, int x)  {
        //throw new UnsupportedOperationException();
        if (size() == max_elements) {
            throw new IndexOutOfBoundsException("Size of the array equals max");
        }

        if (i >= size() || i < max_elements) {
            throw new IndexOutOfBoundsException("Index outside array");
        }

        if (i == size()) {
            arr[i] = x;

        }

        if (i < size()-1) {
            for (int j = arr.length-1; j == i; j--) {
                arr[j] = arr[j+1];
            }
            arr[i] = x;
        }

    }

    /**
     * Hands on session 1 Exercise 2
     *
     * @return true if the array is sorted
     */
    public boolean isSorted() {

        //throw new UnsupportedOperationException();
        boolean isSorted = true;
        for (int i = 0; i < size -1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    /**
     * Hands on session 1 Exercise 3
     *
     * @return the length of longest increasing sub array
     */
    public int maxNonDecreasing() {
        throw new UnsupportedOperationException();

    }

    /**
     * Hands on session 1 Exercise 4 - returns the index of the first number in the
     * first matching subarray
     *
     * @param b The subarray to compare with
     * @return the index where the subarray starts
     */
    public int subArrayIndex(Array2 b) {
        throw new UnsupportedOperationException();
    }

    // Internal method for swapping
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Hands on Session 3 Exercise 2 Return the maximum sum of all contiguous
     * subarrays of the array.
     *
     * @param array the array
     * @param lo    the index of the low boundary of the subarray
     * @param hi    the index of the high boundary of the subarray
     * @return the sum of the subarray
     */
    public static int maxSubarraySum(int[] array, int lo, int hi) {
        throw new UnsupportedOperationException();
    }

    /**
     * Assignment 1 Question 1 Reverse the array
     */
    public void reverse() {

        int temp;
        int j = size-1;

        for (int i = 0; i < size/2; i++) {

            temp = arr[j];

            arr[j] = arr[i];

            arr[i] = temp;

            j--;

        }

    }

    /**
     * Assignment 1 Question 2 Remove the element of index i from the array.
     *
     * @param i the element to remove
     */
    public void remove(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * Assignment 1 Question 2 Remove the element of index i from the array. This
     * method may change the order of the other elements of the array.
     *
     * @param i the element to remove
     */
    public void remove2(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * Assignment 1 Question 3 Return the index of the first occurrence of x in the
     * array, or -1 if x does not occur.
     *
     * @param x the element to find
     * @return the index of the first occurrence
     */
    public int find(int x) {
        throw new UnsupportedOperationException();
    }

    /**
     * Assignment 1 Question 4 Find the length of the longest palindrome that is a
     * contiguous subsequence of the array.
     *
     * @return The length of the palindrome
     */
    public int maxPalindrome() {
        throw new UnsupportedOperationException();
    }

    /**
     * Assignment 2 Question 3 returns the sum of the largest contiguous ascending
     * array
     *
     * @return the sum
     */
    public int maxInterval() {
        throw new UnsupportedOperationException();
    }

    /**
     * Assignment 2 Question 3 Return the median value of an array.
     *
     * @return the median
     */
    public int median() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Array2 a = new Array2(3);
        a.set(0, 4);
        a.set(1, 2);
        System.out.println(a.toString());
    }
}
