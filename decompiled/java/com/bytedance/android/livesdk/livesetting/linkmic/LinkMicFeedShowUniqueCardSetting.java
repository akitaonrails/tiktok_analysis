package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C452501pT;
import X.C915990Zwb;
import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_feed_show_unique_card_client_control")
public final class LinkMicFeedShowUniqueCardSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicFeedShowUniqueCardSetting INSTANCE = new LinkMicFeedShowUniqueCardSetting();
    public static final C01GW settingValue$delegate = C452501pT.LIZIZ(new C915990Zwb());

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final boolean hitExperiment() {
        return getSettingValue() > 0;
    }

    public static final boolean enable(boolean z) {
        LinkMicFeedShowUniqueCardSetting linkMicFeedShowUniqueCardSetting = INSTANCE;
        if (linkMicFeedShowUniqueCardSetting.getSettingValue() <= 0) {
            return false;
        }
        if (linkMicFeedShowUniqueCardSetting.getSettingValue() == 2) {
            return z;
        }
        return true;
    }
}
