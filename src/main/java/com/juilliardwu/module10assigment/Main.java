package com.juilliardwu.module10assigment;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Driver class
 * @author juilliardwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of cloth you will like");
        String order = sc.nextLine();
        switch(order){
            case "Professional":
                Professional p  = new Professional(); 
                System.out.println("Professional clothes made");
                break;
            case "Party":
                Party party = new Party();
                System.out.println("Party clothes made");
                break;
            case "Casual":
                Casual s = new Casual();
                System.out.println("Casual clothes made");
                break;
            
        }
        
            
    }
}
