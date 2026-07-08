package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C13LQ;
import X.C2093608Ic;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_username_follow_style_language")
public final class LiveUserNameFollowStyleLanguage {
    public static final LiveUserNameFollowStyleLanguage INSTANCE = new LiveUserNameFollowStyleLanguage();
    public static final String[] DEFAULT = {"bn-IN", "el-GR", "hi-IN", "my-MM", "ru-RU", "uk-UA"};

    private final String[] getCurrentValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_username_follow_style_language", DEFAULT);
    }

    public final boolean contains(String str) {
        if (C2093608Ic.LJ(str)) {
            return false;
        }
        return C13LQ.LJIILLIIL(str, getCurrentValue());
    }
}
