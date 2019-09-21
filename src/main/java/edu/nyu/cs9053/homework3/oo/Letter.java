package edu.nyu.cs9053.homework3.oo;

import java.io.*;

/**
 *User: Hongjian Su
 *Date: Sep. 20
 */
public class Letter{

    private final char[][] art;

    private final PrintStream output;

    public Letter(char[][] art, PrintStream output){
	this.art = art;
	this.output = output;
    }

    public PrintStream print(){
	for(int i = 0; i < 10; i++){
	    for(int j = 0; j < 20; j++){
		if(this.art[i][j] == '\u0000'){
		    this.output.append(' ');
		}
		else{
		    this.output.append(this.art[i][j]);
		}
	    }
	    this.output.append('\n');
	}
	return this.output;
    }
}
