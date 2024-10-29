import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessingNumberGameTest {
  record StubRandomNumberGenerator(int number) implements RandomNumberGenerator {

    @Override
    public int randomNumber() {
      return number;
    }
  }

  @Test
  void should_show_the_player_win_at_the_first_time() {
    GuessingNumberGame player = new GuessingNumberGame(new DummieRandomNumberGenerator());
    int numberToGuess = 5;

    assertEquals(player.guessNumber(numberToGuess), "✅ Correct, you won!");
  }

  @Test
  void should_show_that_number_is_greater_if_the_player_did_not_guess_right() {
    GuessingNumberGame player = new GuessingNumberGame(new StubRandomNumberGenerator(5));

    assertEquals(player.guessNumber(4), "✚ The guess number is higher");
  }

  @Test
  void should_show_that_number_is_lower_if_the_player_did_not_guess_right() {
    GuessingNumberGame player = new GuessingNumberGame(new StubRandomNumberGenerator(5));

    assertEquals(player.guessNumber(6), "- The guess number is lower");
  }

  @Test
  void should_show_that_the_player_lose_when_it_has_spent_three_intents() {
    GuessingNumberGame player = new GuessingNumberGame(new DummieRandomNumberGenerator());

    player.guessNumber(4);
    player.guessNumber(3);

    assertEquals(player.guessNumber(2), "You lose");
  }
}