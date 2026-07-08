package com.ss.lyrax.audio;

import X.C2188811AlT;
import com.ss.lyrax.stream.LyraxStreamIndex;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPropertiesInfo {
    public LyraxStreamIndex index;
    public int linearVolume;
    public int nonlinearVolume;
    public float[] spectrum;
    public String userId;
    public int vad;
    public double voicePitch;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAudioPropertiesInfo {streamIndex='");
        sbLIZ.append(this.index);
        sbLIZ.append(" linearVolume='");
        sbLIZ.append(this.linearVolume);
        sbLIZ.append('\'');
        sbLIZ.append(" nonlinearVolume= '");
        sbLIZ.append(this.nonlinearVolume);
        sbLIZ.append('\'');
        sbLIZ.append(" vad: '");
        sbLIZ.append(this.vad);
        sbLIZ.append(" voicePitch='");
        sbLIZ.append(this.voicePitch);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAudioPropertiesInfo(String str, LyraxStreamIndex lyraxStreamIndex, int i, int i2, float[] fArr, int i3, double d) {
        float[] fArr2 = new float[257];
        this.spectrum = fArr2;
        this.userId = str;
        this.index = lyraxStreamIndex;
        this.linearVolume = i;
        this.nonlinearVolume = i2;
        System.arraycopy(fArr, 0, fArr2, 0, 257);
        this.vad = i3;
        this.voicePitch = d;
    }

    public void updateInfo(String str, LyraxStreamIndex lyraxStreamIndex, int i, int i2, float[] fArr, int i3, double d) {
        this.userId = str;
        this.index = lyraxStreamIndex;
        this.linearVolume = i;
        this.nonlinearVolume = i2;
        System.arraycopy(fArr, 0, this.spectrum, 0, 257);
        this.vad = i3;
        this.voicePitch = d;
    }
}
