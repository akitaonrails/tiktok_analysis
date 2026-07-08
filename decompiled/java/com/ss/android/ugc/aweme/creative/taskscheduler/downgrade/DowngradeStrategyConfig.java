package com.ss.android.ugc.aweme.creative.taskscheduler.downgrade;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class DowngradeStrategyConfig {

    @C09CT("downgrade_strategies")
    public final ArrayList<DowngradeStrategy> downgradeStrategyList;

    public DowngradeStrategyConfig() {
        this(new ArrayList());
    }

    public DowngradeStrategyConfig(ArrayList<DowngradeStrategy> arrayList) {
        this.downgradeStrategyList = arrayList;
    }
}
