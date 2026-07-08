package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_watcher_ecom_pin_in_public_screen")
public final class LiveWatcherEcomPinInPublicScreen {
    public static final LiveWatcherEcomPinInPublicScreen INSTANCE = new LiveWatcherEcomPinInPublicScreen();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_watcher_ecom_pin_in_public_screen", true);

    public final boolean getValue() {
        return value;
    }
}
