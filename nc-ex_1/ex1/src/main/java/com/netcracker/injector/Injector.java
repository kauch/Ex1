package com.netcracker.injector;

import com.netcracker.annotation.AutoInjectable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Injector {
	private static Logger log = LogManager.getLogger(Injector.class);
    
	private Properties properties;

    public Injector(){
        properties = new Properties();
        InputStream stream = getClass().getClassLoader().getResourceAsStream("app.properties");

        try {
            if(stream!=null){
                properties.load(stream);
            }
        } catch (Exception e) {
        	log.info("Exception", e);
        } 
    }

    public Object inject(Object object){
        for(Field field : object.getClass().getDeclaredFields()){
            field.setAccessible(true);								 // Отмена проверок доступа
            if(field.isAnnotationPresent(AutoInjectable.class)){
                try {
                    field.set(object, Class.forName(properties.getProperty(field.getType().getName())).getDeclaredConstructor().newInstance());
                } catch (Exception e) {
                	log.info("Exception", e);
                } 
            }
        }

        return object;
    }
}
