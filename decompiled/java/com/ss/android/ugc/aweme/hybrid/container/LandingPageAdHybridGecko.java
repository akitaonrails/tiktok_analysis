package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014150cUv;
import X.C1014220cV2;
import X.C1014230cV3;
import X.C292440BdC;
import X.InterfaceC1018920ccc;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageAdHybridGecko implements InterfaceC1018920ccc<Aweme> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(Aweme aweme) {
        List arrayList;
        AwemeRawAd awemeRawAd;
        NativeSiteConfig nativeSiteConfig;
        if (!C292440BdC.LIZ()) {
            return new C1014220cV2("", "", new ArrayList());
        }
        String strLIZ = C1014230cV3.LIZ("landing_page_1p");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || (arrayList = nativeSiteConfig.geckoChannel) == null) {
            arrayList = new ArrayList();
        }
        return new C1014220cV2(strLIZ, "landing_page_1p", arrayList);
    }
}
