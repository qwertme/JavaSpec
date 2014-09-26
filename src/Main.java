public class Main {

  public static class MySpec {
    public void spec() {
      new Describe("The thing that does stuff") {
        public void before() {
          System.out.println("Prepare shit");
        }
        public void after() {
          System.out.println("Clean up shit");
        }

        public void run() {
          new It("should do something nice"){
            public void run() {
              System.out.println("*asserting something nice");
            }
          };

          new Describe("with another thing") {
            public void run() {
              new It("should test for blah") {
                public void run() {
                  System.out.println("*asserting blah");
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
