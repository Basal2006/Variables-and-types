public class Main {
    public static void main(String[] args) {

        // 创建第一个 MusicBox 对象
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
            "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);

        
        MusicBox mbox2 = new MusicBox("T78HJ91", 'N', "Sunshine", "Aurora", 
            "The bright side", "Pop", "Star Records", "Melody Lane");

        System.out.println("Now playing the second song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1); // ads 参数设置为 1
    }
}



