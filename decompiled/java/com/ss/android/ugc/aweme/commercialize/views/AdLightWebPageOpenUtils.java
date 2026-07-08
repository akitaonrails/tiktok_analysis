package com.ss.android.ugc.aweme.commercialize.views;

import X.C1025720cna;
import X.C1026310coX;
import X.C1028090crP;
import X.C1028100crQ;
import X.C1388190mED;
import X.C19EG;
import android.app.Activity;
import com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;

/* JADX INFO: loaded from: classes5.dex */
public final class AdLightWebPageOpenUtils implements IAdLightWebPageOpen {
    @Override // com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen
    public final void LIZ(Activity activity, Aweme aweme, String str, boolean z) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
        if (c19egLIZIZ == null || str == null) {
            return;
        }
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        AdlpExtraModel adlpExtraModelLIZ = C1028090crP.LIZ(aweme, null, 1, "", null, null, null, null);
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        iAdLandingPagePopUpService.LJIIJ(-1, c19egLIZIZ, null, new C1026310coX(str, awemeRawAd, adlpExtraModelLIZ, false, new C1025720cna(0.7316342f, bool, bool2, 1, Boolean.FALSE, -1, -1, Boolean.FALSE), new C1028100crQ(bool, null, bool, true, false, bool2, Boolean.TRUE, null, null, null, false, z, false, false, null, Boolean.FALSE)), null);
    }
}
