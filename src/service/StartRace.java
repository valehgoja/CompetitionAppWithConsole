/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Competitor;
import bean.Config;
import java.util.ArrayList;
import java.util.Collections;
import static menu.MenuUtil.menuShow;

/**
 *
 * @author User
 */
public class StartRace {

    public static Competitor race() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < Config.competitors.length; i++) {
            Competitor c = Config.competitors[i];
            System.out.println("Racer " + (i + 1) + ": " + c.getName() + " " + c.getSurname() + " " + c.getScore());
            al.add(c.getScore());
        }
        int max = Collections.max(al);
        for (int i = 0; i < Config.competitors.length; i++) {
            Competitor c = Config.competitors[i];
            if (c.getScore() == max) {
                System.out.println("Winner " + (i + 1) + ": " + c.getName() + " " + c.getSurname());
            }
        }
        menuShow();
        return null;
    }

}
