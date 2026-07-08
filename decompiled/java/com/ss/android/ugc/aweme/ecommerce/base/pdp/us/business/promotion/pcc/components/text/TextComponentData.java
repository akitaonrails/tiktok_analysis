package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.text;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TextComponentData {

    @C09CT("max_lines")
    public final Integer maxLines;

    @C09CT("text")
    public final ECRichText text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextComponentData)) {
            return false;
        }
        TextComponentData textComponentData = (TextComponentData) obj;
        return Intrinsics.LJFF(this.text, textComponentData.text) && Intrinsics.LJFF(this.maxLines, textComponentData.maxLines);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Integer num = this.maxLines;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextComponentData(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", maxLines=");
        sbLIZ.append(this.maxLines);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextComponentData(ECRichText eCRichText, Integer num) {
        this.text = eCRichText;
        this.maxLines = num;
    }
}
