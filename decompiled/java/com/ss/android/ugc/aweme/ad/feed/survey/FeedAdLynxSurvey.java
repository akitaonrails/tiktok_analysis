package com.ss.android.ugc.aweme.ad.feed.survey;

import X.AbstractC1024610cln;
import X.C01GW;
import X.C1000130c8J;
import X.C1022820ciu;
import X.C1029690ctz;
import X.C14EU;
import X.C2184171Adz;
import X.C452501pT;
import X.C739830T0j;
import X.C786410Ut5;
import X.C987980boi;
import X.C999680c7a;
import X.InterfaceC1000280c8Y;
import X.InterfaceC999480c7G;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdLynxSurvey implements GenericLifecycleObserver {
    public final C1000130c8J LL;
    public final FrameLayout LLILLJJLI;
    public Aweme LLILLL;
    public AwemeRawAd LLILZ;
    public AdQuestionnaire LLILZIL;
    public long LLILZLL = -1;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 63));
    public final C01GW LLIZLLLIL;
    public final View LLJ;
    public final InterfaceC999480c7G LLJI;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJIJIL;
    public View LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZIZ() {
        if (this.LL.LLIZLLLIL) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_over", this.LLILZ);
            AwemeRawAd awemeRawAd = this.LLILZ;
            c1022820ciuLIZLLL.LIZJ(awemeRawAd != null ? awemeRawAd.getAdId() : null, "ad_id");
            c1022820ciuLIZLLL.LIZJ(this.LLJILJILJ, "refer");
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LLILZLL), "duration");
            AdQuestionnaire adQuestionnaire = this.LLILZIL;
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(adQuestionnaire != null ? adQuestionnaire.id : 0), "five_star_survey_id");
            c1022820ciuLIZLLL.LJII();
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHomeTabPressed(C739830T0j c739830T0j) {
        C1000130c8J c1000130c8J = this.LL;
        if (c1000130c8J.LLIZLLLIL) {
            FrameLayout frameLayout = c1000130c8J.LLILZ;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            int i = 0;
            c1000130c8J.LLIZLLLIL = false;
            Long adId = null;
            c1000130c8J.LLJ = null;
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_over", this.LLILZ);
            AwemeRawAd awemeRawAd = this.LLILZ;
            if (awemeRawAd != null) {
                adId = awemeRawAd.getAdId();
            }
            c1022820ciuLIZLLL.LIZJ(adId, "ad_id");
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LLILZLL), "duration");
            AdQuestionnaire adQuestionnaire = this.LLILZIL;
            if (adQuestionnaire != null) {
                i = adQuestionnaire.id;
            }
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "five_star_survey_id");
            c1022820ciuLIZLLL.LJII();
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwipeUpEvent(C999680c7a c999680c7a) {
        int iHashCode;
        DataCenter dataCenter;
        int i = c999680c7a.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            iHashCode = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode();
        } else {
            iHashCode = 0;
        }
        if (i != iHashCode) {
            return;
        }
        String str = c999680c7a.LIZIZ;
        if (str == null) {
            str = "";
        }
        this.LLJILJILJ = str;
        C1000130c8J c1000130c8J = this.LL;
        C987980boi c987980boi = c1000130c8J.LLJ;
        if (c987980boi != null && (dataCenter = c1000130c8J.LLILLL) != null) {
            dataCenter.zQ2(c987980boi, "action_ad_swipe_up_video");
        }
    }

    public FeedAdLynxSurvey(C1000130c8J c1000130c8J, FrameLayout frameLayout) {
        this.LL = c1000130c8J;
        this.LLILLJJLI = frameLayout;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(88));
        this.LLIZLLLIL = c01gwLIZIZ;
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        View viewLJLLJ = C786410Ut5.LJLLJ(frameLayout.getContext(), R.layout.d4k, null);
        this.LLJ = viewLJLLJ;
        this.LLJILJILJ = "";
        AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.0c8K
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                FeedAdLynxSurvey feedAdLynxSurvey = this.LL;
                if (!feedAdLynxSurvey.LLJJ) {
                    feedAdLynxSurvey.LLJILJIL = interfaceC1541990qEH.e1();
                    this.LL.LLJILLL = true;
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                this.LL.LLJJ = false;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
                this.LL.LLJJ = true;
            }
        };
        C786410Ut5.LJJJJIZL(frameLayout);
        frameLayout.addView(viewLJLLJ);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLJLLJ.findViewById(R.id.spark_center_view_container);
        this.LLJIJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1000280c8Y interfaceC1000280c8Y = (InterfaceC1000280c8Y) c01gwLIZIZ.getValue();
        if (interfaceC1000280c8Y != null) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            c1029690ctzLJJIIJZLJL = interfaceC1000280c8Y.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, iAdLandPagePreloadService != null ? iAdLandPagePreloadService.K0("lynx_feed") : null, abstractC1024610cln);
        }
        this.LLJI = c1029690ctzLJJIIJZLJL;
    }

    public final void LIZ(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Lifecycle lifecycle;
        this.LLILLL = aweme;
        AdQuestionnaire adQuestionnaire = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LLILZ = awemeRawAd;
        if (awemeRawAd != null) {
            adQuestionnaire = awemeRawAd.getAdQuestionnaire();
        }
        this.LLILZIL = adQuestionnaire;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.LLIZ.getValue();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
