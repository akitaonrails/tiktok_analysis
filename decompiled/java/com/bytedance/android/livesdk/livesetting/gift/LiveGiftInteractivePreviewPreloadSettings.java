package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("interactive_gifts_preview_preload_enabled")
public final class LiveGiftInteractivePreviewPreloadSettings {
    public static final boolean DEFAULT = false;
    public static final LiveGiftInteractivePreviewPreloadSettings INSTANCE = new LiveGiftInteractivePreviewPreloadSettings();

    public final boolean getEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("interactive_gifts_preview_preload_enabled", DEFAULT);
    }
}
