package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_battle_mvp_animation_fix_enable_v2")
public final class LiveMatchMvpAnimationFixEnableV2 {
    public static final int DEFAULT = 0;
    public static final LiveMatchMvpAnimationFixEnableV2 INSTANCE = new LiveMatchMvpAnimationFixEnableV2();

    public final int isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_battle_mvp_animation_fix_enable_v2", DEFAULT);
    }
}
