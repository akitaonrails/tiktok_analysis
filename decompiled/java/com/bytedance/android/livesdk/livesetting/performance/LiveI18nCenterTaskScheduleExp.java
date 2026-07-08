package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_i18n_init_task_schedule")
public final class LiveI18nCenterTaskScheduleExp {
    public static final LiveI18nCenterTaskScheduleExp INSTANCE = new LiveI18nCenterTaskScheduleExp();
    public static final LiveI18nCenterTaskScheduleConfig DEFAULT = new LiveI18nCenterTaskScheduleConfig();
    public static final C01GW scheduleSources$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(75));

    private final Set<Integer> getScheduleSources() {
        return (Set) scheduleSources$delegate.getValue();
    }

    public final LiveI18nCenterTaskScheduleConfig value() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveI18nCenterTaskScheduleConfig liveI18nCenterTaskScheduleConfig = DEFAULT;
        LiveI18nCenterTaskScheduleConfig liveI18nCenterTaskScheduleConfig2 = (LiveI18nCenterTaskScheduleConfig) settingsManager.getValueSafely("live_i18n_init_task_schedule", liveI18nCenterTaskScheduleConfig);
        return liveI18nCenterTaskScheduleConfig2 != null ? liveI18nCenterTaskScheduleConfig2 : liveI18nCenterTaskScheduleConfig;
    }

    public final boolean isEnable(int i) {
        if (value().isEnable && getScheduleSources().contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }
}
