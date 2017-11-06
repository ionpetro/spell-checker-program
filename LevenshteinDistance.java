public class LevenshteinDistance {
  public static int computeDistance(String w1, String d2) {
    w1 = w1.toLowerCase();
    d2 = d2.toLowerCase();
    int[] costs = new int[d2.length() + 1];
    for (int i = 0; i <= w1.length(); i++) {
      int lastValue = i;
      for (int j = 0; j <= d2.length(); j++) {
        if (i == 0)
          costs[j] = j;
        else {
          if (j > 0) {
            int newValue = costs[j - 1];
            if (w1.charAt(i - 1) != d2.charAt(j - 1))
              newValue = Math.min(Math.min(newValue, lastValue), costs[j]) + 1;
            costs[j - 1] = lastValue;
            lastValue = newValue;
          }
        }
      }
      if (i > 0)
        costs[d2.length()] = lastValue;
    }
    return costs[d2.length()];
  }
}
