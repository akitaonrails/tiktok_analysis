package com.bytedance.helios.cache.config;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FeatureRegisterConfig {

    @C09CT("feature_key")
    public final String featureKey;

    @C09CT("func_sig_names")
    public final List<String> funSigNames;

    @C09CT("invalid_values")
    public final List<String> invalidValues;

    public FeatureRegisterConfig() {
        this(new ArrayList(), "", new ArrayList());
    }

    public FeatureRegisterConfig(List<String> list, String str, List<String> list2) {
        this.funSigNames = list;
        this.featureKey = str;
        this.invalidValues = list2;
    }
}
