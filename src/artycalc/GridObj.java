/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package artycalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joe
 */

public class GridObj {
    
    static List<GridObj> entities = new ArrayList<>();
    
    static void listEntities( ) {
        int num = 0;
        System.out.println( "=====List of Objects=====" );
        for ( GridObj obj : entities ) {
            System.out.println( "I.D: " + num + ", " + obj.ident + "\nGridX: " + obj.gridx + "\nGridY: " + obj.gridy );
            num++;
            System.out.println( "=========================" );
        }
        System.out.println( "=========================" );
    }
    
    static void addNew( ) {
        Scanner scn = new Scanner( System.in );
        
        System.out.print("Enter name: ");
        String nn = scn.next( );

        System.out.print("Enter grid X: ");
        int ngx = scn.nextInt( );

        System.out.print("Enter grid Y: ");
        int ngy = scn.nextInt( );

        entities.add( new GridObj( nn, ngx, ngy ) );
    }
    
    static void removeObj(  ) {
        Scanner scn = new Scanner( System.in );
        
        System.out.print("Which one?: ");
        int ind = scn.nextInt( );
        
        entities.remove(ind);
    }
    
    static void calculate(  ) {
        Scanner scn = new Scanner( System.in );
        GridObj obj1, obj2;
        
        System.out.print( "First:" );
        obj1 = GridObj.entities.get( scn.nextInt( ) );
        System.out.print( "Second:" );
        obj2 = GridObj.entities.get( scn.nextInt( ) );
        
        System.out.print(
                "What would you like to calculate?: \n"
                    + "\t1: Distance. \n"
                    + "\t2: Angle. \n" );
        
        switch( scn.nextInt( ) ) {
            case 1:
                System.out.println( "\n\nDistance: " + obj1.getDistance( obj2 ) + "\n\n" );
                break;
            case 2:
                System.out.println( "\n\nAngle: " + obj1.getAng( obj2 ) + "\n\n" );
                break;
        }
    }
    
    private final String ident;
    private final int gridx;
    private final int gridy;
    
    GridObj(String ident, int gridx, int gridy) {
        this.ident = ident;
        this.gridx = gridx;
        this.gridy = gridy;
    }
    
    double getDistance( GridObj target) {
        int a = this.gridx - target.gridx;
        int b = this.gridy - target.gridy;
        return Math.sqrt( a*a + b*b );
    }
    
    double getAng(GridObj target) {
        int a = this.gridx - target.gridx;
        int b = this.gridy - target.gridy;
        return ( Math.atan( a/b ) * 180 ) / Math.PI;
    }
    
}
