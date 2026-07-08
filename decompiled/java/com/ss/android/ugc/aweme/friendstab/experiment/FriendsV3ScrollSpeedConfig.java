package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3ScrollSpeedConfig {

    @C09CT("downgrade_hysteresis_ms")
    public final long downgradeHysteresisMs;

    @C09CT("ema_alpha")
    public final float emaAlpha;

    @C09CT("enable_classifier")
    public final boolean enableClassifier;

    @C09CT("enable_scroll_aware_loadmore_offset")
    public final boolean enableScrollAwareLoadMoreOffset;

    @C09CT("enable_scroll_aware_page_count")
    public final boolean enableScrollAwarePageCount;

    @C09CT("fast_to_fling_dp_per_sec")
    public final float fastToFlingDpPerSec;

    @C09CT("normal_to_fast_dp_per_sec")
    public final float normalToFastDpPerSec;

    public FriendsV3ScrollSpeedConfig() {
        this(true, false, false, 2000.0f, 6000.0f, 180L, 0.3f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3ScrollSpeedConfig)) {
            return false;
        }
        FriendsV3ScrollSpeedConfig friendsV3ScrollSpeedConfig = (FriendsV3ScrollSpeedConfig) obj;
        return this.enableClassifier == friendsV3ScrollSpeedConfig.enableClassifier && this.enableScrollAwarePageCount == friendsV3ScrollSpeedConfig.enableScrollAwarePageCount && this.enableScrollAwareLoadMoreOffset == friendsV3ScrollSpeedConfig.enableScrollAwareLoadMoreOffset && Float.compare(this.normalToFastDpPerSec, friendsV3ScrollSpeedConfig.normalToFastDpPerSec) == 0 && Float.compare(this.fastToFlingDpPerSec, friendsV3ScrollSpeedConfig.fastToFlingDpPerSec) == 0 && this.downgradeHysteresisMs == friendsV3ScrollSpeedConfig.downgradeHysteresisMs && Float.compare(this.emaAlpha, friendsV3ScrollSpeedConfig.emaAlpha) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3ScrollSpeedConfig(enableClassifier=");
        sbLIZ.append(this.enableClassifier);
        sbLIZ.append(", enableScrollAwarePageCount=");
        sbLIZ.append(this.enableScrollAwarePageCount);
        sbLIZ.append(", enableScrollAwareLoadMoreOffset=");
        sbLIZ.append(this.enableScrollAwareLoadMoreOffset);
        sbLIZ.append(", normalToFastDpPerSec=");
        sbLIZ.append(this.normalToFastDpPerSec);
        sbLIZ.append(", fastToFlingDpPerSec=");
        sbLIZ.append(this.fastToFlingDpPerSec);
        sbLIZ.append(", downgradeHysteresisMs=");
        sbLIZ.append(this.downgradeHysteresisMs);
        sbLIZ.append(", emaAlpha=");
        sbLIZ.append(this.emaAlpha);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.enableClassifier) * 31) + C786410Ut5.Z2(this.enableScrollAwarePageCount)) * 31) + C786410Ut5.Z2(this.enableScrollAwareLoadMoreOffset)) * 31) + Float.floatToIntBits(this.normalToFastDpPerSec)) * 31) + Float.floatToIntBits(this.fastToFlingDpPerSec)) * 31) + C786410Ut5.Y2(this.downgradeHysteresisMs)) * 31) + Float.floatToIntBits(this.emaAlpha);
    }

    public FriendsV3ScrollSpeedConfig(boolean z, boolean z2, boolean z3, float f, float f2, long j, float f3) {
        this.enableClassifier = z;
        this.enableScrollAwarePageCount = z2;
        this.enableScrollAwareLoadMoreOffset = z3;
        this.normalToFastDpPerSec = f;
        this.fastToFlingDpPerSec = f2;
        this.downgradeHysteresisMs = j;
        this.emaAlpha = f3;
    }
}
