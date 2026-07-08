package com.bytedance.android.livesdk.settings;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_player_logger_task_schedule_exp")
public final class LivePlayerLoggerTaskScheduleSetting {
    public static final PlayerLoggerTaskScheduleConfig DEFAULT;
    public static final LivePlayerLoggerTaskScheduleSetting INSTANCE = new LivePlayerLoggerTaskScheduleSetting();
    public static final C01GW disableKeySet$delegate;
    public static final PlayerLoggerTaskScheduleConfig value;

    static {
        PlayerLoggerTaskScheduleConfig playerLoggerTaskScheduleConfig = new PlayerLoggerTaskScheduleConfig(false, new ArrayList());
        DEFAULT = playerLoggerTaskScheduleConfig;
        PlayerLoggerTaskScheduleConfig playerLoggerTaskScheduleConfig2 = (PlayerLoggerTaskScheduleConfig) SettingsManager.INSTANCE.getValueSafely("live_player_logger_task_schedule_exp", playerLoggerTaskScheduleConfig);
        if (playerLoggerTaskScheduleConfig2 != null) {
            playerLoggerTaskScheduleConfig = playerLoggerTaskScheduleConfig2;
        }
        value = playerLoggerTaskScheduleConfig;
        disableKeySet$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(106));
    }

    private final Set<String> getDisableKeySet() {
        return (Set) disableKeySet$delegate.getValue();
    }

    public final boolean isEventKeyScheduleEnable(String str) {
        if (str == null || !value.scheduleEnable || getDisableKeySet().contains(str)) {
            return false;
        }
        return true;
    }
}
