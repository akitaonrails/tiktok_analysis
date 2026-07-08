package com.ss.android.ugc.aweme.cct;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCCTLogModel implements Serializable {

    @C09CT("is_from_jsb")
    public boolean isFromJSB;

    @C09CT("refer")
    public String refer;

    @C09CT("session_id")
    public String sessionId;

    public AdCCTLogModel() {
        this(null, null, false);
    }

    public final String getRefer() {
        return this.refer;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean isFromJSB() {
        return this.isFromJSB;
    }

    public final void setFromJSB(boolean z) {
        this.isFromJSB = z;
    }

    public final void setRefer(String str) {
        this.refer = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public AdCCTLogModel(String str, String str2, boolean z) {
        this.refer = str;
        this.sessionId = str2;
        this.isFromJSB = z;
    }
}
