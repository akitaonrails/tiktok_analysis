package com.ss.android.ugc.aweme.pipo.errorsdk;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorActionResponse {

    @C09CT("extra")
    public final String extra;

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("oe_code")
    public final String oeCode;

    @C09CT("oe_message")
    public final String oeMessage;

    @C09CT("page")
    public final String page;

    @C09CT("product")
    public final String product;

    @C09CT("ui_data")
    public final ErrorActionUIData uiData;

    public ErrorActionResponse() {
        this(null, null, null, null, null, null, null);
    }

    public ErrorActionResponse(String str, String str2, String str3, String str4, String str5, Boolean bool, ErrorActionUIData errorActionUIData) {
        this.oeCode = str;
        this.product = str2;
        this.page = str3;
        this.extra = str4;
        this.oeMessage = str5;
        this.isDefault = bool;
        this.uiData = errorActionUIData;
    }
}
