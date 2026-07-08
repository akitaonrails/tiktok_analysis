package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileLabelPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("can_apply")
        public boolean canApply;

        @C09CT("privileges")
        public List<CertificationPrivilege> privileges = new ArrayList();
    }
}
