package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_game_moment_quick_comment_expend")
public final class TtliveGameMomentQuickCommentExpand {
    public static final int DEFAULT = 0;
    public static final int GROUP1 = 1;
    public static final int GROUP2 = 2;
    public static final TtliveGameMomentQuickCommentExpand INSTANCE = new TtliveGameMomentQuickCommentExpand();

    public final boolean enableQuickComment() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_moment_quick_comment_expend", DEFAULT) != 0;
    }

    public final boolean enableWatchFocus() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_moment_quick_comment_expend", DEFAULT) == 2;
    }
}
