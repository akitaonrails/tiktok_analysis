package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_select_gift_page_refactor_enable")
public final class LiveCoHostSelectGiftPageRefactorEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostSelectGiftPageRefactorEnableSetting INSTANCE = new LiveCoHostSelectGiftPageRefactorEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_select_gift_page_refactor_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
