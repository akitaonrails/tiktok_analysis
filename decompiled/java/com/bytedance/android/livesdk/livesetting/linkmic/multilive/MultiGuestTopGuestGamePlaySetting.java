package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("multi_guest_top_guest_opt")
public final class MultiGuestTopGuestGamePlaySetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestTopGuestGamePlaySetting INSTANCE = new MultiGuestTopGuestGamePlaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_top_guest_opt", DEFAULT);
    }

    public final boolean isEnableTopGuest() {
        return getValue() == 1 || getValue() == 2;
    }
}
