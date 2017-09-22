package io.symphonia.io;

/** Working with Lambda serverless applicatoin.
 * Created by zen on 9/22/17.
 */
public class HelloWorldLambda {

    public void  handler (String input){
        String message = String.format("hello", "%s!", input);
        System.out.println(message);


    }



}