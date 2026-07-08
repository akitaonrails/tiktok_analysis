package com.ss.android.ugc.aweme.services;

import X.AbstractC1025070cmX;
import X.C0CLW;
import X.C1016550cYn;
import X.C1017070cZd;
import X.C1017520caM;
import X.C1019030ccn;
import X.C1019110ccv;
import X.C1021930chT;
import X.C1025090cmZ;
import X.C1028050crL;
import X.C1035340d36;
import X.C1440005kM;
import X.C19EG;
import X.C316660CbA;
import X.C739250SzD;
import X.C786410Ut5;
import X.C990280bsQ;
import X.InterfaceC1022210chv;
import X.InterfaceC1029510cth;
import X.InterfaceC1054790dYT;
import X.InterfaceC1054930dYh;
import X.InterfaceC1054970dYl;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileFragment;
import com.ss.android.ugc.aweme.commercialize.profile.FakeUserProfileFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AdUtilsServiceImpl implements InterfaceC1054790dYT, InterfaceC1029510cth {
    @Override // X.InterfaceC1054790dYT
    public InterfaceC1054930dYh createFakeUserProfileFragment() {
        return new FakeUserProfileFragment();
    }

    @Override // X.InterfaceC1054790dYT
    public InterfaceC1054930dYh createNewFakeUserProfileFragment() {
        return new AdNewFakeUserProfileFragment();
    }

    @Override // X.InterfaceC1054790dYT
    public boolean shouldShowBioEmail() {
        try {
            return C0CLW.LIZIZ.LIZ.getBioSettings().getEnableBioEmail().booleanValue();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC1054790dYT
    public boolean shouldShowBioUrl() {
        try {
            return C0CLW.LIZIZ.LIZ.getBioSettings().getEnableBioUrl().booleanValue();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC1054790dYT
    public IAdLynxLandPageUtils getAdLynxLandPageUtil() {
        return (IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class);
    }

    @Override // X.InterfaceC1054790dYT
    public InterfaceC1054970dYl getAdFlutterLandPageUtil() {
        return new InterfaceC1054970dYl() { // from class: X.0cmu
            @Override // X.InterfaceC1054970dYl
            public final void LIZ() {
            }

            @Override // X.InterfaceC1054970dYl
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1054970dYl
            public final void LIZJ() {
            }
        };
    }

    @Override // X.InterfaceC1054790dYT
    public void changeBottomBarVisible(Boolean bool) {
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
        if (iAdLandingPagePopUpService != null) {
            iAdLandingPagePopUpService.LJ(bool.booleanValue());
        }
    }

    @Override // X.InterfaceC1054790dYT
    public void closeProfilePopUpWebPage(Activity activity) {
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
        if (iAdLandingPagePopUpService != null && (activity instanceof C19EG)) {
            iAdLandingPagePopUpService.LJIILIIL();
        }
        C1035340d36 c1035340d36LIZ = C990280bsQ.LIZ(activity);
        if (c1035340d36LIZ != null && c1035340d36LIZ.LJIIJJI()) {
            c1035340d36LIZ.LJ(true);
            FrameLayout frameLayoutLIZIZ = C990280bsQ.LIZIZ(activity);
            if (frameLayoutLIZIZ != null) {
                C786410Ut5.LJZ(8, frameLayoutLIZIZ);
            }
        }
    }

    public C1017520caM getAdMiddlePageModel(String str) {
        return C1016550cYn.LIZ(str);
    }

    @Override // X.InterfaceC1054790dYT
    public String getRealMiddlePageUrl(String str) {
        C1017520caM c1017520caMLIZ = C1016550cYn.LIZ(str);
        if (c1017520caMLIZ == null) {
            return null;
        }
        return c1017520caMLIZ.LIZ;
    }

    @Override // X.InterfaceC1054790dYT
    public boolean shouldShowAdFakeMiddlePage(Aweme aweme) {
        if (AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getCreativeIdStr() != null) {
            return C1016550cYn.LIZLLL(aweme.getAwemeRawAd().getCreativeIdStr());
        }
        return false;
    }

    @Override // X.InterfaceC1054790dYT
    public boolean shouldShowAdRealMiddlePage(Aweme aweme) {
        return C1016550cYn.LJ(aweme);
    }

    @Override // X.InterfaceC1054790dYT
    public boolean shouldShowFakeUserProfile(Aweme aweme) {
        return C1017070cZd.LJIIJ(aweme);
    }

    public void logFeedRawAdOpenUrlH5(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "open_url_h5", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    public void logFeedRawFlutterAdOpenUrlH5(Context context, Aweme aweme) {
        List<String> list = C1019030ccn.LIZ;
        HashMap map = new HashMap();
        map.put("render_type", "flutter");
        C1019030ccn.LJJJJ(context, "open_url_h5", aweme, C1019030ccn.LJIIJJI(context, aweme, false, C1019030ccn.LJFF(map)));
    }

    public void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme) {
        C1019030ccn.LJJIJIIJIL(context, aweme);
    }

    @Override // X.InterfaceC1054790dYT
    public boolean shouldShowAdBrowser(Aweme aweme, String str) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd().getCreativeIdStr() != null && !C1016550cYn.LIZLLL(aweme.getAwemeRawAd().getCreativeIdStr()) && (C1017070cZd.LL(aweme) || C1017070cZd.LLJJIJIL(aweme, "draw_ad", str))) {
            if (TextUtils.isEmpty(C1017070cZd.LJIIZILJ(aweme))) {
                if (C1017070cZd.LJJZZI(aweme) && ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZJ(aweme)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (!C1016550cYn.LJ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1054790dYT
    public JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return C1019030ccn.LJIIIZ(context, aweme);
    }

    @Override // X.InterfaceC1054790dYT
    public void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        if (context == null) {
            return;
        }
        C1440005kM.LIZ(new C739250SzD(context.hashCode(), 2, aweme, str));
    }

    @Override // X.InterfaceC1054790dYT
    public void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        if (context == null) {
            return;
        }
        C1440005kM.LIZ(new C739250SzD(context.hashCode(), 1, aweme, str));
    }

    @Override // X.InterfaceC1054790dYT
    public boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 5, false);
    }

    @Override // X.InterfaceC1054790dYT
    public boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 6, false);
    }

    @Override // X.InterfaceC1054790dYT
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 1, false);
    }

    @Override // X.InterfaceC1054790dYT
    public void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i, User user) {
        C1019110ccv.LIZIZ.LJIIIZ(context, aweme, i, user, true);
    }

    @Override // X.InterfaceC1054790dYT
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return openProfilePopUpWebPage(context, aweme, str, 4, z);
    }

    @Override // X.InterfaceC1054790dYT
    public boolean openTopViewLive(Context context, Aweme aweme, int i, InterfaceC1022210chv interfaceC1022210chv) {
        return C1021930chT.LIZ(context, aweme, i, interfaceC1022210chv);
    }

    public boolean openAdWebUrl(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return C1028050crL.LIZIZ(context, str, str2, z, map, true, null, 0);
    }

    public boolean openProfilePopUpWebPage(Context context, Aweme aweme, String str, int i, boolean z) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            C1025090cmZ c1025090cmZ = new C1025090cmZ();
            c1025090cmZ.LIZ = context;
            c1025090cmZ.LIZIZ = aweme.getAwemeRawAd();
            c1025090cmZ.LIZJ = i;
            c1025090cmZ.LIZ(str);
            c1025090cmZ.LJIIIIZZ = aweme;
            return AbstractC1025070cmX.LJJI(c1025090cmZ, z);
        }
        return false;
    }
}
