package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_preview_card_mpd_enable")
public final class LivePreviewCardMPDSetting {
    public static final boolean DEFAULT = false;
    public static final LivePreviewCardMPDSetting INSTANCE = new LivePreviewCardMPDSetting();
    public static final boolean enable = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_card_mpd_enable", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnable() {
        return enable;
    }
}
