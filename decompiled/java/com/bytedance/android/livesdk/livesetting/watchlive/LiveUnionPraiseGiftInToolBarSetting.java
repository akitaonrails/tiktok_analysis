package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_screen_audience_union_toolbar")
public final class LiveUnionPraiseGiftInToolBarSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final LiveUnionPraiseGiftInToolBarSetting INSTANCE = new LiveUnionPraiseGiftInToolBarSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_screen_audience_union_toolbar", DEFAULT) == 1;
    }
}
