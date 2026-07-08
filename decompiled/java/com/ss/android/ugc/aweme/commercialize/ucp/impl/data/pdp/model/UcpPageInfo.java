package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpPageInfo {

    @C09CT("referrer")
    public final String referrer;

    @C09CT("url")
    public final String url;

    public UcpPageInfo() {
        this(null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpPageInfo)) {
            return false;
        }
        UcpPageInfo ucpPageInfo = (UcpPageInfo) obj;
        return Intrinsics.LJFF(this.url, ucpPageInfo.url) && Intrinsics.LJFF(this.referrer, ucpPageInfo.referrer);
    }

    public final int hashCode() {
        String str = this.url;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.referrer.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpPageInfo(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", referrer=");
        sbLIZ.append(this.referrer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpPageInfo(String str, String str2) {
        this.url = str;
        this.referrer = str2;
    }
}
