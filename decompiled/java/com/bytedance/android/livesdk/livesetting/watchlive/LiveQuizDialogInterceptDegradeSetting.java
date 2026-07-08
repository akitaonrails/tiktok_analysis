package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_quiz_dialog_intercept_degrade")
public final class LiveQuizDialogInterceptDegradeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveQuizDialogInterceptDegradeSetting INSTANCE = new LiveQuizDialogInterceptDegradeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_quiz_dialog_intercept_degrade", DEFAULT);
    }
}
