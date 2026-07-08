package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpFirstScreenOptConfig {

    @C09CT("direct_set_state_switch")
    public boolean directSetState;

    @C09CT("init_data_upgrade_switch")
    public boolean initDataMethodUpgrade;

    @C09CT("post_expensive_tasks_switch")
    public boolean postExpensiveTasks;

    @C09CT("preemptive_view_preload_switch")
    public boolean preemptiveViewPreloadSwitch;

    @C09CT("show_all_modules_on_first_render_if_batch_preload")
    public boolean showAllModulesOnFirstRenderOnBatchPreload;

    @C09CT("show_all_modules_on_first_render_if_full_cache")
    public boolean showAllModulesOnFirstRenderOnFullCache;

    public PdpFirstScreenOptConfig() {
        this(false, false, false, false, false, false);
    }

    public PdpFirstScreenOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.directSetState = z;
        this.postExpensiveTasks = z2;
        this.initDataMethodUpgrade = z3;
        this.preemptiveViewPreloadSwitch = z4;
        this.showAllModulesOnFirstRenderOnFullCache = z5;
        this.showAllModulesOnFirstRenderOnBatchPreload = z6;
    }
}
