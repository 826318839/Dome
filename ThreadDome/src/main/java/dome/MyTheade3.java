package dome;

/**
 * <p>类说明：</p>
 *
 * @Author fengxin_b
 * @date Created in 11:28 2017/9/6
 */
public class MyTheade3 extends Thread {
    private int count = 5;
    @Override
    public void run(){
        super.run();
        count--;
        System.out.println("由 "+this.currentThread().getName()+ " 计算，count="+count);
    }
}
