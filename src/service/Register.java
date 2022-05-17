/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Competitor;
import bean.Config;
import java.util.Scanner;
import static menu.MenuUtil.menuShow;

/**
 *
 * @author User
 */
public class Register {

    public static Competitor compRegister() {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many competitor are you register ? : ");
        int competitorNumber = sc.nextInt();
        Config.competitors = new Competitor[competitorNumber];
        for (int i = 0; i < competitorNumber; i++) {
            System.out.println((i + 1) + ". register");
            String name = service.Utils.requireText("Enter name: ");
            String surname = service.Utils.requireText("Enter surname: ");
            int age = service.Utils.requireNumber("Enter age: ");
            int randomNum = 0 + (int) (Math.random() * 10);
            int score = randomNum;

            Competitor c = new Competitor(name, surname, age,score);
            Config.competitors[i] = c;
        }
        menuShow();
        return null;

    }

}
