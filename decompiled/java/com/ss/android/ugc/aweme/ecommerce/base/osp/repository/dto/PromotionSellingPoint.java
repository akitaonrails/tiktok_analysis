package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionSellingPoint {

    @C09CT("count_down")
    public LabelCountDown countDown;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("icon")
    public Icon icon;

    @C09CT("label_type")
    public Long labelType;

    @C09CT("promotion_id")
    public Long promotionId;

    @C09CT("selling_point_style")
    public SellingPointStyle sellingPointStyle;

    @C09CT("text")
    public String text;

    public PromotionSellingPoint() {
    }

    public final int hashCode() {
        Long l = this.promotionId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.labelType;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.text;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        LabelCountDown labelCountDown = this.countDown;
        int iHashCode5 = (iHashCode4 + (labelCountDown == null ? 0 : labelCountDown.hashCode())) * 31;
        String str2 = this.daInfo;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SellingPointStyle sellingPointStyle = this.sellingPointStyle;
        return iHashCode6 + (sellingPointStyle != null ? sellingPointStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionSellingPoint(promotionId=");
        sbLIZ.append(this.promotionId);
        sbLIZ.append(", labelType=");
        sbLIZ.append(this.labelType);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", countDown=");
        sbLIZ.append(this.countDown);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", sellingPointStyle=");
        sbLIZ.append(this.sellingPointStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionSellingPoint(Long l, Long l2, Icon icon, String str, LabelCountDown labelCountDown, String str2, SellingPointStyle sellingPointStyle) {
        this.promotionId = l;
        this.labelType = l2;
        this.icon = icon;
        this.text = str;
        this.countDown = labelCountDown;
        this.daInfo = str2;
        this.sellingPointStyle = sellingPointStyle;
    }
}
