package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_layout_id_config")
public final class LiveMatchLayoutIdConfig {
    public static final LiveMatchLayoutIdConfig INSTANCE = new LiveMatchLayoutIdConfig();
    public static final MatchLayoutIds DEFAULT = new MatchLayoutIds(2002, 200201, 2030, 2031);

    public final MatchLayoutIds getValue() {
        MatchLayoutIds matchLayoutIds = (MatchLayoutIds) SettingsManager.INSTANCE.getValueSafely(LiveMatchLayoutIdConfig.class);
        return matchLayoutIds == null ? DEFAULT : matchLayoutIds;
    }

    public final long match1vNLayoutId() {
        return getValue().match1vNLayoutId;
    }

    public final long matchNv1LayoutId() {
        return getValue().matchNv1LayoutId;
    }

    public final long matchNvNCropLayoutId() {
        return getValue().matchNvNCropLayoutId;
    }

    public final long matchNvNLayoutId() {
        return getValue().matchNvNLayoutId;
    }
}
