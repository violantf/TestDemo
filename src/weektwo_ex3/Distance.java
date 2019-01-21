/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weektwo_ex3;

/**
 *
 * @author owner
 */
public class Distance {
    
    private int km;
    private int m;
    
    public Distance() {
        km = 0;
        m = 0;
    }
    
    public Distance(int km) {
        this.km = km;
        m = 0;
    }
    
    public Distance(int km, int m) {
        this.km = km;
        this.m = m;
    }
    
    public int getKm(){
        return km;
    }
    
    public int getM() {
        return m;
    }
    
    public void setKm(int km) {
        this.km = km;
    }
    
    public void setM(int m) {
        this.m = m;
    }
    
    public void setDistance(int km, int m) {
        this.km = km;
        this.m = m;
    }
    
    public Distance add(Distance obj) {
        Distance temp = new Distance();
        temp.km = this.km + obj.km;
        temp.m = this.m + obj.m;
        while(temp.m > 999) {
            temp.km += temp.m / 1000; 
            temp.m = temp.m % 1000;
        }
        return temp;
    }
    
    public String toString(){
        return km + String.format(".%03d", m);
    }
    
    
}
