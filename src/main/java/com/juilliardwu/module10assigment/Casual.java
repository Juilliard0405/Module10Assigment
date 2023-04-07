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
public class Casual implements Clothes{

    @Override
    public void top() {
        System.out.println("Casual top");
    }

    @Override
    public void pants() {
        System.out.println("Casual pants");
    }

    @Override
    public void shoes() {
        System.out.println("Casual shoes");
    }
    
}
