package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "go_live_voice_call_conflict_check")
public final class GoLiveVoiceCallConflictCheckSetting {
    public static final boolean DEFAULT = true;
    public static final GoLiveVoiceCallConflictCheckSetting INSTANCE = new GoLiveVoiceCallConflictCheckSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("go_live_voice_call_conflict_check", DEFAULT);
    }
}
