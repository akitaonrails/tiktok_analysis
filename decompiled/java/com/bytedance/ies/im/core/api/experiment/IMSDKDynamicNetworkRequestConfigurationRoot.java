package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;
import X.C0YHO;
import X.C13BV;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKDynamicNetworkRequestConfigurationRoot {

    @C09CT("configs")
    public final List<Map<String, IMSDKDynamicNetworkRequestTierConfig>> configs;

    @C09CT("default_config")
    public final IMSDKDynamicNetworkRequestTierConfig defaultConfig;

    public IMSDKDynamicNetworkRequestConfigurationRoot() {
        this(null, null, 3, null);
    }

    public final C0YHO toSDKModel() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<Map<String, IMSDKDynamicNetworkRequestTierConfig>> it2 = this.configs.iterator();
        while (it2.hasNext()) {
            for (Map.Entry<String, IMSDKDynamicNetworkRequestTierConfig> entry : it2.next().entrySet()) {
                String key = entry.getKey();
                IMSDKDynamicNetworkRequestTierConfig value = entry.getValue();
                linkedHashMap2.put(key, value.toSDKModel());
                Iterator<Integer> it3 = value.cmds.iterator();
                while (it3.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(it3.next().intValue()), key);
                }
            }
        }
        IMSDKDynamicNetworkRequestTierConfig iMSDKDynamicNetworkRequestTierConfig = this.defaultConfig;
        return new C0YHO(iMSDKDynamicNetworkRequestTierConfig != null ? iMSDKDynamicNetworkRequestTierConfig.toSDKModel() : null, linkedHashMap, linkedHashMap2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IMSDKDynamicNetworkRequestConfigurationRoot(List<? extends Map<String, IMSDKDynamicNetworkRequestTierConfig>> list, IMSDKDynamicNetworkRequestTierConfig iMSDKDynamicNetworkRequestTierConfig) {
        this.configs = list;
        this.defaultConfig = iMSDKDynamicNetworkRequestTierConfig;
    }

    public IMSDKDynamicNetworkRequestConfigurationRoot(List list, IMSDKDynamicNetworkRequestTierConfig iMSDKDynamicNetworkRequestTierConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : iMSDKDynamicNetworkRequestTierConfig);
    }
}
