package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Navigator {

    @C09CT("faq_url")
    public final String faqUrl;

    @C09CT("label")
    public final String label;

    public Navigator() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Navigator)) {
            return false;
        }
        Navigator navigator = (Navigator) obj;
        return Intrinsics.LJFF(this.label, navigator.label) && Intrinsics.LJFF(this.faqUrl, navigator.faqUrl);
    }

    public final int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.faqUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Navigator(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(", faqUrl=");
        sbLIZ.append(this.faqUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Navigator(String str, String str2) {
        this.label = str;
        this.faqUrl = str2;
    }
}
