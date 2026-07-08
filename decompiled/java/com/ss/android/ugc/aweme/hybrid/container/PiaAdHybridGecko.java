package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014150cUv;
import X.C1014220cV2;
import X.C1014230cV3;
import X.InterfaceC1018920ccc;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class PiaAdHybridGecko implements InterfaceC1018920ccc<Aweme> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(Aweme aweme) {
        List arrayList;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        LandingPageConfig landingPageConfig;
        String strLIZ = C1014230cV3.LIZ("feed_lp_pia");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getPreloadWeb() != 11 || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd2.getLandingPageConfig()) == null || (arrayList = landingPageConfig.webGeckoChannels) == null) {
            arrayList = new ArrayList();
        }
        return new C1014220cV2(strLIZ, "feed_lp_pia", arrayList);
    }
}
