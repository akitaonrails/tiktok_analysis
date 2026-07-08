package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureHouseData implements Serializable {

    @C09CT("feature_house_configs")
    public List<FeatureHouseDataConfig> configList;

    public FeatureHouseData() {
        this(null);
    }

    public FeatureHouseData(List<FeatureHouseDataConfig> list) {
        this.configList = list;
    }

    public final void setConfigList(List<FeatureHouseDataConfig> list) {
        this.configList = list;
    }
}
