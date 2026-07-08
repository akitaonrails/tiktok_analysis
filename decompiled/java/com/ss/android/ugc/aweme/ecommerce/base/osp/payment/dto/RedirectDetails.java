package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class RedirectDetails {

    @C09CT("body")
    public final String body;

    @C09CT("header")
    public final String header;

    @C09CT("method")
    public final String method;

    @C09CT("url")
    public final String url;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RedirectDetails(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", method=");
        sbLIZ.append(this.method);
        sbLIZ.append(", header=");
        sbLIZ.append(this.header);
        sbLIZ.append(", body=");
        sbLIZ.append(this.body);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RedirectDetails(String str, String str2, String str3, String str4) {
        this.url = str;
        this.method = str2;
        this.header = str3;
        this.body = str4;
    }
}
