package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class BxgyPageReturnConfigData implements Serializable {

    @C09CT("should_return_bxgy_page")
    public final boolean shouldReturnBxgyPage;

    public BxgyPageReturnConfigData() {
        this(false);
    }

    public BxgyPageReturnConfigData(boolean z) {
        this.shouldReturnBxgyPage = z;
    }
}
