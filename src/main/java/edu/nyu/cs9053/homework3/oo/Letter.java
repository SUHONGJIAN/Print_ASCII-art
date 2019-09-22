package edu.nyu.cs9053.homework3.oo;
import java.io.*;

/**
 * A {@code Letter} object represents a letter, which have many methods like print Letter-art
 * @author Hongjian Su
 * @version 1.0
 */
public class Letter{

    private final char[][] artArray;

    private final PrintStream output;

    /**
     * Construct a {@code Letter} object
     * @param art char[][] of size 10 rows * 20 columns
     * @param output PrintStream as input
     * Instialize {@code this.art} and {@code this.output}
     */
    public Letter(char[][] artArray, PrintStream output){
	this.artArray = artArray;
	this.output = output;
    }

    /**
     * Print the art to the inputted PrintStream
     * by using {@code PrintStream.append(char)} function char by char
     */
    public PrintStream print(){
	for(int i = 0; i < 10; i++){
	    for(int j = 0; j < 20; j++){
		if(this.artArray[i][j] == '\u0000'){   //add blank(\u0000) when the char is empty.
		    this.output.append(' ');
		}
		else{
		    this.output.append(this.artArray[i][j]);
		}
	    }
	    this.output.append('\n');   //add a new line for each row.
	}
	return this.output;
    }
}
