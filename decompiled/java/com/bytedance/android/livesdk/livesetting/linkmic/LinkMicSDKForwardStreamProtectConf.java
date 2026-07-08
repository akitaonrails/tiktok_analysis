package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicSDKForwardStreamProtectConf {
    public static final TypeAdapter ADAPTER = new LinkMicSDKForwardStreamProtectConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("apply_group_recharge_timer_inverval")
    public long applyRechargeTimerInterval;

    @C09CT("enable_miss_push")
    public boolean enableMissPush;

    @C09CT("enable_push_more")
    public boolean enablePushMore;

    @C09CT("invite_group_recharge_timer_inverval")
    public long inviteRechargeTimerInterval;

    @C09CT("push_more_timer_interval")
    public long pushMoreTimerInterval;

    public LinkMicSDKForwardStreamProtectConf() {
        this(true, true, 20L, 15L, 15L);
    }

    public LinkMicSDKForwardStreamProtectConf(boolean z, boolean z2, long j, long j2, long j3) {
        this.enableMissPush = z;
        this.enablePushMore = z2;
        this.pushMoreTimerInterval = j;
        this.inviteRechargeTimerInterval = j2;
        this.applyRechargeTimerInterval = j3;
    }
}
