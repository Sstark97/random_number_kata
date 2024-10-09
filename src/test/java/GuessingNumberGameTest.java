import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessingNumberGameTest {
  record DummieRandomNumberGenerator() implements RandomNumberGenerator {
    @Override
    public int randomNumber() {
      return 5;
    }
  }
  @Test
  void should_show_the_player_win_at_the_first_time() {
    GuessingNumberGame game = new GuessingNumberGame(new DummieRandomNumberGenerator());
    int numberToGuess = 5;

    assertEquals(game.guessNumber(numberToGuess), "✅ Correct, you won!");
  }

  @Test
  void should_show_that_number_is_greater_if_the_player_did_not_guess_right() {
    GuessingNumberGame game = new GuessingNumberGame(new DummieRandomNumberGenerator());
    int numberToGuess = 5;

    assertEquals(game.guessNumber(4), "✚ The guess number is higher");
  }
}