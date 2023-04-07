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

    @Override
    public void top() {
        System.out.println("Party top");
    }

    @Override
    public void pants() {
        System.out.println("Party pants");
    }

    @Override
    public void shoes() {
        System.out.println("Party shoes");
    }
    
}
