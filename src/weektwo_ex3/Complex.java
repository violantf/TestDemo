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
public class Complex {
    private int x;
    private int y;
    
    public Complex() {
        x = 0;
        y = 0;
    }
    
    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public Complex add(Complex obj) {
        Complex temp = new Complex();
        temp.x = this.x + obj.x;
        temp.y = this.y + obj.y;
        return temp;
    }
    
    public Complex multiply(Complex obj) {
        Complex temp = new Complex();
        temp.x = this.x * obj.x;
        temp.y = this.y * obj.y;
        return temp;
    }
    
    @Override
    public String toString() {
        if(x == 0) {
            return "i" + y;
        } else if(y == 0) {
            return "" + x;
        } else if(y == 0 && x == 0) {
            return "Argument equals 0";
        } else {
            return x + " + i" + y;
        }
    }
    
}
