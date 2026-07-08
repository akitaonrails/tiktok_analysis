package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformDiscountBrief {

    @C09CT("not_available_discount_desc")
    public ColorText notAvailableDiscountDesc;

    @C09CT("platform_discount_list")
    public List<PlatformDiscountItem> platformDiscountList;

    public PlatformDiscountBrief() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformDiscountBrief)) {
            return false;
        }
        PlatformDiscountBrief platformDiscountBrief = (PlatformDiscountBrief) obj;
        return Intrinsics.LJFF(this.notAvailableDiscountDesc, platformDiscountBrief.notAvailableDiscountDesc) && Intrinsics.LJFF(this.platformDiscountList, platformDiscountBrief.platformDiscountList);
    }

    public final int hashCode() {
        ColorText colorText = this.notAvailableDiscountDesc;
        int iHashCode = (colorText == null ? 0 : colorText.hashCode()) * 31;
        List<PlatformDiscountItem> list = this.platformDiscountList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlatformDiscountBrief(notAvailableDiscountDesc=");
        sbLIZ.append(this.notAvailableDiscountDesc);
        sbLIZ.append(", platformDiscountList=");
        sbLIZ.append(this.platformDiscountList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlatformDiscountBrief(ColorText colorText, List<PlatformDiscountItem> list) {
        this.notAvailableDiscountDesc = colorText;
        this.platformDiscountList = list;
    }
}
