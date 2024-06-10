package basic.section12.dkoo.ex01;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String s) {
        System.out.println("sms을 발송합니다: "+ s);
    }
}
