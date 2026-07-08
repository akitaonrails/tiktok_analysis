package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui;

import X.AbstractC1076520e7W;
import X.AbstractC1076560e7a;
import X.AbstractC1076640e7i;
import X.C036E;
import X.C098200Yq;
import X.C09JN;
import X.C0CQT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1000150c8L;
import X.C1024380clQ;
import X.C1041990dDp;
import X.C1076480e7S;
import X.C1076630e7h;
import X.C11NN;
import X.C11NZ;
import X.C11PQ;
import X.C11S5;
import X.C13LE;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1893080zMY;
import X.C19475711Hn;
import X.C19487811Me;
import X.C19488511Ml;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20533215Wg;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C616540OGe;
import X.C703302op;
import X.C786410Ut5;
import X.C905703gN;
import X.InterfaceC1076430e7N;
import X.InterfaceC1076550e7Z;
import X.InterfaceC1206390hUz;
import X.InterfaceC1258040iqI;
import X.InterfaceC19483011Ki;
import X.InterfaceC2217461Bqa;
import Y.AfS185S0100000_16;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class WishListFragment extends AmeBaseFragment implements InterfaceC1076550e7Z, InterfaceC1258040iqI, InterfaceC1206390hUz {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiHELIOSLCw8JSgpOyw2ZjIlOic/ITY4Zzo6ZhIlOicfITY4Dz0yLygpJzs=";
    public C1749280vcc LL;
    public FrameLayout LLILLJJLI;
    public SparkFragment LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public AwS560S0100000_16 LLILZLL;
    public String LLIZ;
    public View LLIZLLLIL;
    public volatile C1076480e7S LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WishListFragment.class, "wishListManager", "getWishListManager()Lcom/ss/android/ugc/aweme/commercialize/ecommerce/wishlist/manager/WishListManager;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() throws Throwable {
        setUserVisibleHint(false);
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.InterfaceC1076550e7Z
    public final void LJ() {
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.LJ();
        FrameLayout frameLayout = this.LLILLJJLI;
        C786410Ut5.LJZ(8, frameLayout != null ? frameLayout : null);
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        View viewMR = this.LLIZLLLIL;
        if (viewMR == null) {
            FrameLayout frameLayout = this.LLILLJJLI;
            if (frameLayout == null) {
                frameLayout = null;
            }
            viewMR = MR(frameLayout);
            if (viewMR == null) {
                ScrollView scrollView = new ScrollView(getContext());
                this.LLIZLLLIL = scrollView;
                return scrollView;
            }
            this.LLIZLLLIL = viewMR;
        }
        return viewMR;
    }

    public final C1076480e7S NR() {
        C1076480e7S c1076480e7S = this.LLJ;
        if (c1076480e7S == null) {
            synchronized (this) {
                c1076480e7S = this.LLJ;
                if (c1076480e7S == null) {
                    InterfaceC1076430e7N.LIZ.getClass();
                    C1076480e7S c1076480e7S2 = new C1076480e7S((InterfaceC1076430e7N) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC1076430e7N.class), (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class));
                    this.LLJ = c1076480e7S2;
                    return c1076480e7S2;
                }
            }
        }
        return c1076480e7S;
    }

    @Override // X.InterfaceC1076550e7Z
    public final void Nm() {
        boolean zLIZIZ;
        getContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            C1749280vcc c1749280vcc = this.LL;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_no_access;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = getString(2131858545);
            c1722300uv6.LJIIIZ = new AwS595S0100000_16(this, 70);
            c1749280vcc.setStatus(c1722300uv6);
        } else {
            C1749280vcc c1749280vcc2 = this.LL;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv62, new AwS560S0100000_16(this, 160));
            c1749280vcc2.setStatus(c1722300uv62);
        }
        C1749280vcc c1749280vcc3 = this.LL;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        FrameLayout frameLayout = this.LLILLJJLI;
        C786410Ut5.LJZ(8, frameLayout != null ? frameLayout : null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZIL = false;
        C1076480e7S c1076480e7SNR = NR();
        c1076480e7SNR.LIZJ.dispose();
        c1076480e7SNR.LIZIZ.G0();
        C1024380clQ.LIZJ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            C20684815ws.onEventV3("ads_wishlist_tab_exit");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(WishListFragment.class.getName());
        }
        super.onResume();
        if (getUserVisibleHint() && this.LLILZIL) {
            C20684815ws.onEventV3("ads_wishlist_tab_enter");
        }
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC1076550e7Z
    public final void vP() {
        boolean zLIZIZ;
        getContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            C1749280vcc c1749280vcc = this.LL;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
            FrameLayout frameLayout = this.LLILLJJLI;
            C786410Ut5.LJZ(0, frameLayout != null ? frameLayout : null);
            return;
        }
        C1749280vcc c1749280vcc2 = this.LL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS560S0100000_16(this, 161));
        c1749280vcc2.setStatus(c1722300uv6);
        FrameLayout frameLayout2 = this.LLILLJJLI;
        C786410Ut5.LJZ(8, frameLayout2 != null ? frameLayout2 : null);
    }

    public final View MR(View view) {
        if ((view instanceof RecyclerView) || (view instanceof ScrollView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewMR = MR(viewGroup.getChildAt(i));
                if (viewMR != null) {
                    return viewMR;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ShoppingAdsServiceImpl.WishListFragmentData wishListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (wishListFragmentData = (ShoppingAdsServiceImpl.WishListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LLIZ = wishListFragmentData.location;
        }
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) throws Throwable {
        setUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        SparkFragment sparkFragment = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ecommerce/wishlist/ui/WishListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMvWL3nTqFA8Y7bEqOFJapDidGZoYQX/PS+EucYHT1Piq1V+uu22A=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.LLILLL != null) {
                C1076480e7S c1076480e7SNR = NR();
                SparkFragment sparkFragment2 = this.LLILLL;
                if (sparkFragment2 != null) {
                    sparkFragment = sparkFragment2;
                }
                c1076480e7SNR.LIZJ(sparkFragment, this.LLIZ);
            } else {
                this.LLILZLL = new AwS560S0100000_16(this, 159);
            }
            this.LLILZ = true;
            C20684815ws.onEventV3("ads_wishlist_tab_enter");
        } else if (this.LLILZ) {
            C20684815ws.onEventV3("ads_wishlist_tab_exit");
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(WishListFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SparkFragment sparkFragment;
        SparkContext sparkContext;
        final String strK0;
        super.onViewCreated(view, bundle);
        this.LL = (C1749280vcc) view.findViewById(R.id.wishlist_status_view);
        this.LLILLJJLI = (FrameLayout) view.findViewById(R.id.wishlist_content_container);
        Context context = view.getContext();
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF == null || (sparkFragment = iAdSparkUtilsLJFF.LIZIZ(true)) == null) {
            sparkFragment = new SparkFragment();
        }
        IAdSparkUtils iAdSparkUtilsLJFF2 = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF2 == null || (sparkContext = iAdSparkUtilsLJFF2.LIZJ(context, null, null, null, false)) == null) {
            sparkContext = new SparkContext();
        }
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService == null || (strK0 = iAdLandPagePreloadService.K0("lynx_feed")) == null) {
            strK0 = "";
        }
        if (C703302op.LIZ(strK0)) {
            if (C1000150c8L.LIZ().enableLynxWishList) {
                sparkContext.LJJL("use_forest", true);
            }
            sparkContext.LJJJZ("access_key", strK0);
            sparkContext.LJJ(AbstractC1076640e7i.class, new AbstractC1076640e7i() { // from class: X.0e7M
                @Override // X.AbstractC1076640e7i
                public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                    String str = strK0;
                    C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                    if (c1533570q0h != null) {
                        c1533570q0h.LIZ = str;
                    }
                    return c1533560q0g;
                }
            });
        }
        Bundle bundle2 = new Bundle();
        C905703gN.LIZ.getClass();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContext);
        C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle2);
        sparkFragment.setArguments(bundle2);
        this.LLILLL = sparkFragment;
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        SparkFragment sparkFragment2 = this.LLILLL;
        if (sparkFragment2 == null) {
            sparkFragment2 = null;
        }
        c19ehLJIIJ.LJIJ(R.id.wishlist_content_container, sparkFragment2, null);
        c19ehLJIIJ.LJIIIZ();
        C1076480e7S c1076480e7SNR = NR();
        C11PQ<AbstractC1076520e7W> c11pq = c1076480e7SNR.LIZLLL;
        c11pq.getClass();
        c1076480e7SNR.LIZJ.LIZ(new C19475711Hn(c11pq).LJJIL(new InterfaceC19483011Ki() { // from class: X.0e7O
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C1076510e7V;
            }
        }).LJL(C11S5.LIZ()).LJJLL(new AfS185S0100000_16(c1076480e7SNR, 32), new C09JN() { // from class: X.00Nc
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("WishListManager@8a.listenToGeckoInfoFetchResult$3");
                C1C7U.LIZIZ("WishListManager@8a.listenToGeckoInfoFetchResult$3");
            }
        }));
        C11PQ<AbstractC1076520e7W> c11pq2 = c1076480e7SNR.LIZLLL;
        c11pq2.getClass();
        C19475711Hn c19475711Hn = new C19475711Hn(c11pq2);
        c1076480e7SNR.LIZIZ.G0();
        C19488511Ml c19488511MlLJ = C1024380clQ.LJ();
        C11PQ<AbstractC1076560e7a> c11pq3 = c1076480e7SNR.LJ;
        c11pq3.getClass();
        C11NZ c11nzLJJJJ = C11NZ.LJJJJ(c19475711Hn, c19488511MlLJ, new C19475711Hn(c11pq3));
        C1076630e7h c1076630e7h = C19487811Me.LIZ;
        c11nzLJJJJ.getClass();
        c1076480e7SNR.LIZJ.LIZ(c11nzLJJJJ.LJJIZ(3, C11NN.LL, c1076630e7h, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 33), new C09JN() { // from class: X.00Nd
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("WishListManager@8a.listenToLoadUrlResult$2");
                C1C7U.LIZIZ("WishListManager@8a.listenToLoadUrlResult$2");
            }
        }));
        NR().LIZIZ();
        AwS560S0100000_16 awS560S0100000_16 = this.LLILZLL;
        if (awS560S0100000_16 != null) {
            awS560S0100000_16.invoke();
        }
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_0, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
