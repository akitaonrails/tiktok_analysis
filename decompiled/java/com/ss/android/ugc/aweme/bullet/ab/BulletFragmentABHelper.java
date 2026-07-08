package com.ss.android.ugc.aweme.bullet.ab;

import X.AbstractC1043210dFn;
import X.AbstractC1076640e7i;
import X.C01GW;
import X.C08RU;
import X.C098200Yq;
import X.C0C64;
import X.C1000150c8L;
import X.C1001830cB3;
import X.C1012040cRW;
import X.C1017070cZd;
import X.C1017180cZo;
import X.C1017200cZq;
import X.C1017230cZt;
import X.C1017520caM;
import X.C1022820ciu;
import X.C1026350cob;
import X.C1035740d3k;
import X.C1036130d4N;
import X.C1037010d5n;
import X.C1037480d6Y;
import X.C1039050d95;
import X.C1041550dD7;
import X.C1041560dD8;
import X.C1041660dDI;
import X.C1041990dDp;
import X.C1042680dEw;
import X.C1043460dGC;
import X.C1054780dYS;
import X.C10EU;
import X.C1111304Wh;
import X.C1544770qIl;
import X.C189200o6;
import X.C19EG;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C292440BdC;
import X.C305800Byk;
import X.C452501pT;
import X.C497270Jen;
import X.C703302op;
import X.C786410Ut5;
import X.C905703gN;
import X.EnumC1027220cq0;
import X.EnumC1036640d5C;
import X.InterfaceC1008930cMV;
import X.InterfaceC1017210cZr;
import X.InterfaceC1034470d1h;
import X.InterfaceC1037450d6V;
import X.InterfaceC1037460d6W;
import X.InterfaceC1037470d6X;
import X.InterfaceC1037760d70;
import X.InterfaceC1038630d8P;
import X.InterfaceC1040510dBR;
import X.InterfaceC1054820dYW;
import X.InterfaceC1056670dbV;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS85S0200000_16;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.crash.Npth;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.middlepage.AdFakeMiddlePageFragment;
import com.ss.android.ugc.aweme.spark.AdSparkFragment;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BulletFragmentABHelper implements InterfaceC1054820dYW {
    public static final C01GW<BulletFragmentABHelper> LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(114));

    @Override // X.InterfaceC1054820dYW
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1054820dYW
    public final void LJI() {
    }

    @Override // X.InterfaceC1054820dYW
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC1054820dYW
    public final void LJIILIIL() {
        C1037010d5n.LIZ.getClass();
        System.currentTimeMillis();
        C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
        C1042680dEw.LIZ.getClass();
        c1001830cB3.log(C1042680dEw.LJIIJ, AFwS252S0000000_16.get$arr$(537));
    }

    @Override // X.InterfaceC1054820dYW
    public final void LIZLLL(Fragment fragment) {
        InterfaceC1541990qEH kitView;
        if (fragment instanceof SparkFragment) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((SparkFragment) fragment).LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.LIZ("completed_transition", null);
                return;
            }
            return;
        }
        C2344809Gs.LJ("fragment notifyFE nothing");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1054820dYW
    public final String LJ(Fragment fragment) {
        Bundle arguments;
        if (fragment instanceof InterfaceC1034470d1h) {
            return ((InterfaceC1034470d1h) fragment).aH();
        }
        if ((fragment instanceof CrossPlatformFragment) && (arguments = fragment.getArguments()) != null) {
            return arguments.getString("aweme_creative_id");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1054820dYW
    public final boolean LJII(Fragment fragment) {
        if (fragment instanceof InterfaceC1034470d1h) {
            return ((InterfaceC1034470d1h) fragment).SQ();
        }
        if (fragment instanceof InterfaceC1037460d6W) {
            return ((InterfaceC1037460d6W) fragment).onBackPress();
        }
        return false;
    }

    @Override // X.InterfaceC1054820dYW
    public final Fragment LJIIIIZZ(Aweme aweme) {
        String creativeIdStr;
        C1017520caM c1017520caMSW0;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2 = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        InterfaceC1017210cZr interfaceC1017210cZr = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class);
        if (interfaceC1017210cZr != null && (c1017520caMSW0 = interfaceC1017210cZr.SW0(creativeIdStr)) != null) {
            AdFakeMiddlePageFragment adFakeMiddlePageFragment = new AdFakeMiddlePageFragment();
            if (aweme != null) {
                awemeRawAd2 = aweme.getAwemeRawAd();
            }
            adFakeMiddlePageFragment.LLILZLL = new C1037480d6Y(awemeRawAd2, c1017520caMSW0);
            return adFakeMiddlePageFragment;
        }
        return new Fragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1054820dYW
    public final void LJIIJ(Fragment fragment) throws JSONException {
        C1039050d95 c1039050d95;
        InterfaceC1541990qEH kitView;
        String url;
        InterfaceC1038630d8P interfaceC1038630d8P;
        if (fragment instanceof InterfaceC1034470d1h) {
            ((InterfaceC1034470d1h) fragment).LLLIL(null);
            return;
        }
        if (fragment instanceof InterfaceC1037460d6W) {
            ((InterfaceC1037460d6W) fragment).onHide();
            return;
        }
        if (fragment instanceof CrossPlatformFragment) {
            MixActivityContainer mixActivityContainer = ((CrossPlatformFragment) fragment).LL;
            if (mixActivityContainer == null) {
                return;
            }
            if (mixActivityContainer.LJJIIJ() && mixActivityContainer.LJJIFFI() != null) {
                if (C1111304Wh.LIZ()) {
                    C1544770qIl.LIZ((WebView) mixActivityContainer.LJJIFFI().getView(), new AbstractC1043210dFn() { // from class: X.0d63
                        @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                        public final String LJFF(Uri uri, WebView webView) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("reactId", "ad_web");
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            return C786410Ut5.J3(jSONObject);
                        }
                    });
                } else {
                    mixActivityContainer.LJJIFFI().LJII();
                }
                C1041660dDI c1041660dDI = mixActivityContainer.LLILLJJLI;
                String str = mixActivityContainer.LLIZ;
                if (c1041660dDI != null) {
                    long j = c1041660dDI.LIZIZ.LL;
                    if (j > 0) {
                        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("landing_ad", "close", String.valueOf(j), c1041660dDI.LIZIZ.LLJ, null);
                        c1022820ciuLJ.LIZJ(str, "refer");
                        c1022820ciuLJ.LJII();
                    }
                }
            }
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) mixActivityContainer.LLILZIL.LIZ(AdWebStatBusiness.class);
            if (adWebStatBusiness != null && (interfaceC1038630d8P = mixActivityContainer.LLILZLL) != null) {
                adWebStatBusiness.LIZIZ(true, interfaceC1038630d8P.LJIILJJIL(), mixActivityContainer.LJJIFFI(), mixActivityContainer.LLIZ);
            }
            if (mixActivityContainer.LJJIFFI() != null) {
                mixActivityContainer.LJJIFFI().onPause();
                if (mixActivityContainer.LJJIIJ()) {
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_fragment_pv", true, true)) {
                        mixActivityContainer.LJJIFFI().LJJJJL();
                    }
                }
                url = mixActivityContainer.LJJIFFI().getUrl();
            } else {
                url = "";
            }
            String str2 = mixActivityContainer.LLILLJJLI.LIZIZ.LLLLIL;
            InterfaceC1037760d70 interfaceC1037760d70LJI = C1043460dGC.LJI(InterfaceC1040510dBR.class);
            if (interfaceC1037760d70LJI != null) {
                interfaceC1037760d70LJI.z82(str2, url, mixActivityContainer.LLILLJJLI.LIZIZ, null);
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) mixActivityContainer.LLILZIL.LIZ(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.LIZLLL = true;
            }
            PreRenderWebViewBusiness preRenderWebViewBusinessLIZ = PreRenderWebViewBusiness.LIZ(mixActivityContainer);
            if (preRenderWebViewBusinessLIZ != null) {
                preRenderWebViewBusinessLIZ.LIZLLL = 0;
            }
            Activity activity = mixActivityContainer.LL;
            if (activity != null) {
                activity.getWindow().getDecorView().setSystemUiVisibility(1024);
            }
            mixActivityContainer.LJJIJIIJI(false);
            return;
        }
        if (fragment instanceof AdSparkFragment) {
            AdSparkFragment adSparkFragment = (AdSparkFragment) fragment;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = adSparkFragment.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.onHide();
            }
            InterfaceC1056670dbV interfaceC1056670dbVZR = adSparkFragment.ZR();
            if (!(interfaceC1056670dbVZR instanceof C1039050d95) || (c1039050d95 = (C1039050d95) interfaceC1056670dbVZR) == null) {
                return;
            }
            c1039050d95.LLLIL(null);
            return;
        }
        C2344809Gs.LJ("fragment onHide failed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1054820dYW
    public final void LIZ(Fragment fragment, C1036130d4N c1036130d4N) {
        InterfaceC1541990qEH kitView;
        C1039050d95 c1039050d95;
        if (fragment instanceof InterfaceC1034470d1h) {
            if (c1036130d4N != null) {
                ((InterfaceC1034470d1h) fragment).XN(c1036130d4N, true);
            }
            ((InterfaceC1034470d1h) fragment).ge(EnumC1036640d5C.PAGE_SELECT);
            return;
        }
        if (fragment instanceof InterfaceC1037460d6W) {
            ((InterfaceC1037460d6W) fragment).onShow();
            return;
        }
        if (fragment instanceof CrossPlatformFragment) {
            MixActivityContainer mixActivityContainer = ((CrossPlatformFragment) fragment).LL;
            if (mixActivityContainer == null) {
                return;
            }
            if (mixActivityContainer.LJJIFFI() != null) {
                mixActivityContainer.LJJIFFI().onResume();
            }
            if (mixActivityContainer.LJJIIJ()) {
                C1041550dD7 c1041550dD7 = mixActivityContainer.LLILLJJLI.LIZIZ;
                c1041550dD7.LLLLIIIILLL = UUID.randomUUID().toString();
                c1041550dD7.LLLLIIL = System.currentTimeMillis();
                AdWebLogService.LJIIIZ().LIZJ(String.valueOf(c1041550dD7.LL), c1041550dD7.LLJ, c1041550dD7.LLLLIIIILLL, c1041550dD7.LLJI, mixActivityContainer.LLILLJJLI.LIZ.LIZIZ, c1041550dD7.LLJJL, c1041550dD7.LLJL, c1041550dD7.LLLJL, null);
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) mixActivityContainer.LLILZIL.LIZ(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.LIZLLL = false;
            }
            PreRenderWebViewBusiness preRenderWebViewBusinessLIZ = PreRenderWebViewBusiness.LIZ(mixActivityContainer);
            if (preRenderWebViewBusinessLIZ != null) {
                preRenderWebViewBusinessLIZ.LIZLLL = 2;
                preRenderWebViewBusinessLIZ.LJ = null;
            }
            Activity activity = mixActivityContainer.LL;
            if (activity != null) {
                C497270Jen.LIZJ(activity);
            }
            mixActivityContainer.LJJIJIIJI(true);
            if (!mixActivityContainer.LJJIIJ()) {
                return;
            }
            mixActivityContainer.LLIZ = "full_screen_slide";
            return;
        }
        if (fragment instanceof SparkFragment) {
            if (fragment instanceof AdSparkFragment) {
                InterfaceC1056670dbV interfaceC1056670dbVZR = ((AdSparkFragment) fragment).ZR();
                if ((interfaceC1056670dbVZR instanceof C1039050d95) && (c1039050d95 = (C1039050d95) interfaceC1056670dbVZR) != null) {
                    c1039050d95.LLJJ = "full_screen_slide";
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((SparkFragment) fragment).LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
                return;
            }
            kitView.onShow();
            return;
        }
        C2344809Gs.LJ("fragment onShow failed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1054820dYW
    public final void LIZIZ(Fragment fragment, Runnable runnable) {
        C1039050d95 c1039050d95;
        if (fragment instanceof InterfaceC1034470d1h) {
            ((InterfaceC1034470d1h) fragment).LLJI(runnable);
            return;
        }
        if (fragment instanceof InterfaceC1037460d6W) {
            ((InterfaceC1037460d6W) fragment).LLJI(runnable);
            return;
        }
        if (fragment instanceof CrossPlatformFragment) {
            CrossPlatformFragment crossPlatformFragment = (CrossPlatformFragment) fragment;
            crossPlatformFragment.LLILLL = runnable;
            MixActivityContainer mixActivityContainer = crossPlatformFragment.LL;
            if (mixActivityContainer == null) {
                return;
            }
            mixActivityContainer.LLIZLLLIL = runnable;
            return;
        }
        if (fragment instanceof AdSparkFragment) {
            InterfaceC1056670dbV interfaceC1056670dbVZR = ((AdSparkFragment) fragment).ZR();
            if (!(interfaceC1056670dbVZR instanceof C1039050d95) || (c1039050d95 = (C1039050d95) interfaceC1056670dbVZR) == null) {
                return;
            }
            c1039050d95.LLJILLL = runnable;
            return;
        }
        C2344809Gs.LJ("fragment setBackListener failed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1054820dYW
    public final void LJIIIZ(Fragment fragment, ARunnableS85S0200000_16 aRunnableS85S0200000_16) {
        if (fragment instanceof InterfaceC1034470d1h) {
            ((InterfaceC1034470d1h) fragment).LM(aRunnableS85S0200000_16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1054820dYW
    public final void LJFF(Fragment fragment, String str, C1036130d4N c1036130d4N) {
        C1039050d95 c1039050d95;
        AdSparkFragment adSparkFragment;
        SparkContext sparkContext;
        C1036130d4N c1036130d4N2;
        InterfaceC1037470d6X interfaceC1037470d6X;
        InterfaceC1037450d6V interfaceC1037450d6VLIZ;
        if (str == null) {
            return;
        }
        if (fragment instanceof InterfaceC1034470d1h) {
            InterfaceC1034470d1h interfaceC1034470d1h = (InterfaceC1034470d1h) fragment;
            interfaceC1034470d1h.LJJ(str);
            interfaceC1034470d1h.LJJJLZIJ();
            return;
        }
        InterfaceC1056670dbV interfaceC1056670dbVZR = null;
        if (fragment instanceof CrossPlatformFragment) {
            CrossPlatformFragment crossPlatformFragment = (CrossPlatformFragment) fragment;
            MixActivityContainer mixActivityContainer = crossPlatformFragment.LL;
            if (mixActivityContainer != null && (interfaceC1037470d6X = (InterfaceC1037470d6X) mixActivityContainer.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)) != null && (interfaceC1037450d6VLIZ = interfaceC1037470d6X.LIZ()) != null) {
                interfaceC1037450d6VLIZ.LIZJ();
            }
            MixActivityContainer mixActivityContainer2 = crossPlatformFragment.LL;
            if (mixActivityContainer2 != null && c1036130d4N != null) {
                C786410Ut5.LJJJI("refer", c1036130d4N.LJ, mixActivityContainer2.LLILLL);
                mixActivityContainer2.LLILLL.putBoolean("is_lynx_landing_page", c1036130d4N.LIZJ);
                C786410Ut5.LJJJI("bundle_web_title", c1036130d4N.LIZIZ, mixActivityContainer2.LLILLL);
                mixActivityContainer2.LLILLL.putBoolean("is_from_jsb", c1036130d4N.LIZLLL);
                mixActivityContainer2.LLILZ = c1036130d4N;
            }
            MixActivityContainer mixActivityContainer3 = crossPlatformFragment.LL;
            if (mixActivityContainer3 == null) {
                return;
            }
            Bundle bundle = mixActivityContainer3.LLILLL;
            if (bundle != null && !TextUtils.equals(str, bundle.getString("url"))) {
                C786410Ut5.LJJJI("url", str, mixActivityContainer3.LLILLL);
                mixActivityContainer3.LLILLJJLI = C1041560dD8.LIZ(mixActivityContainer3.LLILLL);
                mixActivityContainer3.LJJIIZI();
            }
            if (mixActivityContainer3.LLILZ != null) {
                BusinessService.Business businessLIZ = mixActivityContainer3.LLILZIL.LIZ(AdWebStatBusiness.class);
                if (businessLIZ != null && (c1036130d4N2 = mixActivityContainer3.LLILZ) != null) {
                    C1041660dDI c1041660dDI = businessLIZ.LIZIZ;
                    C1041550dD7 c1041550dD7 = c1041660dDI.LIZIZ;
                    c1041550dD7.LLJI = c1036130d4N2.LJ;
                    c1041550dD7.LLLIIIIL = c1036130d4N2.LIZJ;
                    c1041660dDI.LIZJ.LJ = c1036130d4N2.LIZIZ;
                    c1041550dD7.LLJJL = c1036130d4N2.LIZLLL;
                }
                C1041660dDI c1041660dDI2 = mixActivityContainer3.LLILLJJLI;
                C1041550dD7 c1041550dD72 = c1041660dDI2.LIZIZ;
                C1036130d4N c1036130d4N3 = mixActivityContainer3.LLILZ;
                c1041550dD72.LLJI = c1036130d4N3.LJ;
                c1041550dD72.LLLIIIIL = c1036130d4N3.LIZJ;
                c1041660dDI2.LIZJ.LJ = c1036130d4N3.LIZIZ;
                c1041550dD72.LLJJL = c1036130d4N3.LIZLLL;
                mixActivityContainer3.LLILZ = null;
            }
            ((InterfaceC1037470d6X) mixActivityContainer3.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZIZ();
            mixActivityContainer3.LLILZIL.LIZ(AdWebStatBusiness.class);
            return;
        }
        if (fragment instanceof SparkFragment) {
            SparkFragment sparkFragment = (SparkFragment) fragment;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
                sparkContext.LJJLIIJ(str);
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = sparkFragment.LLILLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJIJ(sparkContext);
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = sparkFragment.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LJIIIIZZ();
            }
            if ((fragment instanceof AdSparkFragment) && (adSparkFragment = (AdSparkFragment) fragment) != null) {
                interfaceC1056670dbVZR = adSparkFragment.ZR();
            }
            if (!(interfaceC1056670dbVZR instanceof C1039050d95) || (c1039050d95 = (C1039050d95) interfaceC1056670dbVZR) == null) {
                return;
            }
            c1039050d95.LJJJLZIJ();
            return;
        }
        C2344809Gs.LJ("fragment loadUrl failed");
    }

    @Override // X.InterfaceC1054820dYW
    public final Fragment LJIIL(C19EG c19eg, Bundle bundle, Aweme aweme, String str, boolean z, boolean z2, boolean z3) {
        boolean z4;
        String reportAdExtraData;
        String strLIZLLL;
        boolean adLandpageFakeEnable;
        SparkContext sparkContext;
        String strK0;
        AwemeRawAd awemeRawAd;
        String webUrl;
        String webTitle;
        boolean z5;
        EnumC1027220cq0 enumC1027220cq0;
        String creativeIdStr;
        C1017200cZq c1017200cZqLJIL;
        String webUrl2;
        String webTitle2;
        boolean zIsFromJsb;
        String refer;
        int useWebUrl;
        AdWebUrlDataFromJsb adWebUrlDataFromJsb;
        AdWebUrlDataFromJsb adWebUrlDataFromJsb2;
        AdWebUrlDataFromJsb adWebUrlDataFromJsb3;
        AdWebUrlDataFromJsb adWebUrlDataFromJsb4;
        AdWebUrlDataFromJsb adWebUrlDataFromJsb5;
        String creativeIdStr2;
        String first;
        Pair<String, String> pairLJIIL;
        AwemeRawAd awemeRawAd2;
        AdWebUrlDataFromJsb adWebUrlDataFromJsb6;
        boolean z6 = false;
        if (bundle != null) {
            z4 = bundle.getBoolean("is_lynx_landing_page", false);
        } else {
            z4 = false;
        }
        Bundle bundle2 = null;
        c1017230cZtLIZ = null;
        C1017230cZt c1017230cZtLIZ = null;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (adWebUrlDataFromJsb6 = awemeRawAd2.getAdWebUrlDataFromJsb()) != null) {
            reportAdExtraData = adWebUrlDataFromJsb6.getReportAdExtraData();
        } else {
            reportAdExtraData = null;
        }
        int i = C1012040cRW.LIZIZ().LJIIIIZZ;
        if (TextUtils.isEmpty(C1026350cob.LIZLLL(Integer.valueOf(i)))) {
            strLIZLLL = C1012040cRW.LIZIZ().LJIIIZ;
        } else {
            strLIZLLL = C1026350cob.LIZLLL(Integer.valueOf(i));
        }
        CommerceAdLandpageBulletConfig commerceAdLandpageBulletConfigLIZ = C305800Byk.LIZ();
        if (commerceAdLandpageBulletConfigLIZ != null && commerceAdLandpageBulletConfigLIZ.getTotalEnable()) {
            adLandpageFakeEnable = commerceAdLandpageBulletConfigLIZ.getAdLandpageFakeEnable();
        } else {
            adLandpageFakeEnable = false;
        }
        final String str2 = "";
        if (!adLandpageFakeEnable && !z4) {
            if (!TextUtils.isEmpty(str) && c19eg != null) {
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (awemeRawAd != null && AwemeExtKt.isAdTraffic(aweme)) {
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (awemeRawAd3 == null || (webUrl = awemeRawAd3.getWebUrl()) == null) {
                        webUrl = "";
                    }
                    AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                    if (awemeRawAd4 == null || (webTitle = awemeRawAd4.getWebTitle()) == null) {
                        webTitle = "";
                    }
                    String aid = aweme.getAid();
                    String authorUid = AwemeExtKt.getAuthorUid(aweme);
                    String requestId = aweme.getRequestId();
                    UrlModel urlModelLIZLLL = C10EU.LIZLLL(aweme.getAuthor());
                    AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                    if (awemeRawAd5 != null && C1017180cZo.LJIILJJIL(awemeRawAd5)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append('-');
                    sbLIZ.append(UUID.randomUUID());
                    C1035740d3k c1035740d3k = new C1035740d3k(webUrl, 1, webTitle, "feedad", "", true, "click", false, 0, C2188811AlT.LIZIZ(sbLIZ), false, z5, aid, authorUid, requestId, urlModelLIZLLL, false, null, null, numValueOf);
                    c1035740d3k.setRefer(strLIZLLL);
                    if (z3) {
                        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null);
                        if (iAdPhotoModeService != null && (pairLJIIL = iAdPhotoModeService.LJIIL(aweme)) != null) {
                            first = pairLJIIL.getFirst();
                        } else {
                            first = null;
                        }
                        if (C703302op.LIZ(first) && !u.LJJIIJZLJL(first, "aweme://lynxview", false)) {
                            c1035740d3k.setUrl(first);
                        }
                    }
                    C1054780dYS c1054780dYS = C1054780dYS.LIZIZ;
                    if (c1054780dYS.shouldShowAdRealMiddlePage(aweme)) {
                        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                        if (awemeRawAd6 != null) {
                            creativeIdStr2 = awemeRawAd6.getCreativeIdStr();
                        } else {
                            creativeIdStr2 = null;
                        }
                        c1035740d3k.setUrl(c1054780dYS.getRealMiddlePageUrl(creativeIdStr2));
                    }
                    if (z) {
                        AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
                        if (awemeRawAd7 == null || (adWebUrlDataFromJsb5 = awemeRawAd7.getAdWebUrlDataFromJsb()) == null || (webUrl2 = adWebUrlDataFromJsb5.getWebUrl()) == null) {
                            webUrl2 = "";
                        }
                        c1035740d3k.setUrl(webUrl2);
                        AwemeRawAd awemeRawAd8 = aweme.getAwemeRawAd();
                        if (awemeRawAd8 == null || (adWebUrlDataFromJsb4 = awemeRawAd8.getAdWebUrlDataFromJsb()) == null || (webTitle2 = adWebUrlDataFromJsb4.getWebTitle()) == null) {
                            webTitle2 = "";
                        }
                        c1035740d3k.setTitle(webTitle2);
                        AwemeRawAd awemeRawAd9 = aweme.getAwemeRawAd();
                        if (awemeRawAd9 != null && (adWebUrlDataFromJsb3 = awemeRawAd9.getAdWebUrlDataFromJsb()) != null) {
                            zIsFromJsb = adWebUrlDataFromJsb3.isFromJsb();
                        } else {
                            zIsFromJsb = false;
                        }
                        c1035740d3k.setFromJsb(zIsFromJsb);
                        AwemeRawAd awemeRawAd10 = aweme.getAwemeRawAd();
                        if (awemeRawAd10 == null || (adWebUrlDataFromJsb2 = awemeRawAd10.getAdWebUrlDataFromJsb()) == null || (refer = adWebUrlDataFromJsb2.getRefer()) == null) {
                            refer = "";
                        }
                        c1035740d3k.setRefer(refer);
                        AwemeRawAd awemeRawAd11 = aweme.getAwemeRawAd();
                        if (awemeRawAd11 != null && (adWebUrlDataFromJsb = awemeRawAd11.getAdWebUrlDataFromJsb()) != null) {
                            useWebUrl = adWebUrlDataFromJsb.getUseWebUrl();
                        } else {
                            useWebUrl = 1;
                        }
                        c1035740d3k.setUseWebUrl(useWebUrl);
                    }
                    ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).N0();
                    String str3 = c1035740d3k.url;
                    AwemeRawAd awemeRawAd12 = aweme.getAwemeRawAd();
                    String aid2 = aweme.getAid();
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    String strLJIIJJI = C1037010d5n.LJIIJJI(awemeRawAd12, str3, aid2, true);
                    if (strLJIIJJI != null) {
                        c1035740d3k.setContainerId(strLJIIJJI);
                    }
                    InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
                    if (interfaceC1008930cMVLJ != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null) {
                        c1017230cZtLIZ = c1017200cZqLJIL.LIZ(aweme.getAwemeRawAd());
                    }
                    if (c1017230cZtLIZ != null) {
                        c1035740d3k.setUrl(c1017230cZtLIZ.LIZ);
                    }
                    if (C1017070cZd.LLJJIJIL(aweme, C1026350cob.LIZIZ(i), C1026350cob.LIZ(i))) {
                        try {
                            c1035740d3k.setForceShowNavBar(UriProtector.parse(c1035740d3k.url).getBooleanQueryParameter("is_instant_page", false));
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    c1035740d3k.setReportAdExtraData(reportAdExtraData);
                    if (z2) {
                        enumC1027220cq0 = EnumC1027220cq0.ON_AWEME_CHANGE;
                    } else {
                        enumC1027220cq0 = EnumC1027220cq0.NORMAL;
                    }
                    Fragment fragmentFv = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).fv(c19eg, aweme, c1035740d3k, enumC1027220cq0, null);
                    if (fragmentFv == null) {
                        HashMap map = new HashMap();
                        map.put("origin_url", c1035740d3k.url);
                        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                        if (awemeRawAdLJJIJLIJ != null && (creativeIdStr = awemeRawAdLJJIJLIJ.getCreativeIdStr()) != null) {
                            str2 = creativeIdStr;
                        }
                        map.put("creative_id", str2);
                        Npth.reportBizException("iab", new Throwable(map.toString()), map.toString(), (Map<String, String>) map, true);
                    }
                    if (fragmentFv == null) {
                        return new SparkFragment();
                    }
                    return fragmentFv;
                }
            }
            return new Fragment();
        }
        if (c19eg == null) {
            C2344809Gs.LJ("createBulletAdFragment failed caz activity is null");
            return new Fragment();
        }
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF == null || (sparkContext = iAdSparkUtilsLJFF.LIZJ(c19eg, str, bundle, null, false)) == null) {
            sparkContext = new SparkContext();
        }
        if (str != null) {
            Bundle bundle3 = new Bundle();
            C786410Ut5.LJJJI("container_bg_color", "FFFFFFFF", bundle3);
            sparkContext.LJJLIIJ(C08RU.LIZ(bundle3, str));
        }
        sparkContext.LJJJZ("container_bg_color", "FFFFFFFF");
        if (bundle != null) {
            z6 = bundle.getBoolean("is_lynx_landing_page", false);
        }
        if (z6) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService != null && (strK0 = iAdLandPagePreloadService.K0("lynx_feed")) != null) {
                str2 = strK0;
            }
            if (C703302op.LIZ(str2)) {
                if (C1000150c8L.LIZIZ()) {
                    sparkContext.LJJJZ("use_forest", "1");
                }
                sparkContext.LJJJZ("access_key", str2);
                sparkContext.LJJ(AbstractC1076640e7i.class, new AbstractC1076640e7i() { // from class: X.0dTE
                    @Override // X.AbstractC1076640e7i
                    public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                        String str4 = str2;
                        C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                        if (c1533570q0h != null) {
                            c1533570q0h.LIZ = str4;
                        }
                        return c1533560q0g;
                    }
                });
            }
        }
        if (!C292440BdC.LIZ()) {
            AdSparkFragment adSparkFragment = new AdSparkFragment(true);
            if (bundle != null) {
                C905703gN.LIZ.getClass();
                C1041990dDp.LIZ.getClass();
                C1041990dDp.LIZJ(sparkContext);
                C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle);
                bundle2 = bundle;
            }
            adSparkFragment.setArguments(bundle2);
            return adSparkFragment;
        }
        Fragment fragmentLJ = C1054780dYS.LIZIZ.getAdLynxLandPageUtil().LJ(c19eg, bundle, aweme, str, strLIZLLL, true);
        if (fragmentLJ != null) {
            return fragmentLJ;
        }
        return new Fragment();
    }
}
