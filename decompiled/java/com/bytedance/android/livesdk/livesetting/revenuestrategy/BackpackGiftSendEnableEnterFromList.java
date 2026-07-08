package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_backpack_enable_send_enter_from_list")
public final class BackpackGiftSendEnableEnterFromList {
    public static final BackpackGiftSendEnableEnterFromList INSTANCE = new BackpackGiftSendEnableEnterFromList();
    public static final String[] DEFAULT = {"convenient_icon", "gift_goal"};

    public final boolean isEnable(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : SettingsManager.INSTANCE.getStringArrayValue("live_backpack_enable_send_enter_from_list", DEFAULT)) {
            if (new Regex(str2).matches(str)) {
                return true;
            }
        }
        return false;
    }
}
