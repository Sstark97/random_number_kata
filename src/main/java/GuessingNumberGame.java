public class GuessingNumberGame {
  private int generator;
  GuessingNumberGame(RandomNumberGenerator generator){
    this.generator = generator.randomNumber();
  }

  public String guessNumber(int guessedNumber) {
    if (guessedNumber == generator) return  "✅ Correct, you won!";
    return "";
  }
}
