package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AdvancedOrderData implements Serializable {
    public static final int $stable = 8;

    @C09CT("feature_id")
    public Integer featureId;

    @C09CT("name")
    public String name;

    public final Integer getFeatureId() {
        return this.featureId;
    }

    public final String getName() {
        return this.name;
    }

    public final void setFeatureId(Integer num) {
        this.featureId = num;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
