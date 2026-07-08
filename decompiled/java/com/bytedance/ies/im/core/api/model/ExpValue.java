package com.bytedance.ies.im.core.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class ExpValue implements Serializable {

    @C09CT("feature_status_code")
    public final Integer featureStatusCode;

    public ExpValue() {
        this(null);
    }

    public ExpValue(Integer num) {
        this.featureStatusCode = num;
    }
}
