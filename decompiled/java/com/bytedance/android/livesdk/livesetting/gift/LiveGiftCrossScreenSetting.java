package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_cross_screen_config")
public final class LiveGiftCrossScreenSetting {
    public static final LiveGiftCrossScreenSetting INSTANCE = new LiveGiftCrossScreenSetting();
    public static final CrossScreenSettingParams DEFAULT = new CrossScreenSettingParams(1, 1, 1, 1, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL);

    private final CrossScreenSettingParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CrossScreenSettingParams crossScreenSettingParams = DEFAULT;
        CrossScreenSettingParams crossScreenSettingParams2 = (CrossScreenSettingParams) settingsManager.getValueSafely("live_gift_cross_screen_config", crossScreenSettingParams);
        return crossScreenSettingParams2 != null ? crossScreenSettingParams2 : crossScreenSettingParams;
    }

    public final long getAnchorPreloadDelay() {
        return getSettingParams().anchorPreloadDelay;
    }

    public final long getGuestPreloadDelay() {
        return getSettingParams().guestPreloadDelay;
    }

    public final boolean shouldCheckCameraForAction() {
        return getSettingParams().checkCameraForAction == 1;
    }

    public final boolean shouldIgnoreExtraTrays() {
        return getSettingParams().ignoreExtraTrays == 1;
    }

    public final boolean shouldIgnorePublicScreenMessage() {
        return getSettingParams().ignorePublicScreenMessage == 1;
    }

    public final boolean shouldInsertByPriority() {
        return getSettingParams().insertByPriority == 1;
    }

    public final CrossScreenSettingParams getDEFAULT() {
        return DEFAULT;
    }
}
