import model.Category;
import model.Music;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;

public class MusicTest {
    @Test
    public void checkMusicParameters(){
        // act
        Music music = new Music(1, 2, 10, 550, "MusicTestTitle", Category.Music, "Test", "Test", 2019, "TheTester");
        // verify
        assertSame(music.getGenre(), "Test");
        assertSame(music.getTitle(), "MusicTestTitle");
        assertSame(music.getArtist(), "TheTester");
        assertSame(music.getCategory(), Category.Music);
    }
}
