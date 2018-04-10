package algorithm;

public class Sort {
    static int arraySize=0;
    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

       for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    exchange(array,j,i);
                    /*int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;*/
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp;
        for(int i=1;i<array.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(array[j]<array[j-1])
                {
                    exchange(array,j,j-1);
                    /*temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;*/
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                     exchange(array,j,j+1);
                    /*temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;*/
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
         //implement here
         int beg=0; int end=array.length-1;
         mergeSort(array,beg,end);
        return list;
    }

    void mergeSort(int a[],int beg, int end)
    {
        int mid;
        if(beg<end) {
            mid=(beg+end)/2;
            mergeSort(a,beg,mid);
            mergeSort(a,mid+1,end);
            mergeSortedArray(a,beg,mid,mid+1,end);}

    }
    void mergeSortedArray(int a[],int leftbeg,int leftend,int rightbeg,int rightend) {

        int pa = leftbeg, pb = rightbeg, pt = leftbeg;
        int limit = a.length;
        int tempa[] = new int[limit];

        while (pa <= leftend && pb <= rightend) {
            if (a[pa] < a[pb]) {
                tempa[pt++] = a[pa++];
            } else {
                tempa[pt++] = a[pb++];
            }
        }

        if (pa > leftend) {
            while (pb <= rightend) {
                tempa[pt++] = a[pb++];
            }
        } else {
            while (pa <= leftend) {
                tempa[pt++] = a[pa++];
            }
        }
        for (pt = leftbeg; pt <= rightend; pt++)
            a[pt] = tempa[pt];
    }

        public int [] quickSort(int [] array) {
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            int start = 0;
            int end = array.length - 1;
            quickSort(array, start, end);
            return list;
        }
             //implement here
            public void quickSort(int a[],int start,int end) {
                int i=start;int j=end;
                int pivot=a[start+(end-start)/2];  //calculate pivot value it divides the list into twp parts
                while(i<=j)
                {
                    while(a[i]<pivot) { i++;   }  //while value at left is less than pivot move right
                    while(a[j]>pivot) { j--;   }  //while value at right is greater than pivot move left
                    if (i <= j) {
                        exchange(a,i, j);
                        i++;
                        j--;
                    }
                }
                // do Recursion here
                if (start < j)
                    quickSort(a,start, j);
                if (i < end)
                    quickSort(a,i, end);
            }

            public void exchange(int a[],int i, int j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }


    public int [] heapSort(int [] array){

        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        arrayHeapify(array);
        for(int i=arraySize;i>0;i--) {
            exchange(array,0,i);
            arraySize=arraySize-1; //the largest item is stored at the root of the heap.
                                    // Replace it with the last item of the heap followed by reducing the size of heap by 1
            maxHeap(array,0);

        }
        return list;
    }
    public  void arrayHeapify(int arr[]) {
        arraySize=arr.length-1;
        for(int i=arraySize/2;i>=0;i--) {
            maxHeap(arr,i);
        }

    }
    public void maxHeap(int arr[],int i)  //Build a max heap from the input data.
    {
        int left=2*i;
        int right=2*i+1;
        int max=i;
        if(left<=arraySize&&arr[left]>arr[i])
            max=left;
        if(right<=arraySize&&arr[right]>arr[max])
            max=right;
        if(max!=i)   {
            exchange(arr,i,max);
            maxHeap(arr,max);

        }
    }

      public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        //Bucket sort algorithm distributes elements of an array into number of buckets. This is a non-comparison sort
          int max=maxValue(array);
          bucketSort(array,max);
          return list;
    }

    public void bucketSort(int arr[],int max) {
        int bucket[]=new int[max+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<arr.length; i++) {
            bucket[arr[i]]++;
        }

        int sort=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                arr[sort++]=i;
            }
        }

    }
    static int maxValue(int[] arr)
    {
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > maxValue)
                maxValue = arr[i];
        return maxValue;
    }
    public int [] shellSort(int [] array){

        final long startTime = System.currentTimeMillis();
        int [] list = array;
        /*This algorithm uses insertion sort on a widely spread elements, first to sort them
         and then sorts the less widely spaced elements. This spacing is termed as interval.
        implement here*/
        int inner, outer;
        int temp;

        int interval = 1;
        while (interval <= array.length / 3) {
            interval = interval * 3 + 1;     //Knuth's Formula
        }
        while (interval > 0) {
            for (outer = interval; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                while (inner > interval - 1 && array[inner - interval] >= temp) {
                    array[inner] = array[inner - interval];
                    inner =inner- interval;
                }
                array[inner] = temp;
            }
            interval = (interval - 1) / 3;
        }

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
