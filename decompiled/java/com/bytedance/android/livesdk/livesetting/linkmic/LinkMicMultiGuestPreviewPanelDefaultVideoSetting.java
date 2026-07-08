package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_linkmic_preview_panel_default_video")
public final class LinkMicMultiGuestPreviewPanelDefaultVideoSetting {
    public static final int ACROSS_LIVE_ROOMS = 1;
    public static final int DEFAULT = 0;
    public static final LinkMicMultiGuestPreviewPanelDefaultVideoSetting INSTANCE = new LinkMicMultiGuestPreviewPanelDefaultVideoSetting();
    public static final int SINGLE_LIVE_ROOM = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_linkmic_preview_panel_default_video", DEFAULT);
    }

    public final boolean isControlGroup() {
        return getValue() == 0;
    }
}
