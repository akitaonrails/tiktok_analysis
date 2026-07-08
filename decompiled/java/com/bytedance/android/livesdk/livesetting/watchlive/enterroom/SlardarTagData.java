package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class SlardarTagData {
    public static final TypeAdapter ADAPTER = new SlardarTagData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("app_log_count")
    public int logCount;

    @C09CT("message_count")
    public int messageCount;

    public SlardarTagData() {
        this(true, 5, 5);
    }

    public SlardarTagData(boolean z, int i, int i2) {
        this.enable = z;
        this.messageCount = i;
        this.logCount = i2;
    }
}
