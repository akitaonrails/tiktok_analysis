package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_battle_mvp_animation_fix_enable")
public final class LiveMatchMvpAnimationFixEnable {
    public static final int DEFAULT = 1;
    public static final LiveMatchMvpAnimationFixEnable INSTANCE = new LiveMatchMvpAnimationFixEnable();

    public final int isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_battle_mvp_animation_fix_enable", DEFAULT);
    }
}
