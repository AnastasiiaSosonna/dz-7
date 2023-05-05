public enum Planets {
    MERCURY(1, 0, 0.2, null),
    VENUS(2, 1000, 0.65, MERCURY),
    EARTH(3, 7000, 0.68, VENUS),
    MARS(4, 8000, 0.8, EARTH),
    JUPITER(5, 15000, 4, MARS),
    SATURN(6, 10000, 3.5, JUPITER),
    URANUS(7, 20000, 2, SATURN),
    NEPTUNE(8, 10202, 2.2, URANUS),
    PLUTO(9, 10101, 1, NEPTUNE);

    private int planetNumber; //порядковий номер від сонця (для супутників застосовується номер планети)
    private double distanceFromTheSun; //віддаленість від сонця, обчислюється в конструкторі
    private double distanceFromPreviousPlanet; //віддаленість від попередньої планети (для меркурія 0), явно
    private double radius; //радіус
    private Planets previousPlanet; //попередня планета

    Planets(int planetNumber, double distanceFromPreviousPlanet, double radius, Planets previousPlanet) {
        this.planetNumber = planetNumber;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        if (previousPlanet != null)
            this.distanceFromTheSun = previousPlanet.distanceFromTheSun + distanceFromPreviousPlanet;
        else this.distanceFromTheSun = distanceFromPreviousPlanet;
    }

    double showDistanceFromTheSun() {
        return distanceFromTheSun;
    }
}


