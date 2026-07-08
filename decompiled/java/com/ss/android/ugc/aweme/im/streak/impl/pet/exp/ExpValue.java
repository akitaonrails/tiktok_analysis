package com.ss.android.ugc.aweme.im.streak.impl.pet.exp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
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
