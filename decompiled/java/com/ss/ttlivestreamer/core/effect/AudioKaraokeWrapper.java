package com.ss.ttlivestreamer.core.effect;

import X.C2188811AlT;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public class AudioKaraokeWrapper extends NativeObject {
    public int mChannels;

    public static native long nativeCreate(int i, int i2, String str, String str2);

    public static native int[] nativeGetMidiDrawingData(String str, int[] iArr);

    private native void nativeGetScoreInfo(double[] dArr, long j);

    private native void nativeProcess(Buffer buffer, int i, int i2, long j);

    public native void nativeSeekLyricPos(double d);

    public native void nativeSetTranspose(int i);

    public AudioKaraokeWrapper() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ctor AudioKaraokeWrapper ");
        sbLIZ.append(this);
        AVLog.iod("AudioKaraokeWrapper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void getScoreInfo(double[] dArr) {
        nativeGetScoreInfo(dArr, this.mNativeObj);
    }

    public void process(Buffer buffer, int i) {
        nativeProcess(buffer, this.mChannels, i, this.mNativeObj);
    }

    public static AudioKaraokeWrapper create(int i, int i2, String str, String str2) {
        AudioKaraokeWrapper audioKaraokeWrapper = new AudioKaraokeWrapper();
        if (str != null && str2 != null && audioKaraokeWrapper.init(i, i2, str, str2)) {
            return audioKaraokeWrapper;
        }
        return null;
    }

    private boolean init(int i, int i2, String str, String str2) {
        long jNativeCreate = nativeCreate(i, i2, str, str2);
        if (jNativeCreate != 0) {
            setNativeObj(jNativeCreate);
            this.mChannels = i2;
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Init failed with sample ");
        sbLIZ.append(i);
        sbLIZ.append(" channel ");
        sbLIZ.append(i2);
        sbLIZ.append(" midiFile ");
        sbLIZ.append(str);
        sbLIZ.append(" lyricFile ");
        sbLIZ.append(str2);
        AVLog.ioe("AudioKaraokeWrapper", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }
}
