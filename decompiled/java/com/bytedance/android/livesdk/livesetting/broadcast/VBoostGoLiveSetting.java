package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C1152760g6U;
import X.C1954807lC;
import X.EnumC1153460g7c;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("webcast_broadcast_go_live_vboost_time")
public final class VBoostGoLiveSetting {
    public static final VBoostGoLiveSetting INSTANCE = new VBoostGoLiveSetting();
    public static final VBoostSettings DEFAULT = new VBoostSettings(0, 0, 0, 0);

    public static final class VBoostSettings {
        public static final TypeAdapter ADAPTER;

        @C09CT("webcast_broadcast_go_live_vboost_cpu_core_time")
        public long cpuCoreTime;

        @C09CT("webcast_broadcast_go_live_vboost_cpu_time")
        public long cpuTime;

        @C09CT("webcast_broadcast_go_live_vboost_gpu_time")
        public long gpuTime;

        @C09CT("webcast_broadcast_go_live_vboost_settings")
        public int settings;

        static {
            NormalGson.singleton();
            ADAPTER = new VBoostGoLiveSetting_VBoostSettings_OptTypeAdapter();
        }

        public VBoostSettings() {
            this(0, 0L, 0L, 0L);
        }

        public VBoostSettings(int i, long j, long j2, long j3) {
            this.settings = i;
            this.cpuTime = j;
            this.cpuCoreTime = j2;
            this.gpuTime = j3;
        }
    }

    public final long getTime(EnumC1153460g7c enumC1153460g7c) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        VBoostSettings vBoostSettings = DEFAULT;
        VBoostSettings vBoostSettings2 = (VBoostSettings) settingsManager.getValueSafely("webcast_broadcast_go_live_vboost_time", vBoostSettings);
        if (vBoostSettings2 != null) {
            vBoostSettings = vBoostSettings2;
        }
        int i = C1152760g6U.LIZ[enumC1153460g7c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return vBoostSettings.gpuTime;
                }
                throw new C1954807lC();
            }
            return vBoostSettings.cpuCoreTime;
        }
        return vBoostSettings.cpuTime;
    }

    public final boolean isEnable(EnumC1153460g7c enumC1153460g7c) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        VBoostSettings vBoostSettings = DEFAULT;
        VBoostSettings vBoostSettings2 = (VBoostSettings) settingsManager.getValueSafely("webcast_broadcast_go_live_vboost_time", vBoostSettings);
        if (vBoostSettings2 != null) {
            vBoostSettings = vBoostSettings2;
        }
        if ((enumC1153460g7c.getValue() & vBoostSettings.settings) == enumC1153460g7c.getValue()) {
            return true;
        }
        return false;
    }
}
