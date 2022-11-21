package Constructors;

public class Main {
  private String modelName;
    int startingYear;

    public Main(String modelName, int startingYear) {
        this.modelName = modelName;
        this.startingYear = startingYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
