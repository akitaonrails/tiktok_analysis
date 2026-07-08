package com.bytedance.pumbaa.hybrid.rasp.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BridgeConfig {

    @C09CT("allow_param_bridge_list")
    public final List<String> allowParamBridgeList;

    @C09CT("enable")
    public boolean enable;

    @C09CT("ignore_bridge_method_list")
    public final List<Object> ignoreBridgeMethodList;

    @C09CT("rasp_security_enable")
    public final boolean raspSecurityEnable;

    public BridgeConfig() {
        this(false, false, new ArrayList(), new ArrayList());
    }

    public BridgeConfig(boolean z, boolean z2, List<Object> list, List<String> list2) {
        this.enable = z;
        this.raspSecurityEnable = z2;
        this.ignoreBridgeMethodList = list;
        this.allowParamBridgeList = list2;
    }
}
