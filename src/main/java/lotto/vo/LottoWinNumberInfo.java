package lotto.vo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lotto.vaildator.WinNumberValidator;

public class LottoWinNumberInfo extends WinNumberValidator {

    private List<Integer> lottoWinNumbers;
    private int bonusNumber;

    public LottoWinNumberInfo(String inputWinNumbers) {
        List<Integer> winNumbers = lottoNumberToList(inputWinNumbers);
        validateNumbers(winNumbers);
        this.lottoWinNumbers = winNumbers;
    }

    public LottoWinNumberInfo(int bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

    private List<Integer> lottoNumberToList(String inputWinNumbers) {
        return Arrays.stream(inputWinNumbers
                .replaceAll(" ", "")
                .split(","))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }


    public List<Integer> getLottoWinNumbers() {
        return lottoWinNumbers;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }


}
