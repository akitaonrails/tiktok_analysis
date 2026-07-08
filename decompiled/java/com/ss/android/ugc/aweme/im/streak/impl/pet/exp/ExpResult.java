package com.ss.android.ugc.aweme.im.streak.impl.pet.exp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
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
