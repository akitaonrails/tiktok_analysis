package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class EnterRoomBoostEntra implements Serializable {

    @C09CT("enter_boost_cache_version")
    public long enterBoostCacheVersion;

    @C09CT("use_enter_boost_cache")
    public long useEnterBoostCache;

    public final long getEnterBoostCacheVersion() {
        return this.enterBoostCacheVersion;
    }

    public final long getUseEnterBoostCache() {
        return this.useEnterBoostCache;
    }

    public final void setEnterBoostCacheVersion(long j) {
        this.enterBoostCacheVersion = j;
    }

    public final void setUseEnterBoostCache(long j) {
        this.useEnterBoostCache = j;
    }
}
