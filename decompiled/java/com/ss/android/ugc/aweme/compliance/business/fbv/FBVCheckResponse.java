package com.ss.android.ugc.aweme.compliance.business.fbv;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FBVCheckResponse {

    @C09CT("consent_status_code")
    public final int status;

    @C09CT("expire_timestamp_ms")
    public final long timestampToCheckAgain;

    public FBVCheckResponse(int i, long j) {
        this.status = i;
        this.timestampToCheckAgain = j;
    }
}
