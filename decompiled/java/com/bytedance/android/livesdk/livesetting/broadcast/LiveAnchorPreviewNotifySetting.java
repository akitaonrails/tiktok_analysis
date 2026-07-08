package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_preview_notify")
public final class LiveAnchorPreviewNotifySetting {
    public static final int DEFAULT = 1;
    public static final LiveAnchorPreviewNotifySetting INSTANCE = new LiveAnchorPreviewNotifySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_preview_notify", DEFAULT) > 0;
    }
}
