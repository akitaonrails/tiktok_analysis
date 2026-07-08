package com.ss.android.ugc.aweme.tako.entrance.model;

import X.C2188811AlT;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoFeedBubbleEntranceHotspotLayoutConfig {
    public static final int $stable = 8;
    public final Rect hotspotPadding;
    public final int logoMarginBottomDp;
    public final int logoMarginEndDp;
    public final int rootHeightDp;
    public final int rootMarginBottomDp;
    public final int rootMarginEndDp;
    public final int rootWidthDp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoFeedBubbleEntranceHotspotLayoutConfig)) {
            return false;
        }
        TakoFeedBubbleEntranceHotspotLayoutConfig takoFeedBubbleEntranceHotspotLayoutConfig = (TakoFeedBubbleEntranceHotspotLayoutConfig) obj;
        return this.rootWidthDp == takoFeedBubbleEntranceHotspotLayoutConfig.rootWidthDp && this.rootHeightDp == takoFeedBubbleEntranceHotspotLayoutConfig.rootHeightDp && this.rootMarginEndDp == takoFeedBubbleEntranceHotspotLayoutConfig.rootMarginEndDp && this.rootMarginBottomDp == takoFeedBubbleEntranceHotspotLayoutConfig.rootMarginBottomDp && Intrinsics.LJFF(this.hotspotPadding, takoFeedBubbleEntranceHotspotLayoutConfig.hotspotPadding) && this.logoMarginEndDp == takoFeedBubbleEntranceHotspotLayoutConfig.logoMarginEndDp && this.logoMarginBottomDp == takoFeedBubbleEntranceHotspotLayoutConfig.logoMarginBottomDp;
    }

    public int hashCode() {
        return (((((((((((this.rootWidthDp * 31) + this.rootHeightDp) * 31) + this.rootMarginEndDp) * 31) + this.rootMarginBottomDp) * 31) + this.hotspotPadding.hashCode()) * 31) + this.logoMarginEndDp) * 31) + this.logoMarginBottomDp;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFeedBubbleEntranceHotspotLayoutConfig(rootWidthDp=");
        sbLIZ.append(this.rootWidthDp);
        sbLIZ.append(", rootHeightDp=");
        sbLIZ.append(this.rootHeightDp);
        sbLIZ.append(", rootMarginEndDp=");
        sbLIZ.append(this.rootMarginEndDp);
        sbLIZ.append(", rootMarginBottomDp=");
        sbLIZ.append(this.rootMarginBottomDp);
        sbLIZ.append(", hotspotPadding=");
        sbLIZ.append(this.hotspotPadding);
        sbLIZ.append(", logoMarginEndDp=");
        sbLIZ.append(this.logoMarginEndDp);
        sbLIZ.append(", logoMarginBottomDp=");
        sbLIZ.append(this.logoMarginBottomDp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoFeedBubbleEntranceHotspotLayoutConfig(int i, int i2, int i3, int i4, Rect rect, int i5, int i6) {
        this.rootWidthDp = i;
        this.rootHeightDp = i2;
        this.rootMarginEndDp = i3;
        this.rootMarginBottomDp = i4;
        this.hotspotPadding = rect;
        this.logoMarginEndDp = i5;
        this.logoMarginBottomDp = i6;
    }
}
