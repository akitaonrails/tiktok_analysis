package com.shopify.checkout.models.errors;

import X.C08FF;
import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public enum InternalErrorReasons {
    InvalidErrorType("invalid_error_type"),
    FailToParseErrorJson("fail_to_parse_error_json"),
    FailToParseMessage("fail_to_parse_message"),
    FailToEncodeBuyerIdentity("fail_to_encode_buyer_identity"),
    WebViewOnError("webview_on_error");


    @C09CT("value")
    public final String value;

    public static InternalErrorReasons valueOf(String str) {
        return (InternalErrorReasons) C08FF.LIZ(InternalErrorReasons.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    InternalErrorReasons(String str) {
        this.value = str;
    }
}
