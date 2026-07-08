package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C13LQ;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_entrance_disable_dislike")
public final class LiveEntranceDisableDislikeSetting {
    public static final LiveEntranceDisableDislikeSetting INSTANCE = new LiveEntranceDisableDislikeSetting();
    public static final String[] DEFAULT = new String[0];

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_entrance_disable_dislike", DEFAULT);
    }

    public final boolean enable(String str, String str2) {
        String[] value = getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C13LQ.LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ), value);
    }
}
