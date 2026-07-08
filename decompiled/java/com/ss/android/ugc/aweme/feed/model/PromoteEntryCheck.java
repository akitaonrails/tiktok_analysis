package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class PromoteEntryCheck implements Serializable {

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    @C09CT("url")
    public String url = "";

    @C09CT("promote_status")
    public Integer promoteStatus = 0;

    public final Integer getPromoteStatus() {
        return this.promoteStatus;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setPromoteStatus(Integer num) {
        this.promoteStatus = num;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
