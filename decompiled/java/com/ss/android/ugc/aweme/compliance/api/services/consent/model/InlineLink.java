package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class InlineLink implements Serializable {
    public static final int $stable = 0;

    @C09CT("text")
    public final String text;

    @C09CT("url")
    public final String url;

    public InlineLink() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineLink)) {
            return false;
        }
        InlineLink inlineLink = (InlineLink) obj;
        return Intrinsics.LJFF(this.text, inlineLink.text) && Intrinsics.LJFF(this.url, inlineLink.url);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineLink(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InlineLink(String str, String str2) {
        this.text = str;
        this.url = str2;
    }
}
