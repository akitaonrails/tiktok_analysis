package com.ss.android.ugc.aweme.socialavatar.network.socialavatar;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class BatchTnsResponse {
    public static final int $stable = 0;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("extra")
    public final TnsResponseExtra extra;

    @C09CT("generation_uri")
    public final String generationUri;

    @C09CT("is_tns_passed")
    public final Boolean isTnsPassed;

    @C09CT("status_code")
    public final Integer statusCode;

    public final Boolean isTnsPassed() {
        return this.isTnsPassed;
    }

    public BatchTnsResponse(Boolean bool, TnsResponseExtra tnsResponseExtra, Integer num, Integer num2, String str) {
        this.isTnsPassed = bool;
        this.extra = tnsResponseExtra;
        this.errorCode = num;
        this.statusCode = num2;
        this.generationUri = str;
    }
}
