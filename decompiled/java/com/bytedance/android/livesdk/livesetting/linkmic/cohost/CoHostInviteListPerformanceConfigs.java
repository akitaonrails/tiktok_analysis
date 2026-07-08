package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class CoHostInviteListPerformanceConfigs {
    public static final TypeAdapter ADAPTER = new CoHostInviteListPerformanceConfigs_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable = true;
}
