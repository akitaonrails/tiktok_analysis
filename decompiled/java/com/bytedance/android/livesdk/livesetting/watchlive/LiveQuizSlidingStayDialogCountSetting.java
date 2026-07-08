package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_quiz_sliding_stay_dialog_count")
public final class LiveQuizSlidingStayDialogCountSetting {
    public static final int DEFAULT = 1;
    public static final LiveQuizSlidingStayDialogCountSetting INSTANCE = new LiveQuizSlidingStayDialogCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_quiz_sliding_stay_dialog_count", DEFAULT);
    }
}
