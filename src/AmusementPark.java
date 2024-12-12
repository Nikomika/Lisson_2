public class AmusementPark {
    private String name;
    private Attraction ferrisWheel = new Attraction ("Сюрприз", "9.00-21.00", 12);
    public void amusementParkCard () {
        System.out.println("Название парка: " + name);
        System.out.println("Атракцион: " + ferrisWheel);
    }

    public AmusementPark(String name) {
        this.name = name;
    }


    private class Attraction {
        private String nameAttraction, timeWork;
        private int cost;

        private Attraction (String nameAttraction, String timeWork, int cost) {
            this.nameAttraction = nameAttraction;
            this.timeWork = timeWork;
            this.cost =  cost;
        }

    }

}
