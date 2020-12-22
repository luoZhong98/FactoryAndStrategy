package factory;

/**
 * TODO:
 *
 * @author ：Luo
 * @date ：2020/12/22 21:53
 */
public class Client {

    public static void main(String[] args) {
        FactorySuper cashRebateFactory=new CashRebateFactory();
        CashStrategy cashRebate=cashRebateFactory.createCashStrategy(0.8);
        double money= cashRebate.acceptCash(100);
        System.out.println("打折方式："+money);

        FactorySuper cashReturnFactory=new CashReturnFactory();
        CashStrategy cashReturn=cashReturnFactory.createCashStrategy(300d,100d);
        double money1= cashReturn.acceptCash(300);
        System.out.println("返利方式："+money1);
    }
}
