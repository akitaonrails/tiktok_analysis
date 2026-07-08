package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_quiz_closing_stay_dialog_count")
public final class LiveQuizClosingStayDialogCountSetting {
    public static final int DEFAULT = 1;
    public static final LiveQuizClosingStayDialogCountSetting INSTANCE = new LiveQuizClosingStayDialogCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_quiz_closing_stay_dialog_count", DEFAULT);
    }
}
