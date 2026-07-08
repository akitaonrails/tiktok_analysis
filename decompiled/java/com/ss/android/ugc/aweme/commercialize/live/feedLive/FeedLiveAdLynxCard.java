package com.ss.android.ugc.aweme.commercialize.live.feedLive;

import X.AbstractC1024610cln;
import X.C01GW;
import X.C1000150c8L;
import X.C1017070cZd;
import X.C1029690ctz;
import X.C1388190mED;
import X.C14EU;
import X.C1EKI;
import X.C341940Daq;
import X.C444960Hcc;
import X.C452501pT;
import X.C497820Jfg;
import X.C622680Oba;
import X.C786410Ut5;
import X.C990080bs6;
import X.C997410c3v;
import X.C999410c79;
import X.C999580c7Q;
import X.InterfaceC1000280c8Y;
import X.InterfaceC990070bs5;
import X.InterfaceC999480c7G;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedLiveAdLynxCard implements InterfaceC990070bs5, GenericLifecycleObserver {
    public final FrameLayout LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Long LLILZLL;
    public Aweme LLIZ;
    public AwemeRawAd LLIZLLLIL;
    public CardStruct LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C999410c79 LLJILLL;
    public View LLJJ;
    public final BPEAHandler LLJJI = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public final View LLJJIJIL;
    public final InterfaceC999480c7G LLJJJ;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJIL;
    public final Keva LLJJJJ;
    public final C01GW LLJJJJJIL;

    public final void LJIIIZ() {
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        hide();
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJJIJIIJIL = -1;
        this.LLJJI.removeCallbacksAndMessages(null);
        FrameLayout frameLayout = this.LL;
        if (frameLayout == null || frameLayout.getVisibility() == 8) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, frameLayout);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    @Override // X.InterfaceC990070bs5
    public final void LIZLLL() {
        if (((Boolean) C1EKI.LJ.getValue()).booleanValue()) {
            onActivityDestroy();
        }
    }

    public final void hide() {
        if (this.LLJI) {
            this.LLJI = false;
            FrameLayout frameLayout = this.LL;
            frameLayout.animate().alpha(0.0f).translationY(C341940Daq.LIZ(15.0d)).setDuration(290L).withEndAction(new ARunnableS102S0100000_2(frameLayout, 57)).start();
            C999410c79 c999410c79 = this.LLJILLL;
            if (c999410c79 != null) {
                c999410c79.LIZ.vQ2(null, "ad_live_card_hide");
            }
        }
    }

    @Override // X.InterfaceC990070bs5
    public final void load() {
        String cardUrl;
        String strJ3;
        CardStruct cardStruct = this.LLJ;
        if (cardStruct == null || (cardUrl = cardStruct.getCardUrl()) == null) {
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(cardUrl).buildUpon();
        n nVar = new n();
        AwemeRawAd awemeRawAd = this.LLIZLLLIL;
        String str = "";
        if (awemeRawAd != null) {
            Long adId = awemeRawAd.getAdId();
            nVar.LJJIIJ("adId", adId != null ? adId.toString() : null);
            nVar.LJJIIJ("creativeId", awemeRawAd.getCreativeIdStr());
            nVar.LJJIIJ("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            nVar.LJJIIJ("groupId", groupId != null ? groupId.toString() : null);
            List<String> urlList = awemeRawAd.getClickTrackUrlList().getUrlList();
            if (urlList != null && !urlList.isEmpty()) {
                h hVar = new h();
                Iterator<String> it2 = urlList.iterator();
                while (it2.hasNext()) {
                    hVar.LJJIII(it2.next());
                }
                nVar.LJJIFFI("clickTrackUrlList", hVar);
            }
            String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
            if (nativeSiteAdInfo == null) {
                nativeSiteAdInfo = "";
            }
            nVar.LJJIIJ("pageData", nativeSiteAdInfo);
            nVar.LJJIII(Integer.valueOf(this.LLJJJJ.getBoolean(awemeRawAd.getCreativeId().toString(), false) ? 1 : 0), "isVoted");
            NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            nVar.LJJIIJ("lynxSchema", nativeSiteConfig != null ? nativeSiteConfig.lynxScheme : null);
        }
        Aweme aweme = this.LLIZ;
        nVar.LJJIIJ("itemId", String.valueOf(aweme != null ? aweme.getAid() : null));
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(this.LL.getContext()) ? 1 : 0), "isRTL");
        CardStruct cardStruct2 = this.LLJ;
        if (cardStruct2 != null) {
            JSONObject cardData = cardStruct2.getCardData();
            if (cardData != null && (strJ3 = C786410Ut5.J3(cardData)) != null) {
                str = strJ3;
            }
            nVar.LJJIIJ("cardData", str);
        }
        nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(this.LL.getContext())), "topSafeAreaHeight");
        nVar.LJJIII(1, "isCardState");
        C1388190mED.LIZ(this.LL.getContext());
        nVar.LJJIII(0, "userHasVoted");
        nVar.LJJIII(0, "enableCardCloseButton");
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            nVar.LJJIIJ("adLiveJson", str2);
        }
        String str3 = this.LLILLL;
        if (str3 != null) {
            nVar.LJJIIJ("productInfo", str3);
        }
        String str4 = this.LLILZ;
        if (str4 != null) {
            nVar.LJJIIJ("frontendExtraData", str4);
        }
        String str5 = this.LLILZIL;
        if (str5 != null) {
            nVar.LJJIIJ("liveCardIncentiveInfo", str5);
        }
        Long l = this.LLILZLL;
        if (l != null) {
            nVar.LJJIII(Long.valueOf(l.longValue()), "startTimestamp");
        }
        builderBuildUpon.appendQueryParameter("initialData", nVar.toString());
        InterfaceC999480c7G interfaceC999480c7G = this.LLJJJ;
        if (interfaceC999480c7G != null) {
            String string = builderBuildUpon.toString();
            Bundle bundle = new Bundle();
            Context context = this.LL.getContext();
            InterfaceC1000280c8Y interfaceC1000280c8Y = (InterfaceC1000280c8Y) this.LLJJIII.getValue();
            if (interfaceC1000280c8Y != null) {
                interfaceC1000280c8Y.LJIJJ(context, bundle, this.LLIZ);
            }
            AwemeRawAd awemeRawAd2 = this.LLIZLLLIL;
            C786410Ut5.LJJJI("bundle_native_site_custom_data", awemeRawAd2 != null ? awemeRawAd2.getNativeSiteCustomData() : null, bundle);
            interfaceC999480c7G.LIZ(bundle, string, C1000150c8L.LIZ().enableLynxCard);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityDestroy() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.LLJJJJJIL.getValue();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC990070bs5
    public final void LJIIIIZZ() {
        LJIIIZ();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC990070bs5
    public final void LIZ() {
        C622680Oba.LIZJ(this);
    }

    public FeedLiveAdLynxCard(FrameLayout frameLayout) {
        Lifecycle lifecycle;
        this.LL = frameLayout;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(140));
        this.LLJJIII = c01gwLIZIZ;
        this.LLJJIJIIJIL = -1;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d4m, frameLayout, true);
        this.LLJJIJIL = viewTd;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewTd.findViewById(R.id.mtj);
        this.LLJJJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.0c7P
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                FeedLiveAdLynxCard feedLiveAdLynxCard = this.LL;
                if (!feedLiveAdLynxCard.LLJJIJI) {
                    feedLiveAdLynxCard.LLJILJIL = true;
                    feedLiveAdLynxCard.LLJJ = interfaceC1541990qEH.e1();
                    View viewE1 = interfaceC1541990qEH.e1();
                    if (viewE1 != null) {
                        C786410Ut5.W5(viewE1, new FrameLayout.LayoutParams(-1, -2));
                    }
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                this.LL.LLJJIJI = false;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
                this.LL.LLJJIJI = true;
            }
        };
        this.LLJJJJ = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS560S0100000_16(this, 176));
        this.LLJJJJJIL = c01gwLIZIZ2;
        InterfaceC1000280c8Y interfaceC1000280c8Y = (InterfaceC1000280c8Y) c01gwLIZIZ.getValue();
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        if (interfaceC1000280c8Y != null) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            c1029690ctzLJJIIJZLJL = interfaceC1000280c8Y.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, iAdLandPagePreloadService != null ? iAdLandPagePreloadService.K0("lynx_feed") : null, abstractC1024610cln);
        }
        this.LLJJJ = c1029690ctzLJJIIJZLJL;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) c01gwLIZIZ2.getValue();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC990070bs5
    public final void LJFF(CardStruct cardStruct) {
        this.LLJ = cardStruct;
    }

    @Override // X.InterfaceC990070bs5
    public final void LJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        this.LLIZ = aweme;
        CardStruct cardStructLJJIIZI = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LLIZLLLIL = awemeRawAd;
        if (awemeRawAd == null) {
            if (aweme != null) {
                cardStructLJJIIZI = C1017070cZd.LJJIJ(aweme);
            }
        } else if (aweme != null) {
            cardStructLJJIIZI = C1017070cZd.LJJIIZI(aweme);
        }
        this.LLJ = cardStructLJJIIZI;
        LJIIIZ();
    }

    @Override // X.InterfaceC990070bs5
    public final void LJII(C999410c79 c999410c79) {
        this.LLJILLL = c999410c79;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardCloseEvent(C999580c7Q c999580c7Q) {
        if (c999580c7Q.LIZ != this.LLJJJIL.hashCode()) {
            return;
        }
        hide();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C997410c3v c997410c3v) {
        int i = c997410c3v.LIZ;
        this.LLJJIJIIJIL = i;
        if (i == 1) {
            this.LLJILJILJ = true;
        }
    }

    @Override // X.InterfaceC990070bs5
    public final void LIZIZ(long j, String str) {
        this.LLILZIL = str;
        this.LLILZLL = Long.valueOf(j);
    }

    @Override // X.InterfaceC990070bs5
    public final void LJ(long j, C990080bs6 c990080bs6) {
        if (this.LLJ == null || this.LLJI) {
            return;
        }
        C786410Ut5.LJLIIL(j, this.LLJJI, new ARunnableS116S0100000_16(this, c990080bs6, 141));
    }

    @Override // X.InterfaceC990070bs5
    public final void LIZJ(String str, String str2, String str3) {
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
