package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_encourage_diamond_grade_list")
public final class FinishEncourageAchievementSetting {
    public static final Achievement DEFAULT;
    public static final FinishEncourageAchievementSetting INSTANCE = new FinishEncourageAchievementSetting();
    public static final Achievement config;

    static {
        Achievement achievement = new Achievement(C1697810uHb.LJIIJJI(40L, 90L, 500L, 1000L), C1697810uHb.LJIIJJI(900L, 10000L, 100000L, 1000000L));
        DEFAULT = achievement;
        config = (Achievement) SettingsManager.INSTANCE.getValueSafely("live_encourage_diamond_grade_list", achievement);
    }

    public final List<Long> getDiamondList() {
        return config.getDiamondList();
    }

    public final List<Long> getDurationList() {
        return config.getDurationList();
    }
}
