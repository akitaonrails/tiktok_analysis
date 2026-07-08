package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionCouponModuleSubItem {

    @C09CT("badge_background_color")
    public CommonColor badgeBackgroundColor;

    @C09CT("badge_text")
    public ECRichText badgeText;

    @C09CT("coupon_count")
    public Integer couponCount;

    @C09CT("discount_text")
    public ECRichText discountText;

    @C09CT("title")
    public ECRichText title;

    public PromotionCouponModuleSubItem() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionCouponModuleSubItem)) {
            return false;
        }
        PromotionCouponModuleSubItem promotionCouponModuleSubItem = (PromotionCouponModuleSubItem) obj;
        return Intrinsics.LJFF(this.title, promotionCouponModuleSubItem.title) && Intrinsics.LJFF(this.badgeText, promotionCouponModuleSubItem.badgeText) && Intrinsics.LJFF(this.badgeBackgroundColor, promotionCouponModuleSubItem.badgeBackgroundColor) && Intrinsics.LJFF(this.discountText, promotionCouponModuleSubItem.discountText) && Intrinsics.LJFF(this.couponCount, promotionCouponModuleSubItem.couponCount);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.badgeText;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        CommonColor commonColor = this.badgeBackgroundColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        ECRichText eCRichText3 = this.discountText;
        int iHashCode4 = (iHashCode3 + (eCRichText3 == null ? 0 : eCRichText3.hashCode())) * 31;
        Integer num = this.couponCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionCouponModuleSubItem(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", badgeText=");
        sbLIZ.append(this.badgeText);
        sbLIZ.append(", badgeBackgroundColor=");
        sbLIZ.append(this.badgeBackgroundColor);
        sbLIZ.append(", discountText=");
        sbLIZ.append(this.discountText);
        sbLIZ.append(", couponCount=");
        sbLIZ.append(this.couponCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionCouponModuleSubItem(ECRichText eCRichText, ECRichText eCRichText2, CommonColor commonColor, ECRichText eCRichText3, Integer num) {
        this.title = eCRichText;
        this.badgeText = eCRichText2;
        this.badgeBackgroundColor = commonColor;
        this.discountText = eCRichText3;
        this.couponCount = num;
    }
}
