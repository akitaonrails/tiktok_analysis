package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreCacheKeyOptV2Config {

    @C09CT("chunk0_first")
    public final boolean chunk0First;

    @C09CT("merge_wait_cover")
    public final boolean mergeWaitCover;

    @C09CT("merge_wait_timeout_ms")
    public final long mergeWaitTimeoutMs;

    @C09CT("pre_connect_use_last_domain")
    public final boolean preConnectUseLastDomain;

    public ExploreCacheKeyOptV2Config() {
        this(false, false, 2000L, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreCacheKeyOptV2Config)) {
            return false;
        }
        ExploreCacheKeyOptV2Config exploreCacheKeyOptV2Config = (ExploreCacheKeyOptV2Config) obj;
        return this.chunk0First == exploreCacheKeyOptV2Config.chunk0First && this.mergeWaitCover == exploreCacheKeyOptV2Config.mergeWaitCover && this.mergeWaitTimeoutMs == exploreCacheKeyOptV2Config.mergeWaitTimeoutMs && this.preConnectUseLastDomain == exploreCacheKeyOptV2Config.preConnectUseLastDomain;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.chunk0First) * 31) + C786410Ut5.Z2(this.mergeWaitCover)) * 31) + C786410Ut5.Y2(this.mergeWaitTimeoutMs)) * 31) + C786410Ut5.Z2(this.preConnectUseLastDomain);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreCacheKeyOptV2Config(chunk0First=");
        sbLIZ.append(this.chunk0First);
        sbLIZ.append(", mergeWaitCover=");
        sbLIZ.append(this.mergeWaitCover);
        sbLIZ.append(", mergeWaitTimeoutMs=");
        sbLIZ.append(this.mergeWaitTimeoutMs);
        sbLIZ.append(", preConnectUseLastDomain=");
        sbLIZ.append(this.preConnectUseLastDomain);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreCacheKeyOptV2Config(boolean z, boolean z2, long j, boolean z3) {
        this.chunk0First = z;
        this.mergeWaitCover = z2;
        this.mergeWaitTimeoutMs = j;
        this.preConnectUseLastDomain = z3;
    }
}
