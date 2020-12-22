package factory;

/**
 * TODO:工厂接口
 *
 * @author ：Luo
 * @date ：2020/12/22 21:36
 */
public interface FactorySuper {
    CashStrategy createCashStrategy(Double... doubles);
}
