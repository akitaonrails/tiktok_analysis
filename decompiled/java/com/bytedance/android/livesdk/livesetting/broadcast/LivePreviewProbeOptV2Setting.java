package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_opt_v2")
public final class LivePreviewProbeOptV2Setting {
    public static final int DEFAULT = 1;
    public static final LivePreviewProbeOptV2Setting INSTANCE = new LivePreviewProbeOptV2Setting();

    public final int getValue() {
        return 1;
    }

    public final boolean enabled() {
        return getValue() > 0;
    }
}
