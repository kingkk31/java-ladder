package ladder.domain.line;

import java.util.List;

public class ManualLine extends Line {

    public ManualLine(int countOfPerson, List<Boolean> bars) {
        super(countOfPerson);
        this.bars.addAll(bars);
    }

    @Override
    protected void initBars() {

    }
}
