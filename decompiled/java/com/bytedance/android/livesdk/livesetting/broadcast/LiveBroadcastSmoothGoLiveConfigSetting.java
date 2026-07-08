package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_broadcast_smooth_go_live_config")
public final class LiveBroadcastSmoothGoLiveConfigSetting {
    public static final LiveBroadcastSmoothGoLiveConfigSetting INSTANCE = new LiveBroadcastSmoothGoLiveConfigSetting();
    public static final BroadcastSmoothGoLiveConfig DEFAULT = new BroadcastSmoothGoLiveConfig(false, 1000);

    public final BroadcastSmoothGoLiveConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig = DEFAULT;
        BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig2 = (BroadcastSmoothGoLiveConfig) settingsManager.getValueSafely("live_broadcast_smooth_go_live_config", broadcastSmoothGoLiveConfig);
        return broadcastSmoothGoLiveConfig2 != null ? broadcastSmoothGoLiveConfig2 : broadcastSmoothGoLiveConfig;
    }

    public static final class BroadcastSmoothGoLiveConfig {
        public static final TypeAdapter ADAPTER = new LiveBroadcastSmoothGoLiveConfigSetting_BroadcastSmoothGoLiveConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_dirty_len")
        public boolean enableDirtyLenDetect;

        @C09CT("stream_info_time_out_threshold")
        public long streamInfoTimeOutThreshold;

        public BroadcastSmoothGoLiveConfig() {
            this(false, 1000L);
        }

        public BroadcastSmoothGoLiveConfig(boolean z, long j) {
            this.enableDirtyLenDetect = z;
            this.streamInfoTimeOutThreshold = j;
        }
    }
}
