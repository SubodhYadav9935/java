package lecture22;

public class testshopingMart {
    public static void main(String[] args) {
        testshopingMart mart=new testshopingMart();
        //CCard card=new CCard();
        //Dcard card=new Dcard();
        Gcard card = new Gcard();
        mart.makePayment(card);


    }
    public void makePayment(CCard myCard){
        myCard.pay();

    }
    public void makePayment(Dcard mycard){
          mycard.pay();
    }
    public void makePayment(Gcard mycard){
        mycard.pay();
    }

}
class CCard{
    public void pay(){
        System.out.println("makig the payment using credit card");
    }

}
class Dcard{
    public void pay(){
        System.out.println("making payment by debit card");
    }
}
class Gcard{
    public void pay(){
        System.out.println(" I am making payment via gift card");
    }
}
