package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_fast_gift_memory_leak_fix")
public final class LiveGiftFastGiftMemoryLeakFixSetting {
    public static final LiveGiftFastGiftMemoryLeakFixSetting INSTANCE = new LiveGiftFastGiftMemoryLeakFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_fast_gift_memory_leak_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
