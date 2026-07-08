package com.bytedance.pipo.verify.base.model;

import X.C09CT;
import X.C1713640uh8;
import X.C309810CCl;
import com.google.gson.k;

/* JADX INFO: loaded from: classes27.dex */
public final class RawDTOVerifyInfoCandidate {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("verify_priority")
    public final int priority;

    @C09CT("verify_detail")
    public final k verifyDetailRaw;

    @C09CT("verify_type")
    public final String verifyType;

    public RawDTOVerifyInfoCandidate() {
        this(null, 0, null, null);
    }

    public final C1713640uh8 LIZ() {
        VerifyDetail verifyDetail = (VerifyDetail) C309810CCl.LIZJ(this.verifyDetailRaw, VerifyDetail.class);
        if (verifyDetail == null) {
            return null;
        }
        String str = this.verifyType;
        if (str == null) {
            str = "";
        }
        return new C1713640uh8(str, this.actionType, verifyDetail, null, 16);
    }

    public RawDTOVerifyInfoCandidate(String str, int i, String str2, k kVar) {
        this.verifyType = str;
        this.priority = i;
        this.actionType = str2;
        this.verifyDetailRaw = kVar;
    }
}
