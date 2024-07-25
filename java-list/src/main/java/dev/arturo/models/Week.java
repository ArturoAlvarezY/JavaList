package dev.arturo.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class Week {

    private List<String> weekDays;

    public Week(){
        makeWeekDays();
    }

    private void makeWeekDays(){
        weekDays = new ArrayList<>();
        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");
    }

    public List<String> getDaysOfTheWeek(){
        return new ArrayList<>(weekDays);
    }

    public Integer longList(){
        return weekDays.size();
    }

    public boolean removeArgument(String day){
        return weekDays.remove(day);
    }

    public String getSolicitedDay(String day){
        return day;
    }

   public boolean itExists(String dayExists){
    if (weekDays.contains(dayExists.toLowerCase())) {
        return true;  
    }
    return false;
   }

  public List<String> alphabeticOrder(){

    List<String> orderedDays = new ArrayList<>(weekDays);

    Collections.sort(orderedDays);

    return orderedDays;
}

public List<String> clearAll(){
    List<String> eraseList = new ArrayList<>(weekDays);

    eraseList.clear();

    return eraseList;
}
    }
    
        
    
