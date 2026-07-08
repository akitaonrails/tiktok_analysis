package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_bubble_setting")
public final class LiveBubbleSetting {
    public static final LiveBubbleSetting INSTANCE = new LiveBubbleSetting();
    public static final BubbleSettingData DEFAULT = new BubbleSettingData(0, 0, 0);
    public static final BubbleSettingData solidifyValue = new BubbleSettingData(10, 10, 10);

    public final BubbleSettingData getConfig() {
        if (C486960J7u.LIZ()) {
            return solidifyValue;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BubbleSettingData bubbleSettingData = DEFAULT;
        BubbleSettingData bubbleSettingData2 = (BubbleSettingData) settingsManager.getValueSafely("live_bubble_setting", bubbleSettingData);
        return bubbleSettingData2 == null ? bubbleSettingData : bubbleSettingData2;
    }

    public final BubbleSettingData getDEFAULT() {
        return DEFAULT;
    }
}
