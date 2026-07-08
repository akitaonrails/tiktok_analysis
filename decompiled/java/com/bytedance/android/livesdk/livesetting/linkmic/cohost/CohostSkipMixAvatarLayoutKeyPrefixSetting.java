package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_skip_mix_avatar_layout_key_prefix")
public final class CohostSkipMixAvatarLayoutKeyPrefixSetting {
    public static final CohostSkipMixAvatarLayoutKeyPrefixSetting INSTANCE = new CohostSkipMixAvatarLayoutKeyPrefixSetting();
    public static final String[] DEFAULT = {"cohost_enlarge"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("cohost_skip_mix_avatar_layout_key_prefix", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isPrefixMatched(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        for (String str2 : getValue()) {
            if (str2.length() > 0 && u.LJJIIJZLJL(str, str2, false)) {
                return true;
            }
        }
        return false;
    }
}
