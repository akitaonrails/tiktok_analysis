package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("suppress_gift_text_messages")
public final class SuppressGiftTextMessagesSetting {
    public static final boolean DEFAULT = false;
    public static final SuppressGiftTextMessagesSetting INSTANCE = new SuppressGiftTextMessagesSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("suppress_gift_text_messages", DEFAULT);
    }
}
