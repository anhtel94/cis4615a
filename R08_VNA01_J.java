// VNA01-J. Ensure visibility of shared references to immutable objects. Given
// the non-compliant code below:
// Immutable Helper
public final class TestHelp {
  private final int n;

  public TestHelp(int n) {
    this.n = n;
  }
  // ...
}

final class Test {
  private TestHelp help;

  public TestHelp getHelp() {
    return help;
  }

  public void setHelp(int num) {
    help = new TestHelp(num);
  }
}

// Correct the code as Compliant Solution below:
final class Test {
  private volatile TestHelp help;

  public TestHelp getHelp() {
    return help;
  }

  public void setHelp(int num) {
    help = new TestHelp(num);
  }
}

// Refer to: Rule 08. Visibility and Atomicity (VNA)
