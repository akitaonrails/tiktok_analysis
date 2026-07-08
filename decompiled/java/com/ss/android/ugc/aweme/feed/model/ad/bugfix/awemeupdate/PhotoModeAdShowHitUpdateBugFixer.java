package com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AwemeRawAdUpdateBugFixParam;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer;

/* JADX INFO: loaded from: classes36.dex */
public final class PhotoModeAdShowHitUpdateBugFixer implements AwemeRawAdUpdateBugFixer {
    public final int oldPhotoModeSlideHint;

    public PhotoModeAdShowHitUpdateBugFixer(int i) {
        this.oldPhotoModeSlideHint = i;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer
    public void fix(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            awemeRawAd.setPhotoModeSlideHint(this.oldPhotoModeSlideHint);
        }
    }

    public static final class Factory implements AwemeRawAdUpdateBugFixer.Factory {
        @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer.Factory
        public AwemeRawAdUpdateBugFixer create(Aweme aweme, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam) {
            AwemeRawAd awemeRawAd;
            if (!AwemeExtKt.isPhotoMode(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
                return null;
            }
            return new PhotoModeAdShowHitUpdateBugFixer(awemeRawAd.getPhotoModeSlideHint());
        }
    }
}
