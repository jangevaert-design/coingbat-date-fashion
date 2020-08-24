public class dateFashion {
  public int dateFashion(int you, int date) {
    if ((you > 7 && date > 2) ||(you > 3 && date > 7)) {
      return 2;
    }else if ((you > 2 && date < 3) || (you < 3 && date > 2 || you < 3 && date < 3)) {
      return 0;
    } else {
      return 1;
    }
  }
}
