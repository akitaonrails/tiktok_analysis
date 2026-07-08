package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveCacheConstraint {

    @C09CT("gp")
    public final Map<String, Object> gp;

    @C09CT("param")
    public final Map<String, Object> param;

    @C09CT("uid")
    public final String uid;

    public IncentiveCacheConstraint() {
        this("", null, null);
    }

    public IncentiveCacheConstraint(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.uid = str;
        this.gp = map;
        this.param = map2;
    }
}
