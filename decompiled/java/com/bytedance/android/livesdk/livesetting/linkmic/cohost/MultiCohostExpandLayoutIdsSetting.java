package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_expand_layout_id")
public final class MultiCohostExpandLayoutIdsSetting {
    public static final MultiCohostExpandLayoutIdsSetting INSTANCE = new MultiCohostExpandLayoutIdsSetting();
    public static final String[] DEFAULT = {"2002", "200201", "2011"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_cohost_expand_layout_id", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isLayoutIdExpanded(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
