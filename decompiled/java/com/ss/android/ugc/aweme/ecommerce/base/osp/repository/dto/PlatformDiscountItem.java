package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformDiscountItem {

    @C09CT("discount_end_time")
    public Long discountEndTime;

    @C09CT("discount_text")
    public ColorText discountText;

    public PlatformDiscountItem() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformDiscountItem)) {
            return false;
        }
        PlatformDiscountItem platformDiscountItem = (PlatformDiscountItem) obj;
        return Intrinsics.LJFF(this.discountText, platformDiscountItem.discountText) && Intrinsics.LJFF(this.discountEndTime, platformDiscountItem.discountEndTime);
    }

    public final int hashCode() {
        ColorText colorText = this.discountText;
        int iHashCode = (colorText == null ? 0 : colorText.hashCode()) * 31;
        Long l = this.discountEndTime;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlatformDiscountItem(discountText=");
        sbLIZ.append(this.discountText);
        sbLIZ.append(", discountEndTime=");
        sbLIZ.append(this.discountEndTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlatformDiscountItem(ColorText colorText, Long l) {
        this.discountText = colorText;
        this.discountEndTime = l;
    }
}
