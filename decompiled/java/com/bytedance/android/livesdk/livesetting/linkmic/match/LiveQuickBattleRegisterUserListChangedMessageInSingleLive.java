package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("quick_battle_register_user_list_changed_in_single_live")
public final class LiveQuickBattleRegisterUserListChangedMessageInSingleLive {
    public static final boolean DEFAULT = true;
    public static final LiveQuickBattleRegisterUserListChangedMessageInSingleLive INSTANCE = new LiveQuickBattleRegisterUserListChangedMessageInSingleLive();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("quick_battle_register_user_list_changed_in_single_live", DEFAULT);
    }
}
