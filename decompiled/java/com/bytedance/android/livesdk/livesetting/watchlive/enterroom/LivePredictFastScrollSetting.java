package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_predict_fast_scroll")
public final class LivePredictFastScrollSetting {
    public static final int DEFAULT = 0;
    public static final LivePredictFastScrollSetting INSTANCE = new LivePredictFastScrollSetting();
    public static final int TWO_SECONDS = 2;
    public static final int THREE_SECONDS = 3;
    public static final int FOUR_SECONDS = 4;

    public static final boolean isThreeSecondModel() {
        return INSTANCE.getSettingValue() == THREE_SECONDS;
    }

    public static final boolean isTwoSecondModel() {
        return INSTANCE.getSettingValue() == TWO_SECONDS;
    }

    public final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_predict_fast_scroll", DEFAULT);
    }

    public final boolean isDisable() {
        return getSettingValue() <= 0;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getFOUR_SECONDS() {
        return FOUR_SECONDS;
    }

    public final int getTHREE_SECONDS() {
        return THREE_SECONDS;
    }

    public final int getTWO_SECONDS() {
        return TWO_SECONDS;
    }
}
