package com.bytedance.pipo.verify.base.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyCodeDetail {

    @C09CT("app_id")
    public final String appId;

    @C09CT("code_type")
    public final String codeType;

    public VerifyCodeDetail() {
        this(null, null);
    }

    public VerifyCodeDetail(String str, String str2) {
        this.codeType = str;
        this.appId = str2;
    }
}
