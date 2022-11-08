/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdemo;

import java.util.Scanner;

public class CheckEmail
{
    
    public static void main(String args[])
    {
        String user;
        Scanner sc=new Scanner(System.in);
        user=sc.next();
        int i=-1;
        
        i=user.indexOf('@');
        if(i>0)
        {
            System.out.println("Email");
        }
        else
        {
            System.out.println("mobile");
        }
    }
}

    
