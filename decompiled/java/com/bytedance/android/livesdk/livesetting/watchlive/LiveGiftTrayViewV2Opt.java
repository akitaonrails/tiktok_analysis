package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_tray_view_v2_opt")
public final class LiveGiftTrayViewV2Opt {
    public static final LiveGiftTrayViewV2Opt INSTANCE = new LiveGiftTrayViewV2Opt();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_gift_tray_view_v2_opt", DEFAULT);

    public final boolean enableCacheView() {
        return (value & 1) == 1;
    }

    public final boolean enableOptRefresh() {
        return (value & 2) == 2;
    }
}
