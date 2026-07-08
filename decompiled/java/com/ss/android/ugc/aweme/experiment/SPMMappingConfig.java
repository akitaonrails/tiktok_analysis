package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class SPMMappingConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("v1")
    public final Refers refers;

    @C09CT("v2")
    public final SPMMapping spmMapping;

    public SPMMappingConfig() {
        this(null, null);
    }

    public SPMMappingConfig(SPMMapping sPMMapping, Refers refers) {
        this.spmMapping = sPMMapping;
        this.refers = refers;
    }
}
