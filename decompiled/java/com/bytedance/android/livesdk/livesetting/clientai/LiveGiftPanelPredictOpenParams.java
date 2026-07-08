package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftPanelPredictOpenParams {
    public static final TypeAdapter ADAPTER = new LiveGiftPanelPredictOpenParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("algo_package_name")
    public String algoPkgName;

    @C09CT("default_predict_time_sec")
    public long defaultPredictTime;

    @C09CT("enable")
    public boolean enable;

    @C09CT("is_training")
    public boolean isTraining;

    @C09CT("icon_preload_count")
    public int preloadCount;

    @C09CT("room_enter_delay_sec")
    public long roomEnterDelay;

    public LiveGiftPanelPredictOpenParams() {
        this(false, 30L, "gift_panel_predict_open", 12, -1L, false);
    }

    public LiveGiftPanelPredictOpenParams(boolean z, long j, String str, int i, long j2, boolean z2) {
        this.enable = z;
        this.roomEnterDelay = j;
        this.algoPkgName = str;
        this.preloadCount = i;
        this.defaultPredictTime = j2;
        this.isTraining = z2;
    }
}
