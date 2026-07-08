package com.ss.android.ugc.aweme.account.loginapproval;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class LoginApprovalDeviceData {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public LoginApprovalDeviceData(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Extra {

        @C09CT("approve_button")
        public final String approveButton;

        @C09CT("approve_toast")
        public final String approveToast;

        @C09CT("deny_button")
        public final String denyButton;

        @C09CT("deny_toast")
        public final String denyToast;

        @C09CT("description")
        public final String description;

        @C09CT("title")
        public final String title;

        public Extra(String str, String str2, String str3, String str4, String str5, String str6) {
            this.title = str;
            this.description = str2;
            this.approveButton = str3;
            this.approveToast = str4;
            this.denyButton = str5;
            this.denyToast = str6;
        }
    }

    public static final class Data {

        @C09CT("authentication_method")
        public final String authenticationMethod;

        @C09CT("captcha")
        public final String captcha;

        @C09CT("desc_url")
        public final String descUrl;

        @C09CT("device_name")
        public final String deviceName;

        @C09CT("device_platform")
        public final String devicePlatform;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        @C09CT("extra")
        public final Extra extra;

        @C09CT("latitude")
        public final String latitude;

        @C09CT("location")
        public final String location;

        @C09CT("longitude")
        public final String longitude;

        @C09CT("passport_ticket")
        public final String passportTicket;

        @C09CT("timestamp")
        public final Long timestamp;

        @C09CT("user_id")
        public final String userId;

        @C09CT("username")
        public final String username;

        public Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, String str9, Extra extra, String str10, String str11, Integer num, String str12) {
            this.passportTicket = str;
            this.userId = str2;
            this.username = str3;
            this.deviceName = str4;
            this.devicePlatform = str5;
            this.location = str6;
            this.longitude = str7;
            this.latitude = str8;
            this.timestamp = l;
            this.authenticationMethod = str9;
            this.extra = extra;
            this.captcha = str10;
            this.descUrl = str11;
            this.errorCode = num;
            this.errorDescription = str12;
        }
    }
}
