package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_probe_result_notify_type")
public final class LivePreviewProbeResultNotifyTypeSetting {
    public static final int DEFAULT = 2;
    public static final LivePreviewProbeResultNotifyTypeSetting INSTANCE = new LivePreviewProbeResultNotifyTypeSetting();

    public final int getValue() {
        return 2;
    }

    public final boolean inExperiment() {
        return getValue() > 0;
    }

    public final boolean newToastHint() {
        return getValue() == 1;
    }

    public final boolean showDialog() {
        return getValue() > 1;
    }
}
