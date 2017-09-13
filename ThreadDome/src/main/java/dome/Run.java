package dome;

/**
 * <p>类说明：</p>
 *
 * @Author fengxin_b
 * @date Created in 11:34 2017/9/6
 */
public class Run {
    public static void main(String[] args) {
        MyTheade3 myTheade3 = new MyTheade3();
        Thread a = new Thread(myTheade3,"A");
        Thread b = new Thread(myTheade3,"B");
        Thread c = new Thread(myTheade3,"C");
        Thread d = new Thread(myTheade3,"D");
        Thread e = new Thread(myTheade3,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
