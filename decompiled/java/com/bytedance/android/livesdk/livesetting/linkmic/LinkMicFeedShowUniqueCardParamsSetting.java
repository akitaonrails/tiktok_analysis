package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_guest_feed_show_unique_card_params")
public final class LinkMicFeedShowUniqueCardParamsSetting {
    public static final LinkMicFeedShowUniqueCardParamsSetting INSTANCE = new LinkMicFeedShowUniqueCardParamsSetting();
    public static final UniqueCardParams DEFAULT = new UniqueCardParams(300, 10000, 0.52f, Mp4ScreenVideoLoadTimeout.CONTROL, 200, true, 2000);

    public static final UniqueCardParams getParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        UniqueCardParams uniqueCardParams = DEFAULT;
        UniqueCardParams uniqueCardParams2 = (UniqueCardParams) settingsManager.getValueSafely("multi_guest_feed_show_unique_card_params", uniqueCardParams);
        return uniqueCardParams2 != null ? uniqueCardParams2 : uniqueCardParams;
    }
}
