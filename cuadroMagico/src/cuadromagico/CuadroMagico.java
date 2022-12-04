/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadromagico;

import javax.swing.JOptionPane;

/**
 *
 * @author luisi
 */
public class CuadroMagico {


    public static void main(String[] args) 
    {
    Matriz obj=new Matriz();
    int n;
    int [][] arr = null;
    do
    {
      n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el orden del cuadrado que desea llenar"));
        if((n%2!=0)&(n!=1))
        {
        arr = obj.leerDatos(arr, n);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El numero que ingreso es un numero PAR, el cuadrado magico solo funciona con IMPARES");
        }        
    }while((n%2==0)||(n==1));
    
    JOptionPane.showMessageDialog(null,obj.mostrar(arr));
     
    }
}
class Matriz 
{
   
    int [][] leerDatos (int[][] arr,int n)
    {                        
         arr=new int[n][n];
         int i=0, número = 1,k=(n-1)/2;         
         do
         {                            
             arr [i][k] = número;
             número += 1;
             if(((número-1)%n == 0)&&(número!=1))
             {
                 i=i+1;
                 if(i==n)
                 {
                     i=0;
                 }             
             }
             else
             {
                 if(k==n-1)
                 {
                     k=0;
                 }
                 else
                 {
                     k+=1;
                 }
                 if(i==0)
                 {
                     i=n-1;
                 }
                 else
                 {
                     i -=1;
                 }
             }               
         }while(número<=n*n);
         
        return arr; 
    }
            
      String mostrar(int[][]arr)
      {
          String S="";
          
       for(int i=0 ;i<arr.length; i++)
      {
          for(int k=0; k<arr[i].length; k++)
          {
              S = S + arr[i][k] +" ";
          }
          S = S + "\n";
      }
    return S;       
    }
}
