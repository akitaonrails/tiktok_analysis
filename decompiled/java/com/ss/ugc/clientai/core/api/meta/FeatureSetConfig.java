package com.ss.ugc.clientai.core.api.meta;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureSetConfig {

    @C09CT("name")
    public String featureSetName;

    @C09CT("feature_groups")
    public List<FeatureGroup> features;

    @C09CT("flatten_config")
    public FlattenConfig flattenConfig;

    @C09CT("monitor")
    public Monitor monitor;

    @C09CT("version")
    public String version;

    public FeatureSetConfig(String str, String str2, Monitor monitor, List<FeatureGroup> list, FlattenConfig flattenConfig) {
        this.featureSetName = str;
        this.version = str2;
        this.monitor = monitor;
        this.features = list;
        this.flattenConfig = flattenConfig;
    }
}
