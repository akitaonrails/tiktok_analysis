package com.shopify.checkout.models.errors;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum InternalErrorCode {
    WebviewFailedToLoad,
    DecodingError,
    EncodingError;

    public static InternalErrorCode valueOf(String str) {
        return (InternalErrorCode) C08FF.LIZ(InternalErrorCode.class, str);
    }
}
