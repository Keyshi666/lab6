public class MyThread extends Thread {
    public MyThread(String name){
        this.setName(name);
    }
    public void run() {
        Log.consoleOutput("Thread:  "+this.getName());
    }
}