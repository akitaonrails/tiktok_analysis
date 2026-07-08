package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class BABCRemoveMe implements Serializable {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
