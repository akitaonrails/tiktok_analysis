package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_decoration_fix")
public final class MultiGuestDecorationFixSetting {
    public static final int DEFAULT = 1;
    public static final MultiGuestDecorationFixSetting INSTANCE = new MultiGuestDecorationFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_decoration_fix", DEFAULT);
    }

    public final boolean enable() {
        return getValue() > 0;
    }
}
