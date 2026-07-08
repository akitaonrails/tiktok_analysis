package com.bytedance.android.livesdk.broadcast.setting;

import X.C1505160pGs;
import X.C1510700pPo;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("ttlh_linkmic_portrait_settings")
public final class TTLHVideoResolutionPortraitSettings {
    public static final TTLHVideoResolutionPortraitSettings INSTANCE = new TTLHVideoResolutionPortraitSettings();
    public static final String[] DEFAULT = new String[0];

    public static final boolean anchorEverLinked() {
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue("ttlh_linkmic_portrait_settings", DEFAULT);
        if (stringArrayValue.length != 0) {
            C1505160pGs c1505160pGsLIZ = C1510700pPo.LIZ();
            for (String str : stringArrayValue) {
                if (c1505160pGsLIZ.LJFF(0, str) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
