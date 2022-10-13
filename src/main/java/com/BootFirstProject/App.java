/*
 * @Author = Rupa
 * This program do nothing other than responding on browser
 * returns hey when the mapping request is hello
 */

package com.BootFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// configuration of bean methods
@SpringBootApplication
public class App 
{
	
    public static void main( String[] args )
    {
    	//launches spring Boot
    	SpringApplication.run(App.class,args);
    }
}
