/**
 * Created by vasujogani on 8/31/17.
 */
public class MergeSort {
    int[] list;
    public MergeSort(int[] listtobesorted){
        list = listtobesorted;
    }

    public void sort(){
        int high = list.length-1;
        int low = 0;
        sort(list,low,high);
    }

    public void sort(int[] list, int low, int high){
        if(high-low < 1)
            return;
        int middle = (high-low)/2 + low;
        sort(list,low, middle);
        sort(list, middle+1, high);
        merge(list, low, middle+1, high);
    }

    public void merge(int[] list, int low, int middle, int high){
        int lowercounter = low;
        int midpoint = middle;
        int highpoint = high;
        int[] sorted = new int[high-low+1];
        int counter = 0;
        boolean leftDone = false;

        for (int i = 0; i < sorted.length; i++) {
            if(!leftDone && lowercounter==midpoint){//error is here
                leftDone = true;
                i--;
            } else if(midpoint>high){
                sorted[i] = list[lowercounter++];
            }else if(lowercounter>=middle){
                sorted[i] = list[midpoint++];
                leftDone = true;

            } else if(list[lowercounter] < list[midpoint]){
                sorted[i] = list[lowercounter++];
            }else{
                sorted[i] = list[midpoint++];
            }
        }
        counter = 0;
        for (int i = low; i <= high; i++) {
            list[i] = sorted[counter++];
        }
    }


    //  this method returns the list
    public int[] getList(){
        return list;
    }

    //    this method prints out array
    public void print(){
        String s = "";
        for(int i : list){
            s+= (i + ", ");
        }
        System.out.println(s.substring(0,s.length()-2));
    }

    public void print(int[] l){
        for(int i : l){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
