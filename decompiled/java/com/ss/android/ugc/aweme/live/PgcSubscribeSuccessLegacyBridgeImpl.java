package com.ss.android.ugc.aweme.live;

import X.C0KAH;
import X.C20441214yg;
import X.C2188811AlT;
import X.C512140K6q;
import X.C512210K6x;
import X.C512220K6y;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.room.PlanChangeSuccessEvent;
import com.bytedance.android.live.room.ResubscribeSuccessEvent;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.room.SubscribeSuccessToastEvent;
import com.bytedance.android.livesdk.comp.api.subscription.event.OpenNewRecordPage;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class PgcSubscribeSuccessLegacyBridgeImpl implements IPgcSubscribeSuccessLegacyBridge {
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge
    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forwardResubscribeSuccess secAnchorUid=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("PgcSubLegacyBridge", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal.LLILZ.HQ2(ResubscribeSuccessEvent.class, new C512210K6x(str));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge
    public final void LIZJ(Map<String, String> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forwardOpenNewRecordPage keys=");
        sbLIZ.append(map.keySet());
        C20441214yg.LJIIIZ("PgcSubLegacyBridge", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal.LLILZ.FQ2(OpenNewRecordPage.class, map);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge
    public final void LIZLLL(C512140K6q c512140K6q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forward received secUid=");
        sbLIZ.append(c512140K6q.LIZ);
        sbLIZ.append(" packageId=");
        sbLIZ.append(c512140K6q.LIZIZ);
        sbLIZ.append(" autoRenew=");
        sbLIZ.append(c512140K6q.LIZJ);
        sbLIZ.append(" trackingSize=");
        sbLIZ.append(c512140K6q.LJI.size());
        C20441214yg.LJIIIZ("PgcSubLegacyBridge", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal.LLILZ.HQ2(SubscribeSuccessEvent.class, new C512220K6y(c512140K6q.LJ, c512140K6q.LIZLLL, c512140K6q.LIZJ, c512140K6q.LIZIZ, c512140K6q.LIZ, c512140K6q.LJI, 92));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("forward posted DataChannel secUid=");
        sbLIZ2.append(c512140K6q.LIZ);
        sbLIZ2.append(" packageId=");
        sbLIZ2.append(c512140K6q.LIZIZ);
        C20441214yg.LJIIIZ("PgcSubLegacyBridge", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge
    public final void LJ(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forwardSubscribeSuccessToast toast=");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        sbLIZ.append(str2);
        C20441214yg.LJIIIZ("PgcSubLegacyBridge", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (str == null) {
            str = "";
        }
        dataChannelGlobal.HQ2(SubscribeSuccessToastEvent.class, str);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge
    public final void LIZIZ(SubscribeBadge subscribeBadge, String str, String str2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forwardPlanChangeSuccess secUid=");
        sbLIZ.append(str);
        sbLIZ.append(" packageId=");
        sbLIZ.append(str2);
        sbLIZ.append(" autoRenew=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("PgcSubLegacyBridge", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal.LLILZ.HQ2(PlanChangeSuccessEvent.class, new C0KAH(subscribeBadge, str, str2, z));
    }
}
