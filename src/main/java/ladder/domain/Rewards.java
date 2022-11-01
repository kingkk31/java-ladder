package ladder.domain;

import java.util.List;
import java.util.Optional;
import ladder.domain.exception.InvalidRewordsException;

public class Rewards {

    private final List<String> rewards;

    public Rewards(List<String> rewards, int countOfPerson) {
        if (!validateNotEmpty(rewards) || rewards.size() != countOfPerson) {
            throw new InvalidRewordsException();
        }

        this.rewards = rewards;
    }

    public List<String> getRewards() {
        return this.rewards;
    }

    public String getReward(int index) {
        return this.rewards.get(index);
    }

    private boolean validateNotEmpty(List<String> rewards) {
        return Optional.ofNullable(rewards)
                .map(r -> !r.isEmpty())
                .orElse(false);
    }
}
