package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POPromotion {

    @C09CT("url")
    public final String rawUrl;

    @C09CT("desc_selected")
    public final PipoRichText selectedText;

    @C09CT("desc")
    public final PipoRichText text;

    public POPromotion() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POPromotion)) {
            return false;
        }
        POPromotion pOPromotion = (POPromotion) obj;
        return Intrinsics.LJFF(this.text, pOPromotion.text) && Intrinsics.LJFF(this.selectedText, pOPromotion.selectedText) && Intrinsics.LJFF(this.rawUrl, pOPromotion.rawUrl);
    }

    public final int hashCode() {
        PipoRichText pipoRichText = this.text;
        int iHashCode = (pipoRichText == null ? 0 : pipoRichText.hashCode()) * 31;
        PipoRichText pipoRichText2 = this.selectedText;
        int iHashCode2 = (iHashCode + (pipoRichText2 == null ? 0 : pipoRichText2.hashCode())) * 31;
        String str = this.rawUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POPromotion(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", selectedText=");
        sbLIZ.append(this.selectedText);
        sbLIZ.append(", rawUrl=");
        sbLIZ.append(this.rawUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POPromotion(PipoRichText pipoRichText, PipoRichText pipoRichText2, String str) {
        this.text = pipoRichText;
        this.selectedText = pipoRichText2;
        this.rawUrl = str;
    }
}
