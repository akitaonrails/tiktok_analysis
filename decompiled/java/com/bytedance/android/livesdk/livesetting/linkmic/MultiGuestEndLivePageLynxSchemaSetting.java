package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_end_live_page_lynx_schema")
public final class MultiGuestEndLivePageLynxSchemaSetting {
    public static final MultiGuestEndLivePageLynxSchemaSetting INSTANCE = new MultiGuestEndLivePageLynxSchemaSetting();
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=guest_live_end_close_page";

    public final String url() {
        return SettingsManager.INSTANCE.getStringValue("multi_guest_end_live_page_lynx_schema", DEFAULT);
    }
}
