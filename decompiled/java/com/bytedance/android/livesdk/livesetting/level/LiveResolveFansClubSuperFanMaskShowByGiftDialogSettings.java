package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_resolve_superfan_mask_show_by_gift_dialog")
public final class LiveResolveFansClubSuperFanMaskShowByGiftDialogSettings {
    public static final boolean DEFAULT = true;
    public static final LiveResolveFansClubSuperFanMaskShowByGiftDialogSettings INSTANCE = new LiveResolveFansClubSuperFanMaskShowByGiftDialogSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_resolve_superfan_mask_show_by_gift_dialog", DEFAULT);
    }
}
