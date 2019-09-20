package edu.nyu.cs9053.homework3;
import edu.nyu.cs9053.homework3.metadata.*;   //import dependent class.

/**
 * User: blangel
 */
public class FixMe {

    private static final String DEFAULT_METADATA = "";   //add DEFAULT_METADATA.

    private final String name;

    private final String metadata;   //change public to private, because all instance variables should be private for good encapsulation and immutability.

    public FixMe(String name) {
        //this.name = name;   //delete this code, because there will be a error if metadata isn't initialized.
	this(name, DEFAULT_METADATA);   // calls FixMe(String, String).
    }

    public FixMe(String name, String metadata) {
        this.name = name;
        this.metadata = new Processor(true).processMetadata(metadata);   //change metadata to this.metadata, because metadata refers to the parameter in this function, and this.metadata refers to the variable in instance field. change the function process to processMetadata according to Processor.java.
    }

    public FixMe changeName(String name) {
        return new FixMe(name);
    }

    public FixMe changeName(String firstName, String lastName) {
        return new FixMe(combineName(firstName, lastName), metadata);   //change changeName() to combineName().
    }

    public String combineName(String firstName, String lastName) {   //change the function name changeName to combineName for avoiding same function-name conflict, and also make the name clearer. 
        return String.format("%s %s", firstName, lastName);
    }

    public String getName() {
        return this.name;   //change name to this.name to make it more clearly.
    }

}
