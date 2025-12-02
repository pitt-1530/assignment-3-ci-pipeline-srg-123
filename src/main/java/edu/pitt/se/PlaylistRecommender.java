package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()


        int sum = 0;
        for (Integer b : bpms) {
            if (b == null) {
                throw new IllegalArgumentException("bpms list has null value");
            }
            sum += b;
        }

        double avg = (double) sum / bpms.size();

        if (avg >= 140) {
            return "HIGH";
        } else if (avg >= 100) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        if (title == null) return false;

        int len = title.length();
        if (len < 1 || len > 30) return false;

        for (int i = 0; i < len; i++) {
            char c = title.charAt(i);
            if (!(Character.isLetter(c) || c == ' ')) {
                return false;
            }
        }

        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        if (volumeDb < 0) {
            return 0;
        }
        if (volumeDb > 100) {
            return 100;
        }
        return volumeDb;
    }
}
