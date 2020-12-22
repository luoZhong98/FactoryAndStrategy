package factory;

/**
 * TODO:返利收费实现类
 *
 * @author ：Luo
 * @date ：2020/12/22 21:33
 */
public class CashReturn implements CashStrategy{
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result=money;
        if (money>=moneyCondition)
            result=money-Math.floor(money/moneyCondition)*moneyReturn;
        return result;
    }
}
