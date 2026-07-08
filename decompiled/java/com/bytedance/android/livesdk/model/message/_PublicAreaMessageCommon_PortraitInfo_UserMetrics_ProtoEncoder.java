package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_PortraitInfo_UserMetrics_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.PortraitInfo.UserMetrics> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.PortraitInfo.UserMetrics userMetrics) {
        PublicAreaMessageCommon.PortraitInfo.UserMetrics userMetrics2 = userMetrics;
        int i = userMetrics2.type;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, userMetrics2.metricsValue);
    }
}
