package com.ankit.exception;

public class InSufficientCreditScoreException extends RuntimeException{

   public InSufficientCreditScoreException(String message){
       super(message);
    }
}
