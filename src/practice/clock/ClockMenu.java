/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.clock;

/**
 *
 * @author dwarfonfire
 */
public class ClockMenu {
    
    private int startHour=0;
    private int startMin=0;
    private boolean clockOn=true;
    ClockProgression clockface = new ClockProgression();
    
    public void startClock() throws InterruptedException{
    
        
        while(clockOn=true){
            
            setMin(startMin);
            setHour(startHour);
            int startMin=getMin();
            int startHour=getHour();
            clockface.clockProgression(startMin, startHour);
            System.out.println(startHour+":"+getMin());
            Thread.sleep(1000);
        }
    }

    public int getMin() {
        return this.startMin;
    }
    public void setMin(int newMin){
        startMin = newMin+1;
    }

    public int getHour() {
        return this.startHour;
    }
    public void setHour(int newHour){
        startMin = newHour;
    }


    
    

}
