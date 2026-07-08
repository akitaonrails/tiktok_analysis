package com.ss.android.ugc.aweme.ad.feed.card;

import X.AbstractC1024610cln;
import X.AbstractC1038410d83;
import X.C01GW;
import X.C09JN;
import X.C0CQT;
import X.C0QBU;
import X.C1017070cZd;
import X.C1022820ciu;
import X.C1029690ctz;
import X.C1076010e6h;
import X.C11NJ;
import X.C11S5;
import X.C1388190mED;
import X.C14EU;
import X.C1591220rVg;
import X.C1701940uOG;
import X.C20684815ws;
import X.C21388418n4;
import X.C2184171Adz;
import X.C2344009Gk;
import X.C341940Daq;
import X.C452501pT;
import X.C663730Q1r;
import X.C691870RBx;
import X.C737030Svd;
import X.C786410Ut5;
import X.C996690c2l;
import X.C997410c3v;
import X.C999500c7I;
import X.C999520c7K;
import X.C999580c7Q;
import X.C999610c7T;
import X.C999630c7V;
import X.C999640c7W;
import X.C999650c7X;
import X.C999680c7a;
import X.C999710c7d;
import X.C999800c7m;
import X.InterfaceC1000280c8Y;
import X.InterfaceC1541990qEH;
import X.InterfaceC990040bs2;
import X.InterfaceC999480c7G;
import X.InterfaceC999820c7o;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnLayoutChangeListenerC998530c5j;
import Y.AObserverS220S0100000_16;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS116S0100000_16;
import Y.AfS185S0100000_16;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import com.ss.android.ugc.aweme.ad.network.VoteApi;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdCardStrategyModel;
import com.ss.android.ugc.aweme.commercialize.model.AdPromptInfoModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdLynxCard implements InterfaceC990040bs2, GenericLifecycleObserver {
    public static Integer LLLFF;
    public final C999500c7I LL;
    public final FrameLayout LLILLJJLI;
    public Aweme LLILLL;
    public AwemeRawAd LLILZ;
    public CardStruct LLILZIL;
    public int LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public Long LLJILLL;
    public String LLJJIII;
    public final C01GW LLJJIJIIJIL;
    public View LLJJIJIL;
    public final InterfaceC999480c7G LLJJJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJIL;
    public View LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public C999610c7T LLJL;
    public final Keva LLJLIL;
    public final C11NJ LLJLILLLLZIIL;
    public final InterfaceC999820c7o LLJLL;
    public C999800c7m LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public LiveEventObserver<FollowStatus> LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public int LLILZLL = -100;
    public int LLIZ = -100;
    public int LLJJ = -1;
    public int LLJJI = -1;
    public int LLJJIJI = -1;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            sendCardShowState();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            sendCardHideState();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    @Override // X.InterfaceC990040bs2
    public final void LIZ() throws JSONException {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AdPromptInfoModel slideBackInfoModel;
        AdCardStrategyModel cardStrategy;
        EventBus.LIZLLL().LJJI(C999520c7K.LIZ);
        EventBus.LIZLLL().LJIJJ(this);
        this.LLJZ++;
        Aweme aweme2 = this.LLILLL;
        boolean z = false;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && awemeRawAd.isReshowAd() && (aweme = this.LLILLL) != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.isReshowFormat() && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && (slideBackInfoModel = awemeRawAd3.getSlideBackInfoModel()) != null && (cardStrategy = slideBackInfoModel.getCardStrategy()) != null && cardStrategy.getTriggerCondition() == 1) {
            z = true;
        }
        LJII("reshow", null, z, true);
    }

    public final FrameLayout LJ() {
        Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.getContext());
        if (activityLIZ == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) activityLIZ.findViewById(R.id.a93);
        return viewStub == null ? (FrameLayout) activityLIZ.findViewById(R.id.a92) : (FrameLayout) C786410Ut5.LJLLLL(viewStub);
    }

    public final void LJIIIZ() {
        EventLiveData<FollowStatus> relationObservable;
        LiveEventObserver<FollowStatus> liveEventObserver = this.LLJZIJLIL;
        if (liveEventObserver != null) {
            try {
                RelationService relationServiceLIZIZ = C1076010e6h.LIZJ.LIZIZ();
                if (relationServiceLIZIZ != null && (relationObservable = relationServiceLIZIZ.getRelationObservable()) != null) {
                    relationObservable.removeObserver(liveEventObserver);
                }
                Lifecycle lifecycle = (Lifecycle) this.LLLF.getValue();
                if (lifecycle != null) {
                    lifecycle.removeObserver(liveEventObserver);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLJZIJLIL = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.LLL.getValue();
        if (lifecycleOwner != null) {
            if (C1591220rVg.LIZIZ()) {
                this.LLJZIJLIL = C1076010e6h.LIZJ.LIZIZ().getRelationObservable().subscribe(lifecycleOwner, new AObserverS220S0100000_16(this, 0));
            } else {
                C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(lifecycleOwner, new AObserverS220S0100000_16(this, 1));
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void sendCardHideState() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        if (!this.LLJJL || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.onHide();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void sendCardShowState() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        if (!this.LLJJL || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.onShow();
    }

    public final boolean LJIIIIZZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (C1591220rVg.LIZIZ()) {
            LJIIIZ();
        }
        Lifecycle lifecycle = (Lifecycle) this.LLLF.getValue();
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        EventBus.LIZLLL().LJJI(C999520c7K.LIZ);
        EventBus.LIZLLL().LJJI(this);
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJLILLLLZIIL.dispose();
        if (this.LLJLLL) {
            return false;
        }
        this.LLJJJJJIL = false;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
        }
        View view = this.LLJJIJIL;
        if ((view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLJJJJ = null;
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityDestroy() {
        if (C1591220rVg.LIZIZ()) {
            LJIIIZ();
        }
        Lifecycle lifecycle = (Lifecycle) this.LLLF.getValue();
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        C999610c7T c999610c7T = this.LLJL;
        if (c999610c7T != null) {
            c999610c7T.enable(false);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLJJJJ = null;
        this.LLJLILLLLZIIL.dispose();
    }

    public final void LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Lifecycle lifecycle;
        AwemeRawAd awemeRawAd2;
        this.LLILLL = aweme;
        CardStruct cardStructLJJIIZI = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LLILZ = awemeRawAd;
        if ((!C1591220rVg.LIZIZ() || aweme != null) && (lifecycle = (Lifecycle) this.LLLF.getValue()) != null) {
            lifecycle.addObserver(this);
        }
        if (this.LLILZ == null) {
            if (aweme != null) {
                cardStructLJJIIZI = C1017070cZd.LJJIJ(aweme);
            }
        } else if (aweme != null) {
            cardStructLJJIIZI = C1017070cZd.LJJIIZI(aweme);
        }
        this.LLILZIL = cardStructLJJIIZI;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && !awemeRawAd2.isReshowAd()) {
            this.LLJZ = 0;
        }
        LJI(aweme);
    }

    public final void LJFF(FollowStatus followStatus) {
        String strLJIJ;
        Aweme aweme = this.LLILLL;
        if (aweme != null && C1017070cZd.LLLIL(aweme)) {
            Aweme aweme2 = this.LLILLL;
            if (aweme2 != null) {
                strLJIJ = C1017070cZd.LJIJ(aweme2);
            } else {
                strLJIJ = null;
            }
            if (!TextUtils.equals(strLJIJ, followStatus.getUserId())) {
                return;
            }
            if (followStatus.getFollowStatus() == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isFollowed", false);
                LJIIJ("followStatusChanged", jSONObject);
            } else {
                if (followStatus.getFollowStatus() == 0 || 2149 == followStatus.getFollowStatus()) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isFollowed", true);
                LJIIJ("followStatusChanged", jSONObject2);
            }
        }
    }

    public final void LJI(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C999800c7m c999800c7m = this.LLJLLIL;
        if (c999800c7m != null) {
            c999800c7m.LJ();
        }
        if (!this.LLJLLL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(0, "is_successful");
            c2344009Gk.LIZJ(0, "is_ever_failed");
            c2344009Gk.LIZJ(1, "failed_reason");
            C20684815ws.LJIILLIIL("feed_lynx_card_preload_usage", c2344009Gk.LIZ);
        }
    }

    public final void LJIILIIL(int i) {
        boolean z;
        C999800c7m c999800c7m;
        InterfaceC1541990qEH kitView;
        C786410Ut5.LJLLLLLL(i, this.LLJJIJIL);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJL = z;
        if (z) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.onShow();
            }
            if (this.LLJLLL && (c999800c7m = this.LLJLLIL) != null) {
                c999800c7m.LJFF = true;
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardCloseEvent(C999580c7Q c999580c7Q) {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode() == c999580c7Q.LIZ) {
            C999500c7I c999500c7I = this.LL;
            if (c999500c7I.LLJIJIL) {
                DataCenter dataCenter = c999500c7I.LLILZLL;
                if (dataCenter != null) {
                    dataCenter.zQ2(Boolean.FALSE, "ad_feed_card_show_state");
                }
                FrameLayout frameLayout = c999500c7I.LLILLL;
                if (frameLayout != null) {
                    frameLayout.removeOnLayoutChangeListener((ViewOnLayoutChangeListenerC998530c5j) c999500c7I.LLJILLL.getValue());
                }
                ICommerceTransAndCaptionAbility iCommerceTransAndCaptionAbility = (ICommerceTransAndCaptionAbility) c999500c7I.LLJILJILJ.getValue();
                if (iCommerceTransAndCaptionAbility != null) {
                    iCommerceTransAndCaptionAbility.p72("FeedAdCardDelegate");
                }
                ((ViewOnLayoutChangeListenerC998530c5j) c999500c7I.LLJILLL.getValue()).LL = -1;
                FrameLayout frameLayout2 = c999500c7I.LLILLL;
                if (frameLayout2 != null) {
                    frameLayout2.animate().alpha(0.0f).translationY(C341940Daq.LIZ(15.0d)).setDuration(290L).withEndAction(new ARunnableS102S0100000_2(frameLayout2, 49)).start();
                }
                C786410Ut5.LJLIIL(200L, c999500c7I.LLIZ, new ARunnableS116S0100000_16(c999500c7I, 131));
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJJIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null) {
                kitView.onHide();
            }
            this.LLJJL = false;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardCollapseEvent(C0QBU c0qbu) {
        ViewGroup viewGroup;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode() == c0qbu.LIZIZ) {
            int i = c0qbu.LIZ;
            if (i == 1) {
                if (this.LLJJLIIIJLLLLLLLZ != 1) {
                    this.LLJJLIIIJLLLLLLLZ = 1;
                    C999610c7T c999610c7T = this.LLJL;
                    if (c999610c7T != null) {
                        c999610c7T.enable(false);
                    }
                    HandlerHook.viewPost(this.LLJJIJIL, new ARunnableS116S0100000_16(this, 134));
                    return;
                }
                return;
            }
            if (i != 2 || this.LLJJLIIIJLLLLLLLZ == 0) {
                return;
            }
            this.LLJJLIIIJLLLLLLLZ = 0;
            ViewParent parent = this.LLJJIJIL.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LLJJIJIL, viewGroup);
            }
            C786410Ut5.T4(this.LLJJIJIL, 0.0f);
            C786410Ut5.ed(this.LLJJIJIL, 0.0f);
            this.LLILLJJLI.addView(this.LLJJIJIL, new ViewGroup.LayoutParams(C341940Daq.LIZ(270.0d), -2));
            View view = this.LLJJJJ;
            if (view != null) {
                C786410Ut5.W5(view, new FrameLayout.LayoutParams(C341940Daq.LIZ(270.0d), -2));
            }
            this.LLJJIJIL.animate().alpha(1.0f).setInterpolator(new C21388418n4()).setDuration(300L).start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0c7T] */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardExpandEvent(C663730Q1r c663730Q1r) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String cardUrl;
        Uri uri;
        ViewGroup viewGroup;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode() == c663730Q1r.LIZIZ && c663730Q1r.LIZ == 1 && this.LLJJLIIIJLLLLLLLZ != 2) {
            this.LLJJLIIIJLLLLLLLZ = 2;
            FrameLayout frameLayoutLJ = LJ();
            if (frameLayoutLJ != null) {
                ViewParent parent = this.LLJJIJIL.getParent();
                String pageId = null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(this.LLJJIJIL, viewGroup);
                }
                frameLayoutLJ.addView(this.LLJJIJIL, new FrameLayout.LayoutParams(-1, -1));
                View view = this.LLJJJJ;
                if (view != null) {
                    C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
                }
                C786410Ut5.LJZ(0, frameLayoutLJ);
                DataCenter dataCenter = this.LL.LLILZLL;
                if (dataCenter != null) {
                    dataCenter.zQ2(null, "action_ad_pop_up_web_pause_video");
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("ad_wap_stat", "load_finish", this.LLILZ);
                c1022820ciuLIZLLL.LIZIZ("lynx", "render_type");
                c1022820ciuLIZLLL.LIZIZ(0, "duration");
                CardStruct cardStruct = this.LLILZIL;
                if (cardStruct == null || (cardUrl = cardStruct.getCardUrl()) == null || (uri = UriProtector.parse(cardUrl)) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                c1022820ciuLIZLLL.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "channel_name");
                AwemeRawAd awemeRawAd = this.LLILZ;
                if (awemeRawAd != null) {
                    pageId = awemeRawAd.getPageId();
                }
                c1022820ciuLIZLLL.LIZIZ(pageId, "page_id");
                c1022820ciuLIZLLL.LIZIZ(1, "first_page");
                c1022820ciuLIZLLL.LJII();
                if (this.LLJL == null) {
                    final Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.getContext());
                    if (activityLIZ != null) {
                        final View view2 = this.LLJJIJIL;
                        this.LLJL = new AbstractC1038410d83(activityLIZ, view2) { // from class: X.0c7T
                            @Override // X.InterfaceC1399350mWD
                            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                                if (i == 4) {
                                    FeedAdLynxCard feedAdLynxCard = this;
                                    if (feedAdLynxCard.LLJJLIIIJLLLLLLLZ == 2) {
                                        feedAdLynxCard.LLJJLIIIJLLLLLLLZ = 1;
                                        C999610c7T c999610c7T = feedAdLynxCard.LLJL;
                                        if (c999610c7T != null) {
                                            c999610c7T.enable(false);
                                        }
                                        HandlerHook.viewPost(feedAdLynxCard.LLJJIJIL, new ARunnableS116S0100000_16(feedAdLynxCard, 134));
                                        return true;
                                    }
                                }
                                return false;
                            }
                        };
                    } else {
                        return;
                    }
                }
                C999610c7T c999610c7T = this.LLJL;
                if (c999610c7T != null) {
                    c999610c7T.enable(true);
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C997410c3v c997410c3v) {
        int i = c997410c3v.LIZ;
        this.LLJJIJI = i;
        if (i == 1) {
            this.LLJJJJLIIL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDiggLocalEvent(X.C586100Mym r5) throws org.json.JSONException {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILLL
            boolean r3 = X.C1017070cZd.LJL(r0)
            boolean r0 = r5.LIZIZ
            if (r0 != 0) goto L2c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LIZ
            r2 = 0
            if (r0 == 0) goto L2a
            java.lang.String r1 = r0.getAid()
        L13:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILLL
            if (r0 == 0) goto L1b
            java.lang.String r2 = r0.getAid()
        L1b:
            boolean r0 = android.text.TextUtils.equals(r1, r2)
            if (r0 == 0) goto L2c
            r2 = 1
        L22:
            java.lang.String r1 = "user_interact"
            java.lang.String r0 = "like_click"
            r4.LJII(r1, r0, r3, r2)
            return
        L2a:
            r1 = r2
            goto L13
        L2c:
            r2 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard.onDiggLocalEvent(X.0Mym):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFavoriteClickEvent(X.C609850Nvz r5) throws org.json.JSONException {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILLL
            boolean r3 = X.C1017070cZd.LJL(r0)
            boolean r0 = r5.LIZ
            if (r0 != 0) goto L25
            java.lang.String r1 = r5.LIZIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILLL
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.getAid()
        L14:
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L25
            r2 = 1
        L1b:
            java.lang.String r1 = "user_interact"
            java.lang.String r0 = "favorite_click"
            r4.LJII(r1, r0, r3, r2)
            return
        L23:
            r0 = 0
            goto L14
        L25:
            r2 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard.onFavoriteClickEvent(X.0Nvz):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFollowCardEvent(C999650c7X c999650c7X) {
        C999500c7I c999500c7I;
        Aweme aweme;
        Aweme aweme2 = this.LLILLL;
        if (aweme2 != null && C1017070cZd.LLLIL(aweme2) && (aweme = (c999500c7I = this.LL).LLJI) != null && !AwemeExtKt.isDelete(aweme) && c999500c7I.LLILZLL != null && aweme.getAuthor().getFollowStatus() == 0) {
            C737030Svd c737030Svd = new C737030Svd(12, aweme);
            c737030Svd.LJIIJ = "card";
            DataCenter dataCenter = c999500c7I.LLILZLL;
            if (dataCenter != null) {
                dataCenter.zQ2(c737030Svd, "feed_internal_event");
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onGetScoreEvent(C999640c7W c999640c7W) {
        Aweme aweme;
        Aweme aweme2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        String creativeId;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode() != c999640c7W.LIZ || (aweme = this.LLILLL) == null || !C1017070cZd.LLFII(aweme)) {
            return;
        }
        if (!TextUtils.isEmpty(C1017070cZd.LJJJJ(aweme))) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            AwemeCommerceStruct commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo2 != null) {
                creativeId = commerceVideoAuthInfo2.getCreativeId();
            } else {
                creativeId = null;
            }
            c2344009Gk.LJIIIIZZ("cid", creativeId);
            c2344009Gk.LJIIIIZZ("enter_method", C1017070cZd.LJJJJ(aweme));
            C20684815ws.LJIILLIIL("ad_feedback_card_rate", c2344009Gk.LIZ);
        }
        if (this.LLILZ == null && (aweme2 = this.LLILLL) != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null) {
            commerceVideoAuthInfo.setHasUserSubmittedFeedback(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onGetVoteCardOptionEvent(C999630c7V c999630c7V) {
        int iHashCode;
        Long creativeId;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        int iHashCode2 = 0;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode() == c999630c7V.LIZ) {
            Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.getContext());
            if (activityLIZ != null) {
                iHashCode = activityLIZ.hashCode();
            } else {
                iHashCode = 0;
            }
            Integer num = LLLFF;
            if (num == null || iHashCode != num.intValue()) {
                if (activityLIZ != null) {
                    iHashCode2 = activityLIZ.hashCode();
                }
                LLLFF = Integer.valueOf(iHashCode2);
            }
            VoteApi.LIZ.getClass();
            VoteApi voteApi = (VoteApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(VoteApi.class);
            Aweme aweme = this.LLILLL;
            if (aweme == null) {
                return;
            }
            String aid = aweme.getAid();
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            Long adId = null;
            if (awemeRawAd != null) {
                creativeId = awemeRawAd.getCreativeId();
            } else {
                creativeId = null;
            }
            String strValueOf = String.valueOf(creativeId);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                adId = awemeRawAd2.getAdId();
            }
            this.LLJLILLLLZIIL.LIZ(voteApi.sendVoteOption(aid, strValueOf, String.valueOf(adId), c999630c7V.LIZIZ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 5), new C09JN() { // from class: X.0c7U
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FeedAdLynxCard@1c05.onGetVoteCardOptionEvent$disposable$2");
                    C1C7U.LIZIZ("FeedAdLynxCard@1c05.onGetVoteCardOptionEvent$disposable$2");
                }
            }));
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onMusicClickEvent(C996690c2l c996690c2l) throws JSONException {
        String aid;
        boolean zLJL = C1017070cZd.LJL(this.LLILLL);
        String str = c996690c2l.LIZ;
        Aweme aweme = this.LLILLL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        LJII("user_interact", "music_click", zLJL, TextUtils.equals(str, aid));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPopupWebShowEvent(C691870RBx c691870RBx) {
        C999610c7T c999610c7T = this.LLJL;
        if (c999610c7T != null) {
            c999610c7T.enable(!c691870RBx.LIZ);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwipeUpVideoEvent(C999680c7a c999680c7a) {
        DataCenter dataCenter;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode() == c999680c7a.LIZ && (dataCenter = this.LL.LLILZLL) != null) {
            dataCenter.zQ2(null, "action_ad_swipe_up_video");
        }
    }

    @Override // X.InterfaceC990040bs2
    public final void LIZIZ(long j, String str) {
        this.LLJILJILJ = str;
        this.LLJILLL = Long.valueOf(j);
    }

    public final void LJIIJ(String str, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ(str, jSONObject);
        }
    }

    public FeedAdLynxCard(C999500c7I c999500c7I, FrameLayout frameLayout, String str) {
        C999710c7d c999710c7dLJFF;
        C999800c7m c999800c7m;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        this.LL = c999500c7I;
        this.LLILLJJLI = frameLayout;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(385));
        this.LLJJIJIIJIL = c01gwLIZIZ;
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        this.LLJJIJIL = C786410Ut5.LJLLJ(frameLayout.getContext(), R.layout.d4f, null);
        AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.0c7N
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                FeedAdLynxCard feedAdLynxCard = this.LL;
                if (!feedAdLynxCard.LLJILJIL) {
                    feedAdLynxCard.LLJJJJJIL = true;
                    feedAdLynxCard.LLJJJJ = interfaceC1541990qEH.e1();
                    View viewE1 = interfaceC1541990qEH.e1();
                    if (viewE1 != null) {
                        C786410Ut5.W5(viewE1, new FrameLayout.LayoutParams(C341940Daq.LIZ(270.0d), -2));
                    }
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                this.LL.LLJILJIL = false;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                this.LL.LLJILJIL = true;
            }
        };
        this.LLJLIL = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        this.LLJLILLLLZIIL = new C11NJ();
        this.LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 714));
        this.LLLF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 713));
        IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
        if (iFeedAdService != null) {
            c999710c7dLJFF = iFeedAdService.LJFF();
        } else {
            c999710c7dLJFF = null;
        }
        this.LLJLL = c999710c7dLJFF;
        if (c999710c7dLJFF != null) {
            c999800c7m = (C999800c7m) c999710c7dLJFF.LIZ(str);
        } else {
            c999800c7m = null;
        }
        this.LLJLLIL = c999800c7m;
        if (c999800c7m != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999800c7m.LIZJ) != null && c999800c7m.LIZ == 3) {
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
            }
            this.LLJJIJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
            this.LLJLLL = true;
            this.LLJJJJLIIL = true;
            this.LLJJJJJIL = c999800c7m.LJ;
            this.LLJJJJ = c999800c7m.LIZLLL;
            this.LLJJJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        }
        frameLayout.addView(this.LLJJIJIL);
        if (!this.LLJLLL) {
            this.LLJJJIL = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) this.LLJJIJIL.findViewById(R.id.spark_container);
        }
        InterfaceC1000280c8Y interfaceC1000280c8Y = (InterfaceC1000280c8Y) c01gwLIZIZ.getValue();
        if (interfaceC1000280c8Y != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJJIL;
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            c1029690ctzLJJIIJZLJL = interfaceC1000280c8Y.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, iAdLandPagePreloadService != null ? iAdLandPagePreloadService.K0("lynx_feed") : null, abstractC1024610cln);
        }
        this.LLJJJ = c1029690ctzLJJIIJZLJL;
    }

    @Override // X.InterfaceC990040bs2
    public final void LIZJ(String str, String str2, String str3) {
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = str3;
    }

    public final void LJIIJJI(int i, int i2, String str) {
        this.LLJJ = i;
        this.LLJJI = i2;
        this.LLJJIII = str;
    }

    public final void LJIIL(int i, int i2, int i3) {
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = i3;
    }

    public final void LJII(String str, String str2, boolean z, boolean z2) throws JSONException {
        if (z) {
            if (z2) {
                this.LL.LLIIIILZ(0L, str, false);
            } else {
                return;
            }
        } else if (!z2) {
            return;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("userInteractType", str2);
            LJIIJ("userInteract", jSONObject);
        }
    }
}
