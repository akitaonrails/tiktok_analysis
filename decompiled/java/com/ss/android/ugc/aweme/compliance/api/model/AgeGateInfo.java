package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("register_age_gate_action")
    public final int registerAgeGateAction;

    public AgeGateInfo() {
        this(0);
    }

    public AgeGateInfo(int i) {
        this.registerAgeGateAction = i;
    }
}
