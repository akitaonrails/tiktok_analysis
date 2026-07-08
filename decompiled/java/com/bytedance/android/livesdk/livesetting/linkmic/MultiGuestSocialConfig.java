package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestSocialConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("random_match_join_timeout_second")
    public long joinTimeOutSecond;

    @C09CT("random_match_auto_permit_mills")
    public long randomMatchAutoPermitMills;

    @C09CT("random_match_v1_timeout_second")
    public long randomMatchTimeoutSecond;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestSocialConfig_OptTypeAdapter();
    }

    public MultiGuestSocialConfig() {
        this(120L, 500L, 10L);
    }

    public MultiGuestSocialConfig(long j, long j2, long j3) {
        this.randomMatchTimeoutSecond = j;
        this.randomMatchAutoPermitMills = j2;
        this.joinTimeOutSecond = j3;
    }
}
