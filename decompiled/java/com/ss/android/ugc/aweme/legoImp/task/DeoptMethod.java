package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class DeoptMethod {

    @C09CT("cls_name")
    public final String className;

    @C09CT("meth_name")
    public final String methodName;

    @C09CT("sig_name")
    public final String methodSignature;

    public DeoptMethod() {
        this("", "", "");
    }

    public DeoptMethod(String str, String str2, String str3) {
        this.className = str;
        this.methodName = str2;
        this.methodSignature = str3;
    }
}
