package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("postpone_request_batch_share_list")
public final class PostponeRequestBatchShareListSetting {
    public static final int DEFAULT = 3;
    public static final PostponeRequestBatchShareListSetting INSTANCE = new PostponeRequestBatchShareListSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("postpone_request_batch_share_list", DEFAULT);
    }
}
