package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_class_rank_creator_opt_out_dialog_enabled")
public final class GiftClassRankCreatorOptOutDialogSetting {
    public static final boolean DEFAULT = false;
    public static final GiftClassRankCreatorOptOutDialogSetting INSTANCE = new GiftClassRankCreatorOptOutDialogSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_class_rank_creator_opt_out_dialog_enabled", DEFAULT);
    }
}
