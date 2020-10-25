// DCL00-J. Prevent class initialization cycles. Given the non-compliant code below:
class Cal1 {
  public static final int c1 = Cal2.c2 + 1;
  // ...
}

class Cal2 {
  public static final int c2 = Cal1.c1 + 1;
  // ...
}

// Correct the code as Compliant Solution below:
class Cal1 {
  public static final int c1 = 2;
  // ...
}

class Cal2 {
  public static final int c2 = Cal1.c1 + 1;
  // ...
}

// Refer to: Rule 01. Declarations and Initialization (DCL)
