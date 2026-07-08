package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_quiz_card_validate_setting")
public final class LiveQuizCardValidateSetting {
    public static final boolean DEFAULT = true;
    public static final LiveQuizCardValidateSetting INSTANCE = new LiveQuizCardValidateSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_quiz_card_validate_setting", DEFAULT);
    }
}
