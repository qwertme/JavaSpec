public class Main {

  public static class MySpec {
    public void spec() {
      new Describe("This and that") {
        public void run() {
          new It("should do something nice"){
            public void run() {
              System.out.println("asserting something nice");
            }
          };

          new Describe("with a thing") {
            public void run() {
              new It("should test for blah") {
                public void run() {
                  System.out.println("asserting blah");
                }
              };
            }
          };
        };
      };
    }
  }
  public static void main(String[] args) {
    new MySpec().spec();
  }
}
