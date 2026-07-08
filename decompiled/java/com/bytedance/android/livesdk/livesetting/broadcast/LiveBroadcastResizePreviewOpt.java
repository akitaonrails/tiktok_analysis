package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_resize_preview_opt")
public final class LiveBroadcastResizePreviewOpt {
    public static final LiveBroadcastResizePreviewOpt INSTANCE = new LiveBroadcastResizePreviewOpt();
    public static final boolean DEFAULT = true;

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_resize_preview_opt", DEFAULT);
    }
}
