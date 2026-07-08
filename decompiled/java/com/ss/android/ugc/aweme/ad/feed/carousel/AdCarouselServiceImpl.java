package com.ss.android.ugc.aweme.ad.feed.carousel;

import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes12.dex */
public final class AdCarouselServiceImpl implements IAdCarouselService {
    @Override // com.ss.android.ugc.aweme.ad.feed.carousel.IAdCarouselService
    public final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer carouselIndicatorDisplayMode;
        if (AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (carouselIndicatorDisplayMode = photoCarouselInfo.getCarouselIndicatorDisplayMode()) != null && carouselIndicatorDisplayMode.intValue() == 2) {
            return true;
        }
        return false;
    }
}
