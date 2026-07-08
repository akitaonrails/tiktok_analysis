package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_extended_screen_gift_optimize")
public final class LiveExtendedScreenGiftOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final LiveExtendedScreenGiftOptimizeSetting INSTANCE = new LiveExtendedScreenGiftOptimizeSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("live_extended_screen_gift_optimize", DEFAULT) > 0;
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_extended_screen_gift_optimize", DEFAULT);
    }

    public final boolean giftMessageViewHolder() {
        return getValue() == 2 || getValue() == 3;
    }

    public final boolean giftTraySpaceOptimize() {
        return getValue() == 1 || getValue() == 2;
    }

    public final boolean jumpGiftTrayCombo() {
        return getValue() == 2;
    }

    public final boolean removeGiftTray() {
        return getValue() == 3;
    }

    public final boolean shouldAnimateCombo() {
        return getValue() == 3;
    }

    public final boolean shouldFormatGiftWithCoin() {
        return getValue() == 1;
    }

    public final boolean shouldShowGiftTag() {
        return getValue() == 3;
    }
}
