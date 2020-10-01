/*
Henry johnson
9/22/20
9/22/20
purpose: to sort two arraylists
 */

import java.util.ArrayList;

public class mergeSorter {
    private ArrayList<Integer> arr1;
    private ArrayList<Integer> arr2;
    //initializes two Arraylists to the arraylists created in the driver
    public mergeSorter(ArrayList<Integer> a, ArrayList<Integer> b){
        arr1 = a;
        arr2 = b;
    }
    /*creates a third arraylist, sets it to the first array list and runs through the second arraylist and sorts
    it into one*/
    public void sortAndMerge(){
        ArrayList<Integer> combined = arr1;
        for(int i = 0;i<arr2.size();i++){
            for(int j  = combined.size()-1;j>=0;j--){
             if(arr2.get(i)>=(combined.get(j))){
                 combined.add(j+1,arr2.get(i));
                 break;
             }
            }
        }
        System.out.println(combined);
    }
}
