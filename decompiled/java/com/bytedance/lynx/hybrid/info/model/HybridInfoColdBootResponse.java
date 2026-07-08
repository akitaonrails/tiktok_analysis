package com.bytedance.lynx.hybrid.info.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridInfoColdBootResponse {

    @C09CT("cold_boot")
    public final ColdBootInfo cold_boot;

    @C09CT("page_info")
    public final Map<String, HybridInfo> page_info;

    public HybridInfoColdBootResponse(ColdBootInfo coldBootInfo, Map<String, HybridInfo> map) {
        this.cold_boot = coldBootInfo;
        this.page_info = map;
    }
}
