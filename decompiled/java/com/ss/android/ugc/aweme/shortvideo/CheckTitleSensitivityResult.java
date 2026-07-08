package com.ss.android.ugc.aweme.shortvideo;

import X.C09CT;
import X.InterfaceC2126708Uv;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class CheckTitleSensitivityResult implements Serializable {

    @C09CT("post_prompts")
    public PostPrompts postPrompts;

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public Integer statusCode;

    @C09CT("status_msg")
    public String statusMessage;

    public final PostPrompts getPostPrompts() {
        return this.postPrompts;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final void setPostPrompts(PostPrompts postPrompts) {
        this.postPrompts = postPrompts;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMessage(String str) {
        this.statusMessage = str;
    }
}
