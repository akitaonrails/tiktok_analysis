package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes7.dex */
public final class DMTypingRecommendationNewPositionConfig {

    @C09CT("item_height")
    public final int itemHeightDp;

    @C09CT("max_favourite")
    public final int maxFavourite;

    @C09CT("max_recent")
    public final int maxRecent;

    @C09CT("max_total")
    public final int maxTotal;

    public DMTypingRecommendationNewPositionConfig() {
        this(5, 25, 30, 72);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMTypingRecommendationNewPositionConfig)) {
            return false;
        }
        DMTypingRecommendationNewPositionConfig dMTypingRecommendationNewPositionConfig = (DMTypingRecommendationNewPositionConfig) obj;
        return this.maxRecent == dMTypingRecommendationNewPositionConfig.maxRecent && this.maxFavourite == dMTypingRecommendationNewPositionConfig.maxFavourite && this.maxTotal == dMTypingRecommendationNewPositionConfig.maxTotal && this.itemHeightDp == dMTypingRecommendationNewPositionConfig.itemHeightDp;
    }

    public final int hashCode() {
        return (((((this.maxRecent * 31) + this.maxFavourite) * 31) + this.maxTotal) * 31) + this.itemHeightDp;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMTypingRecommendationNewPositionConfig(maxRecent=");
        sbLIZ.append(this.maxRecent);
        sbLIZ.append(", maxFavourite=");
        sbLIZ.append(this.maxFavourite);
        sbLIZ.append(", maxTotal=");
        sbLIZ.append(this.maxTotal);
        sbLIZ.append(", itemHeightDp=");
        sbLIZ.append(this.itemHeightDp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DMTypingRecommendationNewPositionConfig(int i, int i2, int i3, int i4) {
        this.maxRecent = i;
        this.maxFavourite = i2;
        this.maxTotal = i3;
        this.itemHeightDp = i4;
    }
}
