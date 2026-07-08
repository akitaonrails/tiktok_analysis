package com.ss.android.ugc.aweme.offline.nletemplate;

import X.C09CT;
import X.C0LNI;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class AutomationResult implements Serializable {
    public String LL;
    public Throwable LLILLJJLI;

    @C09CT("code")
    public int code;

    @C09CT("msg")
    public String msg;
    public static final C0LNI Companion = new Object() { // from class: X.0LNI
    };
    public static final AutomationResult SUCCESS = new AutomationResult(0, "Success");
    public static final AutomationResult FAIL = new AutomationResult(-1, "Unknown Error");

    public AutomationResult() {
        this(-1, "Unknown Error");
    }

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutomationResult: code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.msg);
        sbLIZ.append(", videoPath=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getCode() {
        return this.code;
    }

    public final Throwable getException() {
        return this.LLILLJJLI;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getVideoPath() {
        return this.LL;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setException(Throwable th) {
        this.LLILLJJLI = th;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }

    public final void setVideoPath(String str) {
        this.LL = str;
    }

    public AutomationResult(int i, String str) {
        this(i, str, "");
    }

    public AutomationResult(int i, String str, String str2) {
        this.code = i;
        this.msg = str;
        this.LL = str2;
    }

    public AutomationResult(int i, String str, Throwable th) {
        this.code = i;
        this.msg = str;
        this.LLILLJJLI = th;
    }
}
