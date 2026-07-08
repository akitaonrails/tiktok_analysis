package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multiguest_layout_patch_name")
public final class LinkMicMultiGuestPatchNameSetting {
    public static final String DEFAULT = "seamless";
    public static final LinkMicMultiGuestPatchNameSetting INSTANCE = new LinkMicMultiGuestPatchNameSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("multiguest_layout_patch_name", DEFAULT);
    }
}
