package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreLruCacheConfig {

    @C09CT("enable_fake_refresh")
    public final boolean enableFakeRefresh;

    @C09CT("enable_hot_cache")
    public final boolean enableHotCache;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("fake_refresh_pool_size")
    public final int fakeRefreshPoolSize;

    @C09CT("hot_cache_pool_size")
    public final int hotCachePoolSize;

    @C09CT("preload_pool_size")
    public final int preloadPoolSize;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLruCacheConfig)) {
            return false;
        }
        ExploreLruCacheConfig exploreLruCacheConfig = (ExploreLruCacheConfig) obj;
        return this.enablePreload == exploreLruCacheConfig.enablePreload && this.enableFakeRefresh == exploreLruCacheConfig.enableFakeRefresh && this.enableHotCache == exploreLruCacheConfig.enableHotCache && this.preloadPoolSize == exploreLruCacheConfig.preloadPoolSize && this.fakeRefreshPoolSize == exploreLruCacheConfig.fakeRefreshPoolSize && this.hotCachePoolSize == exploreLruCacheConfig.hotCachePoolSize;
    }

    public int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enablePreload) * 31) + C786410Ut5.Z2(this.enableFakeRefresh)) * 31) + C786410Ut5.Z2(this.enableHotCache)) * 31) + this.preloadPoolSize) * 31) + this.fakeRefreshPoolSize) * 31) + this.hotCachePoolSize;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLruCacheConfig(enablePreload=");
        sbLIZ.append(this.enablePreload);
        sbLIZ.append(", enableFakeRefresh=");
        sbLIZ.append(this.enableFakeRefresh);
        sbLIZ.append(", enableHotCache=");
        sbLIZ.append(this.enableHotCache);
        sbLIZ.append(", preloadPoolSize=");
        sbLIZ.append(this.preloadPoolSize);
        sbLIZ.append(", fakeRefreshPoolSize=");
        sbLIZ.append(this.fakeRefreshPoolSize);
        sbLIZ.append(", hotCachePoolSize=");
        sbLIZ.append(this.hotCachePoolSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLruCacheConfig() {
        this(false, false, false, 8, 8, 8);
    }

    public ExploreLruCacheConfig(boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        this.enablePreload = z;
        this.enableFakeRefresh = z2;
        this.enableHotCache = z3;
        this.preloadPoolSize = i;
        this.fakeRefreshPoolSize = i2;
        this.hotCachePoolSize = i3;
    }
}
