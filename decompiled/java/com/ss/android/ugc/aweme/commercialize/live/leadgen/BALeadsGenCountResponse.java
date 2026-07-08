package com.ss.android.ugc.aweme.commercialize.live.leadgen;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class BALeadsGenCountResponse implements Serializable {

    @C09CT("count")
    public final int count;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BALeadsGenCountResponse(int i, String str, int i2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.count = i2;
    }
}
