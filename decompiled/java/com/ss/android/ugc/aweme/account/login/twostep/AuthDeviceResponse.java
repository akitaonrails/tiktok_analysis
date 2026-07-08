package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class AuthDeviceResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public AuthDeviceResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data implements Serializable {
        public static final int $stable = 8;

        @C09CT("auth_device")
        public final List<Device> auth_device;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        @C09CT("ticket")
        public final String ticket;

        public Data(List<Device> list, String str, Integer num, String str2) {
            this.auth_device = list;
            this.errorDescription = str;
            this.errorCode = num;
            this.ticket = str2;
        }
    }
}
