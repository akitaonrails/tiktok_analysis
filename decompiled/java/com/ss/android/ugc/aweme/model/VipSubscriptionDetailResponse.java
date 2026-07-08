package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VipSubscriptionDetailResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("card_background_img")
    public final com.ss.android.ugc.aweme.base.model.UrlModel cardBackgroundImg;

    @C09CT("detail")
    public final VipSubscriptionDetail detail;

    @C09CT("entitlements")
    public final List<VipSubscriptionEntitlement> entitlements;

    @C09CT("purchase_option_background_img")
    public final com.ss.android.ugc.aweme.base.model.UrlModel purchaseOptionBackgroundImg;

    @C09CT("subs_options")
    public final List<VipSubscriptionPurchaseOption> subsOptions;

    public VipSubscriptionDetailResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipSubscriptionDetailResponse)) {
            return false;
        }
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = (VipSubscriptionDetailResponse) obj;
        return Intrinsics.LJFF(this.detail, vipSubscriptionDetailResponse.detail) && Intrinsics.LJFF(this.cardBackgroundImg, vipSubscriptionDetailResponse.cardBackgroundImg) && Intrinsics.LJFF(this.purchaseOptionBackgroundImg, vipSubscriptionDetailResponse.purchaseOptionBackgroundImg) && Intrinsics.LJFF(this.subsOptions, vipSubscriptionDetailResponse.subsOptions) && Intrinsics.LJFF(this.entitlements, vipSubscriptionDetailResponse.entitlements);
    }

    public int hashCode() {
        VipSubscriptionDetail vipSubscriptionDetail = this.detail;
        int iHashCode = (vipSubscriptionDetail == null ? 0 : vipSubscriptionDetail.hashCode()) * 31;
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel = this.cardBackgroundImg;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = this.purchaseOptionBackgroundImg;
        return ((((iHashCode2 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31) + this.subsOptions.hashCode()) * 31) + this.entitlements.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VipSubscriptionDetailResponse(detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(", cardBackgroundImg=");
        sbLIZ.append(this.cardBackgroundImg);
        sbLIZ.append(", purchaseOptionBackgroundImg=");
        sbLIZ.append(this.purchaseOptionBackgroundImg);
        sbLIZ.append(", subsOptions=");
        sbLIZ.append(this.subsOptions);
        sbLIZ.append(", entitlements=");
        sbLIZ.append(this.entitlements);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VipSubscriptionDetailResponse(VipSubscriptionDetail vipSubscriptionDetail, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, com.ss.android.ugc.aweme.base.model.UrlModel urlModel2, List<VipSubscriptionPurchaseOption> list, List<VipSubscriptionEntitlement> list2) {
        this.detail = vipSubscriptionDetail;
        this.cardBackgroundImg = urlModel;
        this.purchaseOptionBackgroundImg = urlModel2;
        this.subsOptions = list;
        this.entitlements = list2;
    }

    public VipSubscriptionDetailResponse(VipSubscriptionDetail vipSubscriptionDetail, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, com.ss.android.ugc.aweme.base.model.UrlModel urlModel2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : vipSubscriptionDetail, (i & 2) != 0 ? null : urlModel, (i & 4) == 0 ? urlModel2 : null, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
