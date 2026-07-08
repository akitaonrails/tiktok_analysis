package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.network.model.RequestPb;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_mt_pb_requests")
public final class LiveMtPbRequestsSetting {
    public static final LiveMtPbRequestsSetting INSTANCE = new LiveMtPbRequestsSetting();
    public static final RequestPb DEFAULT = RequestPb.defaultInstance();

    public final RequestPb getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RequestPb requestPb = DEFAULT;
        RequestPb requestPb2 = (RequestPb) settingsManager.getValueSafely("live_mt_pb_requests", requestPb);
        return requestPb2 != null ? requestPb2 : requestPb;
    }
}
