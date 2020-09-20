/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

/**
 *
 * @author m_taH
 */
public class S {
     S s;   
     static int n = 0;   
     public S(S x) {     
         s = x;    
         while (x != null) {       
             n += 1;       
             x = x.s;     
         }   
     }
    
}
