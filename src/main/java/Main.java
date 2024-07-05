public class Main {
    public static void main(String[] args) {
        Playable mp = new MusicPlayer();
        Playable vp = new VideoPlayer();

        MediaController mc = new MediaController();
        mc.playMedia(mp);
        mc.playMedia(vp);
    }
}
