public class GuessingNumberGame {
  private final int generator;
  public int intents = 3;

  GuessingNumberGame(RandomNumberGenerator generator){
    this.generator = generator.randomNumber();
  }

  public String guessNumber(int guessedNumber) {
    if (guessedNumber == generator) {
      return  "✅ Correct, you won!";
    } else if (generator > guessedNumber) {
      return "✚ The guess number is higher";
    }
    return "- The guess number is lower";
  }
}
