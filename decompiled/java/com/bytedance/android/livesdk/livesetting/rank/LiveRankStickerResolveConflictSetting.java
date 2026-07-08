package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_sticker_resolve_conflict")
public final class LiveRankStickerResolveConflictSetting {
    public static final LiveRankStickerResolveConflictSetting INSTANCE = new LiveRankStickerResolveConflictSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_sticker_resolve_conflict", DEFAULT);
    }
}
