// FIO02-J. Detect and handle file-related errors. Given the non-compliant code below:
File testFile = new File(args[0]);
testFile.delete();

// Correct the code as Compliant Solution below:
File testFile = new File("testFile");
if (!testFile.delete()) {
  System.out.println("Deletion failed");
}

// Refer to: Rule 13. Input Output (FIO)
