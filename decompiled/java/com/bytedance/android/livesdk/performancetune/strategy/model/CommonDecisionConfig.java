package com.bytedance.android.livesdk.performancetune.strategy.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.performancetune.feature.FeatureFetchInputParams;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class CommonDecisionConfig {
    public static final TypeAdapter ADAPTER = new CommonDecisionConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("bizKey")
    public String bizKey;

    @C09CT("inputABKeys")
    public List<String> inputABKeys;

    @C09CT("inputFeatureKeys")
    public List<FeatureFetchInputParams> inputFeatureKeys;

    @C09CT("nativeStrategyKey")
    public String nativeStrategyKey;

    @C09CT("strategyType")
    public int strategyType;

    @C09CT("ttmSceneKey")
    public String ttmSceneKey;

    @C09CT("ttmStrategyKey")
    public String ttmStrategyKey;

    public CommonDecisionConfig() {
        this(1, "", "", "", "", new ArrayList(), new ArrayList());
    }

    public final String getBizKey() {
        return this.bizKey;
    }

    public final List<String> getInputABKeys() {
        return this.inputABKeys;
    }

    public final List<FeatureFetchInputParams> getInputFeatureKeys() {
        return this.inputFeatureKeys;
    }

    public final String getNativeStrategyKey() {
        return this.nativeStrategyKey;
    }

    public final int getStrategyType() {
        return this.strategyType;
    }

    public final String getTtmSceneKey() {
        return this.ttmSceneKey;
    }

    public final String getTtmStrategyKey() {
        return this.ttmStrategyKey;
    }

    public final void setBizKey(String str) {
        this.bizKey = str;
    }

    public final void setInputABKeys(List<String> list) {
        this.inputABKeys = list;
    }

    public final void setInputFeatureKeys(List<FeatureFetchInputParams> list) {
        this.inputFeatureKeys = list;
    }

    public final void setNativeStrategyKey(String str) {
        this.nativeStrategyKey = str;
    }

    public final void setStrategyType(int i) {
        this.strategyType = i;
    }

    public final void setTtmSceneKey(String str) {
        this.ttmSceneKey = str;
    }

    public final void setTtmStrategyKey(String str) {
        this.ttmStrategyKey = str;
    }

    public CommonDecisionConfig(int i, String str, String str2, String str3, String str4, List<String> list, List<FeatureFetchInputParams> list2) {
        this.strategyType = i;
        this.bizKey = str;
        this.nativeStrategyKey = str2;
        this.ttmSceneKey = str3;
        this.ttmStrategyKey = str4;
        this.inputABKeys = list;
        this.inputFeatureKeys = list2;
    }
}
