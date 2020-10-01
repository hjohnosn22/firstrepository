import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        ArrayList<Integer> int1 = new ArrayList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);
        ArrayList<Integer> int2 = new ArrayList<>();
        int2.add(3);
        int2.add(7);
        int2.add(9);
mergeSorter ms = new mergeSorter(int1,int2);
ms.sortAndMerge();
    }
}
