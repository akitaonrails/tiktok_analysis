package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionDetailInfo {

    @C09CT("avg_rating")
    public final String avgRating;

    @C09CT("enable_single_video_purchase")
    public final Boolean enableSingleVideoPurchase;

    @C09CT("has_user_partial_purchased")
    public final Boolean hasUserPartialPurchased;

    @C09CT("has_user_purchased")
    public final Boolean hasUserPurchased;

    @C09CT("num_sales")
    public final Long numSales;

    @C09CT("num_videos")
    public final Long numVideos;

    @C09CT("num_views")
    public final Long numViews;

    @C09CT("paid_video_ids")
    public final List<Long> paidVideoIds;

    @C09CT("total_duration")
    public final Long totalDuration;

    public CollectionDetailInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionDetailInfo)) {
            return false;
        }
        CollectionDetailInfo collectionDetailInfo = (CollectionDetailInfo) obj;
        return Intrinsics.LJFF(this.hasUserPurchased, collectionDetailInfo.hasUserPurchased) && Intrinsics.LJFF(this.hasUserPartialPurchased, collectionDetailInfo.hasUserPartialPurchased) && Intrinsics.LJFF(this.numVideos, collectionDetailInfo.numVideos) && Intrinsics.LJFF(this.numSales, collectionDetailInfo.numSales) && Intrinsics.LJFF(this.numViews, collectionDetailInfo.numViews) && Intrinsics.LJFF(this.avgRating, collectionDetailInfo.avgRating) && Intrinsics.LJFF(this.totalDuration, collectionDetailInfo.totalDuration) && Intrinsics.LJFF(this.enableSingleVideoPurchase, collectionDetailInfo.enableSingleVideoPurchase) && Intrinsics.LJFF(this.paidVideoIds, collectionDetailInfo.paidVideoIds);
    }

    public final int hashCode() {
        Boolean bool = this.hasUserPurchased;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasUserPartialPurchased;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.numVideos;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.numSales;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.numViews;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.avgRating;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Long l4 = this.totalDuration;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool3 = this.enableSingleVideoPurchase;
        return ((iHashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.paidVideoIds.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionDetailInfo(hasUserPurchased=");
        sbLIZ.append(this.hasUserPurchased);
        sbLIZ.append(", hasUserPartialPurchased=");
        sbLIZ.append(this.hasUserPartialPurchased);
        sbLIZ.append(", numVideos=");
        sbLIZ.append(this.numVideos);
        sbLIZ.append(", numSales=");
        sbLIZ.append(this.numSales);
        sbLIZ.append(", numViews=");
        sbLIZ.append(this.numViews);
        sbLIZ.append(", avgRating=");
        sbLIZ.append(this.avgRating);
        sbLIZ.append(", totalDuration=");
        sbLIZ.append(this.totalDuration);
        sbLIZ.append(", enableSingleVideoPurchase=");
        sbLIZ.append(this.enableSingleVideoPurchase);
        sbLIZ.append(", paidVideoIds=");
        sbLIZ.append(this.paidVideoIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectionDetailInfo(Boolean bool, Boolean bool2, Long l, Long l2, Long l3, String str, Long l4, Boolean bool3, List<Long> list) {
        this.hasUserPurchased = bool;
        this.hasUserPartialPurchased = bool2;
        this.numVideos = l;
        this.numSales = l2;
        this.numViews = l3;
        this.avgRating = str;
        this.totalDuration = l4;
        this.enableSingleVideoPurchase = bool3;
        this.paidVideoIds = list;
    }

    public CollectionDetailInfo(Boolean bool, Boolean bool2, Long l, Long l2, Long l3, String str, Long l4, Boolean bool3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : l4, (i & 128) == 0 ? bool3 : null, (i & 256) != 0 ? C13BV.INSTANCE : list);
    }
}
