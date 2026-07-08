package com.ss.android.ugc.aweme.mix.api.response;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class CheckPlayResponse {

    @C09CT("invalid_reason")
    public final String invalidReason;

    @C09CT("is_valid")
    public final boolean isValid;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public CheckPlayResponse(int i, String str, boolean z, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.isValid = z;
        this.invalidReason = str2;
    }
}
