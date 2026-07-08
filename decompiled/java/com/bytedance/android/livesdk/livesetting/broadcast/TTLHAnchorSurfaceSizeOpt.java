package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_anchor_surface_size_opt")
public final class TTLHAnchorSurfaceSizeOpt {
    public static final TTLHAnchorSurfaceSizeOpt INSTANCE = new TTLHAnchorSurfaceSizeOpt();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("ttlh_anchor_surface_size_opt", DEFAULT);

    public final boolean enable() {
        return setting == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
