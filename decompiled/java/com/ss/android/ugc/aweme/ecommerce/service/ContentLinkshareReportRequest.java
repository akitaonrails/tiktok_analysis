package com.ss.android.ugc.aweme.ecommerce.service;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentLinkshareReportRequest {

    @C09CT("chain_key")
    public final String chainKey;

    public ContentLinkshareReportRequest() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContentLinkshareReportRequest) && Intrinsics.LJFF(this.chainKey, ((ContentLinkshareReportRequest) obj).chainKey);
    }

    public int hashCode() {
        String str = this.chainKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentLinkshareReportRequest(chainKey=");
        sbLIZ.append(this.chainKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ContentLinkshareReportRequest(String str) {
        this.chainKey = str;
    }
}
