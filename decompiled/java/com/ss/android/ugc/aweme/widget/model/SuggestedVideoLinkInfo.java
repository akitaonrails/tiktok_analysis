package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SuggestedVideoLinkInfo {

    @C09CT("deep_link")
    public final String deepLink;

    public SuggestedVideoLinkInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuggestedVideoLinkInfo) && Intrinsics.LJFF(this.deepLink, ((SuggestedVideoLinkInfo) obj).deepLink);
    }

    public int hashCode() {
        String str = this.deepLink;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoLinkInfo(deepLink=");
        sbLIZ.append(this.deepLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoLinkInfo(String str) {
        this.deepLink = str;
    }
}
