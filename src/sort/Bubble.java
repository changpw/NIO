package sort;

public class Bubble {
    public static void main(String[] args) {
        int [] arr ={1,55,66,44,22,5,88,2,5,3,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int num: arr) {
            System.out.print(num+"\t");
        }
    }
}
