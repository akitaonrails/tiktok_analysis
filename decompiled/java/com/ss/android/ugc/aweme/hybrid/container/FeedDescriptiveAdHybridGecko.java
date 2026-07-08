package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014150cUv;
import X.C1014220cV2;
import X.C1014230cV3;
import X.InterfaceC1018920ccc;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedDescriptiveAdHybridGecko implements InterfaceC1018920ccc<Aweme> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(Aweme aweme) {
        List<String> arrayList;
        AwemeRawAd awemeRawAd;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        String strLIZ = C1014230cV3.LIZ("feed_fyp_descriptive_left_container");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) == null || (arrayList = adDescriptiveCTA.getGeckoChannelList()) == null) {
            arrayList = new ArrayList<>();
        }
        return new C1014220cV2(strLIZ, "feed_fyp_descriptive_left_container", arrayList);
    }
}
