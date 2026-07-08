package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_sticker_gift_additional_tag")
public final class LiveGiftEffectAddTagSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftEffectAddTagSetting INSTANCE = new LiveGiftEffectAddTagSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sticker_gift_additional_tag", DEFAULT);
    }

    public final boolean enable() {
        return getValue() != 0;
    }
}
