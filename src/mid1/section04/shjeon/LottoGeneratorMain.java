package mid1.section04.shjeon;

import java.util.Arrays;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        Arrays.sort(lottoNumbers);

        // 생성된 로또 번호 출력
        System.out.print("lotto numbers: ");
        for (int lottoNumber : lottoNumbers) {

            System.out.print(lottoNumber + " ");
        }
    }
}
