package com.ss.android.ugc.aweme.tools.music.music.recent.cache;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class LruCacheMusicModel {

    @C09CT("LJJLL")
    public final boolean isFromAutoSelection;

    @C09CT("LJJLJLI")
    public final String musicId;

    @C09CT("LJJZ")
    public final String originalSelectedFrom;

    public LruCacheMusicModel(String str, boolean z, String str2) {
        this.musicId = str;
        this.isFromAutoSelection = z;
        this.originalSelectedFrom = str2;
    }
}
