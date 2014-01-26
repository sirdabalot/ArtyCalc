/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package artycalc;

import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class ArtyCalc {
    /**
     * @param args the command line arguments
     */
    
    static void clrscr( ) {
        for ( int i = 0; i<100; i++ ) {
            System.out.println( );
        }
    }
    
    public static void main(String[] args) {
        Scanner uin = new Scanner( System.in );
        clrscr( );
        while( true ) {
            System.out.println(
                    "What would you like to do?: \n"
                            + "\t1: Add new entity. \n"
                            + "\t2: Remove entity. \n"
                            + "\t3: Calculate." );

            switch( uin.nextInt( ) ) {
                case 1:
                    clrscr( );
                    GridObj.addNew( );
                    clrscr( );
                    break;
                case 2:
                    clrscr( );
                    GridObj.listEntities( );
                    GridObj.removeObj( );
                    clrscr( );
                    break;
                case 3:
                    clrscr( );
                    GridObj.listEntities( );
                    GridObj.calculate( );
                    break;
            }
        
        }
        
    }
    
}
