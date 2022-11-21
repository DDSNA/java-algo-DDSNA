package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;
import java.util.ArrayList;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
                //Creating an array list
                ArrayList<Integer> numbers = new ArrayList<>();
                
                // add the elements themselves
                numbers.add(4);
                numbers.add(2);
                numbers.add(1249);
                numbers.add(74);
                numbers.add(1);
                numbers.add((7+25)/71+(-5));
                
                //using the sort() method
                Collections.sort(numbers);
                System.out.println("Sorted ArrayList:" + numbers);
                
                //using the shuffle() method
                Collections.shuffle(numbers);
                System.out.println("ArrayList using shuffle: " + numbers);
                
                //is shuffle different?
                Collections.shuffle(numbers);
                System.out.println("ArrayList using shuffle (2nd): " + numbers);
 	
                //swap()
                Collections.swap(numbers, 0, 3);
                System.out.println("ArrayList1 using swap()" + numbers);
                Collections.swap(numbers, 0, 1);
                System.out.println("ArrayList1 using swap() <2>" + numbers);
                Collections.swap(numbers, 1, 5);
                System.out.println("ArrayList1 using swap() <3>" + numbers);
                
        }
}
