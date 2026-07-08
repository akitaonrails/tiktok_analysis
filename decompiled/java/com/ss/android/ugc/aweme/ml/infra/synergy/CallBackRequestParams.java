package com.ss.android.ugc.aweme.ml.infra.synergy;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class CallBackRequestParams {

    @C09CT("biz")
    public final String biz;

    @C09CT("request_id")
    public final String dataType;

    public CallBackRequestParams() {
        this("", "");
    }

    public CallBackRequestParams(String str, String str2) {
        this.biz = str;
        this.dataType = str2;
    }
}
