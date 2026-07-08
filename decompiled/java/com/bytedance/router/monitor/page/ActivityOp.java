package com.bytedance.router.monitor.page;

/* JADX INFO: loaded from: classes36.dex */
public final class ActivityOp {
    public final CallerInfo caller;
    public final CallerInfo redirect;
    public final String sysMethod;
    public final String traceId;

    public ActivityOp(String str, CallerInfo callerInfo, CallerInfo callerInfo2, String str2) {
        this.traceId = str;
        this.caller = callerInfo;
        this.redirect = callerInfo2;
        this.sysMethod = str2;
    }
}
