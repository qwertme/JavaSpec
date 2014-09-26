public abstract class Operation {
  public Operation(final String description) {
    System.out.println(description);
    before();
    run();
    after();
  }

  public void before(){}
  public void after(){}
  public abstract void run();
}
