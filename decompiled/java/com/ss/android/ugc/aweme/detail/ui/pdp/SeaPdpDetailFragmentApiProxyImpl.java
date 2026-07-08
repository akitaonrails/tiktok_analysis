package com.ss.android.ugc.aweme.detail.ui.pdp;

import X.C1483410ohn;
import X.C2189821An6;
import X.C2189831An7;
import android.content.Intent;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity;

/* JADX INFO: loaded from: classes25.dex */
public final class SeaPdpDetailFragmentApiProxyImpl implements SeaPdpDetailFragmentApiProxy {
    @Override // com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy
    public final void LLLLLLLLLL() {
        C1483410ohn.LJLJJI().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy
    public final Class<? extends CommonPageFragment> S9() {
        return SeaPdpCreatorVideoFeedFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy
    public final C2189821An6 T9(SeaPdpBlackLightActivity seaPdpBlackLightActivity, Intent intent) {
        return C2189831An7.LIZLLL(seaPdpBlackLightActivity, intent);
    }
}
