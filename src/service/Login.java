/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Admin;
import static menu.MenuUtil.menuShow;
import static service.Exit.exit;

/**
 *
 * @author User
 */
public class Login {

    public static boolean loginHelper() {
        Admin a = new Admin();
        System.out.println("Please enter your profile ");
        String name = Utils.requireText("Username :");
        String password = Utils.requireText("Password :");
        return a.getUsername().equals(name) && a.getPassword().equals(password);
    }

    public static void login() {
        for (int i = 0; i < 3; i++) {
            if (loginHelper() == false) {
            }else{
                menuShow();
            }
        }

    }
}
