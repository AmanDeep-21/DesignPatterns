import com.codewithmosh.builder.BuilderDemo;
import com.codewithmosh.decorator.DecoratorDemo;
import com.codewithmosh.observer.ObserverDemo;
import com.codewithmosh.singleton.SingletonDemo;
import com.codewithmosh.strategy.StrategyDemo;

public class Main {
    public static void main(String[] args) {

        // Strategy Demo
//        StrategyDemo strategyDemo = new StrategyDemo();
//        strategyDemo.execute();

        // Observer or Pub-Sub Demo
//        ObserverDemo observerDemo = new ObserverDemo();
//        observerDemo.execute();

        // Singleton Demo
//        SingletonDemo singletonDemo = new SingletonDemo();
//        singletonDemo.execute();

        // Builder Demo
//        BuilderDemo builderDemo = new BuilderDemo();
//        builderDemo.execute();

        // Decorator Demo
        DecoratorDemo decoratorDemo = new DecoratorDemo();
        decoratorDemo.execute();
    }
}