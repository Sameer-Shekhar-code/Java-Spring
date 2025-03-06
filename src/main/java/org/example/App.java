package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        Car car = context.getBean(Car.class);
        car.drive();
    }
}
