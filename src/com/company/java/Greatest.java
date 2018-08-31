package com.company.java;

public class Greatest {
    int a,b;
    public Greatest(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int greatest(Greatest ob)
    {
        if(ob.a>b)
        {
            return a;
        }
        else
            return b;
    }
}
