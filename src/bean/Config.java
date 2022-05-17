/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author User
 */
public class Config {
    public static Competitor[] competitors; 

    public Config() {
    }

    public Config(Competitor[] competitors) {
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
    }
    
}
