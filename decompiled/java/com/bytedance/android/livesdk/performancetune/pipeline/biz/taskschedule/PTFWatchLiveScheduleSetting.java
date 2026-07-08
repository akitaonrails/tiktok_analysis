package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.EnumC480200IsM;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.performancetune.strategy.model.CommonDecisionConfig;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "watch_live_task_schedule_setting")
public final class PTFWatchLiveScheduleSetting {
    public static final PTFWatchLiveScheduleSetting INSTANCE = new PTFWatchLiveScheduleSetting();
    public static final WatchLiveTaskScheduleTuneSceneConfig DEFAULT = new WatchLiveTaskScheduleTuneSceneConfig(false, new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), false, true, new LinkedHashMap(), null);
    public static final C01GW configValue$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(81));
    public static final C01GW disableTriggers$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(82));

    private final WatchLiveTaskScheduleTuneSceneConfig getConfigValue() {
        return (WatchLiveTaskScheduleTuneSceneConfig) configValue$delegate.getValue();
    }

    private final Set<EnumC480200IsM> getDisableTriggers() {
        return (Set) disableTriggers$delegate.getValue();
    }

    public final WatchLiveTaskScheduleTuneSceneConfig getValue() {
        return getConfigValue();
    }

    public static final class WatchLiveTaskScheduleTuneSceneConfig {
        public static final TypeAdapter ADAPTER = new PTFWatchLiveScheduleSetting_WatchLiveTaskScheduleTuneSceneConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("common_idle_time_post_block")
        public Map<String, Long> commonIdleTimePostBlock;

        @C09CT("disable_triggers")
        public List<String> disableTriggers;

        @C09CT("enable")
        public boolean enable;

        @C09CT("shouldBlocWhenPrePull")
        public boolean shouldBlocWhenPrePull;

        @C09CT("shouldBlockWhenPreviewPullStream")
        public boolean shouldBlockWhenPreviewPullStream;

        @C09CT("task_schedule_decision_config")
        public CommonDecisionConfig taskScheduleDecisionConfig;

        public WatchLiveTaskScheduleTuneSceneConfig() {
            this(false, new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), false, true, new LinkedHashMap(), null);
        }

        public final Map<String, Long> getCommonIdleTimePostBlock() {
            return this.commonIdleTimePostBlock;
        }

        public final List<String> getDisableTriggers() {
            return this.disableTriggers;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final boolean getShouldBlocWhenPrePull() {
            return this.shouldBlocWhenPrePull;
        }

        public final boolean getShouldBlockWhenPreviewPullStream() {
            return this.shouldBlockWhenPreviewPullStream;
        }

        public final CommonDecisionConfig getTaskScheduleDecisionConfig() {
            return this.taskScheduleDecisionConfig;
        }

        public final void setCommonIdleTimePostBlock(Map<String, Long> map) {
            this.commonIdleTimePostBlock = map;
        }

        public final void setDisableTriggers(List<String> list) {
            this.disableTriggers = list;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setShouldBlocWhenPrePull(boolean z) {
            this.shouldBlocWhenPrePull = z;
        }

        public final void setShouldBlockWhenPreviewPullStream(boolean z) {
            this.shouldBlockWhenPreviewPullStream = z;
        }

        public final void setTaskScheduleDecisionConfig(CommonDecisionConfig commonDecisionConfig) {
            this.taskScheduleDecisionConfig = commonDecisionConfig;
        }

        public WatchLiveTaskScheduleTuneSceneConfig(boolean z, CommonDecisionConfig commonDecisionConfig, boolean z2, boolean z3, Map<String, Long> map, List<String> list) {
            this.enable = z;
            this.taskScheduleDecisionConfig = commonDecisionConfig;
            this.shouldBlocWhenPrePull = z2;
            this.shouldBlockWhenPreviewPullStream = z3;
            this.commonIdleTimePostBlock = map;
            this.disableTriggers = list;
        }
    }

    public final boolean isTriggerDisable(EnumC480200IsM enumC480200IsM) {
        return getDisableTriggers().contains(enumC480200IsM);
    }
}
