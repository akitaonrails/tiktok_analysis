package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PineDramaMidInsertRequest {

    @C09CT("consumed_items")
    public List<MidInsertRequest> consumedItems;

    @C09CT("current_feed_items")
    public List<MidInsertRequest> currentFeedItems;

    @C09CT("enable_end_card")
    public Boolean enableEndCard;

    @C09CT("need_info")
    public Boolean needInfo;

    public PineDramaMidInsertRequest() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PineDramaMidInsertRequest)) {
            return false;
        }
        PineDramaMidInsertRequest pineDramaMidInsertRequest = (PineDramaMidInsertRequest) obj;
        return Intrinsics.LJFF(this.needInfo, pineDramaMidInsertRequest.needInfo) && Intrinsics.LJFF(this.currentFeedItems, pineDramaMidInsertRequest.currentFeedItems) && Intrinsics.LJFF(this.consumedItems, pineDramaMidInsertRequest.consumedItems) && Intrinsics.LJFF(this.enableEndCard, pineDramaMidInsertRequest.enableEndCard);
    }

    public final int hashCode() {
        Boolean bool = this.needInfo;
        int iHashCode = (((((bool == null ? 0 : bool.hashCode()) * 31) + this.currentFeedItems.hashCode()) * 31) + this.consumedItems.hashCode()) * 31;
        Boolean bool2 = this.enableEndCard;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDramaMidInsertRequest(needInfo=");
        sbLIZ.append(this.needInfo);
        sbLIZ.append(", currentFeedItems=");
        sbLIZ.append(this.currentFeedItems);
        sbLIZ.append(", consumedItems=");
        sbLIZ.append(this.consumedItems);
        sbLIZ.append(", enableEndCard=");
        sbLIZ.append(this.enableEndCard);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PineDramaMidInsertRequest(Boolean bool, List<MidInsertRequest> list, List<MidInsertRequest> list2, Boolean bool2) {
        this.needInfo = bool;
        this.currentFeedItems = list;
        this.consumedItems = list2;
        this.enableEndCard = bool2;
    }

    public PineDramaMidInsertRequest(Boolean bool, List list, List list2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? Boolean.FALSE : bool2);
    }
}
