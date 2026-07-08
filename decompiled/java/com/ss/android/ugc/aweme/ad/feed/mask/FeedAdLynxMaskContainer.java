package com.ss.android.ugc.aweme.ad.feed.mask;

import X.AbstractC1024610cln;
import X.C01GW;
import X.C1003680cE2;
import X.C1029690ctz;
import X.C14EU;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2344009Gk;
import X.C290420BZw;
import X.C452501pT;
import X.C583160Mu2;
import X.C786410Ut5;
import X.C996130c1r;
import X.C996140c1s;
import X.C997160c3W;
import X.C997280c3i;
import X.C997530c47;
import X.C997880c4g;
import X.C999460c7E;
import X.C999720c7e;
import X.C999810c7n;
import X.InterfaceC1000280c8Y;
import X.InterfaceC1541990qEH;
import X.InterfaceC988500bpY;
import X.InterfaceC999480c7G;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdLynxMaskContainer implements GenericLifecycleObserver {
    public final C999460c7E LL;
    public FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final String LLILZ;
    public Aweme LLILZIL;
    public CardStruct LLILZLL;
    public JSONObject LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 61));
    public final InterfaceC1000280c8Y LLJ;
    public final InterfaceC999480c7G LLJI;
    public View LLJIJIL;
    public C999810c7n LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZ(Aweme aweme) {
        CardStruct cardStruct;
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        this.LLILZIL = aweme;
        JSONObject cardData = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (cardInfos = awemeRawAd.getCardInfos()) != null) {
            cardStruct = cardInfos.get("5");
        } else {
            cardStruct = null;
        }
        this.LLILZLL = cardStruct;
        if (cardStruct != null) {
            cardData = cardStruct.getCardData();
        }
        this.LLIZ = cardData;
        Lifecycle lifecycle = (Lifecycle) this.LLIZLLLIL.getValue();
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        if (C290420BZw.LIZ() && aweme != null) {
            C999810c7n c999810c7n = this.LLJILJIL;
            if (c999810c7n != null) {
                c999810c7n.LJ();
            }
            if (!this.LLJILJILJ) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(0, "is_successful");
                c2344009Gk.LIZJ(0, "is_ever_failed");
                c2344009Gk.LJIIIIZZ("is_spark", "1");
                c2344009Gk.LIZJ(1, "failed_reason");
                C20684815ws.LJIILLIIL("feed_lynx_mask_preload_usage", c2344009Gk.LIZ);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardGetCodeButtonClickedEvent(C997280c3i c997280c3i) {
        LIZIZ("gameCodeClicked", null);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHideMaskLayoutEvent(C997530c47 c997530c47) {
        if (c997530c47.LIZ != this.LLILLJJLI.hashCode()) {
            return;
        }
        if (C583160Mu2.LIZIZ(this.LLILZIL)) {
            C583160Mu2.LIZJ(1);
            DataCenter dataCenter = this.LL.LLILZ;
            if (dataCenter != null) {
                dataCenter.zQ2(Boolean.FALSE, "action_ad_hide_lynx_mask");
            }
            DataCenter dataCenter2 = this.LL.LLILZ;
            if (dataCenter2 != null) {
                dataCenter2.zQ2(null, "ad_play_story_sub_video");
                return;
            }
            return;
        }
        C999460c7E c999460c7E = this.LL;
        boolean zLIZJ = true ^ C1003680cE2.LIZJ(this.LLILZIL);
        DataCenter dataCenter3 = c999460c7E.LLILZ;
        if (dataCenter3 == null) {
            return;
        }
        dataCenter3.zQ2(Boolean.valueOf(zLIZJ), "action_ad_hide_lynx_mask");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLynxConvert(C997880c4g c997880c4g) {
        int i = C2187451AjH.LIZ;
        C583160Mu2.LJ = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPopUpPageHideResumeVideoEvent(C996130c1r c996130c1r) {
        DataCenter dataCenter = this.LL.LLILZ;
        if (dataCenter != null) {
            dataCenter.zQ2(null, "ad_feed_resume_video");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPopUpPageShowHideMaskLayoutEvent(C996140c1s c996140c1s) {
        DataCenter dataCenter = this.LL.LLILZ;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.FALSE, "action_ad_hide_lynx_mask");
        }
        DataCenter dataCenter2 = this.LL.LLILZ;
        if (dataCenter2 != null) {
            dataCenter2.zQ2(null, "ad_feed_pause_video");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onStoryMaskClickEvent(C997160c3W c997160c3W) {
        C583160Mu2.LIZJ(c997160c3W.LIZ);
        DataCenter dataCenter = this.LL.LLILZ;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.FALSE, "action_ad_hide_lynx_mask");
        }
        DataCenter dataCenter2 = this.LL.LLILZ;
        if (dataCenter2 != null) {
            dataCenter2.zQ2(null, "ad_play_story_sub_video");
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        FrameLayout frameLayout = this.LLILLJJLI;
        if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ(str, jSONObject);
        }
    }

    public FeedAdLynxMaskContainer(C999460c7E c999460c7E, FrameLayout frameLayout, FrameLayout frameLayout2, String str) {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C999810c7n c999810c7n;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        ViewGroup viewGroup;
        C999720c7e c999720c7eLJJIJIIJIL;
        this.LL = c999460c7E;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = frameLayout2;
        this.LLILZ = str;
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        if (interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) {
            interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ;
        } else {
            interfaceC1000280c8Y = null;
        }
        this.LLJ = interfaceC1000280c8Y;
        AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.0c7F
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LL;
                if (!feedAdLynxMaskContainer.LLJJ) {
                    feedAdLynxMaskContainer.LLJIJIL = interfaceC1541990qEH.e1();
                    this.LL.LLJILLL = true;
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                this.LL.getClass();
                this.LL.LLJJ = false;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                this.LL.LLJJ = true;
            }
        };
        if (C290420BZw.LIZ()) {
            IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
            if (iFeedAdService != null && (c999720c7eLJJIJIIJIL = iFeedAdService.LJJIJIIJIL()) != null) {
                c999810c7n = (C999810c7n) c999720c7eLJJIJIIJIL.LIZ(str);
            } else {
                c999810c7n = null;
            }
            this.LLJILJIL = c999810c7n;
            if (c999810c7n != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c999810c7n.LIZJ) != null && c999810c7n.LIZ == 3) {
                if (!Intrinsics.LJFF(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, this.LLILLJJLI)) {
                    ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, viewGroup);
                    }
                }
                ViewParent parent2 = this.LLILLJJLI.getParent();
                ViewGroup viewGroup2 = frameLayout2;
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent2;
                    viewGroup2 = frameLayout2;
                    if (viewGroup3 != null) {
                        viewGroup2 = viewGroup3;
                    }
                }
                int iIndexOfChild = viewGroup2.indexOfChild(this.LLILLJJLI);
                C786410Ut5.LJJJLZIJ(this.LLILLJJLI, viewGroup2);
                viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, iIndexOfChild);
                c999460c7E.LLILZIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
                this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
                this.LLJILJILJ = true;
                this.LLJILLL = c999810c7n.LJ;
                this.LLJIJIL = c999810c7n.LIZLLL;
            }
        }
        if (!this.LLJILJILJ) {
            FrameLayout frameLayout3 = this.LLILLJJLI;
            if (frameLayout3 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout3;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
            }
            if (interfaceC1000280c8Y != null) {
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                c1029690ctzLJJIIJZLJL = interfaceC1000280c8Y.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, iAdLandPagePreloadService != null ? iAdLandPagePreloadService.K0("lynx_feed") : null, abstractC1024610cln);
            }
            this.LLJI = c1029690ctzLJJIIJZLJL;
        }
    }
}
