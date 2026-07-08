package com.bytedance.pumbaa.utility.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class PerformanceExprSwitchConfig {

    @C09CT("api_cache_enable")
    public final boolean apiCacheEnable;

    @C09CT("app2app_enable")
    public final boolean app2appEnable;

    @C09CT("bpea_enable")
    public final boolean bpeaEnable;

    @C09CT("engine_enable")
    public final boolean engineEnable;

    @C09CT("global_init_enable")
    public final boolean globalInitEnable;

    @C09CT("hybrid_enable")
    public final boolean hybridEnable;

    @C09CT("network_enable")
    public final boolean networkEnable;

    @C09CT("pdp_enable")
    public final boolean pdpEnable;

    @C09CT("permission_pop_up_enable")
    public final boolean permissionPopUpEnable;

    @C09CT("sdk_enable")
    public final boolean sdkEnable;

    @C09CT("system_api_enable")
    public final boolean systemApiEnable;

    @C09CT("system_api_old_enable")
    public final boolean systemApiOldEnable;

    @C09CT("user_input_enable")
    public final boolean userInputEnable;

    @C09CT("utility_enable")
    public final boolean utilityEnable;

    public PerformanceExprSwitchConfig() {
        this(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceExprSwitchConfig)) {
            return false;
        }
        PerformanceExprSwitchConfig performanceExprSwitchConfig = (PerformanceExprSwitchConfig) obj;
        return this.globalInitEnable == performanceExprSwitchConfig.globalInitEnable && this.hybridEnable == performanceExprSwitchConfig.hybridEnable && this.networkEnable == performanceExprSwitchConfig.networkEnable && this.systemApiEnable == performanceExprSwitchConfig.systemApiEnable && this.apiCacheEnable == performanceExprSwitchConfig.apiCacheEnable && this.systemApiOldEnable == performanceExprSwitchConfig.systemApiOldEnable && this.engineEnable == performanceExprSwitchConfig.engineEnable && this.bpeaEnable == performanceExprSwitchConfig.bpeaEnable && this.pdpEnable == performanceExprSwitchConfig.pdpEnable && this.sdkEnable == performanceExprSwitchConfig.sdkEnable && this.utilityEnable == performanceExprSwitchConfig.utilityEnable && this.app2appEnable == performanceExprSwitchConfig.app2appEnable && this.userInputEnable == performanceExprSwitchConfig.userInputEnable && this.permissionPopUpEnable == performanceExprSwitchConfig.permissionPopUpEnable;
    }

    public PerformanceExprSwitchConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.globalInitEnable = z;
        this.hybridEnable = z2;
        this.networkEnable = z3;
        this.systemApiEnable = z4;
        this.apiCacheEnable = z5;
        this.systemApiOldEnable = z6;
        this.engineEnable = z7;
        this.bpeaEnable = z8;
        this.pdpEnable = z9;
        this.sdkEnable = z10;
        this.utilityEnable = z11;
        this.app2appEnable = z12;
        this.userInputEnable = z13;
        this.permissionPopUpEnable = z14;
    }
}
