package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pitaya_pkg_update_list_settings")
public final class LivePitayaPkgUpdateListSettings {
    public static final LivePitayaPkgUpdateListSettings INSTANCE = new LivePitayaPkgUpdateListSettings();
    public static final String[] DEFAULT = new String[0];

    public final String[] getDownloadPkgOptList() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_pitaya_pkg_update_list_settings", DEFAULT);
    }
}
