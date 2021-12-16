public class pbvm {
    public static void main(String[] args){
ThreadsTokenizer threadsTokenizer = new ThreadsTokenizer();
threadsTokenizer.func();
threadsTokenizer.myThread1();
try{
    Thread.sleep(3000);
}catch(Exception e){

}
threadsTokenizer.myThread2();
    }
}
