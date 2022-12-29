import basicAlgorithm.sumof;

public class sumOfTest {

    public static void main(String[] args) {
        sumOfTest();
    }

    static void sumOfTest() {
        // given
        int a = 5;
        int b = 3;

        // when
        int result = sumof.sumOf(a, b);

        // then
        if (result == 12) {
            System.out.println("테스트 성공!");
        } else {
            System.out.println("테스트 실패");
        }
    }

}
