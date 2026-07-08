package com.bytedance.ies.im.core.bridge.init.queryexp.model;

import X.C09CT;
import com.bytedance.ies.im.core.api.model.ExpValue;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class ExpResult implements Serializable {

    @C09CT("feature_key")
    public final String key;

    @C09CT("feature_value")
    public final ExpValue value;

    public ExpResult() {
        this(null, null);
    }

    public ExpResult(String str, ExpValue expValue) {
        this.key = str;
        this.value = expValue;
    }
}
