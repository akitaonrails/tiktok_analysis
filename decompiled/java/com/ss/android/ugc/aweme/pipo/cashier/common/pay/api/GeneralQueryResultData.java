package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes27.dex */
public final class GeneralQueryResultData {

    @C09CT("action")
    public final String action;

    @C09CT("action_extra")
    public final n actionExtra;

    @C09CT("action_url")
    public final String actionUrl;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_content")
    public final String errorContent;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("material_content")
    public final String materialContent;

    @C09CT("result_code")
    public final String resultCode;

    public GeneralQueryResultData() {
        this(null, null, null, null, null, null, null, null);
    }

    public GeneralQueryResultData(String str, String str2, String str3, String str4, String str5, String str6, String str7, n nVar) {
        this.resultCode = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.errorContent = str4;
        this.action = str5;
        this.actionUrl = str6;
        this.materialContent = str7;
        this.actionExtra = nVar;
    }
}
