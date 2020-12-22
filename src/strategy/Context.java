package strategy;

/**
 * TODO:上下文类
 *
 * @author ：Luo
 * @date ：2020/12/22 22:14
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double acceptCash(double money){
        return strategy.acceptCash(money);
    }
}
