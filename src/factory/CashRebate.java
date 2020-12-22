package factory;

/**
 * TODO:打折收费实现类
 *
 * @author ：Luo
 * @date ：2020/12/22 21:30
 */
public class CashRebate implements CashStrategy{
    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
