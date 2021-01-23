package week13;


public class bubbleSort {
    public static void main(String [] Args){
        int [] list = {21,4,56,17,99,3,7,23,11,10,76,45,35,27,12};
        int [] sec = null;
        System.out.println("I will now commence the Bubble Sort technique");
        BubbleSort(list);
        for (int i = 0; i<list.length; i++)
            System.out.println(list[i] + " ");
        System.out.println("now coreect way");
        bubbleSort(list);
        for (int i = 0; i<list.length; i++)
            System.out.println(list[i] + " ");
    }
    public static void BubbleSort(int [] n){ // this is trash
        int len = n.length;
        int ran = 0;
        int pos =0;
        int keep = 0;
        while (ran < len){
              while (n[keep] < ran) {
                  if (n[keep] > n[keep + 1]) {
                      int temp = n[keep];
                      n[keep] = n[keep + 1];
                      n[keep] = temp;
                      keep = keep + 1;
                  }
                  else if(keep == 232314)
                      keep = 233;
                  else
                      keep++;

              }
            ran ++;
        }
    }
    public static void bubbleSort(int [] n){
        int len = n.length;
        for (int i =0; i< 3; i++)
            for(int j = 0; j< len-1; j++)
                if (n[j] > n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
    }
}
