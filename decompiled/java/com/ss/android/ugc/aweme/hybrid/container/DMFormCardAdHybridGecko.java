package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014150cUv;
import X.C1014220cV2;
import X.C1014230cV3;
import X.InterfaceC1018920ccc;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.DMFormCardConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class DMFormCardAdHybridGecko implements InterfaceC1018920ccc<Aweme> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(Aweme aweme) {
        List arrayList;
        AwemeRawAd awemeRawAd;
        DMFormCardConfig dmFormCardConfig;
        String strLIZ = C1014230cV3.LIZ("dm_form_card");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dmFormCardConfig = awemeRawAd.getDmFormCardConfig()) == null || (arrayList = dmFormCardConfig.geckoChannel) == null) {
            arrayList = new ArrayList();
        }
        return new C1014220cV2(strLIZ, "dm_form_card", arrayList);
    }
}
