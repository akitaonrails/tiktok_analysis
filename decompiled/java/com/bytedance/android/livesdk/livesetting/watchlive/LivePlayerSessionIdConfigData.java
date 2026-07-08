package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePlayerSessionIdConfigData {
    public static final TypeAdapter ADAPTER = new LivePlayerSessionIdConfigData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_compact_logic_of_session_id")
    public boolean enableCompactLogicOfSessionId;

    @C09CT("enable_pass_session_id")
    public boolean enablePassSessionId;

    public LivePlayerSessionIdConfigData() {
        this(true, true);
    }

    public LivePlayerSessionIdConfigData(boolean z, boolean z2) {
        this.enablePassSessionId = z;
        this.enableCompactLogicOfSessionId = z2;
    }
}
