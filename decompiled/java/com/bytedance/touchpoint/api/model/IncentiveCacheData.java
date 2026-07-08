package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveCacheData {

    @C09CT("constraint")
    public final IncentiveCacheConstraint constraint;

    @C09CT("expireTime")
    public final Number expireTime;

    @C09CT("storeTime")
    public final Number storeTime;

    @C09CT("value")
    public final Map<String, Object> value;

    @C09CT("version")
    public final String version;

    public IncentiveCacheData() {
        this(null, null, "", 0L, 0L);
    }

    public IncentiveCacheData(IncentiveCacheConstraint incentiveCacheConstraint, Map<String, ? extends Object> map, String str, Number number, Number number2) {
        this.constraint = incentiveCacheConstraint;
        this.value = map;
        this.version = str;
        this.expireTime = number;
        this.storeTime = number2;
    }
}
