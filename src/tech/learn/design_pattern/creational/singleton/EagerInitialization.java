package tech.learn.design_pattern.creational.singleton;

/** Singleton Class was create when it called. This is the simplest way.
 * By the way, the instance was created can't be used*/
public class EagerInitialization {
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    //Private constructor to avoid client applications to use constructor
    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return INSTANCE;
    }
}
