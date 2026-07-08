package com.ss.android.ugc.aweme.setting.creatorverification;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatorVerificationResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("RejectReason")
    public String rejectReason;

    @C09CT("VerificationStatus")
    public CreatorVerificationStatus verificationStatus;

    public final String getRejectReason() {
        return this.rejectReason;
    }

    public final CreatorVerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    public final void setRejectReason(String str) {
        this.rejectReason = str;
    }

    public final void setVerificationStatus(CreatorVerificationStatus creatorVerificationStatus) {
        this.verificationStatus = creatorVerificationStatus;
    }
}
