package com.taotao.test;

import java.lang.reflect.Method;

import com.taotao.annotation.MyAnnotation;

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            //获取到指定类的字节码对象
            Class<?> forName = Class.forName("com.taotao.controller.UserController");
            //获取所有的方法
            Method[] methods = forName.getMethods();
            
            for (Method method : methods)
            {
                //遍历方法，判断方法上是否有注解
                boolean annotationPresent = method.isAnnotationPresent(MyAnnotation.class);
                
                if (annotationPresent)
                {
                    //如果有注解，获取到注解
                    MyAnnotation annotation = (MyAnnotation)method.getAnnotation(MyAnnotation.class);
                    String value = annotation.value();
                    
                    System.out.println(value);
                }
            }
            
        }
        catch (ClassNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
