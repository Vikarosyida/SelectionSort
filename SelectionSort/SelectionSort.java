package SelectionSort;

public class SelectionSort {
    private int[] data;

    public void SelectionSort() {

        int i, j, small;
        int n = this.data.length;
        for (i = 0; i < n - 1; j++) {
            small = i;

            for (j = i + 1; j < n; j++)
                if (this.data[j] < this.data[small])
                    small = j;

            int temp = this.data[small];
            this.data[small] = this.data[i];
            this.data[i] = temp;
        }
    }
}

