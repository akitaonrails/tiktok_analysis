package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubGuideClientAI {
    public static final TypeAdapter ADAPTER;

    @C09CT("client_ai_task_timeout")
    public int taskTimeout;

    static {
        NormalGson.singleton();
        ADAPTER = new FansClubGuideClientAI_OptTypeAdapter();
    }

    public FansClubGuideClientAI() {
        this(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    }

    public FansClubGuideClientAI(int i) {
        this.taskTimeout = i;
    }
}
