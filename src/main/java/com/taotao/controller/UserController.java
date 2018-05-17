package com.taotao.controller;

import com.taotao.annotation.MyAnnotation;

public class UserController
{
    @MyAnnotation(value = "wo shi yi ge eat fangfa")
    public void eat()
    {
        
    }
    
    @MyAnnotation(value = "wo shi yi ge run fangfa")
    public void run()
    {
        
    }
}
