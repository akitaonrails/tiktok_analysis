package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_caption_anchor_setting")
public final class LiveCaptionAnchorSetting {
    public static final LiveCaptionAnchorSetting INSTANCE = new LiveCaptionAnchorSetting();
    public static final String[] DEFAULT = {""};

    public static final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_caption_anchor_setting", DEFAULT);
    }
}
