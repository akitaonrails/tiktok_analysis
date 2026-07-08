package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class PreApproveConfig {
    public static final TypeAdapter ADAPTER = new PreApproveConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("anchor_toast_duration")
    public int anchorToastDuration;

    @C09CT("audience_bubble_duration")
    public int audienceBubbleDuration;

    @C09CT("enable")
    public boolean enable;

    @C09CT("max_pre_approve_cnt")
    public int maxPreApproveCount;

    public PreApproveConfig() {
        this(true, 5, 5, 3);
    }

    public PreApproveConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.anchorToastDuration = i;
        this.audienceBubbleDuration = i2;
        this.maxPreApproveCount = i3;
    }
}
