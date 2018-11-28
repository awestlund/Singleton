package main.java;

import javax.management.RuntimeErrorException;

class DbSingleton {

    // lazy loaded: only make an instance if it's going to be used
    // preformance improvement, less memory used and faster start up
    // volatile will only let there be one instance
    private static volatile DbSingleton instance = null;

    // private constructor so that there can only ever be once instance of this class
    // stop instantiation by reflection
    private DbSingleton() {
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // synchronized makes this class threadsafe, but adds overhead
    public static DbSingleton getInstance() {
        if (instance == null){
            synchronized(DbSingleton.class){
                // check for null again
                if (instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        // return the instance already made
        return instance;
    }

}