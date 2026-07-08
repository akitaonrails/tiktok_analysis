package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RatingInfo {

    @C09CT("rating")
    public final String rating;

    @C09CT("exp_rate_percentile")
    public final Integer ratingPercentile;

    @C09CT("show_rate_not_applicable")
    public final Boolean ratingShowNA;

    @C09CT("rate_display_style")
    public final Integer ratingStyle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingInfo)) {
            return false;
        }
        RatingInfo ratingInfo = (RatingInfo) obj;
        return Intrinsics.LJFF(this.rating, ratingInfo.rating) && Intrinsics.LJFF(this.ratingPercentile, ratingInfo.ratingPercentile) && Intrinsics.LJFF(this.ratingStyle, ratingInfo.ratingStyle) && Intrinsics.LJFF(this.ratingShowNA, ratingInfo.ratingShowNA);
    }

    public final int hashCode() {
        String str = this.rating;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.ratingPercentile;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ratingStyle;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.ratingShowNA;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RatingInfo(rating=");
        sbLIZ.append(this.rating);
        sbLIZ.append(", ratingPercentile=");
        sbLIZ.append(this.ratingPercentile);
        sbLIZ.append(", ratingStyle=");
        sbLIZ.append(this.ratingStyle);
        sbLIZ.append(", ratingShowNA=");
        sbLIZ.append(this.ratingShowNA);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RatingInfo(String str, Integer num, Integer num2, Boolean bool) {
        this.rating = str;
        this.ratingPercentile = num;
        this.ratingStyle = num2;
        this.ratingShowNA = bool;
    }
}
