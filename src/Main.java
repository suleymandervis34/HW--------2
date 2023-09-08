public class Main {
    public static void main(String[] args) {
        Plant plant1, plant2, plant3;
        plant1 = createObject("tree");
        plant2 = createObject("chamomile");
        plant3 = createObject("cactus");
        Plant[] printables = {plant1, plant2, plant3};
        for (Plant plt : printables) {
            plt.print();
        }
    }

    public static Plant createObject(String className) {
        switch (className) {
            case "tree":
                return new tree(5, "Дуб");
            case "chamomile":
                return new chamomile(8, true);
            case "cactus":
                return new cactus(40, 200);
            default:
                return null;
        }
    }
}