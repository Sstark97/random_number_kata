import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessingNumberGameTest {
  record DummieRandomNumberGenerator() implements RandomNumberGenerator {}
  @Test
  void should_show_the_player_win_at_the_first_time() {
    GuessingNumberGame game = new GuessingNumberGame(new DummieRandomNumberGenerator());
    int numberToGuess = 5;

    assertEquals(game.guessNumber(numberToGuess), "✅ Correct, you won!");
  }
}