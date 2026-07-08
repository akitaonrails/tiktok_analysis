package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_message_sei_align_buffer_size")
public final class LivePublicScreenMessageSeiAlignBufferSizeSetting {
    public static final int DEFAULT = 10;
    public static final LivePublicScreenMessageSeiAlignBufferSizeSetting INSTANCE = new LivePublicScreenMessageSeiAlignBufferSizeSetting();

    public static final int count() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_message_sei_align_buffer_size", DEFAULT);
    }
}
