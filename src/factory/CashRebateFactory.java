package factory;

/**
 * TODO:打折收费工厂实现类
 *
 * @author ：Luo
 * @date ：2020/12/22 21:41
 */
public class CashRebateFactory implements FactorySuper {
    @Override
    public CashStrategy createCashStrategy(Double... doubles) {
        return new CashRebate(doubles[0]);
    }
}
