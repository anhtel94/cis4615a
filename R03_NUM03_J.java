// NUM03-J. Use integer types that can fully represent the possible range of
// unsigned data. Given the non-compliant code below:
public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt();
}

// Correct the code as Compliant Solution below:
public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
