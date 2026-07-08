package com.ss.android.ugc.aweme.feed.ghouse;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class CacheEntry {
    public volatile transient boolean LIZ;
    public volatile transient float LIZIZ;
    public volatile transient String LIZJ;
    public volatile transient int LIZLLL;

    @C09CT("creation_date")
    public final long creationDate;

    @C09CT("key")
    public final String key;

    @C09CT("shelf_life_ms")
    public final long shelfLifeMS;

    @C09CT("sort_key")
    public final long sortKey;

    @C09CT("source")
    public final String source;

    @C09CT("value")
    public Aweme value;

    @C09CT("video_file_path")
    public final String videoFilePath;

    public CacheEntry() {
        this("", 0L, 0L, null, "", "", 0L, false, false, -1.0f, "", 0);
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CacheEntry) {
            return Intrinsics.LJFF(this.key, ((CacheEntry) obj).key);
        }
        return super.equals(obj);
    }

    public CacheEntry(String str, long j, long j2, Aweme aweme, String str2, String str3, long j3, boolean z, boolean z2, float f, String str4, int i) {
        this.key = str;
        this.creationDate = j;
        this.sortKey = j2;
        this.value = aweme;
        this.videoFilePath = str2;
        this.source = str3;
        this.shelfLifeMS = j3;
        this.LIZ = z2;
        this.LIZIZ = f;
        this.LIZJ = str4;
        this.LIZLLL = i;
    }
}
