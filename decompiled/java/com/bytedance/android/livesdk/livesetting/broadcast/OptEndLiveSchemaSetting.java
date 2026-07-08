package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("end_live_schema_optimize")
public final class OptEndLiveSchemaSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_end_live%2Fend-live%2Fpages%2Fmain%2Ftemplate.js&hide_loading=1";
    public static final OptEndLiveSchemaSetting INSTANCE = new OptEndLiveSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("end_live_schema_optimize", DEFAULT);
    }
}
