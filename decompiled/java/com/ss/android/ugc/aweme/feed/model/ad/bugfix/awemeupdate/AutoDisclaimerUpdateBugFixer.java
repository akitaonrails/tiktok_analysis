package com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate;

import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AwemeRawAdUpdateBugFixParam;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer;

/* JADX INFO: loaded from: classes36.dex */
public final class AutoDisclaimerUpdateBugFixer implements AwemeRawAdUpdateBugFixer {
    public final AdDisclaimer oldDisclaimer;

    public AutoDisclaimerUpdateBugFixer(AdDisclaimer adDisclaimer) {
        this.oldDisclaimer = adDisclaimer;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer
    public void fix(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            awemeRawAd.setDisclaimer(this.oldDisclaimer);
        }
    }

    public static final class Factory implements AwemeRawAdUpdateBugFixer.Factory {
        @Override // com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer.Factory
        public AwemeRawAdUpdateBugFixer create(Aweme aweme, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam) {
            AwemeRawAd awemeRawAd;
            AdDisclaimer disclaimer;
            if (!AwemeExtKt.isPhotoMode(aweme) || aweme.getPhotoModeImageInfo() == null || awemeRawAdUpdateBugFixParam.photoModeImageInfoUpdated || (awemeRawAd = aweme.getAwemeRawAd()) == null || (disclaimer = awemeRawAd.getDisclaimer()) == null) {
                return null;
            }
            return new AutoDisclaimerUpdateBugFixer(disclaimer);
        }
    }
}
