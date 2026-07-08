package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "room_ping_interval")
public final class RoomPingIntervalSetting {
    public static final RoomPingIntervalConfig DEFAULT;
    public static final RoomPingIntervalSetting INSTANCE = new RoomPingIntervalSetting();
    public static final RoomPingIntervalConfig value;

    public static final class RoomPingIntervalConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("group")
        public int group;

        @C09CT("decrease_interval")
        public long decreaseInternal = Mp4ScreenVideoLoadTimeout.CONTROL;

        @C09CT("increase_interval")
        public long increaseInternal = Mp4ScreenVideoLoadTimeout.CONTROL;

        static {
            NormalGson.singleton();
            ADAPTER = new RoomPingIntervalSetting_RoomPingIntervalConfig_OptTypeAdapter();
        }
    }

    static {
        RoomPingIntervalConfig roomPingIntervalConfig = new RoomPingIntervalConfig();
        DEFAULT = roomPingIntervalConfig;
        RoomPingIntervalConfig roomPingIntervalConfig2 = (RoomPingIntervalConfig) SettingsManager.INSTANCE.getValueSafely(RoomPingIntervalSetting.class);
        if (roomPingIntervalConfig2 != null) {
            roomPingIntervalConfig = roomPingIntervalConfig2;
        }
        value = roomPingIntervalConfig;
    }

    public final long decreaseInternal() {
        return value.decreaseInternal;
    }

    public final boolean enable() {
        return value.group != 0;
    }

    public final long increaseInternal() {
        return value.increaseInternal;
    }

    public final boolean isV2() {
        return value.group == 2;
    }
}
