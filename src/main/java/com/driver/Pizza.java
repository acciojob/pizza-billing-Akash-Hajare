package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isBillGenerated=false;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.bill="";
          if(isVeg){
              this.price=300;
              this.toppingsPrice=70;
          }
          else {
              this.price=400;
              this.toppingsPrice=120;
          }
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
          this.cheesePrice=80;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price = this.price + cheesePrice;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            this.price = this.price + toppingsPrice ;
            isExtraToppingAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
         if(!isTakeAwayAdded){
             this.price =this.price + 20;
             isTakeAwayAdded=true;
         }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isExtraCheeseAdded){
                this.bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isExtraToppingAdded){
                this.bill+="Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added: 20"+"\n";
            }
            this.bill+= "Total Price: " +this.price ;
            isBillGenerated=true;
        }
        return this.bill;
    }

}
