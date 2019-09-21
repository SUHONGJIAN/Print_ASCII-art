package edu.nyu.cs9053.homework3.oo;
import java.io.*;

/**
 *Creator: Hongjian Su
 *Date: Sep. 20
 */
public class AsciiArt{
    
    private final char[][] art;
    
    private char[][] temp = new char[10][20];

    public AsciiArt(String arg){
	this.art = toArt(arg);
    }

    public char[][] getArt(){
	return this.art;
    }

    private char[][] toArt(String arg){
	switch(arg)
	{
	case "0":
	    return letter0();
	case "1":
	    return letter1();
        case "2":
            return letter2();
        case "3":
            return letter3();
        case "4":
            return letter4();
        case "5":
            return letter5();
        case "6":
            return letter6();
        case "7":
            return letter7();
        case "8":
            return letter8();
        case "9":
            return letter9();
        case "A":
            return letterA();
        case "B":
            return letterB();
        case "C":
            return letterC();
        case "D":
            return letterD();
        case "E":
            return letterE();
        case "F":
            return letterF();
        case "G":
            return letterG();
        case "H":
            return letterH();
        case "I":
            return letterI();
        case "J":
            return letterJ();
        case "K":
            return letterK();
        case "L":
            return letterL();
        case "M":
            return letterM();
        case "N":
            return letterN();
        case "O":
            return letterO();
        case "P":
            return letterP();
        case "Q":
            return letterQ();
        case "R":
            return letterR();
        case "S":
            return letterS();
        case "T":
            return letterT();
        case "U":
            return letterU();
        case "V":
            return letterV();
        case "W":
            return letterW();
        case "X":
            return letterX();
        case "Y":
            return letterY();
        case "Z":
            return letterZ();
	default:
	    System.out.println("unknown character");
            System.exit(1);
	    return temp;
	}
    }   

    private char[][] letter0(){
        for(int i = 0, j = 10, k = 10; i < 10; i++){
	    if(i == 0 || i == 9){
		temp[i][8] = '0';
		temp[i][10] = '0';
		temp[i][12] = '0';
	    }
	    if(i < 3){
		j -= 2;
		k += 2;
	    }
	    else if(i > 7){
		j += 2;
		k -= 2;
	    }
	    temp[i][j] = '0';
	    temp[i][k] = '0';
	}
        return temp;
    }

    private char[][] letter1(){
	for(int i = 0; i < 10; i++){
	    temp[i][10] = '1';
	    if(i == 0){
		temp[i][9] = '1';
	    }
	    if(i == 9){
		temp[i][7] = '1';
		temp[i][8] = '1';
		temp[i][9] = '1';
		temp[i][11] = '1';
		temp[i][12] = '1';
		temp[i][13] = '1';
	    }
	}
	return temp;
    }

    private char[][] letter2(){
	for(int i = 0, j = 10, k = 10; i < 10; i++){
	    if(i < 4){
		temp[i][j] = '2';
		temp[i][k] = '2';
		j -= 2;
		k += 2;
	    }
	    else if(i == 9){
		for(int m = k-2; m < 18; m += 2){
		    temp[i][m] = '2';
		    k += 2; 
		}
	    }
	    else{
		k -= 2;
		temp[i][k] = '2';
	    }
	}
	return temp;
    }

   private char[][] letter3(){
       for(int i = 0, j = 8; i < 10; i++){
	   if(i < 3 || (i > 5 && i < 8)){
	       j += 3;
	       temp[i][j] = '3';
	   }
	   else if(i == 5){
	       temp[i][j] = '3';
	   }
	   else{
	       j -= 3;
	       temp[i][j] = '3';
	   }
       }
	return temp;
    }

   private char[][] letter4(){
       for(int i = 0, j = 10; i < 10; i++){
	   temp[i][10] = '4';
	   if(i < 5){
	       j -= 2;
	       temp[i][j] = '4';
	   }
	   else if(i == 5){
	       for(int m = j; m < 20; m += 2){
		   temp[i][m] = '4';
	       }
	   }
       }
	return temp;
    }

   private char[][] letter5(){
       for(int i = 0, j = 13; i < 10; i++){
	   if(i < 4){
	       j -= 1;
	       temp[i][j] = '5';
	       if(i == 1){
		   for(int m = j; m < 18; m += 3){
		       temp[i][m] = '5';
		   }
	       }
	   }
	   else if(i < 7){
	       j += 3;
	       temp[i][j] = '5';
	       if(i == 6) temp[i][j] = ' ';
	   }
	   else if(i == 8){
	       j -= 3;
	       temp[i][j] = '5';
	       temp[i][j-6] = '5';
	   }
	   else{
	       j -= 3;
	       temp[i][j] = '5';
	   }
       }
       return temp;
    }

   private char[][] letter6(){
       for(int i = 0, j = 14; i < 10; i += 2){
	   if(i < 8){
	       j -= 2;
	       temp[i][j] = '6';
	       if(i == 4){
		   temp[i][j+4] = '6';
	       }
	       if(i == 6){
		   temp[i][j+8] = '6';
	       }
	   }
	   else{
	       j += 2;
	       temp[i][j] = '6';
	       temp[i][j+4] = '6';
	   }
       }
	return temp;
    }

   private char[][] letter7(){
       for(int i = 0, j = 16; i < 10; i++){
	   if(i == 0){
	       for(int m = 20-j; m <=  j; m+=2){
		   temp[i][m] = '7';
	       }
	   }
	   else{
	       j--;
	       temp[i][j] = '7';
	   }
       }
	return temp;
    }

   private char[][] letter8(){
       for(int i = 0, j = 10, k = 10; i < 10; i++){
	   if(i < 3 || (i < 7 && i >4)){
	       j -= 2;
	       k += 2;
	       temp[i][j] = '8';
	       temp[i][k] = '8';
	   }
	   else{
	       j += 2;
	       k -= 2;
	       temp[i][j] = '8';
	       temp[i][k] = '8';
	   }
       }
	return temp;
    }

   private char[][] letter9(){
       for(int i = 0, j = 10, k = 10; i < 10; i+=2){
	   if(i < 4){
	       j -= 2;
	       k += 2;
	       temp[i][j] = '9';
	       temp[i][k] = '9';
	   }
	   else{
	       k -= 2;
	       temp[i][k] = '9';
	       if(i == 4){
		   j += 2;
		   temp[i][j] = '9';
	       }
	   }
       }
	return temp;
    }

   private char[][] letterA(){
       for(int i = 0, j = 11, k = 9; i < 10; i++){
	   j--;
	   k++;
	   temp[i][j] = 'A';
	   temp[i][k] = 'A';
	   if(i == 5){
	       for(int m = j+1; m < k; m++){
		   temp[i][m] = 'A';
	       }
	   }
       }
	return temp;
    }

   private char[][] letterB(){
       for(int i = 0, j = 10, k = 13; i < 10; i++){
	   temp[i][j] = 'B';
	   if(i == 1 || i == 6){
	       k += 3;
	   }
	   else if(i == 4 || i == 9){
	       k -= 3;
	   }
	   temp[i][k] = 'B';
       }
	return temp;
    }

   private char[][] letterC(){
       for(int i = 0, j = 10; i < 10; i++){
	   if(i < 4){
	       j -= 2;
	   }
	   else if(i > 6){
	       j += 2;
	   }
	   temp[i][j] = 'C';
	   if(i == 0 || i == 9){
	       temp[i][j+2] = 'C';
	       temp[i][j+4] = 'C';
	   }
	   if(i == 1 || i == 8){
	       temp[i][j+8] = 'C';
	   }
       }
	return temp;
    }

   private char[][] letterD(){
       for(int i = 0, j = 10; i < 10; i++){
	   temp[i][6] = 'D';
	   if(i == 0 || i == 9){
	       temp[i][8] = 'D';
	       temp[i][10] = 'D';
	   }
	   if(i < 4){
	       j += 2;
	   }
	   else if(i > 6){
	       j -= 2;
	   }
	   temp[i][j] = 'D';
       }
	return temp;
    }

   private char[][] letterE(){
       for(int i = 0; i < 10; i++){
	   temp[i][6] = 'E';
	   if(i == 0 || i == 4 || i == 9){
	       for(int m = 6; m < 18; m+=2){
		   temp[i][m] = 'E';
	       }
	   }
       }
	return temp;
    }

   private char[][] letterF(){
       for(int i = 0; i < 10; i++){
           temp[i][6] = 'F';
           if(i == 0 || i == 4){
               for(int m = 6; m < 18; m+=2){
                   temp[i][m] = 'F';
               }
           }
       }
	return temp;
    }

   private char[][] letterG(){
       for(int i = 0, j = 10; i < 10; i++){
	   if(i == 0 || i == 9){
	       temp[i][8] = 'G';
	       temp[i][10] = 'G';
	       temp[i][12] = 'G';
	   }
	   if(i == 1 || i == 8){
	       temp[i][14] = 'G';
	   }
	   if(i == 2 || i == 7){
	       temp[i][16] = 'G';
	   }
	   if(i == 6){
	       for(int m = 8; m < 18; m+=2){
		   temp[i][m] = 'G';
	       }
	   }
	   if(i < 4){
	       j -= 2;
	   }
	   else if(i > 6){
	       j += 2;
	   }
	   temp[i][j] = 'G';
       }
	return temp;
    }

   private char[][] letterH(){
       for(int i = 0, j = 4, k = 16; i < 10; i++){
	   temp[i][j] = 'H';
	   temp[i][k] = 'H';
	   if(i == 4){
	       for(int m = j; m < k; m+=2){
		   temp[i][m] = 'H';
	       }
	   }
       }
	return temp;
    }

   private char[][] letterI(){
       for(int i = 0, j = 10; i < 10; i++){
	   temp[i][j] = 'I';
	   if(i == 0 || i == 9){
	       for(int m = j-2; m <= j+2; m++){
		   temp[i][m] = 'I';
	       }
	   }
       }
	return temp;
    }

   private char[][] letterJ(){
       for(int i = 0, j = 10, k = 0; i < 10; i++){
	   if(i == 0){
	       for(int m = j; m > j-6; m-=2){
		   temp[i][m] = 'J';
	       }
	   }
	   if(i < 7){
	       temp[i][j] = 'J';
	   }
	   else{
	       temp[i][j] = 'J';
	       temp[i][k] = 'J';
	       j -= 2;
	       k += 2;
	   }
       }
	return temp;
    }

   private char[][] letterK(){
       for(int i = 0, j = 18; i < 10; i++){
	   temp[i][8] = 'K';
	   if(i < 5){
	       j -= 2;
	   }
	   else{
	       j += 2;
	   }
	   temp[i][j] = 'K';
       }
	return temp;
    }

   private char[][] letterL(){
       for(int i = 0; i < 10; i++){
	   temp[i][10] = 'L';
	   if(i == 9){
	       for(int m = 10; m < 20; m++){
	       temp[i][m] = 'L';
	       }
	   }
       }
	return temp;
    }

   private char[][] letterM(){
       for(int i = 0, j = 0, k = 19; i < 10; i++){
	   temp[i][0] = 'M';
	   temp[i][19] = 'M';
	   temp[i][j] = 'M';
	   temp[i][k] = 'M';
	   j++ ;
	   k-- ;
       }
	return temp;
    }

   private char[][] letterN(){
       for(int i = 0, j = 0; i < 10; i++ ){
	   temp[i][0] = 'N';
	   temp[i][19] = 'N';
	   temp[i][j] = 'N';
	   j += 2;
       }
	return temp;
    }

   private char[][] letterO(){
       for(int i = 0, j = 10, k = 10; i < 10; i++){
	   if(i == 0 || i == 9){
	       temp[i][10] = 'O';
	   }
	   if(i < 4){
	       j -= 2;
	       k += 2;
	   }
	   else if(i > 6){
	       j += 2;
	       k -= 2;
	   }
	   temp[i][j] = 'O';
	   temp[i][k] = 'O';
       }
	return temp;
    }

   private char[][] letterP(){
       for(int i = 0, j = 10; i < 10; i++){
	   temp[i][10] = 'P';
	   if(i < 3){
	       j += 3;
	   }
	   else if(i < 7 && i > 3){
	       j -= 3;
	   }
	   temp[i][j] = 'P';
       }
	return temp;
    }

   private char[][] letterQ(){
       for(int i = 0, j = 10, k = 10; i < 10; i++){
           if(i == 0 || i == 9){
               temp[i][10] = 'Q';
           }
	   if(i == 7){
	       temp[i][k-6] = 'Q';
	   }
	   if(i == 9){
	       temp[i][k+2] = 'Q';
	   }
           if(i < 4){
               j -= 2;
               k += 2;
	   }
           else if(i > 6){
               j += 2;
               k -= 2;
           }
           temp[i][j] = 'Q';
	   temp[i][k] = 'Q';
       }
       return temp;
    }

   private char[][] letterR(){
       for(int i = 0, j = 10; i < 10; i++){
           temp[i][10] = 'R';
           if(i < 3){
               j += 3;
           }
           else if(i < 6 && i > 3){
               j -= 3;
           }
	   else if(i > 6 && i < 9){
	       j += 3;
	   }
           temp[i][j] = 'R';
       }
	return temp;
    }

   private char[][] letterS(){
       for(int i = 0, j = 10; i < 10; i++){
	   if(i == 0 || i == 4 || i == 9){
	       temp[i][8] = 'S';
	       temp[i][10] = 'S';
	       temp[i][12] = 'S';
	   }
	   if(i == 8){
	       temp[i][6] = 'S';
	   }
	   if(i < 3 || i > 7){
	       j -= 2;
	   }
	   else if(i == 4){
	       j += 6;
	   }
	   else if(i < 7){
	       j += 2;
	   }
	   temp[i][j] = 'S';
       }
	return temp;
    }

   private char[][] letterT(){
       for(int i = 0; i < 10; i++){
	   temp[i][10] = 'T';
	   if(i == 0){
	       for(int m = 4; m < 18; m+=2){
		   temp[i][m] = 'T';
	       }
	   }
       }
	return temp;
    }

   private char[][] letterU(){
       for(int i = 0, j = 4, k = 16; i < 10; i++){
	   if(i == 9){
	       temp[i][10] = 'U';
	   }
	   if(i > 7){
	       j += 2;
	       k -= 2;
	   }
	   temp[i][j] = 'U';
	   temp[i][k] ='U';
       }
	return temp;
    }

   private char[][] letterV(){
       for(int i = 0, j = 0, k = 20; i < 10; i++){
	   j++;
	   k--;
	   temp[i][j] = 'V';
	   temp[i][k] = 'V';
       }
	return temp;
    }

   private char[][] letterW(){
       for(int i = 0, j = 4, k = 16; i < 10; i+=2){
	   temp[i][j] = 'W';
	   temp[i][k] = 'W';
	   j++;
	   k--;
	   if(i > 2){
	       temp[i][(8-j)+8] = 'W';
	       temp[i][12-(k-12)] = 'W';
	   }
       }
	return temp;
    }

   private char[][] letterX(){
       for(int i = 0, j = 6, k = 14; i < 10; i++){
	   temp[i][j] = 'X';
	   temp[i][k] = 'X';
	   j++;
	   k--;
       }
	return temp;
    }

   private char[][] letterY(){
       for(int i = 0, j = 2, k = 18; i < 10; i++){
	   if(i < 4){
	       temp[i][j] = 'Y';
	       temp[i][k] = 'Y';
	       j += 2;
	       k -= 2;
	   }
	   else{
	       temp[i][10] = 'Y';
	   }
       }
	return temp;
    }

   private char[][] letterZ(){
       for(int i = 0, j = 14; i < 10; i++){
	   if(i == 0 || i == 9){
	       for(int m = 7; m <= 15; m+=2){
		   temp[i][m] = 'Z';
	       }
	   }
	   else{
	       temp[i][j] = 'Z';
	       j--;
	   }
       }
	return temp;
    }


    public static void main(String[] args){
        char[][] art = new char[10][20];
        AsciiArt letterArt = new AsciiArt(args[0]);
        art = letterArt.getArt();
	Letter su = new Letter(art, new PrintStream(System.out));
	PrintStream output = su.print();
      	output.flush();
	output.close();
        System.out.println(art[0][10]);
    }

}