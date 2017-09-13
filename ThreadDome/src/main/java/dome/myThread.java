package dome;

/**
 * <p>类说明：</p>
 *
 * @Author fengxin_b
 * @date Created in 16:03 2017/8/31
 */
public class myThread extends Thread {
    @Override
    public void run() {


        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
