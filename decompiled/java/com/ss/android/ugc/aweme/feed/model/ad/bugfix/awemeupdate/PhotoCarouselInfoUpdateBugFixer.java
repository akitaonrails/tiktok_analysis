package com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate;

import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AwemeRawAdUpdateBugFixParam;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer;

/* JADX INFO: loaded from: classes36.dex */
public final class PhotoCarouselInfoUpdateBugFixer implements AwemeRawAdUpdateBugFixer {
    public final PhotoCarouselInfoStruct oldPhotoCarouselInfo;

    public PhotoCarouselInfoUpdateBugFixer(PhotoCarouselInfoStruct photoCarouselInfoStruct) {
        this.oldPhotoCarouselInfo = photoCarouselInfoStruct;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer
    public void fix(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            awemeRawAd.setPhotoCarouselInfo(this.oldPhotoCarouselInfo);
        }
    }

    public static final class Factory implements AwemeRawAdUpdateBugFixer.Factory {
        @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer.Factory
        public AwemeRawAdUpdateBugFixer create(Aweme aweme, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam) {
            AwemeRawAd awemeRawAd;
            PhotoCarouselInfoStruct photoCarouselInfo;
            if (!AwemeExtKt.isPhotoMode(aweme) || aweme.getPhotoModeImageInfo() == null || awemeRawAdUpdateBugFixParam.photoModeImageInfoUpdated || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null) {
                return null;
            }
            return new PhotoCarouselInfoUpdateBugFixer(photoCarouselInfo);
        }
    }
}
