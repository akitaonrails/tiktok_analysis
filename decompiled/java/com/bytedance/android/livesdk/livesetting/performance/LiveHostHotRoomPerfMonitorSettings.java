package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_hot_room_perf_monitor_settings")
public final class LiveHostHotRoomPerfMonitorSettings {
    public static final LiveHostHotRoomPerfMonitorSettings INSTANCE = new LiveHostHotRoomPerfMonitorSettings();
    public static final Option DEFAULT = new Option(false, 500);

    public final Option getValue() {
        Option option = (Option) SettingsManager.INSTANCE.getValueSafely(LiveHostHotRoomPerfMonitorSettings.class);
        return option == null ? DEFAULT : option;
    }

    public static final class Option {
        public static final TypeAdapter ADAPTER = new LiveHostHotRoomPerfMonitorSettings_Option_OptTypeAdapter(NormalGson.singleton());

        @C09CT("feature_enable")
        public boolean enable;

        @C09CT("fans_threshold")
        public int fansThreshold;

        public Option() {
            this(false, 500);
        }

        public Option(boolean z, int i) {
            this.enable = z;
            this.fansThreshold = i;
        }
    }
}
