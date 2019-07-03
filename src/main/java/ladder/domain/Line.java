package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

public class Line {

  private List<Bar> bars = new ArrayList<>();
  private Random random = new Random();

  private Line(Players players) {
    Bar bar = Bar.of(random.nextBoolean());

    for (int i = 0; i < players.size() - 1; i++) {
      bars.add(bar);
      bar = randomBar(bar);
    }
  }

  public static Line of(Players players) {
    return new Line(players);
  }

  private Bar randomBar(Bar bar) {
    if (bar.isBar()) {
      return Bar.of(false);
    }
    return Bar.of(random.nextBoolean());
  }

  public int size() {
    return bars.size();
  }

  public List<Boolean> getLine() {
    return bars.stream()
        .map(Bar::isBar)
        .collect(toList());
  }
}
