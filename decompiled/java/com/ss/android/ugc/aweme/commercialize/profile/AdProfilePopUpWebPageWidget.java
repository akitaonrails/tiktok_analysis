package com.ss.android.ugc.aweme.commercialize.profile;

import X.C0RD4;
import X.C1017070cZd;
import X.C1017470caH;
import X.C1035340d36;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C990260bsO;
import X.C990270bsP;
import X.C990280bsQ;
import X.InterfaceC1035410d3D;
import X.InterfaceC1035570d3T;
import X.InterfaceC990300bsS;
import X.RunnableC1025180cmi;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger;
import com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class AdProfilePopUpWebPageWidget extends AbsAdFeedWidget {
    public static final Map<String, WeakReference<Runnable>> LLJJIJI = new HashMap();
    public C1035340d36 LLJIJIL;
    public long LLJILJIL;
    public String LLJILJILJ;
    public final C1017470caH LLJILLL = new InterfaceC1035410d3D() { // from class: X.0caH
        @Override // X.InterfaceC1035410d3D
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1035410d3D
        public final String onShow() {
            C1017200cZq c1017200cZqLJIL;
            Map<String, Object> map;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
            adProfilePopUpWebPageWidget.getClass();
            adProfilePopUpWebPageWidget.LLJILJIL = System.currentTimeMillis();
            C1035340d36 c1035340d36 = adProfilePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 != null && (c1035340d36.LJIILJJIL() || c1035340d36.LJIILIIL())) {
                HashMap map2 = new HashMap();
                InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
                if (interfaceC1008930cMVLJ != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null) {
                    Aweme aweme = adProfilePopUpWebPageWidget.LLIZLLLIL;
                    C1017230cZt c1017230cZtLIZ = c1017200cZqLJIL.LIZ(aweme != null ? aweme.getAwemeRawAd() : null);
                    if (c1017230cZtLIZ != null && (map = c1017230cZtLIZ.LIZJ) != null) {
                        map2.put("product_id", map.get("productId"));
                        map2.put("product_url", c1017230cZtLIZ.LIZ);
                        Map<String, Object> map3 = c1017230cZtLIZ.LIZJ;
                        map2.put("product_counts", map3 != null ? map3.get("productIndex") : null);
                    }
                }
                C1017160cZm.LIZ(adProfilePopUpWebPageWidget.LLIZLLLIL, map2, "halfscreen_page", false);
                String strLIZ = C1017290cZz.LIZ();
                if (strLIZ != null) {
                    map2.put("enter_source", strLIZ);
                }
                if (C1210304oP.LIZ()) {
                    IFullScreenLandingPageUnityLogger iFullScreenLandingPageUnityLogger = (IFullScreenLandingPageUnityLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageUnityLogger.class, false, false, false, 14, null);
                    if (iFullScreenLandingPageUnityLogger != null) {
                        EnumC1029460ctc enumC1029460ctc = EnumC1029460ctc.VERSION_1_0;
                        Aweme aweme2 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                        iFullScreenLandingPageUnityLogger.LIZ(enumC1029460ctc, aweme2 != null ? aweme2.getAwemeRawAd() : null, C1017290cZz.LIZ(), map2);
                    }
                } else {
                    Aweme aweme3 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "click", aweme3 != null ? aweme3.getAwemeRawAd() : null);
                    c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
                    c1022820ciuLIZLLL.LIZ(map2);
                    c1022820ciuLIZLLL.LJII();
                }
            }
            Aweme aweme4 = adProfilePopUpWebPageWidget.LLIZLLLIL;
            Boolean boolValueOf = aweme4 != null ? Boolean.valueOf(C1017070cZd.LJJZ(aweme4, "homepage_ad", "button")) : null;
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolValueOf, bool)) {
                C1440005kM.LIZ(new C1017480caI(true));
            }
            return Intrinsics.LJFF(boolValueOf, bool) ? "homepage_ad_button" : "homepage_ad_halfscreen_page";
        }

        @Override // X.InterfaceC1035410d3D
        public final String LIZ(int i) {
            boolean z;
            String str;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
            Aweme aweme = adProfilePopUpWebPageWidget.LLIZLLLIL;
            if (aweme != null && C1017070cZd.LJJZ(aweme, "homepage_ad", "button")) {
                C1440005kM.LIZ(new C1017480caI(false));
            }
            C1035340d36 c1035340d36 = adProfilePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 != null && c1035340d36.LJIILIIL()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i == 6) {
                Aweme aweme2 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                if (aweme2 != null) {
                    awemeRawAd2 = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "close", awemeRawAd2);
                c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
                c1022820ciuLIZLLL.LJII();
            } else {
                if (i != 4) {
                    if (C996060c1k.LIZ == 1) {
                        str = "slide";
                    } else {
                        str = "slide_down";
                    }
                    Aweme aweme3 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("landing_ad", "close", awemeRawAd);
                    String str2 = adProfilePopUpWebPageWidget.LLJILJILJ;
                    if (str2 != null) {
                        str = str2;
                    }
                    c1022820ciuLIZLLL2.LIZJ(str, "refer");
                    c1022820ciuLIZLLL2.LJII();
                }
                this.LIZ.LLJILJILJ = null;
                return null;
            }
            Aweme aweme4 = adProfilePopUpWebPageWidget.LLIZLLLIL;
            if (aweme4 != null) {
                C1017070cZd.LLJJLIIIJLLLLLLLZ(aweme4);
            }
            Aweme aweme5 = adProfilePopUpWebPageWidget.LLIZLLLIL;
            if (aweme5 != null && C1017070cZd.LLJJLIIIJLLLLLLLZ(aweme5)) {
                C1440005kM.LIZ(new C1017490caJ());
            }
            adProfilePopUpWebPageWidget.LJIIZILJ(System.currentTimeMillis() - adProfilePopUpWebPageWidget.LLJILJIL);
            this.LIZ.LLJILJILJ = null;
            return null;
        }

        @Override // X.InterfaceC1035410d3D
        public final void LIZLLL(int i) {
            boolean z;
            boolean z2;
            C1035340d36 c1035340d36;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
            C1035340d36 c1035340d362 = adProfilePopUpWebPageWidget.LLJIJIL;
            if (c1035340d362 != null && c1035340d362.LJIILJJIL()) {
                z = true;
            } else {
                z = false;
            }
            AwemeRawAd awemeRawAd = null;
            if ((z || ((c1035340d36 = adProfilePopUpWebPageWidget.LLJIJIL) != null && c1035340d36.LJIILIIL())) && i == 6) {
                Aweme aweme = adProfilePopUpWebPageWidget.LLIZLLLIL;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "otherclick", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
                c1022820ciuLIZLLL.LJII();
            } else {
                C1035340d36 c1035340d363 = adProfilePopUpWebPageWidget.LLJIJIL;
                if (c1035340d363 != null && c1035340d363.getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (i == 0 || i == 5)) {
                    Aweme aweme2 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd);
                    c1022820ciuLIZLLL2.LIZJ("all_screen_page", "refer");
                    c1022820ciuLIZLLL2.LJII();
                } else {
                    C1035340d36 c1035340d364 = adProfilePopUpWebPageWidget.LLJIJIL;
                    if (c1035340d364 != null && c1035340d364.LJIIL()) {
                        Aweme aweme3 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                        if (aweme3 != null) {
                            awemeRawAd = aweme3.getAwemeRawAd();
                        }
                        C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd);
                        c1022820ciuLIZLLL3.LIZJ("button", "refer");
                        c1022820ciuLIZLLL3.LJII();
                    }
                }
            }
            adProfilePopUpWebPageWidget.LLJILJIL = System.currentTimeMillis();
            C1035340d36 c1035340d365 = adProfilePopUpWebPageWidget.LLJIJIL;
            if (c1035340d365 != null) {
                c1035340d365.setFromTitleBarClick(false);
            }
        }

        @Override // X.InterfaceC1035410d3D
        public final void LIZJ(int i, Boolean bool) throws JSONException {
            boolean z;
            String str;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
            adProfilePopUpWebPageWidget.getClass();
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                Aweme aweme = adProfilePopUpWebPageWidget.LLIZLLLIL;
                if (aweme != null) {
                    awemeRawAd3 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "othershow_fail", awemeRawAd3);
                c1022820ciuLIZLLL.LIZJ("button", "refer");
                c1022820ciuLIZLLL.LJII();
            } else {
                C1035340d36 c1035340d36 = adProfilePopUpWebPageWidget.LLJIJIL;
                if (c1035340d36 != null && c1035340d36.LJIILJJIL()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && i == 6) {
                    Aweme aweme2 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "close", awemeRawAd2);
                    str = "halfscreen_page";
                    c1022820ciuLIZLLL2.LIZJ("halfscreen_page", "refer");
                    c1022820ciuLIZLLL2.LJII();
                } else if (i != 0 && i != 5) {
                    if (C996060c1k.LIZ == 1) {
                        str = "slide";
                    } else {
                        str = "slide_down";
                    }
                    Aweme aweme3 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("landing_ad", "close", awemeRawAd);
                    String str2 = adProfilePopUpWebPageWidget.LLJILJILJ;
                    if (str2 == null) {
                        str2 = str;
                    }
                    c1022820ciuLIZLLL3.LIZJ(str2, "refer");
                    c1022820ciuLIZLLL3.LJII();
                }
                C1035340d36 c1035340d362 = adProfilePopUpWebPageWidget.LLJIJIL;
                if (c1035340d362 != null) {
                    c1035340d362.LJIL(str);
                }
                adProfilePopUpWebPageWidget.LJIIZILJ(System.currentTimeMillis() - adProfilePopUpWebPageWidget.LLJILJIL);
            }
            this.LIZ.LLJILJILJ = null;
        }
    };
    public final C990260bsO LLJJ = new InterfaceC1035570d3T() { // from class: X.0bsO
        @Override // X.InterfaceC1035570d3T
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1035570d3T
        public final void LIZ() {
            this.LIZ.LLJILJILJ = "button";
        }

        @Override // X.InterfaceC1035570d3T
        public final void LIZJ() {
            Aweme aweme = this.LIZ.LLIZLLLIL;
            C2184171Adz.LIZLLL("homepage_landing_ad", "report", aweme != null ? aweme.getAwemeRawAd() : null).LJII();
        }
    };
    public final C990270bsP LLJJI = new InterfaceC990300bsS() { // from class: X.0bsP
        @Override // X.InterfaceC990300bsS
        public final void onBackPress() {
            this.LIZ.LLJILJILJ = "back";
        }
    };
    public final RunnableC1025180cmi LLJJIII = new Runnable() { // from class: X.0cmi
        public final void LIZ() {
            C19EG activity;
            Fragment fragment;
            AwemeRawAd awemeRawAd;
            int iLIZJ;
            Context context;
            AwemeRawAd awemeRawAd2;
            String webUrl;
            AwemeRawAd awemeRawAd3;
            AwemeRawAd awemeRawAd4;
            AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LL;
            Fragment fragment2 = adProfilePopUpWebPageWidget.LLJ;
            if (fragment2 == null || (activity = fragment2.getActivity()) == null || (fragment = adProfilePopUpWebPageWidget.LLJ) == null || fragment.getContext() == null) {
                return;
            }
            Aweme aweme = adProfilePopUpWebPageWidget.LLIZLLLIL;
            String str = "";
            if (TextUtils.isEmpty((aweme == null || (awemeRawAd4 = aweme.getAwemeRawAd()) == null) ? null : awemeRawAd4.getSource())) {
                Aweme aweme2 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
                    awemeRawAd.getWebTitle();
                }
            } else {
                Aweme aweme3 = adProfilePopUpWebPageWidget.LLIZLLLIL;
                if (aweme3 != null && (awemeRawAd3 = aweme3.getAwemeRawAd()) != null) {
                    awemeRawAd3.getSource();
                }
            }
            C1025210cml c1025210cml = new C1025210cml();
            Aweme aweme4 = adProfilePopUpWebPageWidget.LLIZLLLIL;
            if (aweme4 != null && (awemeRawAd2 = aweme4.getAwemeRawAd()) != null && (webUrl = awemeRawAd2.getWebUrl()) != null) {
                str = webUrl;
            }
            c1025210cml.LIZ = str;
            c1025210cml.LJ = adProfilePopUpWebPageWidget.LLJ;
            if (((Boolean) C287380BOe.LIZ.getValue()).booleanValue()) {
                C1546210qL5.LIZ.getClass();
                iLIZJ = (((int) C12ES.LIZJ((float) (C445490HdT.LIZIZ(activity, Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJII(activity), activity))) * ((double) 0.15f)), activity)) + C1546210qL5.LJII(activity)) - ((int) C12ES.LIZJ(52.0f, activity));
            } else {
                iLIZJ = C497820Jfg.LIZJ(activity);
            }
            c1025210cml.LIZIZ = iLIZJ;
            Aweme aweme5 = adProfilePopUpWebPageWidget.LLIZLLLIL;
            Bundle bundle = new Bundle();
            Fragment fragment3 = adProfilePopUpWebPageWidget.LLJ;
            if (fragment3 != null && (context = fragment3.getContext()) != null && aweme5 != null && aweme5.getAwemeRawAd() != null) {
                C1027650cqh.LIZ(context, bundle, aweme5);
                C1027650cqh.LIZIZ(context, bundle, aweme5);
                C1027650cqh.LIZLLL(context, bundle, aweme5);
                C1027650cqh.LIZJ(context, bundle);
            }
            c1025210cml.LIZJ = bundle;
            Aweme aweme6 = adProfilePopUpWebPageWidget.LLIZLLLIL;
            c1025210cml.LIZLLL = aweme6 != null ? aweme6.getAwemeRawAd() : null;
            c1025210cml.LJI = true;
            C1025930cnv c1025930cnvLIZ = c1025210cml.LIZ();
            C1017470caH c1017470caH = adProfilePopUpWebPageWidget.LLJILLL;
            C990270bsP c990270bsP = adProfilePopUpWebPageWidget.LLJJI;
            C1035340d36 c1035340d36LIZ = C990280bsQ.LIZ(activity);
            if (c1035340d36LIZ == null) {
                boolean zLIZLLL = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZLLL(c1025930cnvLIZ.LJ);
                c1035340d36LIZ = new C1035340d36(activity);
                c1035340d36LIZ.setUseLynxLandingPage(zLIZLLL);
                c1035340d36LIZ.setId(R.id.aai);
                c1035340d36LIZ.setParams(c1025930cnvLIZ);
                c1035340d36LIZ.setMBehaviorCallback(c1017470caH);
                c1035340d36LIZ.setKeyDownCallBack(c990270bsP);
                FrameLayout frameLayoutLIZIZ = C990280bsQ.LIZIZ(activity);
                if (frameLayoutLIZIZ != null) {
                    frameLayoutLIZIZ.addView(c1035340d36LIZ);
                }
            }
            adProfilePopUpWebPageWidget.LLJIJIL = c1035340d36LIZ;
            c1035340d36LIZ.setTitleBarCallback(adProfilePopUpWebPageWidget.LLJJ);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("AdProfilePopUpWebPageWidget@e32b.attachRunnable$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("AdProfilePopUpWebPageWidget@e32b.attachRunnable$1");
        }
    };

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void LJIILL() {
        super.LJIILL();
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        LJIIZILJ(System.currentTimeMillis() - this.LLJILJIL);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.LLJILJIL = System.currentTimeMillis();
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* JADX INFO: renamed from: LJIILLIIL */
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        Fragment fragment;
        C19EG activity;
        String aid;
        Aweme aweme;
        Aweme aweme2;
        String aid2;
        AwemeRawAd awemeRawAd;
        super.onChanged(c0rd4);
        if (c0rd4 != null && (str = c0rd4.LIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1540531799) {
                if (iHashCode == -1132409520 && str.equals("ad_feed_on_page_selected") && (aweme = this.LLIZLLLIL) != null) {
                    if ((C1017070cZd.LLLJIL(aweme) || C1017070cZd.LLLJ(aweme) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1)) && (aweme2 = this.LLIZLLLIL) != null && (aid2 = aweme2.getAid()) != null) {
                        ((HashMap) LLJJIJI).put(aid2, new WeakReference(this.LLJJIII));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected")) {
                return;
            }
            Aweme aweme3 = this.LLIZLLLIL;
            if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                ((HashMap) LLJJIJI).remove(aid);
            }
            if (this.LLJIJIL == null || (fragment = this.LLJ) == null || (activity = fragment.getActivity()) == null) {
                return;
            }
            C1035340d36 c1035340d36LIZ = C990280bsQ.LIZ(activity);
            if (c1035340d36LIZ != null) {
                c1035340d36LIZ.LJIJJ(true);
                FrameLayout frameLayoutLIZIZ = C990280bsQ.LIZIZ(activity);
                if (frameLayoutLIZIZ != null) {
                    C786410Ut5.LJJJZ(c1035340d36LIZ, frameLayoutLIZIZ);
                }
            }
            this.LLJIJIL = null;
        }
    }

    public final void LJIIZILJ(long j) {
        if (this.LLJIJIL == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C0RD4) obj);
    }
}
