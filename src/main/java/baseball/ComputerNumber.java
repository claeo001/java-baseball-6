package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {

   private String computer;

   public static Object computer() {
      System.out.println("숫자 야구 게임을 시작합니다.");
      System.out.print("숫자를 입력해주세요 : ");
      List<Integer> computer = new ArrayList<>();
      while (computer.size() < 3) {
         int randomNumber = Randoms.pickNumberInRange(1, 9);
         if (!computer.contains(randomNumber)) {
            computer.add(randomNumber);
         }
      }

      return null;
   }
}
