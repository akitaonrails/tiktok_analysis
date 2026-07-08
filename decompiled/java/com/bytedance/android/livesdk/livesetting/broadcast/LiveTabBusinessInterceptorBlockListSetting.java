package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_tab_business_interceptor_block_list")
public final class LiveTabBusinessInterceptorBlockListSetting {
    public static final LiveTabBusinessInterceptorBlockListSetting INSTANCE = new LiveTabBusinessInterceptorBlockListSetting();
    public static final String[] DEFAULT = {"comment_reply"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_tab_business_interceptor_block_list", DEFAULT);
    }
}
