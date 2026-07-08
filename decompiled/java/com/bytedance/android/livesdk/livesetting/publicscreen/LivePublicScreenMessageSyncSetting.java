package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_public_screen_message_sync")
public final class LivePublicScreenMessageSyncSetting {
    public static final LivePublicScreenMessageSyncConfig DEFAULT;
    public static final LivePublicScreenMessageSyncSetting INSTANCE = new LivePublicScreenMessageSyncSetting();
    public static final LivePublicScreenMessageSyncConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig = new LivePublicScreenMessageSyncConfig(false, 10000L, 10000L, Mp4ScreenVideoLoadTimeout.CONTROL, 0L, true, 1770L, 10000L);
        DEFAULT = livePublicScreenMessageSyncConfig;
        LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig2 = (LivePublicScreenMessageSyncConfig) SettingsManager.INSTANCE.getValueSafely("live_public_screen_message_sync", livePublicScreenMessageSyncConfig);
        if (livePublicScreenMessageSyncConfig2 != null) {
            livePublicScreenMessageSyncConfig = livePublicScreenMessageSyncConfig2;
        }
        value = livePublicScreenMessageSyncConfig;
    }

    public static final LivePublicScreenMessageSyncConfig getValue() {
        return value;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class LivePublicScreenMessageSyncConfig {
        public static final TypeAdapter ADAPTER = new LivePublicScreenMessageSyncSetting_LivePublicScreenMessageSyncConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("c2c_delay_max")
        public long c2cDelayMax;

        @C09CT("final_gap_max_delay")
        public long finalGapMaxDelay;

        @C09CT("host_c2c_delay")
        public long hostC2CDelay;

        @C09CT("sei_enable")
        public boolean seiEnable;

        @C09CT("sei_enable_host")
        public boolean seiEnableHost;

        @C09CT("sei_frequency")
        public long seiFrequency;

        @C09CT("sei_max_delay")
        public long seiMaxDelay;

        @C09CT("sei_offset_time")
        public long seiOffsetTime;

        public LivePublicScreenMessageSyncConfig() {
            this(false, 10000L, 10000L, Mp4ScreenVideoLoadTimeout.CONTROL, 0L, true, 1770L, 10000L);
        }

        public LivePublicScreenMessageSyncConfig(boolean z, long j, long j2, long j3, long j4, boolean z2, long j5, long j6) {
            this.seiEnable = z;
            this.seiMaxDelay = j;
            this.finalGapMaxDelay = j2;
            this.seiFrequency = j3;
            this.seiOffsetTime = j4;
            this.seiEnableHost = z2;
            this.hostC2CDelay = j5;
            this.c2cDelayMax = j6;
        }
    }
}
