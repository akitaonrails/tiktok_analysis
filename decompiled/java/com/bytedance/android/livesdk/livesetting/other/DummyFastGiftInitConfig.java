package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("dummy_fast_gift_init_config")
public final class DummyFastGiftInitConfig {
    public static final boolean OPTIMIZE = false;
    public static final DummyFastGiftInitConfig INSTANCE = new DummyFastGiftInitConfig();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("dummy_fast_gift_init_config", DEFAULT);

    public final boolean enable() {
        return !value;
    }
}
