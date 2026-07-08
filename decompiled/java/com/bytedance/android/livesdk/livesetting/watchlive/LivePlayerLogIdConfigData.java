package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePlayerLogIdConfigData {
    public static final TypeAdapter ADAPTER = new LivePlayerLogIdConfigData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_pass_log_id")
    public boolean enablePassLogId;

    public LivePlayerLogIdConfigData() {
        this(true);
    }

    public LivePlayerLogIdConfigData(boolean z) {
        this.enablePassLogId = z;
    }
}
