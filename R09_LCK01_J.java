// LCK01-J. Do not synchronize on objects that may be reused. Given the
// non-compliant code below:
private final String testLock = "TESTLOCK";

public void demo() {
  synchronized (testLock) {
    // ...
  }
}

// Correct the code as Compliant Solution below:
private final String testLock = new String("TESTLOCK");

public void demo() {
  synchronized (testLock) {
    // ...
  }
}

// Refer to: Rule 09. Locking (LCK)
