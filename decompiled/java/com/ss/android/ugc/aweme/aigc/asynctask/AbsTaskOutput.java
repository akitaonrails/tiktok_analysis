package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbsTaskOutput {

    @C09CT("base_errorCode")
    public final int errorCode;

    @C09CT("base_errorMsg")
    public final String errorMsg;

    @C09CT("base_errorSource")
    public final String errorSource;

    @C09CT("base_fail_reason_msg")
    public final String failReasonMsg;

    @C09CT("base_status")
    public final String status;

    public int LIZ() {
        return this.errorCode;
    }

    public String LIZIZ() {
        return this.errorMsg;
    }

    public String LIZJ() {
        return this.errorSource;
    }

    public String LIZLLL() {
        return this.failReasonMsg;
    }

    public String LJ() {
        return this.status;
    }

    public AbsTaskOutput(String str, int i, String str2, String str3, String str4) {
        this.status = str;
        this.errorCode = i;
        this.errorMsg = str2;
        this.errorSource = str3;
        this.failReasonMsg = str4;
    }
}
