package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_im_body_simplify")
public final class LinkMicImBodySimplifySetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicImBodySimplifySetting INSTANCE = new LinkMicImBodySimplifySetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_im_body_simplify", DEFAULT);
    }
}
