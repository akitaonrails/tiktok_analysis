package com.ss.android.ugc.aweme.shortvideo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class AVMusicWaveBean implements Serializable {

    @C09CT("music_length")
    public long musicLength;

    @C09CT("video_length")
    public long videoLenght;

    @C09CT("music_wave_ary")
    public float[] musicWavePointArray = new float[0];

    @C09CT("music_path")
    public String musicPath = "";

    public final AVMusicWaveBean clone() {
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        aVMusicWaveBean.musicWavePointArray = (float[]) this.musicWavePointArray.clone();
        aVMusicWaveBean.musicPath = this.musicPath;
        aVMusicWaveBean.videoLenght = this.videoLenght;
        aVMusicWaveBean.musicLength = this.musicLength;
        return aVMusicWaveBean;
    }

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final String getMusicPath() {
        return this.musicPath;
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

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        this.musicWavePointArray = fArr;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }
}
