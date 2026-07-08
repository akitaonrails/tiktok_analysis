package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_card_repost_guide_enable")
public final class LivePreviewCardRepostGuideEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LivePreviewCardRepostGuideEnableSetting INSTANCE = new LivePreviewCardRepostGuideEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_card_repost_guide_enable", DEFAULT);
    }
}
