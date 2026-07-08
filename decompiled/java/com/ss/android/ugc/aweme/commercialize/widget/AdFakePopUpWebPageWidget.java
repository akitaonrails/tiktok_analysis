package com.ss.android.ugc.aweme.commercialize.widget;

import X.C01GW;
import X.C1018570cc3;
import X.C1025090cmZ;
import X.C1025100cma;
import X.C1025210cml;
import X.C1025930cnv;
import X.C1027640cqg;
import X.C1035340d36;
import X.C12ES;
import X.C1388190mED;
import X.C1546210qL5;
import X.C19EG;
import X.C287380BOe;
import X.C299720Bow;
import X.C343950De5;
import X.C445490HdT;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C996070c1l;
import X.C996080c1m;
import X.C996190c1x;
import X.InterfaceC1035410d3D;
import X.InterfaceC1035570d3T;
import X.InterfaceC990300bsS;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFakePopUpWebPageWidget extends AbsAdProfileWidget {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public C1035340d36 LLJIJIL;
    public String LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJJ;
    public final BPEAHandler LLJILLL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(149));
    public final C996080c1m LLJJIII = new InterfaceC990300bsS() { // from class: X.0c1m
        @Override // X.InterfaceC990300bsS
        public final void onBackPress() {
            this.LIZ.LLJILJIL = "back";
        }
    };
    public final C996190c1x LLJJIJI = new InterfaceC1035570d3T() { // from class: X.0c1x
        @Override // X.InterfaceC1035570d3T
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1035570d3T
        public final void LIZ() {
            this.LIZ.LLJILJIL = "button";
        }

        @Override // X.InterfaceC1035570d3T
        public final void LIZJ() {
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
            C1035340d36 c1035340d36 = adFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 != null) {
                C1029600ctq actionMode = c1035340d36.getActionMode();
                Aweme aweme = adFakePopUpWebPageWidget.LLIZLLLIL;
                AwemeRawAd awemeRawAd = aweme != null ? aweme.getAwemeRawAd() : null;
                actionMode.getClass();
                if (awemeRawAd == null || awemeRawAd.getProfileWithWebview() != 1) {
                    return;
                }
                int i = actionMode.LJIIIIZZ;
                if (i == 7 || i == 8 || actionMode.LIZJ == 3) {
                    Aweme aweme2 = adFakePopUpWebPageWidget.LLIZLLLIL;
                    C2184171Adz.LIZLLL("homepage_landing_ad", "report", aweme2 != null ? aweme2.getAwemeRawAd() : null).LJII();
                }
            }
        }
    };
    public final C996070c1l LLJJIJIIJIL = new InterfaceC1035410d3D() { // from class: X.0c1l
        @Override // X.InterfaceC1035410d3D
        public final String LIZ(int i) {
            return null;
        }

        @Override // X.InterfaceC1035410d3D
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1035410d3D
        public final String onShow() {
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
            C1035340d36 c1035340d36 = adFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 != null && c1035340d36.LJIILJJIL()) {
                C786410Ut5.LJJZZIII(adFakePopUpWebPageWidget.LLJILLL, new Runnable() { // from class: X.0brg
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AdFakePopUpWebPageWidget@405.onPageShow$1");
                        try {
                            C1440005kM.LIZ(new C989800bre(true));
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AdFakePopUpWebPageWidget@405.onPageShow$1");
                    }
                });
            }
            adFakePopUpWebPageWidget.LLJILJILJ = System.currentTimeMillis();
            C1035340d36 c1035340d362 = adFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d362 == null || !c1035340d362.LJIILJJIL()) {
                return "homepage_ad_halfscreen_page";
            }
            Aweme aweme = adFakePopUpWebPageWidget.LLIZLLLIL;
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "othershow", aweme != null ? aweme.getAwemeRawAd() : null);
            c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
            c1022820ciuLIZLLL.LJII();
            return "homepage_ad_halfscreen_page";
        }

        @Override // X.InterfaceC1035410d3D
        public final void LIZLLL(int i) {
            AwemeRawAd awemeRawAd;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
            C786410Ut5.LJJZZIII(adFakePopUpWebPageWidget.LLJILLL, new Runnable() { // from class: X.0brf
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AdFakePopUpWebPageWidget@405.onPageExpanded$1");
                    try {
                        C1440005kM.LIZ(new C989800bre(true));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AdFakePopUpWebPageWidget@405.onPageExpanded$1");
                }
            });
            C1035340d36 c1035340d36 = adFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 != null) {
                AwemeRawAd awemeRawAd2 = null;
                if (c1035340d36.LJIILJJIL() && !adFakePopUpWebPageWidget.LLJJ) {
                    Aweme aweme = adFakePopUpWebPageWidget.LLIZLLLIL;
                    if (aweme != null) {
                        awemeRawAd2 = aweme.getAwemeRawAd();
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd2);
                    c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
                    c1022820ciuLIZLLL.LJII();
                    adFakePopUpWebPageWidget.LLJJ = true;
                    return;
                }
                String str = "landing_page";
                if (!c1035340d36.LLLFFI) {
                    Aweme aweme2 = adFakePopUpWebPageWidget.LLIZLLLIL;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "othershow", awemeRawAd);
                    c1022820ciuLIZLLL2.LIZJ("landing_page", "refer");
                    c1022820ciuLIZLLL2.LJII();
                }
                Aweme aweme3 = adFakePopUpWebPageWidget.LLIZLLLIL;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd2);
                if (c1035340d36.LLLFFI) {
                    str = "button";
                }
                c1022820ciuLIZLLL3.LIZJ(str, "refer");
                c1022820ciuLIZLLL3.LJII();
                adFakePopUpWebPageWidget.LLJILJILJ = System.currentTimeMillis();
                c1035340d36.setFromAdButtonClick(false);
            }
        }

        @Override // X.InterfaceC1035410d3D
        public final void LIZJ(int i, Boolean bool) throws JSONException {
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
            adFakePopUpWebPageWidget.getClass();
            String str = "landing_page";
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                Aweme aweme = adFakePopUpWebPageWidget.LLIZLLLIL;
                if (aweme != null) {
                    awemeRawAd3 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "othershow_fail", awemeRawAd3);
                c1022820ciuLIZLLL.LIZJ("landing_page", "refer");
                c1022820ciuLIZLLL.LJII();
            } else {
                if (i != 5 && i != 0) {
                    C786410Ut5.LJJZZIII(adFakePopUpWebPageWidget.LLJILLL, new Runnable() { // from class: X.0brd
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AdFakePopUpWebPageWidget@405.onPageCollapsed$1");
                            try {
                                C1440005kM.LIZ(new C989800bre(false));
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AdFakePopUpWebPageWidget@405.onPageCollapsed$1");
                        }
                    });
                }
                C1035340d36 c1035340d36 = adFakePopUpWebPageWidget.LLJIJIL;
                if (c1035340d36 != null) {
                    if (c1035340d36.LJIILJJIL() && !adFakePopUpWebPageWidget.LLJJ) {
                        Aweme aweme2 = adFakePopUpWebPageWidget.LLIZLLLIL;
                        if (aweme2 != null) {
                            awemeRawAd2 = aweme2.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "close", awemeRawAd2);
                        str = "halfscreen_page";
                        c1022820ciuLIZLLL2.LIZJ("halfscreen_page", "refer");
                        c1022820ciuLIZLLL2.LJII();
                        adFakePopUpWebPageWidget.LLJJ = true;
                    } else {
                        if (C996060c1k.LIZ == 1) {
                            str = "slide";
                        } else {
                            str = "slide_down";
                        }
                        if (i != 5 && i != 0) {
                            Aweme aweme3 = adFakePopUpWebPageWidget.LLIZLLLIL;
                            if (aweme3 != null) {
                                awemeRawAd = aweme3.getAwemeRawAd();
                            } else {
                                awemeRawAd = null;
                            }
                            C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("landing_ad", "close", awemeRawAd);
                            String str2 = adFakePopUpWebPageWidget.LLJILJIL;
                            if (str2 == null) {
                                str2 = str;
                            }
                            c1022820ciuLIZLLL3.LIZJ(str2, "refer");
                            c1022820ciuLIZLLL3.LJII();
                        }
                    }
                }
                C1035340d36 c1035340d362 = adFakePopUpWebPageWidget.LLJIJIL;
                if (c1035340d362 != null) {
                    c1035340d362.LJIL(str);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - adFakePopUpWebPageWidget.LLJILJILJ;
                if (adFakePopUpWebPageWidget.LLJIJIL != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                    C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
                }
            }
            this.LIZ.LLJILJIL = null;
        }
    };

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIIZILJ(boolean z) {
        AwemeRawAd awemeRawAd;
        Context context;
        int i;
        Context context2;
        AwemeRawAd awemeRawAd2;
        String aid;
        C19EG activity;
        IAdLandingPagePopUpService iAdLandingPagePopUpService;
        C1035340d36 c1035340d36LIZIZ;
        C19EG activity2;
        String source;
        AwemeRawAd awemeRawAd3;
        int iLIZJ;
        AwemeRawAd awemeRawAd4;
        Context context3;
        AwemeRawAd awemeRawAd5;
        String webUrl;
        AwemeRawAd awemeRawAd6;
        AwemeRawAd awemeRawAd7;
        AwemeRawAd awemeRawAd8;
        FakeAuthor fakeAuthor;
        Aweme aweme = this.LLIZLLLIL;
        C19EG activity3 = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        Fragment fragment = this.LLJ;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        UUID.randomUUID().toString();
        Aweme aweme2 = this.LLIZLLLIL;
        if (aweme2 != null && (awemeRawAd8 = aweme2.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd8.getFakeAuthor()) != null && Intrinsics.LJFF(fakeAuthor.getAutoShowWebview(), Boolean.TRUE)) {
            i = 5;
        } else {
            i = 4;
        }
        C1025090cmZ c1025090cmZ = new C1025090cmZ();
        Fragment fragment2 = this.LLJ;
        if (fragment2 != null) {
            context2 = fragment2.getContext();
        } else {
            context2 = null;
        }
        c1025090cmZ.LIZ = context2;
        Aweme aweme3 = this.LLIZLLLIL;
        c1025090cmZ.LJIIIIZZ = aweme3;
        if (aweme3 != null) {
            awemeRawAd2 = aweme3.getAwemeRawAd();
        } else {
            awemeRawAd2 = null;
        }
        c1025090cmZ.LIZIZ = awemeRawAd2;
        c1025090cmZ.LIZLLL = 8;
        c1025090cmZ.LIZJ = i;
        Aweme aweme4 = this.LLIZLLLIL;
        String str = "";
        if (aweme4 == null || (aid = aweme4.getAid()) == null) {
            aid = "";
        }
        c1025090cmZ.LIZ(aid);
        C1025100cma c1025100cmaLIZIZ = c1025090cmZ.LIZIZ();
        Fragment fragment3 = this.LLJ;
        if (fragment3 != null) {
            activity = fragment3.getActivity();
        } else {
            activity = null;
        }
        if (z) {
            if (activity != null && aweme != null && (context instanceof C19EG) && this.LLJJI.getValue() != null && awemeRawAd != null && C299720Bow.LIZ()) {
                ((IAdLandingPagePopUpService) this.LLJJI.getValue()).LJJI(activity, C1018570cc3.LIZJ((C19EG) context), c1025100cmaLIZIZ.LJFF, aweme, i, 78, true);
                return;
            }
            Fragment fragment4 = this.LLJ;
            if (fragment4 != null && (activity2 = fragment4.getActivity()) != null) {
                Aweme aweme5 = this.LLIZLLLIL;
                if (aweme5 != null && (awemeRawAd7 = aweme5.getAwemeRawAd()) != null) {
                    source = awemeRawAd7.getSource();
                } else {
                    source = null;
                }
                if (!TextUtils.isEmpty(source)) {
                    Aweme aweme6 = this.LLIZLLLIL;
                    if (aweme6 != null && (awemeRawAd6 = aweme6.getAwemeRawAd()) != null) {
                        awemeRawAd6.getSource();
                    }
                } else {
                    Aweme aweme7 = this.LLIZLLLIL;
                    if (aweme7 != null && (awemeRawAd3 = aweme7.getAwemeRawAd()) != null) {
                        awemeRawAd3.getWebTitle();
                    }
                }
                C1025210cml c1025210cml = new C1025210cml();
                Aweme aweme8 = this.LLIZLLLIL;
                if (aweme8 != null && (awemeRawAd5 = aweme8.getAwemeRawAd()) != null && (webUrl = awemeRawAd5.getWebUrl()) != null) {
                    str = webUrl;
                }
                c1025210cml.LIZ = str;
                c1025210cml.LJ = this.LLJ;
                if (!((Boolean) C287380BOe.LIZ.getValue()).booleanValue()) {
                    iLIZJ = C497820Jfg.LIZJ(activity2);
                } else {
                    C1546210qL5.LIZ.getClass();
                    iLIZJ = (((int) C12ES.LIZJ((float) (C445490HdT.LIZIZ(activity2, Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJII(activity2), activity2))) * ((double) 0.15f)), activity2)) + C1546210qL5.LJII(activity2)) - ((int) C12ES.LIZJ(52.0f, activity2));
                }
                c1025210cml.LIZIZ = iLIZJ;
                Aweme aweme9 = this.LLIZLLLIL;
                Bundle bundle = new Bundle();
                Fragment fragment5 = this.LLJ;
                if (fragment5 != null && (context3 = fragment5.getContext()) != null && aweme9 != null && aweme9.getAwemeRawAd() != null) {
                    C1027640cqg.LIZ(context3, bundle, aweme9);
                    C1027640cqg.LIZIZ(context3, bundle, aweme9);
                    C1027640cqg.LIZLLL(context3, bundle, aweme9);
                    C1027640cqg.LIZJ(context3, bundle);
                }
                c1025210cml.LIZJ = bundle;
                Aweme aweme10 = this.LLIZLLLIL;
                if (aweme10 != null) {
                    awemeRawAd4 = aweme10.getAwemeRawAd();
                } else {
                    awemeRawAd4 = null;
                }
                c1025210cml.LIZLLL = awemeRawAd4;
                c1025210cml.LJI = true;
                C1025930cnv c1025930cnvLIZ = c1025210cml.LIZ();
                C996070c1l c996070c1l = this.LLJJIJIIJIL;
                C996080c1m c996080c1m = this.LLJJIII;
                C1035340d36 c1035340d36LIZIZ2 = C1018570cc3.LIZIZ(activity2);
                if (c1035340d36LIZIZ2 == null) {
                    c1035340d36LIZIZ2 = new C1035340d36(activity2);
                    c1035340d36LIZIZ2.setId(R.id.a8s);
                    c1035340d36LIZIZ2.setParams(c1025930cnvLIZ);
                    c1035340d36LIZIZ2.setMBehaviorCallback(c996070c1l);
                    c1035340d36LIZIZ2.setKeyDownCallBack(c996080c1m);
                    FrameLayout frameLayoutLIZJ = C1018570cc3.LIZJ(activity2);
                    if (frameLayoutLIZJ != null) {
                        frameLayoutLIZJ.addView(c1035340d36LIZIZ2);
                    }
                }
                this.LLJIJIL = c1035340d36LIZIZ2;
                c1035340d36LIZIZ2.setTitleBarCallback(this.LLJJIJI);
            }
            this.LLJJ = false;
            this.LLJILJILJ = 0L;
            Fragment fragment6 = this.LLJ;
            if (fragment6 != null) {
                activity3 = fragment6.getActivity();
            }
            Context context4 = c1025100cmaLIZIZ.LIZ;
            if (context4 == null || C1388190mED.LIZ(context4) == null || (c1035340d36LIZIZ = C1018570cc3.LIZIZ(activity3)) == null || c1035340d36LIZIZ.LJIIJJI()) {
                return;
            }
            FrameLayout frameLayoutLIZJ2 = C1018570cc3.LIZJ(activity3);
            if (frameLayoutLIZJ2 != null) {
                C786410Ut5.LJZ(0, frameLayoutLIZJ2);
            }
            c1035340d36LIZIZ.getActionMode().LJIIIIZZ = c1025100cmaLIZIZ.LIZLLL;
            c1035340d36LIZIZ.LJIIIZ(new AwS417S0200000_16(c1025100cmaLIZIZ, c1035340d36LIZIZ, 17));
            return;
        }
        if ((context instanceof C19EG) && (iAdLandingPagePopUpService = (IAdLandingPagePopUpService) this.LLJJI.getValue()) != null) {
            new C343950De5();
            iAdLandingPagePopUpService.LJIILIIL();
        }
        Fragment fragment7 = this.LLJ;
        if (fragment7 != null) {
            activity3 = fragment7.getActivity();
        }
        C1035340d36 c1035340d36LIZIZ3 = C1018570cc3.LIZIZ(activity3);
        if (c1035340d36LIZIZ3 == null || !c1035340d36LIZIZ3.LJIIJJI()) {
            return;
        }
        c1035340d36LIZIZ3.LJ(true);
        FrameLayout frameLayoutLIZJ3 = C1018570cc3.LIZJ(activity3);
        if (frameLayoutLIZJ3 == null) {
            return;
        }
        C786410Ut5.LJZ(8, frameLayoutLIZJ3);
    }
}
