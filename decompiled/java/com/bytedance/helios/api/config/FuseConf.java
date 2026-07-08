package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class FuseConf {

    @C09CT("code")
    public final int code;

    @C09CT("message")
    public final String message;

    public FuseConf() {
        this(410, "this api is not allow");
    }

    public FuseConf(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
