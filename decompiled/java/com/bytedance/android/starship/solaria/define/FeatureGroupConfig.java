package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureGroupConfig implements Serializable {

    @C09CT("group_config")
    public FeatureCommonConfig config;

    @C09CT("group_name")
    public String groupName;

    public FeatureGroupConfig() {
        this(null, null);
    }

    public final void setConfig(FeatureCommonConfig featureCommonConfig) {
        this.config = featureCommonConfig;
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public FeatureGroupConfig(String str, FeatureCommonConfig featureCommonConfig) {
        this.groupName = str;
        this.config = featureCommonConfig;
    }
}
