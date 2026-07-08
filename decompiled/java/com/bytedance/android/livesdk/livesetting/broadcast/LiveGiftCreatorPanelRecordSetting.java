package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_creator_gift_panel_record_request_limit")
public final class LiveGiftCreatorPanelRecordSetting {
    public static final LiveGiftCreatorPanelRecordSetting INSTANCE = new LiveGiftCreatorPanelRecordSetting();
    public static final int DEFAULT = 50;

    public final int getFetchSize() {
        return SettingsManager.INSTANCE.getIntValue("live_creator_gift_panel_record_request_limit", DEFAULT);
    }
}
