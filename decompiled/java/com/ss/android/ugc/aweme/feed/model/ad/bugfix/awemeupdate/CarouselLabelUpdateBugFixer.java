package com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AwemeRawAdUpdateBugFixParam;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer;

/* JADX INFO: loaded from: classes36.dex */
public final class CarouselLabelUpdateBugFixer implements AwemeRawAdUpdateBugFixer {
    public final Object oldRawFrontedData;

    public CarouselLabelUpdateBugFixer(Object obj) {
        this.oldRawFrontedData = obj;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer
    public void fix(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            awemeRawAd.setFrontendData(this.oldRawFrontedData);
        }
    }

    public static final class Factory implements AwemeRawAdUpdateBugFixer.Factory {
        @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer.Factory
        public AwemeRawAdUpdateBugFixer create(Aweme aweme, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam) {
            AwemeRawAd awemeRawAd;
            Object rawFrontendData;
            if (!AwemeExtKt.isPhotoMode(aweme) || aweme.getPhotoModeImageInfo() == null || awemeRawAdUpdateBugFixParam.photoModeImageInfoUpdated || (awemeRawAd = aweme.getAwemeRawAd()) == null || (rawFrontendData = awemeRawAd.getRawFrontendData()) == null) {
                return null;
            }
            return new CarouselLabelUpdateBugFixer(rawFrontendData);
        }
    }
}
