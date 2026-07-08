package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class AudioContentTypeConfig {
    public boolean hasMediaPlayer;
    public boolean hasMic;
    public boolean hasScreenAudio;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioContentTypeConfig{hasMic='");
        sbLIZ.append(this.hasMic);
        sbLIZ.append('\'');
        sbLIZ.append(", hasScreenAudio='");
        sbLIZ.append(this.hasScreenAudio);
        sbLIZ.append('\'');
        sbLIZ.append(", hasMediaPlayer='");
        sbLIZ.append(this.hasMediaPlayer);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AudioContentTypeConfig() {
    }

    public AudioContentTypeConfig(boolean z, boolean z2, boolean z3) {
        this.hasMic = z;
        this.hasScreenAudio = z2;
        this.hasMediaPlayer = z3;
    }
}
