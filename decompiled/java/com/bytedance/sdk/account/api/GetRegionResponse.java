package com.bytedance.sdk.account.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class GetRegionResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public GetRegionResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data {

        @C09CT("country_code")
        public String countryCode;

        @C09CT("device_redirect_info")
        public final String deviceRedirectInfo;

        @C09CT("domain")
        public final String domain;

        @C09CT("error_code")
        public final Integer errorCode;

        public Data(Integer num, String str, String str2, String str3) {
            this.errorCode = num;
            this.domain = str;
            this.deviceRedirectInfo = str2;
            this.countryCode = str3;
        }
    }
}
