package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes25.dex */
public final class EcSearchFeedVideoGuideBatchCacheConfigModel {

    @C09CT("disable_enter_from_lru_cache")
    public final int disableEnterFromLruCache;

    @C09CT("max_cache_count")
    public final int maxCacheCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchFeedVideoGuideBatchCacheConfigModel)) {
            return false;
        }
        EcSearchFeedVideoGuideBatchCacheConfigModel ecSearchFeedVideoGuideBatchCacheConfigModel = (EcSearchFeedVideoGuideBatchCacheConfigModel) obj;
        return this.maxCacheCount == ecSearchFeedVideoGuideBatchCacheConfigModel.maxCacheCount && this.disableEnterFromLruCache == ecSearchFeedVideoGuideBatchCacheConfigModel.disableEnterFromLruCache;
    }

    public final int hashCode() {
        return (this.maxCacheCount * 31) + this.disableEnterFromLruCache;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchFeedVideoGuideBatchCacheConfigModel(maxCacheCount=");
        sbLIZ.append(this.maxCacheCount);
        sbLIZ.append(", disableEnterFromLruCache=");
        sbLIZ.append(this.disableEnterFromLruCache);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchFeedVideoGuideBatchCacheConfigModel() {
        this(200, 0);
    }

    public EcSearchFeedVideoGuideBatchCacheConfigModel(int i, int i2) {
        this.maxCacheCount = i;
        this.disableEnterFromLruCache = i2;
    }
}
