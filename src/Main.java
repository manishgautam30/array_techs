import java.util.Scanner;
public  class Main {

        static Scanner sc=new Scanner(System.in);
        static int len=sc.nextInt();
        // method to print the array
    public void print(int arr[]){

        for (int i=0 ; i<len ; i++){
            System.out.print(arr[i]+" ");}
        System.out.println("\n");
    }
    // method to insert values
    public void insert(int arr[],int val){
        System.out.println("enter the elements of array");
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();;
        }
    }

    // method to  search a certain element
    public void search(int arr[],int val){
        for(int i=0;i<len;i++){
            if(arr[i]==val){
                System.out.println("yes element found at "+i+" index");
            }
        }
    }

    // method to deleat certain element on given index
    public void deleat(int arr[],int pos){

        for(int i=pos;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        len--;
    }

    // void method...
    public static void main(String []args){
        int counter = 0;
        int arr[]=new int [len];
        Main obj=new Main();
        obj.insert(arr,counter);
        counter++;
        obj.print(arr);
        System.out.println("enter the position the element to be search");
        Scanner sc =new Scanner (System.in);
        int v=sc.nextInt();
        obj.search(arr,v);
        System.out.println("enter the position the element to be deleted");
        Scanner s =new Scanner (System.in);
        int p=s.nextInt();
        obj.deleat(arr,p);
        obj.print(arr);


    }
}

/*  @Author
   name: Manish Gautam
   git username: manishgautam30
 */