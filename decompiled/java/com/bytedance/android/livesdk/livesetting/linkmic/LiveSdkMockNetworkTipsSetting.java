package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_mock_network_tips")
public final class LiveSdkMockNetworkTipsSetting {
    public static final LiveSdkMockNetworkTipsSetting INSTANCE = new LiveSdkMockNetworkTipsSetting();
    public static final NetWorkConfig DEFAULT = new NetWorkConfig(false, 0);

    private final NetWorkConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        NetWorkConfig netWorkConfig = DEFAULT;
        NetWorkConfig netWorkConfig2 = (NetWorkConfig) settingsManager.getValueSafely("live_sdk_mock_network_tips", netWorkConfig);
        return netWorkConfig2 != null ? netWorkConfig2 : netWorkConfig;
    }

    public final int getState() {
        return getValue().networkState;
    }

    public final boolean isEnable() {
        return getValue().isEnable;
    }

    public static final class NetWorkConfig {
        public static final TypeAdapter ADAPTER = new LiveSdkMockNetworkTipsSetting_NetWorkConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("isEnable")
        public boolean isEnable;

        @C09CT("networkState")
        public int networkState;

        public NetWorkConfig() {
            this(false, 0);
        }

        public NetWorkConfig(boolean z, int i) {
            this.isEnable = z;
            this.networkState = i;
        }
    }
}
