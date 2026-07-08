package com.bytedance.android.livesdk.performancetune.pipeline.biz.networkctrl;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_inner_flow_pull_stream_network_ctrl_setting")
public final class LiveNetworkCtrlSetting {
    public static final LiveNetworkCtrlSetting INSTANCE = new LiveNetworkCtrlSetting();
    public static final LiveNetworkCtrlSettingConfig DEFAULT = new LiveNetworkCtrlSettingConfig(false, 3, 4, 4, new LiveDispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null));

    public final LiveNetworkCtrlSettingConfig value() {
        LiveNetworkCtrlSettingConfig liveNetworkCtrlSettingConfig = (LiveNetworkCtrlSettingConfig) SettingsManager.INSTANCE.getValueSafely(LiveNetworkCtrlSetting.class);
        return liveNetworkCtrlSettingConfig == null ? DEFAULT : liveNetworkCtrlSettingConfig;
    }

    public static final class LiveNetworkCtrlSettingConfig {
        public static final TypeAdapter ADAPTER = new LiveNetworkCtrlSetting_LiveNetworkCtrlSettingConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("network_ctrl_config")
        public LiveDispatchConfig networkCtrlConfig;

        @C09CT("threshold_live_network_state")
        public int thresholdLiveNetworkState;

        @C09CT("threshold_live_network_state_v2")
        public int thresholdLiveNetworkStateV2;

        @C09CT("threshold_ttnet_network_type")
        public int thresholdTtnetNetworkType;

        public LiveNetworkCtrlSettingConfig() {
            this(false, 3, 4, 4, new LiveDispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null));
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final LiveDispatchConfig getNetworkCtrlConfig() {
            return this.networkCtrlConfig;
        }

        public final int getThresholdLiveNetworkState() {
            return this.thresholdLiveNetworkState;
        }

        public final int getThresholdLiveNetworkStateV2() {
            return this.thresholdLiveNetworkStateV2;
        }

        public final int getThresholdTtnetNetworkType() {
            return this.thresholdTtnetNetworkType;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setNetworkCtrlConfig(LiveDispatchConfig liveDispatchConfig) {
            this.networkCtrlConfig = liveDispatchConfig;
        }

        public final void setThresholdLiveNetworkState(int i) {
            this.thresholdLiveNetworkState = i;
        }

        public final void setThresholdLiveNetworkStateV2(int i) {
            this.thresholdLiveNetworkStateV2 = i;
        }

        public final void setThresholdTtnetNetworkType(int i) {
            this.thresholdTtnetNetworkType = i;
        }

        public LiveNetworkCtrlSettingConfig(boolean z, int i, int i2, int i3, LiveDispatchConfig liveDispatchConfig) {
            this.enable = z;
            this.thresholdTtnetNetworkType = i;
            this.thresholdLiveNetworkState = i2;
            this.thresholdLiveNetworkStateV2 = i3;
            this.networkCtrlConfig = liveDispatchConfig;
        }
    }
}
