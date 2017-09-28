/**
 * Created by vasujogani on 8/31/17.
 */
public class InsertionSort {
    private int[] list;
    public InsertionSort(int[] listtobesorted){
        list = listtobesorted;
    }

    public void sort(){
        if(list.length==1)
            return;
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int counter = i;
            int j = i-1;
            while(j >= 0 && key < list[j]){
                swap(list, counter, j);
                j--;
                counter--;
            }
        }
    }
//    This method does the swapping of two elements in the array list
//    at index a and index b
    public void swap(int[] list, int a, int b){
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
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
}
