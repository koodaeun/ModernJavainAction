package mid.section03.jung;

public class TestString2 {
    public static void main(String[] args) {
        /*문제7 - 공백 제거
        문제 설명
        문자의 양쪽 공백을 제거해라. 예) " Hello Java " "Hello Java"

        실행결과
        Hello Java
        */
        String original = " Hello Java ";
        // 코드 작성
        //System.out.println(original.trim());

        /*문제 설명
        replace() 를 사용해서 java 라는 단어를 jvm 으로 변경해라.

        실행결과
        hello jvm spring jpa jvm
        */
        String input = "hello java spring jpa java";
        // 코드 작성
        //System.out.println(input.replace("java","jvm"));

        /*문제 설명
        split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.

        실행결과
        ID: hello
        Domain: example.com
        */
        String email = "hello@example.com";
        // 코드 작성
        String[] arr =  email.split("@");
        //System.out.println("ID: " + arr[0]);
        //System.out.println("Domain: " + arr[1]);

        /*문제 설명
        split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
        실행 결과를 참고해라.

        실행결과
        apple
        banana
        mango
        joinedString = apple->banana->mango
        */
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] arr1 = fruits.split(",");
        for (String s : arr1){
            //System.out.println(s);
        }
        String join = String.join("->",arr1);
        //System.out.println("joinedString = " + join);

        /*문제 설명
        str 문자열을 반대로 뒤집어라.
        StringBuilder 에 있는 reverse() 를 사용해라.

        실행결과
        avaJ olleH
        */
        String str = "Hello Java";
        // 코드 작성
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
