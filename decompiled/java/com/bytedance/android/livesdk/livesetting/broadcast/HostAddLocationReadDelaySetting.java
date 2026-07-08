package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "host_add_location_read_delay")
public final class HostAddLocationReadDelaySetting {
    public static final HostAddLocationReadDelaySetting INSTANCE = new HostAddLocationReadDelaySetting();
    public static final long DEFAULT = 4000;
    public static final long value = SettingsManager.INSTANCE.getLongValue("host_add_location_read_delay", DEFAULT);

    public final long value() {
        return value;
    }
}
