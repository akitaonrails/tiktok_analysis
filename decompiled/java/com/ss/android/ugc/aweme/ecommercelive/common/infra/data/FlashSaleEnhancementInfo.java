package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FlashSaleEnhancementInfo {

    @C09CT("buyer_infos")
    public final List<FlashSaleBuyerInfo> buyerInfos;

    @C09CT("enhancement_price_curve_info")
    public final FlashSaleEnhancementPriceCurveInfo enhancementPriceCurveInfo;

    @C09CT("enhancement_style")
    public final int enhancementStyle;

    @C09CT("enhancement_text_info")
    public final FlashSaleEnhancementTextInfo enhancementTextInfo;

    public FlashSaleEnhancementInfo() {
        this(0, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSaleEnhancementInfo)) {
            return false;
        }
        FlashSaleEnhancementInfo flashSaleEnhancementInfo = (FlashSaleEnhancementInfo) obj;
        return this.enhancementStyle == flashSaleEnhancementInfo.enhancementStyle && Intrinsics.LJFF(this.buyerInfos, flashSaleEnhancementInfo.buyerInfos) && Intrinsics.LJFF(this.enhancementTextInfo, flashSaleEnhancementInfo.enhancementTextInfo) && Intrinsics.LJFF(this.enhancementPriceCurveInfo, flashSaleEnhancementInfo.enhancementPriceCurveInfo);
    }

    public final int hashCode() {
        int iHashCode = ((this.enhancementStyle * 31) + this.buyerInfos.hashCode()) * 31;
        FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo = this.enhancementTextInfo;
        int iHashCode2 = (iHashCode + (flashSaleEnhancementTextInfo == null ? 0 : flashSaleEnhancementTextInfo.hashCode())) * 31;
        FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo = this.enhancementPriceCurveInfo;
        return iHashCode2 + (flashSaleEnhancementPriceCurveInfo != null ? flashSaleEnhancementPriceCurveInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleEnhancementInfo(enhancementStyle=");
        sbLIZ.append(this.enhancementStyle);
        sbLIZ.append(", buyerInfos=");
        sbLIZ.append(this.buyerInfos);
        sbLIZ.append(", enhancementTextInfo=");
        sbLIZ.append(this.enhancementTextInfo);
        sbLIZ.append(", enhancementPriceCurveInfo=");
        sbLIZ.append(this.enhancementPriceCurveInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleEnhancementInfo(int i, List<FlashSaleBuyerInfo> list, FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo, FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo) {
        this.enhancementStyle = i;
        this.buyerInfos = list;
        this.enhancementTextInfo = flashSaleEnhancementTextInfo;
        this.enhancementPriceCurveInfo = flashSaleEnhancementPriceCurveInfo;
    }

    public FlashSaleEnhancementInfo(int i, List list, FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo, FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? null : flashSaleEnhancementTextInfo, (i2 & 8) != 0 ? null : flashSaleEnhancementPriceCurveInfo);
    }
}
