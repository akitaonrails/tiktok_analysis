package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigSet implements Serializable {

    @C09CT("features")
    public List<FeatureMeta> features;

    public ConfigSet() {
        this(null);
    }

    public ConfigSet(List<FeatureMeta> list) {
        this.features = list;
    }

    public final void setFeatures(List<FeatureMeta> list) {
        this.features = list;
    }
}
