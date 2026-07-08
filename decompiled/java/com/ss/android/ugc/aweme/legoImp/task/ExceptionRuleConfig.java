package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ExceptionRuleConfig {

    @C09CT("app_id")
    public final int appId;

    @C09CT("cls_name")
    public final String className;

    @C09CT("deopt_methods")
    public final DeoptMethod[] deoptMethods;

    @C09CT("excep_cls_name")
    public final String exceptionClassName;

    @C09CT("excep_msg")
    public final String exceptionMessage;

    @C09CT("dex_pc")
    public final int jumpDexPc;

    @C09CT("meth_name")
    public final String methodName;

    @C09CT("sig_name")
    public final String methodSignature;

    @C09CT("mode")
    public final int mode;

    @C09CT("version_name")
    public final String versionName;

    public ExceptionRuleConfig() {
        this("", "", "", "", null, -1, 0, null, null, -1);
    }

    public ExceptionRuleConfig(String str, String str2, String str3, String str4, String str5, int i, int i2, DeoptMethod[] deoptMethodArr, String str6, int i3) {
        this.className = str;
        this.methodName = str2;
        this.methodSignature = str3;
        this.exceptionClassName = str4;
        this.exceptionMessage = str5;
        this.jumpDexPc = i;
        this.mode = i2;
        this.deoptMethods = deoptMethodArr;
        this.versionName = str6;
        this.appId = i3;
    }
}
