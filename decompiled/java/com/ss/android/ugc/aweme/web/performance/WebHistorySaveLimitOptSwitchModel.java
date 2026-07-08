package com.ss.android.ugc.aweme.web.performance;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class WebHistorySaveLimitOptSwitchModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable_history_save_limit_opt")
    public final boolean enableHistorySaveLimitOpt;

    @C09CT("history_save_limit")
    public final int historySaveLimit;

    @C09CT("history_save_limit_max_batches")
    public final int historySaveLimitMaxBatches;

    public WebHistorySaveLimitOptSwitchModel() {
        this(false, 50, 3);
    }

    public WebHistorySaveLimitOptSwitchModel(boolean z, int i, int i2) {
        this.enableHistorySaveLimitOpt = z;
        this.historySaveLimit = i;
        this.historySaveLimitMaxBatches = i2;
    }
}
