/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151_hw2;

import java.util.HashMap;

/**
 *
 * @author Hylix
 */
public class InterviewerList {
    private HashMap myMap = new HashMap();
    private int id = 0;
    
    public InterviewerList() {
    }
    
    public InterviewerList(HashMap newMap) {
        myMap = newMap;
    }
    
    public void addInterviewer(String name){
        myMap.put(name, name);
        id++;
    }
    
    public void deleteInterviewer(String name) {
        myMap.remove(name);
    }
    
    public void printInterviewer(String name) {
        System.out.println(myMap.get(name));
    }
}
