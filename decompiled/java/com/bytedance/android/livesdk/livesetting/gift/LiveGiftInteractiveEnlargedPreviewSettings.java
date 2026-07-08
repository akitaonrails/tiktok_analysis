package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("interactive_gifts_enlarged_previews_enabled")
public final class LiveGiftInteractiveEnlargedPreviewSettings {
    public static final boolean DEFAULT = false;
    public static final LiveGiftInteractiveEnlargedPreviewSettings INSTANCE = new LiveGiftInteractiveEnlargedPreviewSettings();

    public final boolean getEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("interactive_gifts_enlarged_previews_enabled", DEFAULT);
    }
}
