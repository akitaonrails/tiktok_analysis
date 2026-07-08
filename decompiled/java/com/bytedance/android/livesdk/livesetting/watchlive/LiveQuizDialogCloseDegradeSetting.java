package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_quiz_dialog_close_degrade")
public final class LiveQuizDialogCloseDegradeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveQuizDialogCloseDegradeSetting INSTANCE = new LiveQuizDialogCloseDegradeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_quiz_dialog_close_degrade", DEFAULT);
    }
}
