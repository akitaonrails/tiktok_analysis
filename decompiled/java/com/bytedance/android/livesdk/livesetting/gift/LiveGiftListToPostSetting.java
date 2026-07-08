package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_list_switch_to_post")
public final class LiveGiftListToPostSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGiftListToPostSetting INSTANCE = new LiveGiftListToPostSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_list_switch_to_post", DEFAULT);
    }
}
