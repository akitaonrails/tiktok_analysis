package com.bytedance.ies.im.core.bridge.init.queryexp.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class UserExperimentResult implements Serializable {

    @C09CT("feature_result")
    public final List<ExpResult> expResult;

    @C09CT("user_id")
    public final String userId;

    public UserExperimentResult() {
        this("", null);
    }

    public UserExperimentResult(String str, List<ExpResult> list) {
        this.userId = str;
        this.expResult = list;
    }
}
