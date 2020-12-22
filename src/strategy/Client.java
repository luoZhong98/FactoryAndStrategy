package strategy;

/**
 * TODO:
 *
 * @author ：Luo
 * @date ：2020/12/22 22:17
 */
public class Client {
    public static void main(String[] args) {
        //侧重点
        Strategy cashRebateStrategy=new CashRebate(0.8);

        Context cashRebateContext=new Context(cashRebateStrategy);
        double money=cashRebateContext.acceptCash(100);
        System.out.println("打折方式："+money);

        Strategy cashReturnStrategy=new CashReturn(300,100);

        Context cashReturnContext=new Context(cashReturnStrategy);
        double money1=cashReturnContext.acceptCash(300);
        System.out.println("返利方式："+money1);
    }
}
