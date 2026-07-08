package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFollowPanelConf {
    public static final TypeAdapter ADAPTER = new MultiGuestFollowPanelConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled_frequency_check")
    public boolean enabledFrequencyCheck;

    @C09CT("frequency_quota")
    public long frequencyQuota;

    @C09CT("timeout_in_seconds_when_interact")
    public long timeoutInSecondsWhenInteract;

    @C09CT("timeout_in_seconds_when_no_touch")
    public long timeoutInSecondsWhenNoTouch;

    public MultiGuestFollowPanelConf() {
        this(5L, 1L, 5L, true);
    }

    public MultiGuestFollowPanelConf(long j, long j2, long j3, boolean z) {
        this.timeoutInSecondsWhenInteract = j;
        this.frequencyQuota = j2;
        this.timeoutInSecondsWhenNoTouch = j3;
        this.enabledFrequencyCheck = z;
    }
}
