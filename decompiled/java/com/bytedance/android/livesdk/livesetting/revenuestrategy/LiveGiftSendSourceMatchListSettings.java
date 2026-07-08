package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_send_source_match_list")
public final class LiveGiftSendSourceMatchListSettings {
    public static final LiveGiftSendSourceMatchListSettings INSTANCE = new LiveGiftSendSourceMatchListSettings();
    public static final String[] DEFAULT = {""};

    public final boolean hasMatchSource(String str) {
        return C13LQ.LJIILLIIL(str, SettingsManager.INSTANCE.getStringArrayValue("live_gift_send_source_match_list", DEFAULT));
    }
}
