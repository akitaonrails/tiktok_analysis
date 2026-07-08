package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C13LP;
import X.C13LQ;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicWaveBean implements Serializable {

    @C09CT("music_length")
    public long musicLength;

    @C09CT("music_wave_ary")
    public float[] musicWavePointArray = new float[0];

    @C09CT("video_length")
    public long videoLenght;

    public final MusicWaveBean clone() {
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.musicWavePointArray = C13LP.LLI(C13LQ.LJJLIL(this.musicWavePointArray));
        musicWaveBean.videoLenght = this.videoLenght;
        musicWaveBean.musicLength = this.musicLength;
        return musicWaveBean;
    }

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final float[] getMusicWavePointArray() {
        return this.musicWavePointArray;
    }

    public final long getVideoLenght() {
        return this.videoLenght;
    }

    public final void setMusicLength(long j) {
        this.musicLength = j;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        this.musicWavePointArray = fArr;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }
}
