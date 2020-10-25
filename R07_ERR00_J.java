// ERR00-J. Do not suppress or ignore checked exceptions. Given the non-compliant code below:
class Test implements Runnable {
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // Ignore
    }
  }
}

// Correct the code as Compliant Solution below:
class Test implements Runnable {
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt(); // Reset interrupted status
    }
  }
}

// Refer to: Rule 07. Exceptional Behavior (ERR)
