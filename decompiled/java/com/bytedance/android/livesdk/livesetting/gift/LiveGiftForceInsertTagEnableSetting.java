package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_gift_force_insert_tag_enable")
public final class LiveGiftForceInsertTagEnableSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLED = 1;
    public static final LiveGiftForceInsertTagEnableSetting INSTANCE = new LiveGiftForceInsertTagEnableSetting();

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_force_insert_tag_enable", DEFAULT);
    }

    public final boolean isEnabled() {
        return getSettingValue() > 0;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
