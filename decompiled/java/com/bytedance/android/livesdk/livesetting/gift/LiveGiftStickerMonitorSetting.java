package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_sticker_monitor")
public final class LiveGiftStickerMonitorSetting {
    public static final LiveGiftStickerMonitorSetting INSTANCE = new LiveGiftStickerMonitorSetting();
    public static final InitialEffectSettingParams DEFAULT = new InitialEffectSettingParams(false, 0, "", "");

    private final InitialEffectSettingParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        InitialEffectSettingParams initialEffectSettingParams = DEFAULT;
        InitialEffectSettingParams initialEffectSettingParams2 = (InitialEffectSettingParams) settingsManager.getValueSafely("live_gift_sticker_monitor", initialEffectSettingParams);
        return initialEffectSettingParams2 != null ? initialEffectSettingParams2 : initialEffectSettingParams;
    }

    private final int getLoadTiming() {
        return getSettingParams().loadTiming;
    }

    public final String getPanelName() {
        return getSettingParams().panelName;
    }

    public final String getResourceId() {
        return getSettingParams().resourceId;
    }

    public final boolean isEnabled() {
        return getSettingParams().enabled;
    }

    public final boolean isLoadOnGift() {
        return getLoadTiming() == 1;
    }

    public final boolean isLoadOnInit() {
        return getLoadTiming() == 0;
    }

    public final InitialEffectSettingParams getDEFAULT() {
        return DEFAULT;
    }
}
