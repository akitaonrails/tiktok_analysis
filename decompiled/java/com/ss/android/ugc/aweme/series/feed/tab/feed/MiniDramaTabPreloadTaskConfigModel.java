package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MiniDramaTabPreloadTaskConfigModel {

    @C09CT("enable_background_request")
    public final Boolean enableBackgroundRequest;

    @C09CT("max_background_retry_count")
    public final Integer maxBackgroundRetryCount;

    @C09CT("network_retry_count")
    public final Integer networkRetryCount;

    @C09CT("network_retry_delay_ms")
    public final Long networkRetryDelayMs;

    @C09CT("enable_offline_play")
    public final Boolean offlinePlayEnable;

    public MiniDramaTabPreloadTaskConfigModel() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniDramaTabPreloadTaskConfigModel)) {
            return false;
        }
        MiniDramaTabPreloadTaskConfigModel miniDramaTabPreloadTaskConfigModel = (MiniDramaTabPreloadTaskConfigModel) obj;
        return Intrinsics.LJFF(this.maxBackgroundRetryCount, miniDramaTabPreloadTaskConfigModel.maxBackgroundRetryCount) && Intrinsics.LJFF(this.networkRetryCount, miniDramaTabPreloadTaskConfigModel.networkRetryCount) && Intrinsics.LJFF(this.networkRetryDelayMs, miniDramaTabPreloadTaskConfigModel.networkRetryDelayMs) && Intrinsics.LJFF(this.offlinePlayEnable, miniDramaTabPreloadTaskConfigModel.offlinePlayEnable) && Intrinsics.LJFF(this.enableBackgroundRequest, miniDramaTabPreloadTaskConfigModel.enableBackgroundRequest);
    }

    public final int hashCode() {
        Integer num = this.maxBackgroundRetryCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.networkRetryCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.networkRetryDelayMs;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.offlinePlayEnable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableBackgroundRequest;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaTabPreloadTaskConfigModel(maxBackgroundRetryCount=");
        sbLIZ.append(this.maxBackgroundRetryCount);
        sbLIZ.append(", networkRetryCount=");
        sbLIZ.append(this.networkRetryCount);
        sbLIZ.append(", networkRetryDelayMs=");
        sbLIZ.append(this.networkRetryDelayMs);
        sbLIZ.append(", offlinePlayEnable=");
        sbLIZ.append(this.offlinePlayEnable);
        sbLIZ.append(", enableBackgroundRequest=");
        sbLIZ.append(this.enableBackgroundRequest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MiniDramaTabPreloadTaskConfigModel(Integer num, Integer num2, Long l, Boolean bool, Boolean bool2) {
        this.maxBackgroundRetryCount = num;
        this.networkRetryCount = num2;
        this.networkRetryDelayMs = l;
        this.offlinePlayEnable = bool;
        this.enableBackgroundRequest = bool2;
    }
}
