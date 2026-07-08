package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_show_subscribe")
public final class ShowSubscribeSetting {
    public static final boolean DEFAULT = true;
    public static final ShowSubscribeSetting INSTANCE = new ShowSubscribeSetting();

    public final boolean getShow() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_show_subscribe", DEFAULT);
    }
}
