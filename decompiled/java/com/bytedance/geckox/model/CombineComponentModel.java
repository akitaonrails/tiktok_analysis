package com.bytedance.geckox.model;

import X.C09CT;
import com.bytedance.geckox.policy.loop.model.GlobalConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class CombineComponentModel {

    @C09CT("global_config")
    public GlobalConfig globalConfig = new GlobalConfig();

    @C09CT("packages")
    public List<UpdatePackage> packages;

    @C09CT("universal_strategies")
    public Map<String, CleanPolicyModel> universalStrategies;

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public List<UpdatePackage> getPackages() {
        return this.packages;
    }

    public Map<String, CleanPolicyModel> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
