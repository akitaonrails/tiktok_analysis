package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class HighLightPromotionInfo {

    @C09CT("discount_desc")
    public String discountDesc;

    @C09CT("discount_icon")
    public Icon discountIcon;

    @C09CT("discount_text")
    public String discountText;

    public HighLightPromotionInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighLightPromotionInfo)) {
            return false;
        }
        HighLightPromotionInfo highLightPromotionInfo = (HighLightPromotionInfo) obj;
        return Intrinsics.LJFF(this.discountIcon, highLightPromotionInfo.discountIcon) && Intrinsics.LJFF(this.discountText, highLightPromotionInfo.discountText) && Intrinsics.LJFF(this.discountDesc, highLightPromotionInfo.discountDesc);
    }

    public final int hashCode() {
        Icon icon = this.discountIcon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.discountText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discountDesc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public HighLightPromotionInfo(Icon icon, String str, String str2) {
        this.discountIcon = icon;
        this.discountText = str;
        this.discountDesc = str2;
    }
}
