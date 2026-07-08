package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_recharge_group_channel_id_fix")
public final class LinkMicRechargeGroupChannelIdFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicRechargeGroupChannelIdFix INSTANCE = new LinkMicRechargeGroupChannelIdFix();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_recharge_group_channel_id_fix", DEFAULT);
    }
}
