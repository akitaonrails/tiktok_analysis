package com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.performancetune.strategy.model.CommonDecisionConfig;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class InnerFlowDowngradeSceneConfig {
    public static final TypeAdapter ADAPTER = new InnerFlowDowngradeSceneConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("active_decision_biz_list")
    public List<String> activeDecisionBizList;

    @C09CT("active_decision_config")
    public CommonDecisionConfig activeDecisionConfig;

    @C09CT("delay_clear_downgrade_status_ms")
    public long delayClearDowngradeStatusMs;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_new_strategy")
    public boolean enableNewStrategy;

    @C09CT("ignore_level_changed_biz_list")
    public List<String> ignoreLevelChangedBizList;

    @C09CT("passive_decision_config")
    public CommonDecisionConfig passiveDecisionConfig;

    @C09CT("perf_fetch_interval_sec")
    public long perfFetchIntervalSec;

    @C09CT("perf_score_cache_size")
    public int perfScoreCacheSize;

    @C09CT("warmup_perf_fetch_delay_sec")
    public long warmupPerfFetchIntervalSec;

    public InnerFlowDowngradeSceneConfig() {
        this(false, false, 15L, 2L, 2, new ArrayList(), new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), new ArrayList(), 0L);
    }

    public InnerFlowDowngradeSceneConfig(boolean z, boolean z2, long j, long j2, int i, List<String> list, CommonDecisionConfig commonDecisionConfig, CommonDecisionConfig commonDecisionConfig2, List<String> list2, long j3) {
        this.enable = z;
        this.enableNewStrategy = z2;
        this.perfFetchIntervalSec = j;
        this.warmupPerfFetchIntervalSec = j2;
        this.perfScoreCacheSize = i;
        this.activeDecisionBizList = list;
        this.passiveDecisionConfig = commonDecisionConfig;
        this.activeDecisionConfig = commonDecisionConfig2;
        this.ignoreLevelChangedBizList = list2;
        this.delayClearDowngradeStatusMs = j3;
    }
}
