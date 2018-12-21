public class Main {

    public static void main(String[] args) {
        // write your code here
        MyThread ft = new MyThread("First");
        MyThread st = new MyThread("Second");
        while(true) {
            ft.run();
            st.run();
        }
    }
}