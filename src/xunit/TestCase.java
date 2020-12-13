package xunit;

import java.lang.reflect.Method;

public class TestCase {
    protected String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run(){
        try{
            Method method = getClass().getMethod(name);
            method.invoke(this);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
