package lecture22;
interface PaymentCard{
    void pay1();
}

public class Testpayment {
    private PaymentCard paymentcard;

    public static void main(String[] args) {
        Testpayment payment =new Testpayment();
        //PaymentCard card = new CreditCard();
        PaymentCard card=new DebitCard();
        payment.paymentcard(card);

    }

    private void paymentcard(PaymentCard card) {
        card.pay1();
    }

    public Testpayment(){

    }
    public Testpayment(PaymentCard pcard){
        pcard.pay1();
    }

}
class DebitCard implements PaymentCard{
    public void pay1(){
        System.out.println("Making payment via debit card ");

    }
}
class CreditCard implements PaymentCard{
    public void pay1(){
        System.out.println("Making payment via credit card ");

    }
}
class GIftcard implements PaymentCard{
    public void pay1(){
        System.out.println("Making payment via gift card ");

    }
}
class voucher implements PaymentCard{
    public void pay1(){
        System.out.println("Making payment via voucher");
    }
}
