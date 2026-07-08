package com.ss.android.ugc.aweme.pipo.errorsdk.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ClientVisualExpressionRequest {

    @C09CT("error_type")
    public final String errorType;

    @C09CT("locale")
    public final String locale;

    @C09CT("mid")
    public final String mid;

    @C09CT("muid")
    public final String muid;

    @C09CT("product")
    public final String product;

    @C09CT("version")
    public final String version;

    public ClientVisualExpressionRequest() {
        this(null, null, null, null, null, null);
    }

    public ClientVisualExpressionRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.product = str;
        this.locale = str2;
        this.errorType = str3;
        this.mid = str4;
        this.muid = str5;
        this.version = str6;
    }
}
