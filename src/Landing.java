import java.util.Scanner;

public class Landing {

    public static void main(String[]  prams){
        Landing landing=new Landing();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int count=in.nextInt();
        int[] master=new int[count];
        for(int i=0;i<count;i++){
            System.out.println("enter the element "+(i+1));
            master[i]=in.nextInt();
        }
        int mastercounter=count;
        while(mastercounter>0){
            int value=master[0];
            int removalCount=landing.clearArray(master,master[0],mastercounter);
            System.out.println("the number "+value+" has been repeated "+removalCount+" times");
            mastercounter=mastercounter-removalCount;
        }

    }

    private int clearArray(int[] array,int no,int limit){
        int counter=0;
        for(int x=limit-1;x>=0;x--){
            if(array[x]==no){
                counter++;
                for(int i=x;i<=limit-2;i++){
                    array[i]=array[i+1];
                }
            }
        }
        return counter;
    }


}
