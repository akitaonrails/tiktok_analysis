package com.ss.android.ugc.aweme.tako.entrance.model;

import X.C2188811AlT;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoFeedNormalEntranceHotspotLayoutConfig {
    public static final int $stable = 8;
    public final Rect hotspotPadding;
    public final int rootHeightDp;
    public final int rootWidthDp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoFeedNormalEntranceHotspotLayoutConfig)) {
            return false;
        }
        TakoFeedNormalEntranceHotspotLayoutConfig takoFeedNormalEntranceHotspotLayoutConfig = (TakoFeedNormalEntranceHotspotLayoutConfig) obj;
        return this.rootWidthDp == takoFeedNormalEntranceHotspotLayoutConfig.rootWidthDp && this.rootHeightDp == takoFeedNormalEntranceHotspotLayoutConfig.rootHeightDp && Intrinsics.LJFF(this.hotspotPadding, takoFeedNormalEntranceHotspotLayoutConfig.hotspotPadding);
    }

    public int hashCode() {
        return (((this.rootWidthDp * 31) + this.rootHeightDp) * 31) + this.hotspotPadding.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFeedNormalEntranceHotspotLayoutConfig(rootWidthDp=");
        sbLIZ.append(this.rootWidthDp);
        sbLIZ.append(", rootHeightDp=");
        sbLIZ.append(this.rootHeightDp);
        sbLIZ.append(", hotspotPadding=");
        sbLIZ.append(this.hotspotPadding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoFeedNormalEntranceHotspotLayoutConfig(int i, int i2, Rect rect) {
        this.rootWidthDp = i;
        this.rootHeightDp = i2;
        this.hotspotPadding = rect;
    }
}
