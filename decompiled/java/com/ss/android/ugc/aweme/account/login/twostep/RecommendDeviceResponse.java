package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class RecommendDeviceResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public RecommendDeviceResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data implements Serializable {
        public static final int $stable = 8;

        @C09CT("device_info")
        public final List<RecommendDevice> deviceInfo;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        public Data(List<RecommendDevice> list, String str, Integer num) {
            this.deviceInfo = list;
            this.errorDescription = str;
            this.errorCode = num;
        }
    }
}
