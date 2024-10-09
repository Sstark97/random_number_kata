public class GuessingNumberGame {
  private final int generator;

  GuessingNumberGame(RandomNumberGenerator generator){
    this.generator = generator.randomNumber();
  }

  public String guessNumber(int guessedNumber) {
    if (guessedNumber == generator) {
      return  "✅ Correct, you won!";
    } else if (generator > guessedNumber) {
      return "✚ The guess number is higher";
    }
    return "";
  }
}
