public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed <= 4) {
            return speed * 221;
        } else if (speed <= 8) {
            return speed * 221 * .9;
        } else if (speed == 9) {
            return speed * 221 * .8;
        } else if (speed == 10) {
            return speed * 221 * .77;
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
