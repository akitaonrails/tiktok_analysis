package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoCodecConfig {
    public LyraxVideoCodecMode codecMode;
    public LyraxVideoCodecType codecType;

    public int getCodecMode() {
        return this.codecMode.value();
    }

    public int getCodecType() {
        return this.codecType.value();
    }

    public LyraxVideoCodecConfig(LyraxVideoCodecType lyraxVideoCodecType, LyraxVideoCodecMode lyraxVideoCodecMode) {
        this.codecType = LyraxVideoCodecType.AUTO;
        this.codecType = lyraxVideoCodecType;
        this.codecMode = lyraxVideoCodecMode;
    }
}
