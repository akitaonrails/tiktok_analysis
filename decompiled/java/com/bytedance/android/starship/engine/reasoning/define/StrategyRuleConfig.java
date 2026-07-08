package com.bytedance.android.starship.engine.reasoning.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class StrategyRuleConfig implements Serializable {

    @C09CT("engine_list")
    public List<String> engineList;

    @C09CT("extra_data")
    public String extraInput;

    @C09CT("extra_data_config")
    public Map<String, ? extends Object> extraInputMap;

    @C09CT("feature_set")
    public String featureSetName;

    @C09CT("mobile_func_list")
    public List<String> funcList;

    @C09CT("rule_data")
    public String ruleData;

    @C09CT("run_interval")
    public int runInterval;

    public StrategyRuleConfig() {
        this(null, null, null, null, null, 0);
    }

    public final void setEngineList(List<String> list) {
        this.engineList = list;
    }

    public final void setExtraInput(String str) {
        this.extraInput = str;
    }

    public final void setExtraInputMap(Map<String, ? extends Object> map) {
        this.extraInputMap = map;
    }

    public final void setFeatureSetName(String str) {
        this.featureSetName = str;
    }

    public final void setFuncList(List<String> list) {
        this.funcList = list;
    }

    public final void setRuleData(String str) {
        this.ruleData = str;
    }

    public final void setRunInterval(int i) {
        this.runInterval = i;
    }

    public StrategyRuleConfig(String str, List<String> list, String str2, String str3, List<String> list2, int i) {
        this.featureSetName = str;
        this.engineList = list;
        this.ruleData = str2;
        this.extraInput = str3;
        this.funcList = list2;
        this.runInterval = i;
    }
}
