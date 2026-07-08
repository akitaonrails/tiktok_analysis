package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicApplyHangupConfig {
    public static final TypeAdapter ADAPTER = new LinkMicApplyHangupConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("max_apply_count")
    public int maxApplyCount;

    @C09CT("overdue_time_second")
    public int overdueTimeSecond;

    @C09CT("share_icon_priority")
    public int shareIconPriority;

    public LinkMicApplyHangupConfig() {
        this(false, 5, 20, 7);
    }

    public LinkMicApplyHangupConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.maxApplyCount = i;
        this.overdueTimeSecond = i2;
        this.shareIconPriority = i3;
    }
}
