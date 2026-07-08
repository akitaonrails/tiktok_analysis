package com.bytedance.pipo.stellar.base.page;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarPageRequestWrapper implements Serializable {

    @C09CT("data")
    public final StellarPageRequest data;

    public StellarPageRequestWrapper() {
        this(null);
    }

    public StellarPageRequestWrapper(StellarPageRequest stellarPageRequest) {
        this.data = stellarPageRequest;
    }
}
