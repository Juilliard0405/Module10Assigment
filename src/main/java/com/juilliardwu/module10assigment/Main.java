package com.juilliardwu.module10assigment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juilliardwu
 */
public class Main {
    public static void main(String[] args) {
        Professional p = new Professional();
        p.pants();
        p.shoes();
        p.top();
        Casual c = new Casual();
        c.top();
        c.shoes();
        c.top();
        Party partycloth = new Party();
        partycloth.pants();
        partycloth.shoes();
        partycloth.top();
    }
    
    
}
