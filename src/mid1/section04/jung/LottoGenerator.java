package mid1.section04.jung;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lotto;
    private int cnt = 0;
    public int[] generate() {
        lotto = new int[6];
        for (int i = 0; i < 6; i++){
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                lotto[cnt] = number;
                cnt++;
            }
        }
        return lotto;
    }
    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number) {
        for (int i = 0; i < cnt; i++) {
            if (lotto[i] == number) {
                return false;
            }
        }
        return true;
    }
}
