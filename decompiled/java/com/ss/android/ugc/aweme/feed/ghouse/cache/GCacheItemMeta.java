package com.ss.android.ugc.aweme.feed.ghouse.cache;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class GCacheItemMeta {

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("cache_bitrate")
    public final int cacheBitrate;

    @C09CT("creation_date")
    public final long creationDate;

    @C09CT("shelf_life_ms")
    public final long shelfLifeMS;

    @C09CT("sort_key")
    public final long sortKey;

    @C09CT("sort_score")
    public final float sortScore;

    @C09CT("sort_snapshot")
    public final String sortSnapshot;

    @C09CT("source")
    public final String source;

    @C09CT("video_file_path")
    public final String videoFilePath;

    public GCacheItemMeta() {
        this("", 0L, 0L, "", "", 0L, 0.0f, "", 0);
    }

    public GCacheItemMeta(String str, long j, long j2, String str2, String str3, long j3, float f, String str4, int i) {
        this.aid = str;
        this.creationDate = j;
        this.sortKey = j2;
        this.videoFilePath = str2;
        this.source = str3;
        this.shelfLifeMS = j3;
        this.sortScore = f;
        this.sortSnapshot = str4;
        this.cacheBitrate = i;
    }
}
