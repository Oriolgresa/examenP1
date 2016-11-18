package edu.upc.eetac.dsa;

import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class MainP3
{
    public static void main( String[] args ) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        UserP3 user1 = new UserP3(1234,"oriol","bcn");
        user1.insertUser();
    }
}
