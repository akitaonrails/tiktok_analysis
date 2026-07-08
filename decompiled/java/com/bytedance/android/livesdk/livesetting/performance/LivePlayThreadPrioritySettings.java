package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C1954807lC;
import X.C1BZM;
import X.C1BZN;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey("webcast_live_sdk_thread_priority_opt_2")
public final class LivePlayThreadPrioritySettings {
    public static final LivePlayThreadPrioritySettings INSTANCE = new LivePlayThreadPrioritySettings();
    public static final ThreadConfig DEFAULT = new ThreadConfig(0, -1, 19, 19, 19);

    public final int getThreadPriority(C1BZM c1bzm) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ThreadConfig threadConfig = DEFAULT;
        ThreadConfig threadConfig2 = (ThreadConfig) settingsManager.getValueSafely("webcast_live_sdk_thread_priority_opt_2", threadConfig);
        if (threadConfig2 != null) {
            threadConfig = threadConfig2;
        }
        int i = C1BZN.LIZ[c1bzm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return threadConfig.downgrade3rdNice;
                    }
                    throw new C1954807lC();
                }
                return threadConfig.downgradeTeaNice;
            }
            return threadConfig.downgradeLoggerNice;
        }
        return threadConfig.upgradeNice;
    }

    public final boolean isEnabled(C1BZM c1bzm) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ThreadConfig threadConfig = DEFAULT;
        ThreadConfig threadConfig2 = (ThreadConfig) settingsManager.getValueSafely("webcast_live_sdk_thread_priority_opt_2", threadConfig);
        if (threadConfig2 != null) {
            threadConfig = threadConfig2;
        }
        if ((c1bzm.getValue() & threadConfig.enable) == c1bzm.getValue()) {
            return true;
        }
        return false;
    }

    public static final class ThreadConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("downgrade_3rd_thread_nice_value")
        public int downgrade3rdNice;

        @C09CT("downgrade_logger_thread_nice_value")
        public int downgradeLoggerNice;

        @C09CT("downgrade_tea_thread_nice_value")
        public int downgradeTeaNice;

        @C09CT("enable_live_play_thread_priority_opt")
        public int enable;

        @C09CT("upgrade_live_play_conrol_thread_nice_value")
        public int upgradeNice;

        static {
            NormalGson.singleton();
            ADAPTER = new LivePlayThreadPrioritySettings_ThreadConfig_OptTypeAdapter();
        }

        public ThreadConfig() {
            this(0, -1, 19, 19, 19);
        }

        public ThreadConfig(int i, int i2, int i3, int i4, int i5) {
            this.enable = i;
            this.upgradeNice = i2;
            this.downgradeLoggerNice = i3;
            this.downgradeTeaNice = i4;
            this.downgrade3rdNice = i5;
        }
    }
}
