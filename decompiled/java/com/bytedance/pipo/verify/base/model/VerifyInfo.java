package com.bytedance.pipo.verify.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyInfo {
    public final String LIZ;

    @C09CT("action_type")
    public final String actionType;

    @C09CT("is_progressive")
    public final boolean isProgressive;

    @C09CT("switch_candidate")
    public final boolean switchCandidate;

    @C09CT("verify_detail")
    public final VerifyDetail verifyDetail;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_type")
    public final String verifyType;

    public VerifyInfo() {
        this(null, null, null, null, false, false, null);
    }

    public VerifyInfo(String str, String str2, String str3, VerifyDetail verifyDetail, boolean z, boolean z2, String str4) {
        this.verifyId = str;
        this.verifyType = str2;
        this.actionType = str3;
        this.verifyDetail = verifyDetail;
        this.switchCandidate = z;
        this.isProgressive = z2;
        this.LIZ = str4;
    }
}
