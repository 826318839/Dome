package dome;

/**
 * <p>类说明：</p>
 *
 * @Author fengxin_b
 * @date Created in 16:22 2017/9/12
 */
public class MyThread4 extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i="+(i--)+"threadName="+Thread.currentThread().getName());
    }
}
