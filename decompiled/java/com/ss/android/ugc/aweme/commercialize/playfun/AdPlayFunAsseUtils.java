package com.ss.android.ugc.aweme.commercialize.playfun;

import X.C1017560caQ;
import X.C1017570caR;
import X.C1017580caS;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPlayFunAsseUtils implements IAdPlayFunAsseUtils {
    @Override // com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils
    public final void LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            C1017570caR c1017570caR = new C1017570caR("playfun", "preload_start", -1, System.currentTimeMillis());
            c1017570caR.LJ = aweme.getAid();
            c1017570caR.LJFF = awemeRawAd.getCreativeIdStr();
            c1017570caR.LJI = awemeRawAd.getLogExtra();
            C1017560caQ.LJFF(c1017570caR);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils
    public final void LIZIZ(Aweme aweme, String str, boolean z) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            C1017570caR c1017570caR = new C1017570caR("playfun", "preload_result", !z ? 1 : 0, System.currentTimeMillis());
            c1017570caR.LJ = aweme.getAid();
            c1017570caR.LJFF = awemeRawAd.getCreativeIdStr();
            c1017570caR.LJI = awemeRawAd.getLogExtra();
            c1017570caR.LJII = str;
            C1017560caQ.LJFF(c1017570caR);
            C1017580caS.LIZ(aweme, "aweme_ad_play_fun_preload_error_rate", z);
        }
    }
}
