package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POTip {

    @C09CT("content")
    public final PipoRichText content;

    public POTip() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof POTip) && Intrinsics.LJFF(this.content, ((POTip) obj).content);
    }

    public final int hashCode() {
        PipoRichText pipoRichText = this.content;
        if (pipoRichText == null) {
            return 0;
        }
        return pipoRichText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POTip(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POTip(PipoRichText pipoRichText) {
        this.content = pipoRichText;
    }
}
