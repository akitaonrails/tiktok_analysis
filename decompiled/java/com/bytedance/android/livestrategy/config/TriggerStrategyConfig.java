package com.bytedance.android.livestrategy.config;

import X.C09CT;
import X.InterfaceC830890Wid;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class TriggerStrategyConfig {
    public static final TypeAdapter ADAPTER = new TriggerStrategyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("action")
    public Map<String, Object> action;

    @C09CT("async")
    public long async;

    @C09CT("input_params_key")
    public Map<String, Map<String, List<String>>> inputParamsKey;

    @C09CT("notify_input_params")
    public Map<String, ? extends List<String>> notifyInputParams;

    @C09CT("output_feature_group_key")
    public Map<String, Map<String, List<String>>> outputFeatureGroup;
    public transient Map<String, ? extends Object> pitaya;

    @C09CT("rule_name")
    public String ruleName;

    @C09CT("strategy_name")
    public String strategyName;

    @C09CT("trigger_event")
    public Map<String, Object> triggerEvent;

    @C09CT("trigger_feature")
    public Map<String, ? extends List<String>> triggerFeature;

    @C09CT("ttm")
    public Map<String, String> ttm;
    public transient InterfaceC830890Wid ttmScene;

    @C09CT("type")
    public long type;

    public TriggerStrategyConfig() {
        this("", "", 1L, 0L, null, null, null, null, null, null, null, null, null);
    }

    public final Map<String, Object> getAction() {
        return this.action;
    }

    public final long getAsync() {
        return this.async;
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

    public final Map<String, Object> getPitaya() {
        return this.pitaya;
    }

    public final String getRuleName() {
        return this.ruleName;
    }

    public final String getStrategyName() {
        return this.strategyName;
    }

    public final Map<String, Object> getTriggerEvent() {
        return this.triggerEvent;
    }

    public final Map<String, List<String>> getTriggerFeature() {
        return this.triggerFeature;
    }

    public final Map<String, String> getTtm() {
        return this.ttm;
    }

    public final InterfaceC830890Wid getTtmScene() {
        return this.ttmScene;
    }

    public final long getType() {
        return this.type;
    }

    public final void setAction(Map<String, Object> map) {
        this.action = map;
    }

    public final void setAsync(long j) {
        this.async = j;
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

    public final void setPitaya(Map<String, ? extends Object> map) {
        this.pitaya = map;
    }

    public final void setRuleName(String str) {
        this.ruleName = str;
    }

    public final void setStrategyName(String str) {
        this.strategyName = str;
    }

    public final void setTriggerEvent(Map<String, Object> map) {
        this.triggerEvent = map;
    }

    public final void setTriggerFeature(Map<String, ? extends List<String>> map) {
        this.triggerFeature = map;
    }

    public final void setTtm(Map<String, String> map) {
        this.ttm = map;
    }

    public final void setTtmScene(InterfaceC830890Wid interfaceC830890Wid) {
        this.ttmScene = interfaceC830890Wid;
    }

    public final void setType(long j) {
        this.type = j;
    }

    public TriggerStrategyConfig(String str, String str2, long j, long j2, Map<String, Map<String, List<String>>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, Map<String, List<String>>> map4, Map<String, String> map5, Map<String, ? extends Object> map6, InterfaceC830890Wid interfaceC830890Wid, Map<String, Object> map7, Map<String, Object> map8) {
        this.strategyName = str;
        this.ruleName = str2;
        this.async = j;
        this.type = j2;
        this.inputParamsKey = map;
        this.triggerFeature = map2;
        this.notifyInputParams = map3;
        this.outputFeatureGroup = map4;
        this.ttm = map5;
        this.pitaya = map6;
        this.ttmScene = interfaceC830890Wid;
        this.action = map7;
        this.triggerEvent = map8;
    }
}
