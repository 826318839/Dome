package dome;

/**
 * <p>类说明：</p>
 *
 * @Author fengxin_b
 * @date Created in 16:04 2017/8/31
 */
public class Test {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        myThread.setName("myThread");
        //线程就绪
        myThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                //挂起线程
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
