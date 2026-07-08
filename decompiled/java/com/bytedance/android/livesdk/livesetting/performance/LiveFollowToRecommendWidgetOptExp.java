package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_follow_to_recommend_widget_opt_exp")
public final class LiveFollowToRecommendWidgetOptExp {
    public static final int DEFAULT = 0;
    public static final LiveFollowToRecommendWidgetOptExp INSTANCE = new LiveFollowToRecommendWidgetOptExp();
    public static final int enable;
    public static final boolean inExp;

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static /* synthetic */ void getInExp$annotations() {
    }

    static {
        int intValue = SettingsManager.INSTANCE.getIntValue("live_follow_to_recommend_widget_opt_exp", DEFAULT);
        enable = intValue;
        inExp = intValue >= 2;
    }

    public static final boolean needRoundCornerAndOnceToast() {
        return enable == 4;
    }

    public static final boolean needRoundCornerAndVibration() {
        return enable == 3;
    }

    public static final boolean needRoundCornerAndVibrationAndOnceToast() {
        return enable == 5;
    }

    public static final boolean onlyNeedRoundCorner() {
        return enable == 2;
    }

    public static final boolean removeAllIndicators() {
        return enable == 1;
    }

    public static final int getEnable() {
        return enable;
    }

    public static final boolean getInExp() {
        return inExp;
    }
}
