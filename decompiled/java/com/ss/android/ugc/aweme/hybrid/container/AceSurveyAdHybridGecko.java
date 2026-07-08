package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014150cUv;
import X.C1014220cV2;
import X.C1014230cV3;
import X.C1047660dMy;
import X.InterfaceC1018920ccc;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public final class AceSurveyAdHybridGecko implements InterfaceC1018920ccc<Aweme> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(Aweme aweme) {
        return new C1014220cV2(C1014230cV3.LIZ("feed_follow_up_ace_survey"), "feed_follow_up_ace_survey", C1047660dMy.LIZIZ.f3(aweme));
    }
}
