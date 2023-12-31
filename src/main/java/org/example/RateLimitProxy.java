package org.example;

public class RateLimitProxy implements API{
private final API api;
private final int    requestLimit ;
private int requestCount ;

    public RateLimitProxy(API api, int requestLimit) {
        this.api = api;
        this.requestLimit = requestLimit;
        this.requestCount = 0;
        System.out.println("RateLimit proxy Initialized");
    }

    @Override
    public void request(String endPoint) {
if (requestCount < requestLimit ){
    api.request(endPoint);
    requestCount ++;

}else {
    System.out.println("API Limit Rate exceeded,please try again later!!!");
}


    }
}
