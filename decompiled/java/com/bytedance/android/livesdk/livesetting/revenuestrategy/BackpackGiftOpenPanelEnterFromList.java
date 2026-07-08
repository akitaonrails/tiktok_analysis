package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_backpack_open_panel_enter_from_list")
public final class BackpackGiftOpenPanelEnterFromList {
    public static final BackpackGiftOpenPanelEnterFromList INSTANCE = new BackpackGiftOpenPanelEnterFromList();
    public static final String[] DEFAULT = {"gift_guide_popup", "gift_guide_popup_badge", "gift_guide_user_level_popup"};

    public final boolean isEnable(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : SettingsManager.INSTANCE.getStringArrayValue("live_backpack_open_panel_enter_from_list", DEFAULT)) {
            if (new Regex(str2).matches(str)) {
                return true;
            }
        }
        return false;
    }
}
