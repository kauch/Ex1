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
        InputStream fis = getClass().getClassLoader().getResourceAsStream("app.properties");

        try {
            if(fis!=null){
                properties.load(fis);
            }
        } catch (FileNotFoundException e) {
        	log.info("FileNotFoundException", e);
        } catch (IOException e) {
        	log.info("IOException", e);
        }
    }

    public Object inject(Object object){
        for(Field field : object.getClass().getDeclaredFields()){
            field.setAccessible(true);								 // Отмена проверок доступа
            if(field.isAnnotationPresent(AutoInjectable.class)){
                try {
                    field.set(object, Class.forName(properties.getProperty(field.getType().getName())).getDeclaredConstructor().newInstance());
                } catch (IllegalAccessException e) {
                	log.info("IllegalAccessException", e);
                } catch (NoSuchMethodException  e) {
                	log.info("NoSuchMethodException ", e);
                } catch (InstantiationException e) {
                	log.info("InstantiationException", e);
                } catch (ClassNotFoundException e) {
                	log.info("ClassNotFoundException", e);
                }catch (InvocationTargetException e) {
                	log.info("InvocationTargetException ", e);
                }
                
            }
        }

        return object;
    }
}
