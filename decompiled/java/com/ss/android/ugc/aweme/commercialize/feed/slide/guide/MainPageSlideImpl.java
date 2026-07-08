package com.ss.android.ugc.aweme.commercialize.feed.slide.guide;

import X.AbstractC1387200mCc;
import X.C0BJ0;
import X.C1017070cZd;
import X.C1017410caB;
import X.C1026350cob;
import X.C1045220dJ2;
import X.C1388190mED;
import X.C1906580ziK;
import X.C19EG;
import X.C680080Qly;
import X.C844470XAv;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.slide.IMainPageSlide;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class MainPageSlideImpl implements IMainPageSlide {
    @Override // com.ss.android.ugc.aweme.feed.slide.IMainPageSlide
    public final boolean LIZ(Aweme aweme) {
        if (aweme == null || !C1017070cZd.LLFFF(aweme, true) || C1017070cZd.LL(aweme) || C1017070cZd.LJJJJLI(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.slide.IMainPageSlide
    public final C1017410caB LIZIZ(Aweme aweme) {
        Activity activityLIZ;
        AwemeRawAd awemeRawAd;
        String webUrl;
        AwemeRawAd awemeRawAd2;
        C19EG c19eg;
        HomePageDataViewModel homePageDataViewModelLIZIZ;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        String eventType = null;
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(c19eg)) != null) {
            eventType = homePageDataViewModelLIZIZ.getEventType();
        }
        C1026350cob.LJ(eventType);
        if (aweme == null) {
            return new C1017410caB(false, false);
        }
        if (C1017070cZd.LJJLIIIJ(aweme)) {
            return new C1017410caB(false, false);
        }
        if (AwemeExtKt.isAdTraffic(aweme) && C1017070cZd.LL(aweme)) {
            if (C1017070cZd.LJIIJ(aweme)) {
                return new C1017410caB(true, false);
            }
            if (C1017070cZd.LJJLL(aweme)) {
                return new C1017410caB(true, false);
            }
            if (!C1017070cZd.LLJJIJI(aweme, "draw_ad", "slide", false) && C1017070cZd.LLJLLL(aweme)) {
                return new C1017410caB(false, true);
            }
            IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils != null && iAdWebUtils.Su(aweme, "draw_ad")) {
                return new C1017410caB(false, true);
            }
            IAdWebUtils iAdWebUtils2 = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils2 != null && iAdWebUtils2.bv(aweme, "draw_ad", "slide", false)) {
                return new C1017410caB(true, false);
            }
            if (C0BJ0.LIZ() && C1017070cZd.LLIIIJ(aweme)) {
                return new C1017410caB(true, false);
            }
            if (C1017070cZd.LIZJ(aweme)) {
                return new C1017410caB(false, true);
            }
            C844470XAv.LIZ.getClass();
            if (C1017070cZd.LLLLII(C844470XAv.LIZ(), aweme)) {
                return new C1017410caB(false, true);
            }
            if (!C1045220dJ2.LJIIIZ(aweme) && !C1045220dJ2.LJIIIIZZ(aweme)) {
                if (aweme.getAwemeRawAd() != null && ((((awemeRawAd = aweme.getAwemeRawAd()) != null && (webUrl = awemeRawAd.getWebUrl()) != null && (!a0.LJJJIL(webUrl)) && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || !awemeRawAd2.isDisableLeftSlideFollow())) || (((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZJ(aweme) && C1017070cZd.LJJZZI(aweme))) && !C1017070cZd.LLJJIJI(aweme, "draw_ad", "slide", false) && !C1017070cZd.LJJLJLI(aweme))) {
                    return new C1017410caB(true, false);
                }
                return new C1017410caB(false, true);
            }
            return new C1017410caB(false, true);
        }
        if (!C1017070cZd.LJJLIIIJJI(aweme, true) && !C1017070cZd.LJJLIIIJILLIZJL(aweme, true) && !C1017070cZd.LJJLIIIJJIZ(aweme)) {
            if (C1017070cZd.LJJJLIIL(aweme, "draw_ad")) {
                return new C1017410caB(false, false);
            }
            if (!C1017070cZd.LJJZ(aweme, "draw_ad", "slide") && !C1017070cZd.LJLZ(aweme)) {
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && awemeRawAd3.isDisableLeftSlideFollow() && C1017070cZd.LLJJIJIL(aweme, "draw_ad", "slide")) {
                    return new C1017410caB(false, false);
                }
                if (!C1017070cZd.LL(aweme)) {
                    return new C1017410caB(true, false);
                }
                return new C1017410caB(false, false);
            }
            return new C1017410caB(false, false);
        }
        return new C1017410caB(false, false);
    }
}
