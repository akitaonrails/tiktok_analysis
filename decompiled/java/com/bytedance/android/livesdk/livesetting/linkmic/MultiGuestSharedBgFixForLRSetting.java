package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multiguest_shared_bg_fix_for_lr_enabled")
public final class MultiGuestSharedBgFixForLRSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestSharedBgFixForLRSetting INSTANCE = new MultiGuestSharedBgFixForLRSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_shared_bg_fix_for_lr_enabled", DEFAULT);
    }
}
