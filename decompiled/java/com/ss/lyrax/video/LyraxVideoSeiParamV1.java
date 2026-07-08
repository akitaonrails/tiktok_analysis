package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoSeiParamV1 {
    public int channelId;
    public boolean enableParallelMode;
    public int repeatCount;
    public byte[] seiData;

    public LyraxVideoSeiParamV1() {
        this.repeatCount = 2;
    }

    public boolean EnableParallelMode() {
        return this.enableParallelMode;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public byte[] getSeiData() {
        return this.seiData;
    }

    public LyraxVideoSeiParamV1(byte[] bArr, int i, boolean z) {
        this.seiData = bArr;
        this.repeatCount = i;
        this.enableParallelMode = z;
    }
}
