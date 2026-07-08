package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ScanCommonResponse {

    @C09CT("message")
    public final String message;

    @C09CT("data")
    public final ScanCommonResponseData scanCommonResponseData;

    public ScanCommonResponse() {
        this("", null);
    }

    public ScanCommonResponse(String str, ScanCommonResponseData scanCommonResponseData) {
        this.message = str;
        this.scanCommonResponseData = scanCommonResponseData;
    }
}
