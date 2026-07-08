package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import X.C1161920gLG;
import X.C2095008Iq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_entrance_monitor_sampling_rate")
public final class RankEntranceMonitorSamplingSetting {
    public static final long deviceId;
    public static final RankEntranceMonitorSamplingSetting INSTANCE = new RankEntranceMonitorSamplingSetting();
    public static final Config DEFAULT = new Config(1, 1, 1, 1, 1, 1, 1, 1, 1);

    /* JADX INFO: loaded from: classes28.dex */
    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("bad_updates")
        public long badUpdatesSamplingRate;

        @C09CT("duplicated_msg")
        public long duplicatedMsgSamplingRate;

        @C09CT("loop_shut_down")
        public long loopShutDownSamplingRate;

        @C09CT("low_end_device_downgrade")
        public long lowEndDeviceDowngradeSamplingRate;

        @C09CT("miss_enter_rank_animation")
        public long missEnterRankAnimationSamplingRate;

        @C09CT("rank_unavailable_toast")
        public long rankUnavailableToastSamplingRate;

        @C09CT("unexpected_rank")
        public long unexpectedRankSamplingRate;

        @C09CT("unexpected_shift")
        public long unexpectedShiftSamplingRate;

        @C09CT("unexpected_tab")
        public long unexpectedTabSamplingRate;

        static {
            NormalGson.singleton();
            ADAPTER = new RankEntranceMonitorSamplingSetting_Config_OptTypeAdapter();
        }

        public Config() {
            this(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
        }

        public Config(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
            this.duplicatedMsgSamplingRate = j;
            this.unexpectedShiftSamplingRate = j2;
            this.unexpectedTabSamplingRate = j3;
            this.unexpectedRankSamplingRate = j4;
            this.badUpdatesSamplingRate = j5;
            this.loopShutDownSamplingRate = j6;
            this.missEnterRankAnimationSamplingRate = j7;
            this.rankUnavailableToastSamplingRate = j8;
            this.lowEndDeviceDowngradeSamplingRate = j9;
        }
    }

    static {
        Long lLJIILIIL;
        String serverDeviceId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId();
        deviceId = (serverDeviceId == null || (lLJIILIIL = C2095008Iq.LJIILIIL(serverDeviceId)) == null) ? 0L : lLJIILIIL.longValue();
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_rank_entrance_monitor_sampling_rate", config);
        return config2 != null ? config2 : config;
    }

    public final Config getDefaultValue() {
        return DEFAULT;
    }

    public final long getDeviceId() {
        return deviceId;
    }
}
