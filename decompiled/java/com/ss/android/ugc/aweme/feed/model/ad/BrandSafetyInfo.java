package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BrandSafetyInfo implements Serializable {

    @C09CT("risk_level")
    public int riskLevel;

    public BrandSafetyInfo() {
        this(0);
    }

    public BrandSafetyInfo(int i) {
        this.riskLevel = i;
    }
}
