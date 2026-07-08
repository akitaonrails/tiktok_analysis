package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class CacheManagerConfig {

    @C09CT("enable_opt")
    public final boolean enable;

    @C09CT("release_all_lynx_card_when_destroy")
    public final boolean releaseAllWhenDestroy;

    @C09CT("release_buffer_distance")
    public final Integer releaseBufferDistance;

    @C09CT("release_white_list")
    public final ArrayList<Integer> releaseWhiteList;

    @C09CT("rollback_preload_distance")
    public final Integer rollBackPreloadDistance;

    public CacheManagerConfig() {
        this(false, 3, 4, false, null);
    }

    public CacheManagerConfig(boolean z, Integer num, Integer num2, boolean z2, ArrayList<Integer> arrayList) {
        this.enable = z;
        this.rollBackPreloadDistance = num;
        this.releaseBufferDistance = num2;
        this.releaseAllWhenDestroy = z2;
        this.releaseWhiteList = arrayList;
    }
}
