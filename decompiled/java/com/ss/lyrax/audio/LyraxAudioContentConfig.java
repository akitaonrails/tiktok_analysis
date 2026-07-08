package com.ss.lyrax.audio;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioContentConfig {
    public boolean hasMediaPlayer;
    public boolean hasMic;
    public boolean hasScreenAudio;
    public boolean hasSpecialAudio;

    public LyraxAudioContentConfig() {
        this.hasMic = true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAudioContentConfig{hasMic='");
        sbLIZ.append(this.hasMic);
        sbLIZ.append('\'');
        sbLIZ.append(", hasScreenAudio='");
        sbLIZ.append(this.hasScreenAudio);
        sbLIZ.append('\'');
        sbLIZ.append(", hasMediaPlayer='");
        sbLIZ.append(this.hasMediaPlayer);
        sbLIZ.append('\'');
        sbLIZ.append(", hasSpecialAudio='");
        sbLIZ.append(this.hasSpecialAudio);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean HasMediaPlayer() {
        return this.hasMediaPlayer;
    }

    public boolean HasMic() {
        return this.hasMic;
    }

    public boolean HasScreenAudio() {
        return this.hasScreenAudio;
    }

    public boolean HasSpecialAudio() {
        return this.hasSpecialAudio;
    }

    public LyraxAudioContentConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.hasMic = z;
        this.hasScreenAudio = z2;
        this.hasMediaPlayer = z3;
        this.hasSpecialAudio = z4;
    }
}
