package com.ss.android.ugc.aweme.explore.entrance;

import X.AbstractC1591090rVT;
import X.C0BKD;
import X.C1360720lVu;
import X.C1388190mED;
import X.C1561720qk6;
import X.C1581510rG1;
import X.C1582910rIH;
import X.C1583120rIc;
import X.C1583440rJ8;
import X.C1584500rKq;
import X.C1584550rKv;
import X.C1589820rTQ;
import X.C15WT;
import X.C1606660rua;
import X.C1910420zoW;
import X.C19252910Tv;
import X.C19EG;
import X.C2487409ou;
import X.C282760B6k;
import X.C293140BeK;
import X.C343710Ddh;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1571190qzN;
import X.EnumC1910400zoU;
import X.InterfaceC1589850rTT;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS93S0200000_24;
import android.R;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreCacheMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreColdBootMonitor;
import com.ss.android.ugc.aweme.explore.ui.container.ExploreXTabFeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class ExploreXTabProtocol extends TopTabProtocol {
    public Context LLILZIL;
    public final String LLILZLL = "homepage_explore";
    public final int LLIZ = 35;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc() { // from class: X.0rKl
            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1584440rKk c1584440rKk) {
                C19EG c19egLIZIZ;
                InterfaceC1583070rIX interfaceC1583070rIX = (InterfaceC1583070rIX) interfaceC1583080rIY.LIZ(c1584440rKk);
                Context context = this.LIZJ.LLILZIL;
                if (context != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                } else {
                    c19egLIZIZ = null;
                }
                View view = interfaceC1583070rIX.getView();
                HandlerHook.viewPostDelay(view, new ARunnableS93S0200000_24(view, c19egLIZIZ, 9), 800L);
                return interfaceC1583070rIX;
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final InterfaceC1589850rTT LJ() {
        if (((Boolean) C282760B6k.LIZ.getValue()).booleanValue()) {
            return C1589820rTQ.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1571190qzN LJIIL() {
        Context context = this.LLILZIL;
        return (context == null || !C960203pA.LIZIZ(context)) ? EnumC1571190qzN.LIGHT : EnumC1571190qzN.DARK;
    }

    public final void LJIILLIIL() {
        C19EG c19egLIZIZ;
        AbstractC1591090rVT abstractC1591090rVTY01;
        Fragment fragment;
        IMFToolBarAbility iMFToolBarAbilityLJ;
        Fragment fragment2;
        IMFToolBarAbility iMFToolBarAbilityLJ2;
        Context context = this.LLILZIL;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        if (!C1581510rG1.LIZLLL()) {
            Object objLJIIIIZZ = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJIIIIZZ(c19egLIZIZ);
            if (objLJIIIIZZ != null && (objLJIIIIZZ instanceof Fragment) && (fragment2 = (Fragment) objLJIIIIZZ) != null && (iMFToolBarAbilityLJ2 = C1561720qk6.LJ(fragment2)) != null) {
                iMFToolBarAbilityLJ2.j6();
            }
            Context context2 = this.LLILZIL;
            if (context2 == null || !C960203pA.LIZIZ(context2)) {
                C1360720lVu.LIZIZ(c19egLIZIZ);
                ((IMainService) ServiceManager.get().getService(IMainService.class)).changeStatusBarMainTab(c19egLIZIZ, "homepage_explore");
                AbstractC1591090rVT abstractC1591090rVTY012 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(c19egLIZIZ).y01();
                if (abstractC1591090rVTY012 != null) {
                    abstractC1591090rVTY012.LJIILIIL(false);
                }
                Object objLJIIIIZZ2 = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJIIIIZZ(c19egLIZIZ);
                if (objLJIIIIZZ2 != null && (objLJIIIIZZ2 instanceof Fragment) && (fragment = (Fragment) objLJIIIIZZ2) != null && (iMFToolBarAbilityLJ = C1561720qk6.LJ(fragment)) != null) {
                    iMFToolBarAbilityLJ.Rt2(null, true);
                }
            }
        }
        View viewFindViewById = c19egLIZIZ.findViewById(R.id.statusBarBackground);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIIJJI().LJIIIZ() || (abstractC1591090rVTY01 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(c19egLIZIZ).y01()) == null) {
            return;
        }
        Context context3 = this.LLILZIL;
        abstractC1591090rVTY01.LJJJ(C343710Ddh.LIZ(context3 != null ? C1388190mED.LIZIZ(context3) : null).CQ2());
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        C1910420zoW.LIZJ();
        C1910420zoW.LIZLLL(EnumC1910400zoU.TAB_TO_ON_CREATE);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1571190qzN LJIIJJI() {
        return C1581510rG1.LIZLLL() ? EnumC1571190qzN.LIGHT : LJIIL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return C1583440rJ8.LIZIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return ExploreXTabFeedFragment.class;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIJ(String str) {
        C19EG c19egLIZIZ;
        AbstractC1591090rVT abstractC1591090rVTY01;
        Object objLJIIIIZZ;
        Fragment fragment;
        IMFToolBarAbility iMFToolBarAbilityLJ;
        Context context = this.LLILZIL;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C19EG c19egLIZIZ2 = null;
            if (!C1581510rG1.LIZLLL()) {
                if (!Intrinsics.LJFF(str, "Activity")) {
                    Context context2 = this.LLILZIL;
                    boolean z = false;
                    if (context2 == null || !C960203pA.LIZIZ(context2)) {
                        C1360720lVu.LIZ(c19egLIZIZ);
                        ((IMainService) ServiceManager.get().getService(IMainService.class)).changeStatusBarMainTab(C1388190mED.LIZ(c19egLIZIZ), "HOME");
                        AbstractC1591090rVT abstractC1591090rVTY012 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(c19egLIZIZ).y01();
                        if (abstractC1591090rVTY012 != null) {
                            abstractC1591090rVTY012.LJIILIIL(true);
                            abstractC1591090rVTY012.LJIIJ(true);
                        }
                        if (Intrinsics.LJFF(str, "Nearby") && C1606660rua.LIZIZ.LJ()) {
                            z = true;
                        }
                        if (!Intrinsics.LJFF(str, "Shop") && !z && (objLJIIIIZZ = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJIIIIZZ(c19egLIZIZ)) != null && (objLJIIIIZZ instanceof Fragment) && (fragment = (Fragment) objLJIIIIZZ) != null && (iMFToolBarAbilityLJ = C1561720qk6.LJ(fragment)) != null) {
                            iMFToolBarAbilityLJ.ae0(null, true);
                        }
                    }
                } else {
                    return;
                }
            }
            if (C19252910Tv.LIZIZ.LIZLLL().LJIIJJI().LJIIIZ() && (abstractC1591090rVTY01 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(c19egLIZIZ).y01()) != null) {
                Context context3 = this.LLILZIL;
                if (context3 != null) {
                    c19egLIZIZ2 = C1388190mED.LIZIZ(context3);
                }
                abstractC1591090rVTY01.LJJJ(C343710Ddh.LIZ(c19egLIZIZ2).CQ2());
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) throws JSONException {
        this.LLILZIL = context;
        C1584550rKv.LIZ.getClass();
        C1584550rKv.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        return C293140BeK.LIZ(context, new C1582910rIH(context));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        C1910420zoW.LIZJ();
        C1910420zoW.LIZLLL(EnumC1910400zoU.TAB_TO_ON_CREATE);
        if (!((Boolean) C0BKD.LIZ.getValue()).booleanValue()) {
            ExploreCacheMonitor.INSTANCE.start();
        }
        ExploreColdBootMonitor.INSTANCE.start(str2, "explore_top_tab");
        C15WT.LIZIZ.LIZIZ(this.LLILZIL);
        if (C1584500rKq.LIZ().enable && C1584500rKq.LIZ().enableTabSelectedDelay) {
            C2487409ou.LIZLLL(C1584500rKq.LIZ().tabChangeDelayTimeMills, new ARunnableS124S0100000_24(this, 24));
        } else {
            LJIILLIIL();
        }
    }
}
