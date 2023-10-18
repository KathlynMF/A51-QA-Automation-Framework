class Main {
  public static void main(String[] args) {
    
    /* 
    Homework #2 - Strings
    Write a Java simple application to finish the assignments below

    Assignment #1
    1.)  
    */
    System.out.println("Assignment #1");

String phrase = "I never dreamed about success. I worked for it";
System.out.println(phrase);

    /*
    Assignment #2
    1.) Declare a String variable 'name' with a value of "Estee Lauder"
    2.) Declare a String variable 'quote', with the value of the String variable 'name', a dash and the String variable 'phrase' from Assignment #1
    3.) Print out the whole quote
    - Print out first 12 characters of the phrase
    */  
    System.out.println("Assignment #2"); 
String name = "Estee Lauder ";
String quote = name + " - " + phrase;
//print(quote);
//print(phrase[:12]);

System.out.println(quote);

if (phrase.length() >= 12) {
    System.out.println(phrase.substring(0,12));
} else {
    System.out.println("The phrase is too short to extract 12 characters.");
}

    /*
    Assignment #3
    1.) Print out the result of comparison of the following strings: "0CT0PUS" and "0CT0PUS" using the String equals() method
    2.) Print out if they are equal or not equal, and explain why (they are equal or not)
    */
    System.out.println("Assignment #3");
String str1 = "0CT0PUS";
String str2 = "0CT0PUS";

boolean areEqual = str1.equals(str2);

if (areEqual) {
    System.out.println("The strings are equal.");
} else {
    System.out.println("The strings are not equal.");
}  

    
    // Check the answers and submit your homework by clicking 'Submit' button at top right    
  }
}
