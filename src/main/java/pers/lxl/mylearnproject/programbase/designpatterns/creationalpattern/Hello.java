package pers.lxl.mylearnproject.programbase.designpatterns.creationalpattern;
/**创建型模式关注点是如何创建对象，--核心思想--是要把对象的创建和使用相分离，这样使得两者能相对独立地变换。
创建型模式包括：
工厂方法：Factory Method，（虚拟构造函数、Virtual Constructor）
抽象工厂：Abstract Factory
建造者：Builder
原型：Prototype
单例：SingletonOneThread*/
/**定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的实例化延迟到其子类。
 * 产品 （Product）【类】 将会对接口进行声明。 对于所有由创建者及其子类构建的对象， 这些接口都是通用的。
 * 抽象产品【抽象类，接口】
 * 产品簇
 * 产品等级
 * 具体产品 （Concrete Products） 是产品接口的不同实现。
 * 创建者 （Creator） 类声明返回产品对象的工厂方法。 该方法的返回对象类型必须与产品接口相匹配。
 *                   你可以将工厂方法声明为抽象方法， 强制要求每个子类以不同方式实现该方法。 或者， 你也可以在基础工厂方法中返回默认产品类型。
 *                  注意， 尽管它的名字是创建者， 但他最主要的职责并不是创建产品。 一般来说， 创建者类包含一些与产品相关的核心业务逻辑。 工厂方法将这些逻辑处理从具体产品类中分离出来。 打个比方， 大型软件开发公司拥有程序员培训部门。 但是， 这些公司的主要工作还是编写代码， 而非生产程序员。
 * 具体创建者 （Concrete Creators） 将会重写基础工厂方法， 使其返回不同类型的产品。
 *                 注意， 并不一定每次调用工厂方法都会创建新的实例。 工厂方法也可以返回缓存、 对象池或其他来源的已有对象。*/

public class Hello {
}
