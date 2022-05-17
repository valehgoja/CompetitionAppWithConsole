/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Utils {
     public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        String answer = sc.nextLine();
        return answer;
    }

    public static int requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title );
        int answer = sc.nextInt();
        return answer;
    }
}
