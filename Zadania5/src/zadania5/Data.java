/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadania5;

/**
 *
 * @author Mati
 */
public class Data {
    private int mm,rr,dd;

    public Data(int mm, int rr, int dd) {
        this.mm = mm;
        this.rr = rr;
        this.dd = dd;
    }
    public void pokazData(){
        System.out.println("Data w tej zmiennej to:"+dd+"."+mm+"."+rr);
    
    }
     public void  przesunDatePrzód(){
    switch (mm){
         case 1:case 3: case 5: case 7: case 8: case 10: case 12:
             if(dd+7>31){
             dd=dd+7-30;
             mm++;
             }else{
             dd+=7;
             }
         break;
         
         case 2:
             if(dd+7>28){
             dd=dd+7-28;
             mm++;
             }else{
             dd+=7;
             }
         break;
         
         case 4: case 6: case 9: case 11:
             if(dd+7>30){
             dd=dd+7-31;
             mm++;
             }else{
             dd+=7;
             }
             
         default:
         break;
     }
    
    
    
    }
   public void  przesunDateTyl(){
    switch (mm){
         case 1:case 3: case 5: case 7: case 8: case 10: case 12:
             if(dd-7<0){
             dd=dd-7+31;
             mm--;
             }else{
             dd-=7;
             }
         break;
         
         case 2:
             if(dd-7<0){
             dd=dd-7+28;
             mm--;
             }else{
             dd=dd-7;
             }
         break;
         
         case 4: case 6: case 9: case 11:
             if(dd-7<0){
             dd=dd-7+30;
             mm--;
             }else{
             dd-=7;
             }
             
         default:
         break;
     }   
}

    @Override
    public String toString() {
        return "Data{" + "mm=" + mm + ", rr=" + rr + ", dd=" + dd + '}';
    }
   
}
