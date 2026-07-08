package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("enable_preview_card_use_preview")
public final class EnablePreviewCardUsePreviewSetting {
    public static final int DEFAULT = 0;
    public static final EnablePreviewCardUsePreviewSetting INSTANCE = new EnablePreviewCardUsePreviewSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_preview_card_use_preview", DEFAULT);
    }
}
