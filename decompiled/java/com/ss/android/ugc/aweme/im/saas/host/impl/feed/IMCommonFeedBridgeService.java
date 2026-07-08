package com.ss.android.ugc.aweme.im.saas.host.impl.feed;

import X.C1365840leA;
import X.C1365870leD;
import X.C1440005kM;
import X.C1483340ohg;
import X.C739860T0m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonTrigger;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: loaded from: classes13.dex */
public final class IMCommonFeedBridgeService implements IMCommonFeedBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi
    public final void LIZ() {
        C1440005kM.LIZ(new C739860T0m());
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi
    public final JoinGroupBottomButtonTrigger LIZIZ() {
        return new JoinGroupBottomButtonTrigger();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi
    public final boolean LIZJ(IEvent iEvent) {
        if (iEvent instanceof C1365870leD) {
            return C1365840leA.LJI((C1365870leD) iEvent);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi
    public final SimVideoUrlModel LIZLLL(Aweme aweme) {
        return C1483340ohg.LJFF(aweme);
    }
}
