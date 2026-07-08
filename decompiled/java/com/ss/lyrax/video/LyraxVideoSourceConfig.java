package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoSourceConfig {
    public LyraxVideoContentType contentType;
    public LyraxVideoSourceType sourceType;

    public LyraxVideoSourceConfig() {
        LyraxVideoSourceType lyraxVideoSourceType = LyraxVideoSourceType.EXTERNAL_RAW_FRAME;
        this.sourceType = lyraxVideoSourceType;
        LyraxVideoContentType lyraxVideoContentType = LyraxVideoContentType.CAMERA;
        this.sourceType = lyraxVideoSourceType;
        this.contentType = lyraxVideoContentType;
    }

    public LyraxVideoContentType getContentType() {
        return this.contentType;
    }

    public LyraxVideoSourceType getSourceType() {
        return this.sourceType;
    }

    public LyraxVideoSourceConfig(LyraxVideoSourceType lyraxVideoSourceType, LyraxVideoContentType lyraxVideoContentType) {
        this.sourceType = LyraxVideoSourceType.EXTERNAL_RAW_FRAME;
        this.sourceType = lyraxVideoSourceType;
        this.contentType = lyraxVideoContentType;
    }
}
