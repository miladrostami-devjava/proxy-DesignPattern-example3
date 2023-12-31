package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
API api = new RateLimitProxy(new APIController(),5);
        for (int i = 1; i <= 10; i++) {
//            System.out.println("api/request to " + " " + i);
            api.request("api/point " + i);
        }


    }
}
