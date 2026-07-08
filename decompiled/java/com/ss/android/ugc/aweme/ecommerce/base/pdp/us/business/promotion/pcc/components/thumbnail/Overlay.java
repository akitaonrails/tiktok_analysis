package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.thumbnail;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class Overlay {

    @C09CT("mask_color")
    public final CommonColor maskColor;

    @C09CT("text")
    public final ECRichText text;

    public Overlay() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Overlay)) {
            return false;
        }
        Overlay overlay = (Overlay) obj;
        return Intrinsics.LJFF(this.text, overlay.text) && Intrinsics.LJFF(this.maskColor, overlay.maskColor);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        CommonColor commonColor = this.maskColor;
        return iHashCode + (commonColor != null ? commonColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Overlay(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", maskColor=");
        sbLIZ.append(this.maskColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Overlay(ECRichText eCRichText, CommonColor commonColor) {
        this.text = eCRichText;
        this.maskColor = commonColor;
    }
}
