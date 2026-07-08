package com.ss.android.ugc.aweme.ecommercebase.promotion.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePriceHideInfo implements Serializable {

    @C09CT("display_text")
    public String displayText;

    public SinglePriceHideInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SinglePriceHideInfo) && Intrinsics.LJFF(this.displayText, ((SinglePriceHideInfo) obj).displayText);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SinglePriceHideInfo(displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SinglePriceHideInfo(String str) {
        this.displayText = str;
    }

    public final void setDisplayText(String str) {
        this.displayText = str;
    }
}
