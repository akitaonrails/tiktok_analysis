package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.business.popcard.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style.CommonColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VoucherButtonsColor {

    @C09CT("alpha")
    public Float alpha;

    @C09CT("background_color")
    public CommonColor backgroundColor;

    @C09CT("text_color")
    public CommonColor textColor;

    public VoucherButtonsColor() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherButtonsColor)) {
            return false;
        }
        VoucherButtonsColor voucherButtonsColor = (VoucherButtonsColor) obj;
        return Intrinsics.LJFF(this.alpha, voucherButtonsColor.alpha) && Intrinsics.LJFF(this.backgroundColor, voucherButtonsColor.backgroundColor) && Intrinsics.LJFF(this.textColor, voucherButtonsColor.textColor);
    }

    public final int hashCode() {
        Float f = this.alpha;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode2 = (iHashCode + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        CommonColor commonColor2 = this.textColor;
        return iHashCode2 + (commonColor2 != null ? commonColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherButtonsColor(alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VoucherButtonsColor(Float f, CommonColor commonColor, CommonColor commonColor2) {
        this.alpha = f;
        this.backgroundColor = commonColor;
        this.textColor = commonColor2;
    }
}
