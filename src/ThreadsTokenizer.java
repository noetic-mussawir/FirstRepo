import java.util.Arrays;
import java.util.StringTokenizer;
public class ThreadsTokenizer {
    private static final String NAME="H E L L O W O R L D 1 2 3";
    private Character[] mainArr;
    private Character[] arr1;
    private Character[] arr2;
    private int arrDiv;
    private int count;
    String Tokens="";
    private StringTokenizer stringTokenizer = new StringTokenizer(NAME," ");
    public void func(){
        System.out.println(" Original String = "+NAME);
        while(stringTokenizer.hasMoreTokens()){
        Tokens=Tokens+stringTokenizer.nextToken();
        }
        System.out.println(" String After Using String Tokenizer = "+Tokens);
        count=Tokens.length(); //last index
        arrDiv=(count-1)/2; //middle index
        mainArr = new Character[count];
        // System.out.println(Tokens+count);
        for(int i=0 ;i<count;i++){
            mainArr[i]=Tokens.charAt(i);
                   }
        System.out.println("\n\n\n");
        for(int i=0 ;i<=count-1;i++){
        }
        }
        public void myThread1(){
        Runnable runnable1 = () ->{
            String Sorted="";
            System.out.println("Running First Thread...");
            try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}
            arr1= new Character[arrDiv];
            for(int i = 0 ; i <arrDiv ; i ++){
                arr1[i]=Tokens.charAt(i);
              Sorted=Sorted+arr1[i]+"";
            }
            System.out.println("\n First Half Array Result = ");
            for (int i = 0 ; i <arrDiv; i++ )
                System.out.print(arr1[i]);

            char c[] = Sorted.toCharArray();
            Arrays.sort(c);
            System.out.println("\n After Sorting = \n"+new String(c));
            System.out.println("Complete!");
            try {Thread.sleep(100);} catch (InterruptedException e) {
            e.printStackTrace();}
            System.out.println("Please Wait...");
        };
            Thread thread1 = new Thread(runnable1,"First Thread");
            thread1.start();
        }
        public void myThread2(){
        Runnable runnable2 =() -> {
            String Sorted="";
            System.out.println("Now Running Second Thread...");
            try {Thread.sleep(1000);} catch (InterruptedException e) {
            e.printStackTrace();}
            arr2 = new Character[arrDiv];
            int j=0;
            for(int i = arrDiv+1; i <count; i++){
            arr2[j]=Tokens.charAt(i);
            Sorted=Sorted+arr2[j];
            j++;
            }
            System.out.println(" \n Second Half of Array = ");
            for(int i =0 ; i <j ; i++){
            System.out.print(arr2[i]);
            }
            char c[] = Sorted.toCharArray();
            Arrays.sort(c);
            System.out.println("After Sorting = \n"+new String(c));
            System.out.println("Complete!");
     };
        Thread thread2 = new Thread(runnable2,"Second Thread");
thread2.start();
        }
    }