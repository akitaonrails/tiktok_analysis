package com.ss.android.ugc.aweme.ttep.effectapply;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectFetchApiResBean {

    @C09CT("data")
    public final String data;

    @C09CT("loki_busi_msg")
    public final String lokiBusiMsg;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int status;

    public EffectFetchApiResBean() {
        this("", "", 0, "");
    }

    public EffectFetchApiResBean(String str, String str2, int i, String str3) {
        this.data = str;
        this.message = str2;
        this.status = i;
        this.lokiBusiMsg = str3;
    }
}
