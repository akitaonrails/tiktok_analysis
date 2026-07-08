package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_tts_resume_play_setting")
public final class LiveTtsResumePlaySetting {
    public static final boolean DEFAULT = false;
    public static final LiveTtsResumePlaySetting INSTANCE = new LiveTtsResumePlaySetting();

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_tts_resume_play_setting", DEFAULT);
    }
}
