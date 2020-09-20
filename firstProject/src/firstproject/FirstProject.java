/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstproject;

import java.lang.String;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;



/**
 *
 * @author m_taH
 */
public class FirstProject {
    public FirstProject(){
        
    }
    public FirstProject(int _row, int _col, int _unit){
        row = _row;
        col = _col;
        unit = _unit;    
        
        data1 = new double [row][col];

    {
        if((char)unit ==  'r'){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    data1[i][j]= (int)(Math.random()*((255-0)+1))+0;
                }
            }
       }
        if((char)unit ==  'e' ){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i == j){data1[i][j] = 1;}
                    else {data1[i][j] = 0;}
                }
            }
       }    
        if( unit != 'e' && unit != 'r' ){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    data1[i][j]= unit;
                }
            }
       }
    }
    }
//    public void setRow(int _row){
//        row = _row;
//    }
//    public int getRow(){
//        return row;
//    }
//    public void setCol(int _col){
//        col = _col;
//    }
//    public int getCol(){
//        return col;
//    }
//    public void setUnit(int _unit){
//        unit = _unit;
//    }
//    public int getUnit(){
//        return unit;
//    }
    protected int row;
    protected int col;
    protected int unit;
    protected double[][] data1 ;
//Ekrana yazdıran fonksiyon////////////////////////
    public void Print(){        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(data1[i][j] + "    ");
                
            }System.out.print("\n");
        }System.out.print("\n");        
    }
////////////////////////////////////////////////////    
    public void PrintFile(String FName){
        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FName));

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                        bw.write(data1[i][j] + "  ");
                }
                bw.newLine();
            }
            bw.flush();
            } 
        catch (IOException e) {}
    }
///////////////////////////////////////////////////    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        FirstProject f1 = new FirstProject(5,5,'r');
        FirstProject f2 = new FirstProject(2,2,0);
        FirstProject f3 = new FirstProject(2,2,5);
        FirstProject f4 = new FirstProject(4,7,3);
        FirstProject f5 = new FirstProject(4,4,'e');
        FirstProject f6 = new FirstProject(2,2,'e');
        FirstProject f7 = new FirstProject(2,2,'r');
        FirstProject f8 = new FirstProject(12,12,1);
        FirstProject f9 = new FirstProject();
        
        
        
        
        f1.Print();
        f2.Print();
        f3.Print();
        f4.Print();
        f5.Print();
        f6.Print();
        f7.Print();
        f8.Print();
        
        f1.PrintFile("write.txt");
        f2.PrintFile("write.txt");
        
        ArrayList<String> AList = new ArrayList();
        AList.add("kamil");
        System.out.println(AList.size());
        System.out.println(AList);
       
        double value1;
        value1=Math.random();
        System.out.println("value=" + value1);
        
        
        
    }
    
};
