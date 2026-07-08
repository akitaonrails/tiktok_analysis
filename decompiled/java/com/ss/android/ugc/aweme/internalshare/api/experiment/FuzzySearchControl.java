package com.ss.android.ugc.aweme.internalshare.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class FuzzySearchControl {

    @C09CT("tt_share_search_alias_opt_enable")
    public final boolean aliasOptEnable;

    @C09CT("tt_share_search_strategy_key")
    public final String configKey;

    @C09CT("tt_share_search_debounce_interval")
    public final long debounceInterval;

    @C09CT("tt_share_search_opt_enable")
    public final boolean optEnable;

    @C09CT("tt_share_search_ranking_enable")
    public final boolean rankingEnable;

    public FuzzySearchControl() {
        this(false, true, false, "", 250L);
    }

    public FuzzySearchControl(boolean z, boolean z2, boolean z3, String str, long j) {
        this.optEnable = z;
        this.aliasOptEnable = z2;
        this.rankingEnable = z3;
        this.configKey = str;
        this.debounceInterval = j;
    }
}
