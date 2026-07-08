package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_stall_deprecate_sei_count")
public final class LinkMicStallDeprecateSeiCount {
    public static final int DEFAULT = 1;
    public static final LinkMicStallDeprecateSeiCount INSTANCE = new LinkMicStallDeprecateSeiCount();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_stall_deprecate_sei_count", DEFAULT);
    }
}
