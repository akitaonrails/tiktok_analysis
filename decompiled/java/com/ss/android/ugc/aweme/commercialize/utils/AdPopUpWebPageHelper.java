package com.ss.android.ugc.aweme.commercialize.utils;

import X.C01GW;
import X.C1019830ce5;
import X.C1035340d36;
import X.C1440005kM;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C690420R6i;
import X.C988850bq7;
import X.C996120c1q;
import X.C996150c1t;
import X.C996160c1u;
import X.C996170c1v;
import X.InterfaceC1035410d3D;
import X.InterfaceC1035570d3T;
import X.InterfaceC990300bsS;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPopUpWebPageHelper implements GenericLifecycleObserver {
    public static final Map<Integer, AdPopUpWebPageHelper> LLJILJIL = new LinkedHashMap();
    public Aweme LL;
    public String LLILLJJLI;
    public String LLILLL;
    public long LLILZ;
    public final WeakReference<C19EG> LLILZIL;
    public C1035340d36 LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C996120c1q LLJ;
    public final C996150c1t LLJI;
    public final C996160c1u LLJIJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final C19EG LIZ() {
        WeakReference<C19EG> weakReference = this.LLILZIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C1035340d36 c1035340d36 = this.LLILZLL;
        if (c1035340d36 != null && c1035340d36.LJIIJJI() && !this.LLIZ) {
            C1440005kM.LIZ(new C690420R6i());
        }
        this.LLILZ = System.currentTimeMillis();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C19EG c19egLIZ = LIZ();
        if (c19egLIZ == null) {
            return;
        }
        C996170c1v.LIZ(c19egLIZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        if (this.LLILZLL != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0c1t] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0c1u] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0c1q] */
    public AdPopUpWebPageHelper(C19EG c19eg) {
        Aweme aweme;
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (c1019830ce5LIZ != null) {
            aweme = c1019830ce5LIZ.LJIIL;
        } else {
            aweme = null;
        }
        this.LL = aweme;
        this.LLILLJJLI = "";
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(148));
        this.LLILZIL = new WeakReference<>(c19eg);
        c19eg.getLifecycle().addObserver(this);
        this.LLJ = new InterfaceC1035410d3D() { // from class: X.0c1q
            @Override // X.InterfaceC1035410d3D
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1035410d3D
            public final void LIZJ(int i, Boolean bool) {
            }

            @Override // X.InterfaceC1035410d3D
            public final void LIZLLL(int i) {
            }

            @Override // X.InterfaceC1035410d3D
            public final String onShow() {
                AdPopUpWebPageHelper adPopUpWebPageHelper = this.LIZ;
                Aweme aweme2 = adPopUpWebPageHelper.LL;
                if (aweme2 != null && C1017070cZd.LLLII(aweme2)) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.0c1s
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
                }
                if (!adPopUpWebPageHelper.LLIZ) {
                    C1440005kM.LIZ(new C691870RBx(true));
                }
                adPopUpWebPageHelper.LLILZ = System.currentTimeMillis();
                return null;
            }

            @Override // X.InterfaceC1035410d3D
            public final String LIZ(int i) {
                String webUrl;
                AwemeRawAd awemeRawAd;
                String str;
                AwemeRawAd awemeRawAd2;
                AdPopUpWebPageHelper adPopUpWebPageHelper = this.LIZ;
                Aweme aweme2 = adPopUpWebPageHelper.LL;
                if (aweme2 != null && C1017070cZd.LLLII(aweme2) && C1559540qga.LIZ(adPopUpWebPageHelper.LIZ())) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.0c1r
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
                }
                if (!adPopUpWebPageHelper.LLIZ) {
                    C1440005kM.LIZ(new C691870RBx(false));
                }
                if (adPopUpWebPageHelper.LLILZLL != null) {
                    if (C996060c1k.LIZ == 1) {
                        str = "slide";
                    } else {
                        str = "slide_down";
                    }
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZ = "landing_ad";
                    c1020020ceOLIZ.LIZIZ = "close";
                    String str2 = adPopUpWebPageHelper.LLILLL;
                    if (str2 == null) {
                        str2 = str;
                    }
                    c1020020ceOLIZ.LJIIIZ(str2);
                    c1020020ceOLIZ.LJ(adPopUpWebPageHelper.LL);
                    c1020020ceOLIZ.LJIIJ(null);
                    Aweme aweme3 = adPopUpWebPageHelper.LL;
                    if (aweme3 != null) {
                        awemeRawAd2 = aweme3.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "close", awemeRawAd2);
                    String str3 = adPopUpWebPageHelper.LLILLL;
                    if (str3 != null) {
                        str = str3;
                    }
                    c1022820ciuLIZLLL.LIZJ(str, "refer");
                    c1022820ciuLIZLLL.LJIIIIZZ();
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - adPopUpWebPageHelper.LLILZ;
                if (adPopUpWebPageHelper.LLILZLL != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                    C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Aweme aweme4 = adPopUpWebPageHelper.LL;
                if (aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
                    webUrl = "";
                }
                linkedHashMap.put("url", webUrl);
                linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                new C1061730djf();
                C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis2, C1061730djf.LIZLLL(linkedHashMap), "ad_webview_close"));
                this.LIZ.LLILLL = null;
                return null;
            }
        };
        this.LLJI = new InterfaceC990300bsS() { // from class: X.0c1t
            @Override // X.InterfaceC990300bsS
            public final void onBackPress() {
                this.LIZ.LLILLL = "back";
            }
        };
        this.LLJIJIL = new InterfaceC1035570d3T() { // from class: X.0c1u
            @Override // X.InterfaceC1035570d3T
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1035570d3T
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1035570d3T
            public final void LIZ() {
                this.LIZ.LLILLL = "button";
            }
        };
    }
}
