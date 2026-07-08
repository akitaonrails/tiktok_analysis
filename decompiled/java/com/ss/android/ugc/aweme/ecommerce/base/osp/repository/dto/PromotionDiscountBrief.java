package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionDiscountBrief {

    @C09CT("discount_info")
    public ExceptionUX discountInfo;

    @C09CT("discount_text")
    public ColorText discountText;

    @C09CT("discount_title")
    public String discountTitle;

    public PromotionDiscountBrief() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionDiscountBrief)) {
            return false;
        }
        PromotionDiscountBrief promotionDiscountBrief = (PromotionDiscountBrief) obj;
        return Intrinsics.LJFF(this.discountTitle, promotionDiscountBrief.discountTitle) && Intrinsics.LJFF(this.discountText, promotionDiscountBrief.discountText) && Intrinsics.LJFF(this.discountInfo, promotionDiscountBrief.discountInfo);
    }

    public final int hashCode() {
        String str = this.discountTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ColorText colorText = this.discountText;
        int iHashCode2 = (iHashCode + (colorText == null ? 0 : colorText.hashCode())) * 31;
        ExceptionUX exceptionUX = this.discountInfo;
        return iHashCode2 + (exceptionUX != null ? exceptionUX.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionDiscountBrief(discountTitle=");
        sbLIZ.append(this.discountTitle);
        sbLIZ.append(", discountText=");
        sbLIZ.append(this.discountText);
        sbLIZ.append(", discountInfo=");
        sbLIZ.append(this.discountInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionDiscountBrief(String str, ColorText colorText, ExceptionUX exceptionUX) {
        this.discountTitle = str;
        this.discountText = colorText;
        this.discountInfo = exceptionUX;
    }
}
