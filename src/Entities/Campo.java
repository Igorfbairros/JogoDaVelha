package Entities;

public class Campo{
    private char simbol;

    public Campo(){
        this.simbol = ' ';
    }

    public char getSimbol(){
        return simbol;
    }
    public void setSimbol(char simbol){
    if(this.simbol == ' '){
         this.simbol = simbol;
    }else{
        System.out.println("Campo já usado");
    }
    }
}