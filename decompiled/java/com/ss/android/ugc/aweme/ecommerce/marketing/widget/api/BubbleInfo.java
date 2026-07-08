package com.ss.android.ugc.aweme.ecommerce.marketing.widget.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BubbleInfo {

    @C09CT("bonus_amount")
    public final String bonusAmount;

    @C09CT("bubble_img")
    public final String bubbleImg;

    @C09CT("bubble_tooltip")
    public final String bubbleTooltip;

    public BubbleInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleInfo)) {
            return false;
        }
        BubbleInfo bubbleInfo = (BubbleInfo) obj;
        return Intrinsics.LJFF(this.bonusAmount, bubbleInfo.bonusAmount) && Intrinsics.LJFF(this.bubbleTooltip, bubbleInfo.bubbleTooltip) && Intrinsics.LJFF(this.bubbleImg, bubbleInfo.bubbleImg);
    }

    public int hashCode() {
        String str = this.bonusAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bubbleTooltip;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bubbleImg;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleInfo(bonusAmount=");
        sbLIZ.append(this.bonusAmount);
        sbLIZ.append(", bubbleTooltip=");
        sbLIZ.append(this.bubbleTooltip);
        sbLIZ.append(", bubbleImg=");
        sbLIZ.append(this.bubbleImg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BubbleInfo(String str, String str2, String str3) {
        this.bonusAmount = str;
        this.bubbleTooltip = str2;
        this.bubbleImg = str3;
    }
}
