package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_gles_version_report")
public final class TTLHGLVersionReportSettings {
    public static final TTLHGLVersionReportSettings INSTANCE = new TTLHGLVersionReportSettings();
    public static final int DEFAULT = 1;

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_gles_version_report", DEFAULT) == 1;
    }
}
