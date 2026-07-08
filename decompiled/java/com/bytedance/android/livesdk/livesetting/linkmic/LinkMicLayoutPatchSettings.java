package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_layout_patch_enable")
public final class LinkMicLayoutPatchSettings {
    public static final LinkMicLayoutPatchSettings INSTANCE = new LinkMicLayoutPatchSettings();
    public static final boolean DEFAULT = true;

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_layout_patch_enable", DEFAULT);
    }
}
