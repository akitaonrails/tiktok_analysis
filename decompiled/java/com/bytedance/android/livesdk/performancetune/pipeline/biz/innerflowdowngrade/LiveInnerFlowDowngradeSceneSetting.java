package com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.performancetune.strategy.model.CommonDecisionConfig;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_flow_downgrade_setting")
public final class LiveInnerFlowDowngradeSceneSetting {
    public static final LiveInnerFlowDowngradeSceneSetting INSTANCE = new LiveInnerFlowDowngradeSceneSetting();
    public static final InnerFlowDowngradeSceneConfig DEFAULT = new InnerFlowDowngradeSceneConfig(false, false, 15, 2, 2, new ArrayList(), new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), new ArrayList(), 0);
    public static final C01GW ignoreLevelChangedBizSet$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(80));

    private final Set<String> getIgnoreLevelChangedBizSet() {
        return (Set) ignoreLevelChangedBizSet$delegate.getValue();
    }

    public final InnerFlowDowngradeSceneConfig getValue() {
        InnerFlowDowngradeSceneConfig innerFlowDowngradeSceneConfig = (InnerFlowDowngradeSceneConfig) SettingsManager.INSTANCE.getValueSafely(LiveInnerFlowDowngradeSceneSetting.class);
        return innerFlowDowngradeSceneConfig == null ? DEFAULT : innerFlowDowngradeSceneConfig;
    }

    public final long delayClearDowngradeStatusMs() {
        return getValue().delayClearDowngradeStatusMs;
    }

    public final boolean isIgnoreLevelChanged(String str) {
        return getIgnoreLevelChangedBizSet().contains(str);
    }
}
