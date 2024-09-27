public class StringBufferExample {
    public static final int THREAD_COUNT = 10;
    public static final StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int j = 0; j < THREAD_COUNT; j++) {
            threads[j] = new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    String entry = Thread.currentThread().getName() + ": " + i + "\n";
                    //                   System.out.println(entry);
                    sb.append(entry);
                }
            });
            threads[j].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();  // Waits for this thread to die
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sb);
    }
//    static class BufferTask extends Thread{
//        public void run(){
//            for(int i = 0; i < 100 ; i++){
//                String entry = Thread.currentThread().getName()+ ""
//            }
//        }
//    }
}
