package com.bytedance.pumbaa.engine.config;

import X.C09CT;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DecisionEngineSwitch {

    @C09CT("pns_decision_allow_strategy_list")
    public final List<String> allowStrategyList;

    @C09CT("biz_block_list")
    public final Set<String> bizBlockList;

    @C09CT("capacity")
    public final long capacity;

    @C09CT("downgrade_to_video")
    public final boolean downgradeToVideo;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_callback_without_strategy")
    public final boolean enableCallbackWithoutStrategy;

    @C09CT("enable_name_list")
    public final boolean enableNameList;

    @C09CT("enable_validate")
    public final boolean enableValidate;

    @C09CT("trigger_id_block_list")
    public final Set<String> idBlockList;

    @C09CT("pns_decision_ignore_strategy_list")
    public final List<String> ignoreStrategyList;

    @C09CT("loggable")
    public final boolean loggable;

    @C09CT("report_sample")
    public final double reportSample;

    @C09CT("strategy_key")
    public final String strategyKey;

    @C09CT("thread_count")
    public final int tc;

    public DecisionEngineSwitch() {
        this(false, false, null, null, null, true, true, 1, 100L, null, null, 0.001d, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionEngineSwitch)) {
            return false;
        }
        DecisionEngineSwitch decisionEngineSwitch = (DecisionEngineSwitch) obj;
        return this.enable == decisionEngineSwitch.enable && this.loggable == decisionEngineSwitch.loggable && Intrinsics.LJFF(this.strategyKey, decisionEngineSwitch.strategyKey) && Intrinsics.LJFF(this.ignoreStrategyList, decisionEngineSwitch.ignoreStrategyList) && Intrinsics.LJFF(this.allowStrategyList, decisionEngineSwitch.allowStrategyList) && this.enableValidate == decisionEngineSwitch.enableValidate && this.enableNameList == decisionEngineSwitch.enableNameList && this.tc == decisionEngineSwitch.tc && this.capacity == decisionEngineSwitch.capacity && Intrinsics.LJFF(this.bizBlockList, decisionEngineSwitch.bizBlockList) && Intrinsics.LJFF(this.idBlockList, decisionEngineSwitch.idBlockList) && Double.compare(this.reportSample, decisionEngineSwitch.reportSample) == 0 && this.enableCallbackWithoutStrategy == decisionEngineSwitch.enableCallbackWithoutStrategy && this.downgradeToVideo == decisionEngineSwitch.downgradeToVideo;
    }

    public DecisionEngineSwitch(boolean z, boolean z2, String str, List<String> list, List<String> list2, boolean z3, boolean z4, int i, long j, Set<String> set, Set<String> set2, double d, boolean z5, boolean z6) {
        this.enable = z;
        this.loggable = z2;
        this.strategyKey = str;
        this.ignoreStrategyList = list;
        this.allowStrategyList = list2;
        this.enableValidate = z3;
        this.enableNameList = z4;
        this.tc = i;
        this.capacity = j;
        this.bizBlockList = set;
        this.idBlockList = set2;
        this.reportSample = d;
        this.enableCallbackWithoutStrategy = z5;
        this.downgradeToVideo = z6;
    }
}
