package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class C2PACacheItem {

    @C09CT("aigc_info")
    public final AIGCInfo aigcInfo;

    @C09CT("cache_key")
    public final String cacheKey;

    @C09CT("last_use_time")
    public Long lastUseTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2PACacheItem)) {
            return false;
        }
        C2PACacheItem c2PACacheItem = (C2PACacheItem) obj;
        return Intrinsics.LJFF(this.cacheKey, c2PACacheItem.cacheKey) && Intrinsics.LJFF(this.lastUseTime, c2PACacheItem.lastUseTime) && Intrinsics.LJFF(this.aigcInfo, c2PACacheItem.aigcInfo);
    }

    public final int hashCode() {
        String str = this.cacheKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.lastUseTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        AIGCInfo aIGCInfo = this.aigcInfo;
        return iHashCode2 + (aIGCInfo != null ? aIGCInfo.hashCode() : 0);
    }

    public C2PACacheItem(String str, Long l, AIGCInfo aIGCInfo) {
        this.cacheKey = str;
        this.lastUseTime = l;
        this.aigcInfo = aIGCInfo;
    }
}
