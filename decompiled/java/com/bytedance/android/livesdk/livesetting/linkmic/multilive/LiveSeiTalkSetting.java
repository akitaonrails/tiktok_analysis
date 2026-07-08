package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_sei_talk_setting")
public final class LiveSeiTalkSetting {
    public static final LiveSeiTalkSetting INSTANCE = new LiveSeiTalkSetting();
    public static final LiveSeiTalkSettingConfig DEFAULT = new LiveSeiTalkSettingConfig(false, LSPassThroughRecordSizeConfig.DEFAULT, false, 20);

    private final LiveSeiTalkSettingConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSeiTalkSettingConfig liveSeiTalkSettingConfig = DEFAULT;
        LiveSeiTalkSettingConfig liveSeiTalkSettingConfig2 = (LiveSeiTalkSettingConfig) settingsManager.getValueSafely("live_sei_talk_setting", liveSeiTalkSettingConfig);
        return liveSeiTalkSettingConfig2 != null ? liveSeiTalkSettingConfig2 : liveSeiTalkSettingConfig;
    }

    public final boolean enable() {
        return getConfig().seiTalkEnable;
    }

    public final int getInterval() {
        return getConfig().seiInterval;
    }

    public final int volumeThreshold() {
        return getConfig().volumeThreshold;
    }
}
