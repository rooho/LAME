package cc.rooho.lame;

/**
 * @author by cola 2017年06月30日 2:44 PM
 * @description :
 * @modify by modifier
 */
public class Mp3Lame {

    static {
        System.loadLibrary("mp3lame");
    }

    /**
     * Init LAME.
     *
     * @param inSamplerate
     *            input sample rate in Hz.
     * @param outChannel
     *            number of channels in input stream.
     * @param outSamplerate
     *            output sample rate in Hz.
     * @param outBitrate
     *            brate compression ratio in KHz.
     */
    public static native void init(int inSamplerate, int outChannel,
                                   int outSamplerate, int outBitrate, int quality);

    /**
     * Close LAME.
     */
    public native static void close();
}
