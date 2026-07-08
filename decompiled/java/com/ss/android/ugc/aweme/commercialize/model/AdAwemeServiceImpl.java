package com.ss.android.ugc.aweme.commercialize.model;

import X.C1017070cZd;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAwemeServiceImpl implements IAdAwemeService {
    @Override // com.ss.android.ugc.aweme.commercialize.model.IAdAwemeService
    public final int LIZ(AwemeRawAd awemeRawAd) {
        return C1017070cZd.LJIJI(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.model.IAdAwemeService
    public final AutoPullUpConfig LIZIZ(AwemeRawAd awemeRawAd) {
        return C1017070cZd.LJIJJ(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.model.IAdAwemeService
    public final boolean isPseudoAd(Aweme aweme) {
        return AwemeExtKt.isPseudoAd(aweme);
    }
}
