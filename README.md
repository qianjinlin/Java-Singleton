# Java-Singleton
Java 单例模式简单案例
单例
优点:提供了对唯一实例的受控访问，节约系统资源，允许可变数目的实例
缺点：扩展困难，职责过重违背“单一职责原则”，滥用单例将带来一些负面问题，如为了节省资源将数据库连接池对象设计为的单例类，可能会导致共享连接池对象的程序过多而出现连接池溢出；如果实例化的对象长时间不被利用，系统会认为是垃圾而被回收，这将导致对象状态的丢失。

单例模式有  饿汉式，懒汉式，双重校验锁，枚举，静态内部类 后续贴上代码
