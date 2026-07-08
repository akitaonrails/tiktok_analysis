package com.ss.android.ugc.profile.business.profile.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfilePostFirstCursorMaxCountConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("pad")
    public final Integer padMaxCount = 21;

    @C09CT("phone")
    public final Integer phoneMaxCount = 12;

    @C09CT("min_count")
    public final Integer minCount = 3;

    public final Integer getMinCount() {
        return this.minCount;
    }

    public final Integer getPadMaxCount() {
        return this.padMaxCount;
    }

    public final Integer getPhoneMaxCount() {
        return this.phoneMaxCount;
    }
}
