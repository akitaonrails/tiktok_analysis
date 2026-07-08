package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveMatchInvite4029011FixData {
    public static final TypeAdapter ADAPTER = new LiveMatchInvite4029011FixData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay")
    public long delay;

    @C09CT("enabled")
    public boolean enabled;

    public LiveMatchInvite4029011FixData() {
        this(false, 1500L);
    }

    public LiveMatchInvite4029011FixData(boolean z, long j) {
        this.enabled = z;
        this.delay = j;
    }
}
