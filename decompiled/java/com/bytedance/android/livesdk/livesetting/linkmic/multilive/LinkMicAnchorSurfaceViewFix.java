package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("link_mic_anchor_surface_view_fix")
public final class LinkMicAnchorSurfaceViewFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicAnchorSurfaceViewFix INSTANCE = new LinkMicAnchorSurfaceViewFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_anchor_surface_view_fix", DEFAULT);
    }
}
