import java.io.*;

class Main {
  public static void main(String[] args) {   

    try {
      FileWriter fw = new FileWriter("output.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("Hello World!");
      bw.close();
      fw.close();
    }
    catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    





  }
}