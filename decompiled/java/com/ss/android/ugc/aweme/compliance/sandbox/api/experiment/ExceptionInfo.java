package com.ss.android.ugc.aweme.compliance.sandbox.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ExceptionInfo {

    @C09CT("exceptionType")
    public final String exceptionType;

    @C09CT("stackClassName")
    public String stackClassName;

    @C09CT("stackMethodName")
    public String stackMethodName;

    public ExceptionInfo() {
        this("", "", "");
    }

    public ExceptionInfo(String str, String str2, String str3) {
        this.exceptionType = str;
        this.stackClassName = str2;
        this.stackMethodName = str3;
    }
}
