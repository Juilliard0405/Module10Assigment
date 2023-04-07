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
public class Party implements Clothes{
    /**
     * override the shoes method for Party top.
     */

    @Override
    public void top() {
        System.out.println("Party top");
    }
    /**
     * override the shoes method for Party pants.
     */

    @Override
    public void pants() {
        System.out.println("Party pants");
    }
    /**
     * override the shoes method for Party shoes.
     */

    @Override
    public void shoes() {
        System.out.println("Party shoes");
    }
    
}
