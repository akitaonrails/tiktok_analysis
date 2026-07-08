package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class AutoDubbingStatusResponse implements Serializable {

    @C09CT("enable_dubbing_for_post")
    public final boolean enableDubbingForPost;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public AutoDubbingStatusResponse() {
        this(0, null, false);
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public AutoDubbingStatusResponse(int i, String str, boolean z) {
        this.statusCode = i;
        this.statusMsg = str;
        this.enableDubbingForPost = z;
    }
}
