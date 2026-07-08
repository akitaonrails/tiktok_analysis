package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveJsLogicModuleConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_libra")
    public final boolean enableAll;

    @C09CT("logic_module_infos")
    public final Map<String, IncentiveJsLogicModuleInfo> logicModuleInfos;

    @C09CT("pid_trigger_enable")
    public final boolean pidTriggerEnable;

    @C09CT("predecode_enable")
    public final boolean predecodeEnable;

    public IncentiveJsLogicModuleConfig() {
        this(true, false, false, false, null);
    }

    public IncentiveJsLogicModuleConfig(boolean z, boolean z2, boolean z3, boolean z4, Map<String, IncentiveJsLogicModuleInfo> map) {
        this.enableAll = z;
        this.enable = z2;
        this.pidTriggerEnable = z3;
        this.predecodeEnable = z4;
        this.logicModuleInfos = map;
    }
}
