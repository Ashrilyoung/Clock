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
public class ClockProgression {

    
    
    public int clockProgression(int startMin, int startHour){
        startMin = startMin + 1;
        System.out.println(startHour+":"+startMin);
        return startMin;
    }
    
//    public int checkTime(int timeMinutes, int startHour){
//        if(timeMinutes>=60){
//           startHour=startHour+1;
//        }
//        return startHour; 
//    }
//    
//    
//    public int minProgression(int timeMinutes){
//        timeMinutes = timeMinutes+1;
//        return timeMinutes; 
//    }
}
