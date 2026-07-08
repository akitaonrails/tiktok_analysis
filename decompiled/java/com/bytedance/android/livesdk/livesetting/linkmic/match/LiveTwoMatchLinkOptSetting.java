package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("two_match_link_retry_setting")
public final class LiveTwoMatchLinkOptSetting {
    public static final LiveTwoMatchLinkOptSetting INSTANCE = new LiveTwoMatchLinkOptSetting();
    public static final LiveTwoMatchLinkOptSettingData DEFAULT = new LiveTwoMatchLinkOptSettingData(2000, 6000, 2000, LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, 3, 3, LSPassThroughRecordSizeConfig.DEFAULT);

    public final LiveTwoMatchLinkOptSettingData getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData = DEFAULT;
        LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData2 = (LiveTwoMatchLinkOptSettingData) settingsManager.getValueSafely("two_match_link_retry_setting", liveTwoMatchLinkOptSettingData);
        return liveTwoMatchLinkOptSettingData2 != null ? liveTwoMatchLinkOptSettingData2 : liveTwoMatchLinkOptSettingData;
    }

    public final LiveTwoMatchLinkOptSettingData getDEFAULT() {
        return DEFAULT;
    }
}
