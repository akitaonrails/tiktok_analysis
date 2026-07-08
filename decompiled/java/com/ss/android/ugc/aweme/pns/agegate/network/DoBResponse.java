package com.ss.android.ugc.aweme.pns.agegate.network;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class DoBResponse extends BaseResponse {

    @C09CT("age")
    public final Integer age;

    @C09CT("appeal_url")
    public final String appealUrl;

    @C09CT("verification_reason")
    public final String verificationReason;

    public DoBResponse() {
        this(0, "", "");
    }

    public final Integer getAge() {
        return this.age;
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final String getVerificationReason() {
        return this.verificationReason;
    }

    public DoBResponse(Integer num, String str, String str2) {
        super(0, "", null);
        this.age = num;
        this.appealUrl = str;
        this.verificationReason = str2;
    }
}
