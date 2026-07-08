package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_sticker_multi_channel")
public final class LiveGiftStickerMultiChannelSetting {
    public static final boolean isDisable;
    public static final boolean isEnable;
    public static final LiveGiftStickerMultiChannelSetting INSTANCE = new LiveGiftStickerMultiChannelSetting();
    public static final boolean DEFAULT = true;

    static {
        boolean booleanValue = SettingsManager.INSTANCE.getBooleanValue("live_gift_sticker_multi_channel", true);
        isEnable = booleanValue;
        isDisable = true ^ booleanValue;
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isDisable() {
        return isDisable;
    }

    public final boolean isEnable() {
        return isEnable;
    }
}
