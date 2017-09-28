public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] testlist = {4,3,1,5,123,65,3,1,3,42,5,65,76,45,234,-12,-6,-3,-3753648,-298345}; // answer - 1,1,2,3,3,4,4,5,5,6,7,7,8
        int[] testlist2 = {4,3,1,5,123,65,3,1,3,42,5,65,76,45,234,-12,-6,-3,-3753648,-298345};
        merge(testlist);
        insertion(testlist2);
        int[] testlist3 = {3,100,-1000,1234,314,234,2,2,34,2};
        findmaxsub(testlist3);



    }

    public static void findmaxsub(int[] list){
        MaximunSubarray maximunSubarray = new MaximunSubarray(list);
        MaximunSubarray.Tracker tracker = maximunSubarray.findMaxSubArray(0,list.length-1);
        System.out.println(tracker);
    }
    public static void merge(int[] list){
        MergeSort mergeSort = new MergeSort(list);
        mergeSort.sort();
        mergeSort.print();
    }

    public static void insertion(int[] list){
        InsertionSort insertionsort = new InsertionSort(list);
        insertionsort.sort();
        insertionsort.getList();
        insertionsort.print();
    }

}
