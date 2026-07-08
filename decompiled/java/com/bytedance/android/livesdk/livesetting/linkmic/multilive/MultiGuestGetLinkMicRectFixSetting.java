package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("get_link_mic_rect_fix")
public final class MultiGuestGetLinkMicRectFixSetting {
    public static final int DEFAULT = 1;
    public static final MultiGuestGetLinkMicRectFixSetting INSTANCE = new MultiGuestGetLinkMicRectFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("get_link_mic_rect_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
