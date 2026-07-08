package com.ss.android.ugc.aweme.signaling.scene.biz;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;

/* JADX INFO: loaded from: classes8.dex */
public final class CacheStatusData extends BaseDownlinkData {
    public static final int $stable = 8;

    @C09CT("cache_expired")
    public final long cacheExpired;

    @C09CT("latest_cache_version")
    public final long latestCacheVersion;

    @C09CT("room_id")
    public final long roomId;

    public final CacheStatusData copy(long j, long j2, long j3) {
        return new CacheStatusData(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheStatusData)) {
            return false;
        }
        CacheStatusData cacheStatusData = (CacheStatusData) obj;
        return this.roomId == cacheStatusData.roomId && this.cacheExpired == cacheStatusData.cacheExpired && this.latestCacheVersion == cacheStatusData.latestCacheVersion;
    }

    public int hashCode() {
        return (((C786410Ut5.Y2(this.roomId) * 31) + C786410Ut5.Y2(this.cacheExpired)) * 31) + C786410Ut5.Y2(this.latestCacheVersion);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheStatusData(roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", cacheExpired=");
        sbLIZ.append(this.cacheExpired);
        sbLIZ.append(", latestCacheVersion=");
        sbLIZ.append(this.latestCacheVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CacheStatusData() {
        this(0L, 0L, 0L);
    }

    public final long getCacheExpired() {
        return this.cacheExpired;
    }

    public final long getLatestCacheVersion() {
        return this.latestCacheVersion;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public CacheStatusData(long j, long j2, long j3) {
        this.roomId = j;
        this.cacheExpired = j2;
        this.latestCacheVersion = j3;
    }
}
