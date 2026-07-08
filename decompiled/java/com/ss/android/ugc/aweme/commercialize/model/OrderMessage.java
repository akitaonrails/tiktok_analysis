package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class OrderMessage implements Serializable {

    @C09CT("msg_type")
    public Integer msgType;

    @C09CT("status_code")
    public Integer statusCode;

    @C09CT("toast_content")
    public String toastContent = "";

    @C09CT("update_time")
    public long updateime;

    public final Integer getMsgType() {
        return this.msgType;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getToastContent() {
        return this.toastContent;
    }

    public final long getUpdateime() {
        return this.updateime;
    }

    public final void setMsgType(Integer num) {
        this.msgType = num;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setToastContent(String str) {
        this.toastContent = str;
    }

    public final void setUpdateime(long j) {
        this.updateime = j;
    }
}
