package com.bytedance.android.livestrategy.config;

import X.C09CT;
import X.InterfaceC830890Wid;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class FinalStrategyConfig {
    public static final TypeAdapter ADAPTER = new FinalStrategyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("async")
    public long async;

    @C09CT("cel_exp")
    public String celExp;
    public transient Map<String, Object> customParams;

    @C09CT("input_params_key")
    public Map<String, Map<String, List<String>>> inputParamsKey;

    @C09CT("notify_input_params")
    public Map<String, ? extends List<String>> notifyInputParams;

    @C09CT("output_feature_group_key")
    public Map<String, Map<String, List<String>>> outputFeatureGroup;

    @C09CT("pending_timeout")
    public long pendingTimeout;

    @C09CT("rule_name")
    public String ruleName;

    @C09CT("strategy_input_params")
    public Map<String, Object> strategyInputParams;

    @C09CT("strategy_name")
    public String strategyName;
    public transient InterfaceC830890Wid ttmScene;

    @C09CT("type")
    public long type;

    public FinalStrategyConfig() {
        this("", "", null, null, null, null, null, 1L, 30L, 0L, null, null);
    }

    public final long getAsync() {
        return this.async;
    }

    public final String getCelExp() {
        return this.celExp;
    }

    public final Map<String, Object> getCustomParams() {
        return this.customParams;
    }

    public final Map<String, Map<String, List<String>>> getInputParamsKey() {
        return this.inputParamsKey;
    }

    public final Map<String, List<String>> getNotifyInputParams() {
        return this.notifyInputParams;
    }

    public final Map<String, Map<String, List<String>>> getOutputFeatureGroup() {
        return this.outputFeatureGroup;
    }

    public final long getPendingTimeout() {
        return this.pendingTimeout;
    }

    public final String getRuleName() {
        return this.ruleName;
    }

    public final Map<String, Object> getStrategyInputParams() {
        return this.strategyInputParams;
    }

    public final String getStrategyName() {
        return this.strategyName;
    }

    public final InterfaceC830890Wid getTtmScene() {
        return this.ttmScene;
    }

    public final long getType() {
        return this.type;
    }

    public final void setAsync(long j) {
        this.async = j;
    }

    public final void setCelExp(String str) {
        this.celExp = str;
    }

    public final void setCustomParams(Map<String, Object> map) {
        this.customParams = map;
    }

    public final void setInputParamsKey(Map<String, Map<String, List<String>>> map) {
        this.inputParamsKey = map;
    }

    public final void setNotifyInputParams(Map<String, ? extends List<String>> map) {
        this.notifyInputParams = map;
    }

    public final void setOutputFeatureGroup(Map<String, Map<String, List<String>>> map) {
        this.outputFeatureGroup = map;
    }

    public final void setPendingTimeout(long j) {
        this.pendingTimeout = j;
    }

    public final void setRuleName(String str) {
        this.ruleName = str;
    }

    public final void setStrategyInputParams(Map<String, Object> map) {
        this.strategyInputParams = map;
    }

    public final void setStrategyName(String str) {
        this.strategyName = str;
    }

    public final void setTtmScene(InterfaceC830890Wid interfaceC830890Wid) {
        this.ttmScene = interfaceC830890Wid;
    }

    public final void setType(long j) {
        this.type = j;
    }

    public FinalStrategyConfig(String str, String str2, String str3, Map<String, Map<String, List<String>>> map, Map<String, Object> map2, Map<String, ? extends List<String>> map3, Map<String, Map<String, List<String>>> map4, long j, long j2, long j3, Map<String, Object> map5, InterfaceC830890Wid interfaceC830890Wid) {
        this.strategyName = str;
        this.ruleName = str2;
        this.celExp = str3;
        this.inputParamsKey = map;
        this.strategyInputParams = map2;
        this.notifyInputParams = map3;
        this.outputFeatureGroup = map4;
        this.async = j;
        this.pendingTimeout = j2;
        this.type = j3;
        this.customParams = map5;
        this.ttmScene = interfaceC830890Wid;
    }
}
