    static int[] reverseArray(int[] a) {
        int[] solution = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            solution[i] = a[a.length - i - 1];
        }
        return solution;
    }
