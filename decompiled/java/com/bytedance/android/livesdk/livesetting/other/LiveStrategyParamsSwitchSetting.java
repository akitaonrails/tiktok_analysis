package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import X.C13LP;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_strategy_center_upload_config")
public final class LiveStrategyParamsSwitchSetting {
    public static final LiveStrategyParamsConfig DEFAULT;
    public static final LiveStrategyParamsSwitchSetting INSTANCE = new LiveStrategyParamsSwitchSetting();
    public static final HashSet<String> directUploadTypeSet;
    public static final HashSet<String> uploadFilterTypeSet;
    public static final LiveStrategyParamsConfig value;

    public static final class LiveStrategyParamsConfig {
        public static final TypeAdapter ADAPTER = new LiveStrategyParamsSwitchSetting_LiveStrategyParamsConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("base_info_params")
        public List<String> baseInfoParams;

        @C09CT("active_keys")
        public List<String> directUploadType;

        @C09CT("performance_params")
        public List<String> performanceParams;

        @C09CT("period")
        public long period;

        @C09CT("realtime_feature_period")
        public long realtimeFeaturePeriod;

        @C09CT("repeat_skip")
        public boolean repeatSkip;

        @C09CT("room_feature_params")
        public List<String> roomFeatureParams;

        @C09CT("delay")
        public long startUploadDelay;

        /* JADX INFO: renamed from: switch, reason: not valid java name */
        @C09CT("enable")
        public boolean f36switch;

        @C09CT("upload_filter_type")
        public List<String> uploadFilterType;

        @C09CT("user_action_params")
        public List<String> userActionParams;

        @C09CT("user_profile_params")
        public List<String> userProfileParams;

        public LiveStrategyParamsConfig() {
            this(3000L, 3000L, new ArrayList(), false, false, 10000L, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        }

        public LiveStrategyParamsConfig(long j, long j2, List<String> list, boolean z, boolean z2, long j3, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7) {
            this.startUploadDelay = j;
            this.period = j2;
            this.directUploadType = list;
            this.f36switch = z;
            this.repeatSkip = z2;
            this.realtimeFeaturePeriod = j3;
            this.uploadFilterType = list2;
            this.userActionParams = list3;
            this.baseInfoParams = list4;
            this.performanceParams = list5;
            this.userProfileParams = list6;
            this.roomFeatureParams = list7;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveStrategyParamsConfig liveStrategyParamsConfig = new LiveStrategyParamsConfig(3000L, 3000L, new ArrayList(), false, false, 10000L, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        DEFAULT = liveStrategyParamsConfig;
        LiveStrategyParamsConfig liveStrategyParamsConfig2 = (LiveStrategyParamsConfig) SettingsManager.INSTANCE.getValueSafely("live_strategy_center_upload_config", liveStrategyParamsConfig);
        if (liveStrategyParamsConfig2 != null) {
            liveStrategyParamsConfig = liveStrategyParamsConfig2;
        }
        value = liveStrategyParamsConfig;
        directUploadTypeSet = C13LP.LLIFFJFJJ(liveStrategyParamsConfig.directUploadType);
        uploadFilterTypeSet = C13LP.LLIFFJFJJ(liveStrategyParamsConfig.uploadFilterType);
    }

    public static final LiveStrategyParamsConfig getValue() {
        return value;
    }

    public final HashSet<String> getDirectUploadTypeSet() {
        return directUploadTypeSet;
    }

    public final HashSet<String> getUploadFilterTypeSet() {
        return uploadFilterTypeSet;
    }
}
