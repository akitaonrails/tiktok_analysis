package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class BusinessLinksCountResponse implements Serializable {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("total")
    public final int total;

    public BusinessLinksCountResponse(int i, String str, int i2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.total = i2;
    }
}
