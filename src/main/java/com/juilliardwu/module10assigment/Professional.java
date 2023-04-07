/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juilliardwu.module10assigment;

/**
 *
 * @author juilliardwu
 */
public class Professional implements Clothes{
    /**
     * override the shoes method for professional shoes 
     */
    
    @Override
    public void shoes(){
        System.out.println("Professional shoes");
        
    }
    /**
     * override the shoes method for professional top 
     */
    @Override
    public void top(){
        System.out.println("Professional top");
        
    }
    /**
     *  override the shoes method for professional pants
     */
    @Override
    public void pants(){
        System.out.println("Professional pants");
        
    }
}
