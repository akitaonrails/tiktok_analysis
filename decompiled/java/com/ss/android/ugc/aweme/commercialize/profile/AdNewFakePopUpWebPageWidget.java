package com.ss.android.ugc.aweme.commercialize.profile;

import X.C01GW;
import X.C1017180cZo;
import X.C1035340d36;
import X.C452501pT;
import X.C996090c1n;
import X.C996110c1p;
import X.C996200c1y;
import X.InterfaceC1035410d3D;
import X.InterfaceC1035570d3T;
import X.InterfaceC990300bsS;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class AdNewFakePopUpWebPageWidget extends AbsAdProfileWidget {
    public C1035340d36 LLJIJIL;
    public String LLJILJIL;
    public long LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(141));
    public final C996110c1p LLJJ = new InterfaceC990300bsS() { // from class: X.0c1p
        @Override // X.InterfaceC990300bsS
        public final void onBackPress() {
            this.LIZ.LLJILJIL = "back";
        }
    };
    public final C996200c1y LLJJI = new InterfaceC1035570d3T() { // from class: X.0c1y
        @Override // X.InterfaceC1035570d3T
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1035570d3T
        public final void LIZ() {
            this.LIZ.LLJILJIL = "button";
        }

        @Override // X.InterfaceC1035570d3T
        public final void LIZJ() {
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
            C1035340d36 c1035340d36 = adNewFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 != null) {
                C1029600ctq actionMode = c1035340d36.getActionMode();
                Aweme aweme = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                AwemeRawAd awemeRawAd = aweme != null ? aweme.getAwemeRawAd() : null;
                actionMode.getClass();
                if (awemeRawAd == null || awemeRawAd.getProfileWithWebview() != 1) {
                    return;
                }
                int i = actionMode.LJIIIIZZ;
                if (i == 7 || i == 8 || actionMode.LIZJ == 3) {
                    Aweme aweme2 = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                    C2184171Adz.LIZLLL("landing_ad", "report", aweme2 != null ? aweme2.getAwemeRawAd() : null).LJII();
                }
            }
        }
    };
    public final C996090c1n LLJJIII = new InterfaceC1035410d3D() { // from class: X.0c1n
        @Override // X.InterfaceC1035410d3D
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1035410d3D
        public final String onShow() {
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
            adNewFakePopUpWebPageWidget.getClass();
            adNewFakePopUpWebPageWidget.LLJILJILJ = System.currentTimeMillis();
            C1035340d36 c1035340d36 = adNewFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 == null) {
                return "homepage_ad_halfscreen_page";
            }
            if (!c1035340d36.LJIILJJIL() && !c1035340d36.LJIILIIL()) {
                return "homepage_ad_halfscreen_page";
            }
            Aweme aweme = adNewFakePopUpWebPageWidget.LLIZLLLIL;
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "click", aweme != null ? aweme.getAwemeRawAd() : null);
            c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
            c1022820ciuLIZLLL.LJII();
            return "homepage_ad_halfscreen_page";
        }

        @Override // X.InterfaceC1035410d3D
        public final String LIZ(int i) {
            boolean z;
            AwemeRawAd awemeRawAd;
            String str;
            AwemeRawAd awemeRawAd2;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
            C1035340d36 c1035340d36 = adNewFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d36 != null && c1035340d36.LJIILIIL()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i == 3) {
                if (C996060c1k.LIZ == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                Aweme aweme = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                if (aweme != null) {
                    awemeRawAd2 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "close", awemeRawAd2);
                String str2 = adNewFakePopUpWebPageWidget.LLJILJIL;
                if (str2 != null) {
                    str = str2;
                }
                c1022820ciuLIZLLL.LIZJ(str, "refer");
                c1022820ciuLIZLLL.LJII();
            }
            C1035340d36 c1035340d362 = adNewFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d362 != null && c1035340d362.LJIILIIL() && i == 6) {
                Aweme aweme2 = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "close", awemeRawAd);
                c1022820ciuLIZLLL2.LIZJ("halfscreen_page", "refer");
                c1022820ciuLIZLLL2.LJII();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - adNewFakePopUpWebPageWidget.LLJILJILJ;
            if (adNewFakePopUpWebPageWidget.LLJIJIL != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
            }
            C1440005kM.LIZ(new IEvent() { // from class: X.0c1o
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
            return null;
        }

        @Override // X.InterfaceC1035410d3D
        public final void LIZLLL(int i) {
            boolean z;
            C1035340d36 c1035340d36;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
            C1035340d36 c1035340d362 = adNewFakePopUpWebPageWidget.LLJIJIL;
            if (c1035340d362 != null && c1035340d362.LJIILJJIL()) {
                z = true;
            } else {
                z = false;
            }
            AwemeRawAd awemeRawAd = null;
            if ((z || ((c1035340d36 = adNewFakePopUpWebPageWidget.LLJIJIL) != null && c1035340d36.LJIILIIL())) && i == 6) {
                Aweme aweme = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "otherclick", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
                c1022820ciuLIZLLL.LJII();
            } else if (adNewFakePopUpWebPageWidget.LLJIJIL != null) {
                Aweme aweme2 = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd);
                c1022820ciuLIZLLL2.LIZJ("button", "refer");
                c1022820ciuLIZLLL2.LJII();
            }
            adNewFakePopUpWebPageWidget.LLJILJILJ = System.currentTimeMillis();
        }

        @Override // X.InterfaceC1035410d3D
        public final void LIZJ(int i, Boolean bool) throws JSONException {
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
            adNewFakePopUpWebPageWidget.getClass();
            String str = "button";
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                Aweme aweme = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                if (aweme != null) {
                    awemeRawAd3 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "othershow_fail", awemeRawAd3);
                c1022820ciuLIZLLL.LIZJ("button", "refer");
                c1022820ciuLIZLLL.LJII();
            } else {
                C1035340d36 c1035340d36 = adNewFakePopUpWebPageWidget.LLJIJIL;
                if (c1035340d36 != null) {
                    if (c1035340d36.LJIILJJIL() && i == 6) {
                        Aweme aweme2 = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                        if (aweme2 != null) {
                            awemeRawAd2 = aweme2.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "close", awemeRawAd2);
                        str = "halfscreen_page";
                        c1022820ciuLIZLLL2.LIZJ("halfscreen_page", "refer");
                        c1022820ciuLIZLLL2.LJII();
                    } else {
                        if (C996060c1k.LIZ == 1) {
                            str = "slide";
                        } else {
                            str = "slide_down";
                        }
                        if (i != 5 && i != 0) {
                            c1035340d36.LJIL(str);
                            Aweme aweme3 = adNewFakePopUpWebPageWidget.LLIZLLLIL;
                            if (aweme3 != null) {
                                awemeRawAd = aweme3.getAwemeRawAd();
                            } else {
                                awemeRawAd = null;
                            }
                            C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("landing_ad", "close", awemeRawAd);
                            String str2 = adNewFakePopUpWebPageWidget.LLJILJIL;
                            if (str2 == null) {
                                str2 = str;
                            }
                            c1022820ciuLIZLLL3.LIZJ(str2, "refer");
                            c1022820ciuLIZLLL3.LJII();
                        }
                    }
                }
                C1035340d36 c1035340d362 = adNewFakePopUpWebPageWidget.LLJIJIL;
                if (c1035340d362 != null) {
                    c1035340d362.LJIL(str);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - adNewFakePopUpWebPageWidget.LLJILJILJ;
                if (adNewFakePopUpWebPageWidget.LLJIJIL != null) {
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

    public final boolean LJIJ() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        Aweme aweme2 = this.LLIZLLLIL;
        if (aweme2 != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && C1017180cZo.LJIIJJI(awemeRawAd3)) {
            return false;
        }
        Aweme aweme3 = this.LLIZLLLIL;
        return (!TextUtils.isEmpty((aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null) ? null : awemeRawAd2.getOpenUrl()) || (aweme = this.LLIZLLLIL) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || !Intrinsics.LJFF(fakeAuthor.getAutoShowWebview(), Boolean.TRUE)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x021e  */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(boolean r28) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget.LJIIZILJ(boolean):void");
    }
}
