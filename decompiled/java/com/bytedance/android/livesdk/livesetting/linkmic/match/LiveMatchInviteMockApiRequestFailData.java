package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchInviteMockApiRequestFailData {
    public static final TypeAdapter ADAPTER = new LiveMatchInviteMockApiRequestFailData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("errorCode")
    public int errorCode;

    @C09CT("mockResend")
    public boolean mockResend;

    public LiveMatchInviteMockApiRequestFailData() {
        this(false, 4029011, false);
    }

    public LiveMatchInviteMockApiRequestFailData(boolean z, int i, boolean z2) {
        this.enable = z;
        this.errorCode = i;
        this.mockResend = z2;
    }
}
