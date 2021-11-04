/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbaden.la_9900;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mateu
 */
@Named(value = "controller")
@SessionScoped
public class Controller implements Serializable {

    private String week, weather, school, time, child;
    private int kegeln, freibad, hallenbad, dunkelwald, musikkurs, backkurs, schieferbergwerk, gokurse, billard, rennautofahren, openAirKino, korbflechten, besuchDesWasserfalls, zoobesuch;
    ArrayList<Integer> angebote = new ArrayList<Integer>();

    public int getKegeln() {
        return kegeln;
    }

    public void setKegeln(int kegeln) {
        this.kegeln = kegeln;
    }

    public int getFreibad() {
        return freibad;
    }

    public void setFreibad(int freibad) {
        this.freibad = freibad;
    }

    public int getHallenbad() {
        return hallenbad;
    }

    public void setHallenbad(int hallenbad) {
        this.hallenbad = hallenbad;
    }

    public int getDunkelwald() {
        return dunkelwald;
    }

    public void setDunkelwald(int dunkelwald) {
        this.dunkelwald = dunkelwald;
    }

    public int getMusikkurs() {
        return musikkurs;
    }

    public void setMusikkurs(int musikkurs) {
        this.musikkurs = musikkurs;
    }

    public int getBackkurs() {
        return backkurs;
    }

    public void setBackkurs(int backkurs) {
        this.backkurs = backkurs;
    }

    public int getSchieferbergwerk() {
        return schieferbergwerk;
    }

    public void setSchieferbergwerk(int schieferbergwerk) {
        this.schieferbergwerk = schieferbergwerk;
    }

    public int getGokurse() {
        return gokurse;
    }

    public void setGokurse(int gokurse) {
        this.gokurse = gokurse;
    }

    public int getBillard() {
        return billard;
    }

    public void setBillard(int billard) {
        this.billard = billard;
    }

    public int getRennautofahren() {
        return rennautofahren;
    }

    public void setRennautofahren(int rennautofahren) {
        this.rennautofahren = rennautofahren;
    }

    public int getOpenAirKino() {
        return openAirKino;
    }

    public void setOpenAirKino(int openAirKino) {
        this.openAirKino = openAirKino;
    }

    public int getKorbflechten() {
        return korbflechten;
    }

    public void setKorbflechten(int korbflechten) {
        this.korbflechten = korbflechten;
    }

    public int getBesuchDesWasserfalls() {
        return besuchDesWasserfalls;
    }

    public void setBesuchDesWasserfalls(int besuchDesWasserfalls) {
        this.besuchDesWasserfalls = besuchDesWasserfalls;
    }

    public int getZoobesuch() {
        return zoobesuch;
    }

    public void setZoobesuch(int zoobesuch) {
        this.zoobesuch = zoobesuch;
    }
    
    public Controller() {
    }
    
    public String check(){
        if (time.equals(2)) {
            kegeln ++;
        }
        if (weather.equals(1) && time.equals(1)) {
           freibad ++; 
        }
        if (school.equals(2) && week.equals(1)) {
            hallenbad ++;
        }
        if (weather.equals(1) && time.equals(1)) {
            dunkelwald ++;
        }
        if (time.equals(2) && school.equals(2) && week.equals(1)) {
            musikkurs ++;
        }
        if (week.equals(2) && weather.equals(2)) {
            backkurs ++;
        }
        if (time.equals(1)) {
            schieferbergwerk ++;
        }
        if (time.equals(2) && week.equals(2) && school.equals(1)) {
            schieferbergwerk ++;
        }
        if (week.equals(2) && weather.equals(2)) {
            gokurse ++;
        }
        if (week.equals(1) && time.equals(2) && weather.equals(1)) {
            gokurse++;
        }
        if (time.equals(2)) {
            billard++;
        }
        if (week.equals(2) && time.equals(1)) {
            billard++;
        }
        if (child.equals(2) && time.equals(1) && week.equals(2) && school.equals(1)) {
            rennautofahren++;
        }
        if (time.equals(2) && weather.equals(1)) {
            openAirKino++;
        }
        if (time.equals(1) && week.equals(2)) {
            openAirKino++;
        }
        if (school.equals(1) && weather.equals(2)) {
            korbflechten++;
        }
        if (time.equals(1) && week.equals(1) || week.equals(2)) {
            besuchDesWasserfalls++;
        }
        if ((week.equals(1) || week.equals(2)) && (time.equals(1) || time.equals(2))) {
            zoobesuch++;
        }
        
        angebote.add(kegeln);
        angebote.add(freibad);
        angebote.add(hallenbad);
        angebote.add(dunkelwald);
        angebote.add(musikkurs);
        angebote.add(backkurs);
        angebote.add(schieferbergwerk);
        angebote.add(gokurse);
        angebote.add(billard);
        angebote.add(rennautofahren);
        angebote.add(openAirKino);
        angebote.add(korbflechten);
        angebote.add(besuchDesWasserfalls);
        angebote.add(zoobesuch);
        
        
        return "/ergebnis.xhtml";
        
        
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }
    
    
    
}
