package jung.mid1.sec4;

public class WrapperTest1 {
    public static void main(String[] args) {
        /*문제 설명
        문자로 입력된 str1 , str2 두 수의 합을 구하자.

        실행결과
        두 수의 합: 30
        */
        String str1 = "10";
        String str2 = "20";
        // 코드 작성
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        //System.out.println("두 수의 합: " + (a+b));

        /*문제 설명
        배열에 입력된 모든 숫자의 합을 구하자. 숫자는 double 형이 입력될 수 있다.

        실행결과
        sum = 7.0
        */
        String[] array = {"1.5", "2.5", "3.0"};
        // 코드 작성
        double sum = 0;
        for (String c : array){
            double d = Double.parseDouble(c);
            sum += d;
        }
        //System.out.println("sum = " + sum);

        /*문제 설명
        String str 을 Integer 로 변환해서 출력해라.
                Integer 를 int 로 변환해서 출력해라.
        int 를 Integer 로 변환해서 출력해라.
        오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.

        실행결과
        integer1 = 100
        intValue = 100
        integer2 = 100
        */
        String str = "100";
        // 코드 작성
        Integer int1 = Integer.valueOf(str);
        //System.out.println("integer1 = " + int1);

        int value = int1.intValue();
        //System.out.println("intValue = " + value);

        Integer int2 = Integer.valueOf(value);
        //System.out.println("integer2 = " + int2);

        /*문제 설명
        String str 을 Integer 로 변환해서 출력해라.
                Integer 를 int 로 변환해서 출력해라.
        int 를 Integer 로 변환해서 출력해라.
        오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.

        실행결과
        integer1 = 100
        intValue = 100
        integer2 = 100
        */
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);
        //Integer -> int
        int intValue = integer1;
        System.out.println("intValue = " + intValue);
        //int -> Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
