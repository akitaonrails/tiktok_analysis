package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_extend_screen_tag_show")
public final class LiveGiftExtendScreenTagShow {
    public static final LiveGiftExtendScreenTagShow INSTANCE = new LiveGiftExtendScreenTagShow();
    public static final boolean DEFAULT = false;
    public static final boolean isEnabled = SettingsManager.INSTANCE.getBooleanValue("live_gift_extend_screen_tag_show", DEFAULT);

    public final boolean isEnabled() {
        return isEnabled;
    }
}
