package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleInfoResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final BundleInfoResponseData data;

    @C09CT("message")
    public final String message;

    public BundleInfoResponse() {
        this(-1, null, null);
    }

    public BundleInfoResponse(Integer num, String str, BundleInfoResponseData bundleInfoResponseData) {
        this.code = num;
        this.message = str;
        this.data = bundleInfoResponseData;
    }
}
