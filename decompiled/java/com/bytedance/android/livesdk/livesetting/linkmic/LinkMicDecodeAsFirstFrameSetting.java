package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "decode_as_first_frame_setting")
public final class LinkMicDecodeAsFirstFrameSetting {
    public static final LinkMicDecodeAsFirstFrameSetting INSTANCE = new LinkMicDecodeAsFirstFrameSetting();
    public static final boolean DEFAULT = true;

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("decode_as_first_frame_setting", DEFAULT);
    }
}
