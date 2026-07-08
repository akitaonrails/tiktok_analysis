package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LivePreviewCardMaskConfig;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_preview_card_mask")
public final class LivePreViewMaskSettings {
    public static final LivePreViewMaskSettings INSTANCE = new LivePreViewMaskSettings();
    public static final LivePreviewCardMaskConfig DEFAULT = new LivePreviewCardMaskConfig();

    public final LivePreviewCardMaskConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePreviewCardMaskConfig livePreviewCardMaskConfig = DEFAULT;
        LivePreviewCardMaskConfig livePreviewCardMaskConfig2 = (LivePreviewCardMaskConfig) settingsManager.getValueSafely("live_preview_card_mask", livePreviewCardMaskConfig);
        return livePreviewCardMaskConfig2 != null ? livePreviewCardMaskConfig2 : livePreviewCardMaskConfig;
    }

    public final LivePreviewCardMaskConfig getDEFAULT() {
        return DEFAULT;
    }
}
