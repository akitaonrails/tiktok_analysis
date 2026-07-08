package com.bytedance.android.livesdk.livesetting.performance;

import X.C13LP;
import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_slardar_allow_list")
public final class LiveEnableSlardarAllowList {
    public static final LiveEnableSlardarAllowList INSTANCE = new LiveEnableSlardarAllowList();
    public static final String[] DEFAULT = new String[0];

    private final Set<String> getAllowListSet() {
        return C13LQ.LJLIIL(SettingsManager.INSTANCE.getStringArrayValue("live_enable_slardar_allow_list", DEFAULT));
    }

    public final boolean isDisable(String str) {
        return !isEnable(str);
    }

    public final boolean isEnable(String str) {
        return C13LP.LJJJJ(str, getAllowListSet());
    }
}
