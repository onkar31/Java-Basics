package Arrays;

public class PassByRef {
    

    public static void update(int arr[]){
        for(int i=0 ; i<arr.length ;i++){
            arr[i] = arr[i] + 1;
        }
    }
    
    public static void main(String[] args) {
        int[] marks = {95, 97, 99};
        update(marks);

        //print marks 
        for(int i=0 ; i<marks.length ;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
