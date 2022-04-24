
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length > 0){
            return birdsPerDay[birdsPerDay.length - 1];
        } else {
            return 0;
        }
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day:birdsPerDay) {
            if(day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            birdCount += birdsPerDay[i];
        }
        return birdCount;
    }

    public int getBusyDays() {
        int busyCount = 0;
        for(int day:birdsPerDay) {
            if(day >= 5) {
                busyCount++;
            }
        }
        return busyCount;
    }
}
