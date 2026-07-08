package com.bytedance.pumbaa.ruler.adapter.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class RuleEngineConfig {

    @C09CT("ab_tag")
    public final String abTag;

    @C09CT("enable_api_strategy")
    public final boolean enableApiStrategy;

    @C09CT("enable_app_log")
    public final boolean enableAppLog;

    @C09CT("enable_bpea_ruler_filter")
    public final boolean enableBPEARulerFilter;

    @C09CT("enable_disk_cache")
    public final boolean enableDiskCache;

    @C09CT("enable_fff")
    public final boolean enableFFF;

    @C09CT("enable_instruction_list")
    public final boolean enableInstructionList;

    @C09CT("enable_rule_engine_new_arch")
    public final boolean enableNewArchRuleEngine;

    @C09CT("enable_precache_cel")
    public final boolean enablePrecacheCel;

    @C09CT("enable_rule_engine")
    public final boolean enableRuleEngine;

    @C09CT("enable_rule_engine_for_bpea")
    public final boolean enableRuleEngineForBpea;

    @C09CT("enable_rule_engine_for_bpea_block")
    public final boolean enableRuleEngineForBpeaBlock;

    @C09CT("enable_simplify_set_select")
    public final boolean enableSimplifySetSelect;

    @C09CT("enable_strategy_select_cache")
    public final boolean enableStrategySelectCache;

    @C09CT("expression_cache_size")
    public final int expressionCacheSize;

    @C09CT("global_sample_rate")
    public final n globalSampleRate;

    @C09CT("log_level")
    public final int logLevel;

    @C09CT("main_thread_lock_time")
    public final Long mainThreadLockTime;

    @C09CT("precache_rules")
    public final List<String> precacheRules;

    @C09CT("sync_cache_delay")
    public final Long syncCacheDelay;

    public RuleEngineConfig() {
        this(false, false, 0, false, 0, false, null, null, false, false, false, false, false, false, null, null, false, false, false, null, 1048575, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleEngineConfig)) {
            return false;
        }
        RuleEngineConfig ruleEngineConfig = (RuleEngineConfig) obj;
        return this.enableRuleEngine == ruleEngineConfig.enableRuleEngine && this.enableNewArchRuleEngine == ruleEngineConfig.enableNewArchRuleEngine && this.expressionCacheSize == ruleEngineConfig.expressionCacheSize && this.enableAppLog == ruleEngineConfig.enableAppLog && this.logLevel == ruleEngineConfig.logLevel && this.enablePrecacheCel == ruleEngineConfig.enablePrecacheCel && Intrinsics.LJFF(this.precacheRules, ruleEngineConfig.precacheRules) && Intrinsics.LJFF(this.mainThreadLockTime, ruleEngineConfig.mainThreadLockTime) && this.enableStrategySelectCache == ruleEngineConfig.enableStrategySelectCache && this.enableApiStrategy == ruleEngineConfig.enableApiStrategy && this.enableSimplifySetSelect == ruleEngineConfig.enableSimplifySetSelect && this.enableInstructionList == ruleEngineConfig.enableInstructionList && this.enableRuleEngineForBpea == ruleEngineConfig.enableRuleEngineForBpea && this.enableRuleEngineForBpeaBlock == ruleEngineConfig.enableRuleEngineForBpeaBlock && Intrinsics.LJFF(this.syncCacheDelay, ruleEngineConfig.syncCacheDelay) && Intrinsics.LJFF(this.globalSampleRate, ruleEngineConfig.globalSampleRate) && this.enableDiskCache == ruleEngineConfig.enableDiskCache && this.enableBPEARulerFilter == ruleEngineConfig.enableBPEARulerFilter && this.enableFFF == ruleEngineConfig.enableFFF && Intrinsics.LJFF(this.abTag, ruleEngineConfig.abTag);
    }

    public RuleEngineConfig(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, List<String> list, Long l, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Long l2, n nVar, boolean z11, boolean z12, boolean z13, String str) {
        this.enableRuleEngine = z;
        this.enableNewArchRuleEngine = z2;
        this.expressionCacheSize = i;
        this.enableAppLog = z3;
        this.logLevel = i2;
        this.enablePrecacheCel = z4;
        this.precacheRules = list;
        this.mainThreadLockTime = l;
        this.enableStrategySelectCache = z5;
        this.enableApiStrategy = z6;
        this.enableSimplifySetSelect = z7;
        this.enableInstructionList = z8;
        this.enableRuleEngineForBpea = z9;
        this.enableRuleEngineForBpeaBlock = z10;
        this.syncCacheDelay = l2;
        this.globalSampleRate = nVar;
        this.enableDiskCache = z11;
        this.enableBPEARulerFilter = z12;
        this.enableFFF = z13;
        this.abTag = str;
    }

    public RuleEngineConfig(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, List list, Long l, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Long l2, n nVar, boolean z11, boolean z12, boolean z13, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? 100 : i, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? 5 : i2, (i3 & 32) != 0 ? true : z4, (i3 & 64) != 0 ? C13BV.INSTANCE : list, (i3 & 128) != 0 ? null : l, (i3 & 256) != 0 ? true : z5, (i3 & 512) != 0 ? false : z6, (i3 & 1024) != 0 ? true : z7, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z8, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z9, (i3 & 8192) != 0 ? false : z10, (i3 & 16384) != 0 ? 0L : l2, (32768 & i3) != 0 ? null : nVar, (65536 & i3) != 0 ? true : z11, (131072 & i3) != 0 ? false : z12, (262144 & i3) != 0 ? false : z13, (i3 & 524288) != 0 ? null : str);
    }
}
