package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_player_render_view_rebuild_cleanup_fix")
public final class LinkMicPlayerRenderViewRebuildCleanupFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicPlayerRenderViewRebuildCleanupFix INSTANCE = new LinkMicPlayerRenderViewRebuildCleanupFix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_player_render_view_rebuild_cleanup_fix", DEFAULT);
    }
}
