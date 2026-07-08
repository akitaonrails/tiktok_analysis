package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("lop_pns_fe_preload")
public final class LopDobPreloadSetting {
    public static final LopDobPreload DEFAULT;
    public static final LopDobPreloadSetting INSTANCE = new LopDobPreloadSetting();
    public static final LopDobPreload config;

    static {
        LopDobPreload lopDobPreload = new LopDobPreload("", new ArrayList(), new ArrayList(), 120);
        DEFAULT = lopDobPreload;
        config = (LopDobPreload) SettingsManager.INSTANCE.getValueSafely("lop_pns_fe_preload", lopDobPreload);
    }

    public final int getExpiredTimeInSeconds() {
        return config.getExpiredTimeInSeconds();
    }

    public final List<String> getPreloadAllowList() {
        return config.getPreloadAllowList();
    }

    public final String getPreloadSchema() {
        return config.getPreloadSchema();
    }

    public final List<String> getReuseAllowList() {
        return config.getReuseAllowList();
    }
}
