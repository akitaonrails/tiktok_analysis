package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_frame_sign_setting")
public final class FrameSignSetting {
    public static final int DEFAULT = 0;
    public static final FrameSignSetting INSTANCE = new FrameSignSetting();

    public final boolean isDisable() {
        return SettingsManager.INSTANCE.getIntValue("live_frame_sign_setting", DEFAULT) == 0;
    }
}
