package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014150cUv;
import X.C1014220cV2;
import X.C1014230cV3;
import X.C13BV;
import X.InterfaceC1018920ccc;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedCarouselTag implements InterfaceC1018920ccc<Aweme> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(Aweme aweme) {
        List<String> geckoChannelList;
        List list;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        NativeSiteConfig nativeSiteConfig;
        AwemeRawAd awemeRawAd2;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        ArrayList arrayList = new ArrayList();
        if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) == null || (geckoChannelList = photoCarouselInfo2.getGeckoChannelList()) == null) {
            geckoChannelList = C13BV.INSTANCE;
        }
        arrayList.addAll(geckoChannelList);
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || (nativeSiteConfig = photoCarouselInfo.getNativeSiteConfig()) == null || (list = nativeSiteConfig.geckoChannel) == null) {
            list = C13BV.INSTANCE;
        }
        arrayList.addAll(list);
        return new C1014220cV2(C1014230cV3.LIZ("feed_fyp_carousel_tag"), "feed_fyp_carousel_tag", arrayList);
    }
}
