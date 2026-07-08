package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_anchor_panel_compose")
public final class LiveGiftAnchorPanelComposeSettings {
    public static final boolean DEFAULT = false;
    public static final LiveGiftAnchorPanelComposeSettings INSTANCE = new LiveGiftAnchorPanelComposeSettings();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_anchor_panel_compose", DEFAULT);
    }
}
