package alja.programming;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Component
public class NumberGeneratorImpl implements NumberGenerator{

    // == fields ==
    private Random random = new Random();

    private final int maxNumber;

    private final int minNumber;

    // == constructors ==
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods
    @Override
    public int next() {
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }
}
