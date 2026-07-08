package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveJsLogicModuleInfo {

    @C09CT("js_logic_type")
    public final String jsLogicType;

    @C09CT("js_logic_url_path")
    public final String jsLogicUrlPath;

    @C09CT("need_pre_predecode")
    public final boolean needPrePreDecode;

    @C09CT("need_remove_expired_apicache")
    public final boolean needRemoveExpiredApiCache;

    @C09CT("trigger_config")
    public final TriggerConfigInfo triggerConfig;

    public IncentiveJsLogicModuleInfo() {
        this("", "", null, false, false);
    }

    public IncentiveJsLogicModuleInfo(String str, String str2, TriggerConfigInfo triggerConfigInfo, boolean z, boolean z2) {
        this.jsLogicType = str;
        this.jsLogicUrlPath = str2;
        this.triggerConfig = triggerConfigInfo;
        this.needPrePreDecode = z;
        this.needRemoveExpiredApiCache = z2;
    }
}
