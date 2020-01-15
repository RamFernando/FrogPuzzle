public class Frog {

    public static void main(String[] args) {
        predictTime(18);
        predictDistance(6);
    }

    private static void predictTime(int i) {
        int distance = i;
        int time = 0;

        int frogdefdistance[] = {5, 3, 1};
        int frogdeftime[] = {1, 2, 5};

        while (distance != 0) {
            for (int j = 0; j < frogdefdistance.length; j++) {
                if (distance >= frogdefdistance[j]) {
                    time += frogdeftime[j];
                    distance -= frogdefdistance[j];
                }
            }
        }

        System.out.println("Time taken :- " + time);
    }

    private static void predictDistance(int i) {
        int time = i;
        int distance = 0;

        int frogdeftime[] = {5,2,1};
        int frogdefdistance[] = {5,1,3};

        while (time != 0) {
            for (int j = 0; j < frogdeftime.length; j++) {
                if (time >= frogdeftime[j]) {
                    distance += frogdefdistance[j];
                    time -= frogdeftime[j];
                }
            }
        }

        System.out.println("Distance covering :- " + distance);
    }
}