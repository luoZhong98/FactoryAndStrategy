package factory;

/**
 * TODO:返利收费工厂实现类
 *
 * @author ：Luo
 * @date ：2020/12/22 21:44
 */
public class CashReturnFactory implements FactorySuper{
    @Override
    public CashStrategy createCashStrategy(Double... doubles) {
        return new CashReturn(doubles[0],doubles[1]);
    }
}
