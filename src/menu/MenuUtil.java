/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import static service.Exit.exit;
import static service.Login.login;
import static service.Register.compRegister;
import static service.StartRace.race;

/**
 *
 * @author User
 */
public class MenuUtil {

    public static void menuShow() {
        Menu[] m = Menu.values();
        System.out.println("Select menu");
        for (int i = 0; i < m.length; i++) {
            System.out.println((1 + i) + ". " + m[i]);
        }
        
        int num = service.Utils.requireNumber("");
        
        switch (num) {
            case 1:
                compRegister();
                break;
            case 2:
                race();
                break;
            case 3:
                login();
                break;
            case 4:
                exit();
                break;
            default:
                menuShow();
                break;
        }
    }

}
