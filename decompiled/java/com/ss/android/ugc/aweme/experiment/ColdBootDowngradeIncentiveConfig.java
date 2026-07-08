package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ColdBootDowngradeIncentiveConfig {

    @C09CT("mf_ug_assem")
    public final long downgradeMFUGAssemValue;

    @C09CT("share_coin_incentive_component")
    public final long downgradeShareCoinIncentiveComponentValue;

    @C09CT("spec_act_assem")
    public final long downgradeSpecActAssemValue;

    public ColdBootDowngradeIncentiveConfig() {
        this(-1L, -1L, -1L);
    }

    public ColdBootDowngradeIncentiveConfig(long j, long j2, long j3) {
        this.downgradeMFUGAssemValue = j;
        this.downgradeSpecActAssemValue = j2;
        this.downgradeShareCoinIncentiveComponentValue = j3;
    }
}
