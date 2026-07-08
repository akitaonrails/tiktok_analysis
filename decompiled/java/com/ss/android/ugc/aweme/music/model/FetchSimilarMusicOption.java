package com.ss.android.ugc.aweme.music.model;

/* JADX INFO: loaded from: classes19.dex */
public final class FetchSimilarMusicOption {
    public final String creationId;
    public final int cursor;
    public final String enterFrom;
    public final String musicId;
    public final int pageSize;
    public final String shootWay;
    public final boolean useSimilarMusic;

    public FetchSimilarMusicOption(String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        this.musicId = str;
        this.creationId = str2;
        this.shootWay = str3;
        this.enterFrom = str4;
        this.cursor = i;
        this.pageSize = i2;
        this.useSimilarMusic = z;
    }
}
