package com.ss.bytertc.engine.avclient;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVAudioMediaInfo {
    public int channels;
    public int format;
    public int sampleRate;

    public LyraxAVAudioMediaInfo() {
        this(0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyraxAVAudioMediaInfo)) {
            return false;
        }
        LyraxAVAudioMediaInfo lyraxAVAudioMediaInfo = (LyraxAVAudioMediaInfo) obj;
        return this.sampleRate == lyraxAVAudioMediaInfo.sampleRate && this.channels == lyraxAVAudioMediaInfo.channels && this.format == lyraxAVAudioMediaInfo.format;
    }

    public int hashCode() {
        return (((this.sampleRate * 31) + this.channels) * 31) + this.format;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAVAudioMediaInfo(sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(", channels=");
        sbLIZ.append(this.channels);
        sbLIZ.append(", format=");
        sbLIZ.append(this.format);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setChannels(int i) {
        this.channels = i;
    }

    public final void setFormat(int i) {
        this.format = i;
    }

    public final void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public LyraxAVAudioMediaInfo(int i, int i2, int i3) {
        this.sampleRate = i;
        this.channels = i2;
        this.format = i3;
    }
}
