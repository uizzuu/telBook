package exception;

import java.util.regex.Pattern;

public class InputValidation {
    // 이름
    public void nameCheck(String name) throws MyException {
        boolean check = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name);
        if (! check) {
            throw new MyException("✔ 이름은 한글로 입력하세요");
        }
    }

    // 나이
    public void ageCheck(int age) throws MyException {
        if (age < 0 || age > 120) {
            throw new MyException("✔ 나이는 0세부터 120세 사이의 값을 입력해주세요");
        }
    }

    // 전화번호
    public void phoneCheck(String phone) throws MyException {
        boolean check = Pattern.matches("^0\\d{1,2}-?\\d{3,4}-?\\d{4}$", phone);
        if (! check) {
            throw new MyException("✔ 전화번호 입력방식은 xxx-xxxx-xxxx 입니다");
        }
    }
}
