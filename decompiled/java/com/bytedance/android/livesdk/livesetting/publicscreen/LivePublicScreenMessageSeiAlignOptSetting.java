package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_message_sei_align_opt")
public final class LivePublicScreenMessageSeiAlignOptSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenMessageSeiAlignOptSetting INSTANCE = new LivePublicScreenMessageSeiAlignOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_message_sei_align_opt", DEFAULT);
    }
}
