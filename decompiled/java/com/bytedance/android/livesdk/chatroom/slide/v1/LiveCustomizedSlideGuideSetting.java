package com.bytedance.android.livesdk.chatroom.slide.v1;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_slide_guide_show_entrance")
public final class LiveCustomizedSlideGuideSetting {
    public static final LiveCustomizedSlideGuideSetting INSTANCE = new LiveCustomizedSlideGuideSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("live_slide_guide_show_entrance", strArr);
        return stringArrayValue != null ? stringArrayValue : strArr;
    }

    public final boolean isEntranceEnable(String str) {
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
