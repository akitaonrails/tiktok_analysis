package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class AudioPropertiesInfo {
    public int linearVolume;
    public int nonlinearVolume;
    public float[] spectrum;
    public int vad;
    public double voicePitch;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioPropertiesInfo{linearVolume='");
        sbLIZ.append(this.linearVolume);
        sbLIZ.append('\'');
        sbLIZ.append("nonlinearVolume='");
        sbLIZ.append(this.nonlinearVolume);
        sbLIZ.append('\'');
        sbLIZ.append("voicePitch='");
        sbLIZ.append(this.voicePitch);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AudioPropertiesInfo(int i, int i2, float[] fArr, int i3) {
        float[] fArr2 = new float[257];
        this.spectrum = fArr2;
        this.linearVolume = i;
        this.nonlinearVolume = i2;
        System.arraycopy(fArr, 0, fArr2, 0, 257);
        this.vad = i3;
    }
}
