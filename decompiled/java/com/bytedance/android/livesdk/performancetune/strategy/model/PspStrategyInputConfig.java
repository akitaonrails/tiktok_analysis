package com.bytedance.android.livesdk.performancetune.strategy.model;

import X.C09CT;
import com.bytedance.android.livesdk.performancetune.feature.FeatureFetchInputParams;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class PspStrategyInputConfig extends AbsStrategyInputConfig {

    @C09CT("inputABKeys")
    public List<String> inputABKeys;

    @C09CT("inputFeatureKeys")
    public List<FeatureFetchInputParams> inputFeatureKeys;

    @C09CT("strategyKey")
    public final String strategyKey;

    @C09CT("ttmSceneKey")
    public final String ttmSceneKey;

    public final List<String> getInputABKeys() {
        return this.inputABKeys;
    }

    public final List<FeatureFetchInputParams> getInputFeatureKeys() {
        return this.inputFeatureKeys;
    }

    public final String getStrategyKey() {
        return this.strategyKey;
    }

    public final String getTtmSceneKey() {
        return this.ttmSceneKey;
    }

    public final void setInputABKeys(List<String> list) {
        this.inputABKeys = list;
    }

    public final void setInputFeatureKeys(List<FeatureFetchInputParams> list) {
        this.inputFeatureKeys = list;
    }

    public PspStrategyInputConfig(String str, String str2, String str3, List<String> list, List<FeatureFetchInputParams> list2) {
        super(0, str, new LinkedHashMap());
        this.ttmSceneKey = str2;
        this.strategyKey = str3;
        this.inputABKeys = list;
        this.inputFeatureKeys = list2;
    }
}
