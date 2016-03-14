package lecture5;

import java.time.*;

/**
 * A class to represent a date of birth
 * @author sdn
 */
public class DateOfBirth {
    private LocalDate date;
    
    public DateOfBirth (LocalDate d)  {
        date = d;
    }

    public DateOfBirth (int d, int m, int y)   {
        date = LocalDate.of(y, m, d);        
    }
    
    public DateOfBirth (String ddMmmYyWithHyphens)  {
        String [] dateArray = ddMmmYyWithHyphens.split("-");
                
        int day = Integer.valueOf(dateArray[0]);
                       
        int month=0;
        switch (dateArray[1].toUpperCase()) {
            case "JAN" : month = 1; break;
            case "FEB" : month = 2; break;
            case "MAR" : month = 3; break;
            case "APR" : month = 4; break;
            case "MAY" : month = 5; break;
            case "JUN" : month = 6; break;
            case "JUL" : month = 7; break;
            case "AUG" : month = 8; break;
            case "SEP" : month = 9; break;
            case "OCT" : month = 10; break;
            case "NOV" : month = 11; break;
            case "DEC" : month = 12; break;
        }

        int year = Integer.valueOf(dateArray[2].trim());        
                   
        date = LocalDate.of(year, month, day);
        
    }

    public int getAge () {
        if  (LocalDate.now().isBefore(
                LocalDate.of(
                        LocalDate.now().getYear(), 
                        date.getMonth(), 
                        date.getDayOfMonth()))) 
            return LocalDate.now().getYear()-date.getYear()-1;
        else 
            return LocalDate.now().getYear()-date.getYear();
    }
    
    public LocalDate getDate() {  return date;  }
        
    public int getDay() { return date.getDayOfMonth();  }
    
    public String getDayNextYear() {  
        return date.withYear(LocalDate.now().getYear()+1).getDayOfWeek().toString();
    }
    
    public String getDayThisYear() {  
        return date.withYear(LocalDate.now().getYear()).getDayOfWeek().toString();
    }
    
    public int getMonth() {  return date.getMonthValue();  }
    
    public String getMonthName() {  return date.getMonth().toString();  }
    
    public int getYear() {  return date.getYear();  }
    
    @Override public String toString() {
        return date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear();
    }  
    
}
