package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("co_host_sei_talk_setting")
public final class CoHostSeiTalkSetting {
    public static final CoHostSeiTalkSetting INSTANCE = new CoHostSeiTalkSetting();
    public static final CoHostSeiTalkSettingConfig DEFAULT = new CoHostSeiTalkSettingConfig(false, LSPassThroughRecordSizeConfig.DEFAULT, 20);

    private final CoHostSeiTalkSettingConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig = DEFAULT;
        CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig2 = (CoHostSeiTalkSettingConfig) settingsManager.getValueSafely("co_host_sei_talk_setting", coHostSeiTalkSettingConfig);
        return coHostSeiTalkSettingConfig2 != null ? coHostSeiTalkSettingConfig2 : coHostSeiTalkSettingConfig;
    }

    public final boolean enable() {
        return getConfig().seiTalkEnable;
    }

    public final int getInterval() {
        return getConfig().seiInterval;
    }

    public final int getMinAudioVolume() {
        return getConfig().minAudioVolume;
    }
}
