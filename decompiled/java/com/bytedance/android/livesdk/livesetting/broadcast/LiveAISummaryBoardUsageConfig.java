package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveAISummaryBoardUsageConfig {
    public static final TypeAdapter ADAPTER = new LiveAISummaryBoardUsageConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ai_summary_usage_opt")
    public boolean aiSummaryUsageOpt;

    @C09CT("broadcast_dialog_style")
    public int broadcastDialogStyle;

    @C09CT("preview_keep_old_style")
    public boolean previewKeepOldStyle;

    public LiveAISummaryBoardUsageConfig() {
        this(false, 0, true);
    }

    public final boolean getAiSummaryUsageOpt() {
        return this.aiSummaryUsageOpt;
    }

    public final int getBroadcastDialogStyle() {
        return this.broadcastDialogStyle;
    }

    public final boolean getPreviewKeepOldStyle() {
        return this.previewKeepOldStyle;
    }

    public final void setAiSummaryUsageOpt(boolean z) {
        this.aiSummaryUsageOpt = z;
    }

    public final void setBroadcastDialogStyle(int i) {
        this.broadcastDialogStyle = i;
    }

    public final void setPreviewKeepOldStyle(boolean z) {
        this.previewKeepOldStyle = z;
    }

    public LiveAISummaryBoardUsageConfig(boolean z, int i, boolean z2) {
        this.aiSummaryUsageOpt = z;
        this.broadcastDialogStyle = i;
        this.previewKeepOldStyle = z2;
    }
}
