package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_sdk_preview_sr_support")
public final class LivePreviewCardEnableSrSetting {
    public static final int DEFAULT = -1;
    public static final int ENABLE = 1;
    public static final LivePreviewCardEnableSrSetting INSTANCE = new LivePreviewCardEnableSrSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_preview_sr_support", DEFAULT) == 1;
    }
}
