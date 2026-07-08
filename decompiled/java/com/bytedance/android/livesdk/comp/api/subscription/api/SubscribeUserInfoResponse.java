package com.bytedance.android.livesdk.comp.api.subscription.api;

import X.C09CT;
import com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeUserInfoResponse {

    @C09CT("sub_scenario")
    public final int subScenario = -1;

    @C09CT("subscribing")
    public final Subscribing subscribing = new Subscribing();

    @C09CT("sub_only_live_info")
    public final SubOnlyLiveInfo subOnlyLiveInfo = new SubOnlyLiveInfo();
}
