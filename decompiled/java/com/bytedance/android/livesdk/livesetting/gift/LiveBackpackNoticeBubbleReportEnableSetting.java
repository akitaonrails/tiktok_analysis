package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_guide_backpack_bubble_report_enable")
public final class LiveBackpackNoticeBubbleReportEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBackpackNoticeBubbleReportEnableSetting INSTANCE = new LiveBackpackNoticeBubbleReportEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_guide_backpack_bubble_report_enable", DEFAULT);
    }
}
