package com.ss.android.ugc.aweme.account.loginapproval;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ConfirmApprovalNotificationData {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public ConfirmApprovalNotificationData(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data {

        @C09CT("captcha")
        public final String captcha;

        @C09CT("desc_url")
        public final String descUrl;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        @C09CT("masked_mobile")
        public final String maskedMobile;

        @C09CT("need_2sv_upsell")
        public final boolean need2svUpsell;

        @C09CT("need_mobile_change")
        public final boolean needMobileChange;

        @C09CT("need_pwd_reset")
        public final boolean needPwdReset;

        @C09CT("suspicious_method")
        public final String suspiciousMethod;

        public Data(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, Integer num, String str5) {
            this.maskedMobile = str;
            this.suspiciousMethod = str2;
            this.needPwdReset = z;
            this.needMobileChange = z2;
            this.need2svUpsell = z3;
            this.captcha = str3;
            this.descUrl = str4;
            this.errorCode = num;
            this.errorDescription = str5;
        }
    }
}
