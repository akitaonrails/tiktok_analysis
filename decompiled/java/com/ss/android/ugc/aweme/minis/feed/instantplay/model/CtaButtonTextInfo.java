package com.ss.android.ugc.aweme.minis.feed.instantplay.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CtaButtonTextInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("left_cta_button_text")
    public final String leftCtaButtonText;

    @C09CT("right_cta_button_text")
    public final String rightCtaButtonText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaButtonTextInfo)) {
            return false;
        }
        CtaButtonTextInfo ctaButtonTextInfo = (CtaButtonTextInfo) obj;
        return Intrinsics.LJFF(this.leftCtaButtonText, ctaButtonTextInfo.leftCtaButtonText) && Intrinsics.LJFF(this.rightCtaButtonText, ctaButtonTextInfo.rightCtaButtonText);
    }

    public int hashCode() {
        String str = this.leftCtaButtonText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rightCtaButtonText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CtaButtonTextInfo(leftCtaButtonText=");
        sbLIZ.append(this.leftCtaButtonText);
        sbLIZ.append(", rightCtaButtonText=");
        sbLIZ.append(this.rightCtaButtonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CtaButtonTextInfo(String str, String str2) {
        this.leftCtaButtonText = str;
        this.rightCtaButtonText = str2;
    }
}
