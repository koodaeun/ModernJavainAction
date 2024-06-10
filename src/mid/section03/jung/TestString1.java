package jung.mid1.sec3;

public class TestString1 {
    public static void main(String[] args) {
        /*문제 설명
        startsWith() 를 사용해서 url 이 https:// 로 시작하는지 확인해라

        실행결과
        true
        */
        String url = "https://www.example.com";
        // 코드 작성
        boolean reslt = url.startsWith("https://");

        //System.out.println(reslt);

        /*문제 설명
        length() 를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라.
        실행 결과에 맞도록 출력하자.

        실행결과
        hello:5
        java:4
        jvm:3
        spring:6
        jpa:3
        sum = 21
        */
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // 코드 작성
        int sum = 0;
        for(String s : arr){
            //System.out.println(s+ ":" + s.length());
            sum += s.length();
        }

        //System.out.println("sum = " + sum);

        /*문제 설명
        str 에서 ".txt" 문자열이 언제부터 시작하는지 위치를 찾아서 출력해라. indexOf() 를 사용해라.

        실행결과
        index = 5
        */

        String str = "hello.txt";
        // 코드 작성
        int index = str.indexOf(".txt");
        //System.out.println("index = " + index);

        /*문제 설명
        substring() 을 사용해서, hello 부분과 .txt 부분을 분리해라.
        단순하게 substring() 에 숫자를 직접 입력해서 문제를 풀면 된다

        실행결과
        filename = hello
        extName = .txt
        */
        String str1 = "hello.txt";
        // 코드 작성
        String filename = str1.substring(0,5);
        String extName = str1.substring(5);

        //System.out.println("filename = " + filename);
        //System.out.println("extName = " + extName);

        /*문제 설명
        str 에는 파일의 이름과 확장자가 주어진다. ext 에는 파일의 확장자가 주어진다.
        파일명과 확장자를 분리해서 출력하라.
        indexOf() 와 substring() 을 사용해서 문제를 풀면 된다.

        실행결과
        filename = hello
        extName = .txt
        */
        String str2 = "hello.txt";
        String ext = ".txt";

        int extIndex = str2.indexOf(ext);
        String filename1 = str2.substring(0, extIndex);
        String extName1 = str2.substring(extIndex);
        //System.out.println("filename = " + filename1);
        //System.out.println("extName = " + extName1);

        /*문제 설명
        str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
        indexOf() 를 반복문과 함께 풀면 된다.

        실행결과
        count = 3
        */
        String str3 = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int cnt = 0;
        int idx = str3.indexOf(key);
        for (int i = 0; ; i++ ){
            if (idx >= 0){
                //System.out.println(idx);
                idx = str3.indexOf(key, idx + 1);
                cnt++;
            }else{
                System.out.println("count = " + cnt);
                break;
            }
        }
    }
}
