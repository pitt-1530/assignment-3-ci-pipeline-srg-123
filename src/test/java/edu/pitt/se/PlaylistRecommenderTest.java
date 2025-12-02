package edu.pitt.se;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    void testClassifyEnergy() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(Arrays.asList(150, 140)));
    }

    @Test
    void testIsValidTrackTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Hello World"));
    }

    @Test
    void testNormalizeVolume() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(150));
    }
}
