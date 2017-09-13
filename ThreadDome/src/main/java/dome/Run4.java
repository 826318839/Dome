package dome;

/**
 * <p>类说明：</p>
 *
 * @Author fengxin_b
 * @date Created in 16:24 2017/9/12
 */
public class Run4 {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        Thread t1 = new Thread(myThread4);
        Thread t2 = new Thread(myThread4);
        Thread t3 = new Thread(myThread4);
        Thread t4 = new Thread(myThread4);
        Thread t5 = new Thread(myThread4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
