package com.bytedance.android.livesdk.chatroom.ui.extracard;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_scroll_up_intercept")
public final class LiveScrollUpInterceptOpt {
    public static final boolean DEFAULT = false;
    public static final LiveScrollUpInterceptOpt INSTANCE = new LiveScrollUpInterceptOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_scroll_up_intercept", DEFAULT);
    }
}
