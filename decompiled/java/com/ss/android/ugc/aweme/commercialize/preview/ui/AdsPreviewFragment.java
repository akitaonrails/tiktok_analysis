package com.ss.android.ugc.aweme.commercialize.preview.ui;

import X.AbstractC2215911Bo5;
import X.C098200Yq;
import X.C09JN;
import X.C0C47;
import X.C0OM1;
import X.C1168050gV9;
import X.C1168060gVA;
import X.C11NZ;
import X.C11PQ;
import X.C11S5;
import X.C1237450iJ5;
import X.C1390410mHn;
import X.C13LE;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C189200o6;
import X.C19475711Hn;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C804420Vh2;
import X.InterfaceC1749320vcg;
import X.InterfaceC2215921Bo6;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import Y.AfS187S0100000_18;
import Y.AfS203S0100000_34;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class AdsPreviewFragment extends Fragment implements InterfaceC2215921Bo6 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCHELIOSM6MiBiOT02PiwpPmEmIWsNLTwDOiA6ICokDjctLiI2JjE=";
    public String LL;
    public C1749280vcc LLILLJJLI;
    public C1390410mHn LLILLL;
    public volatile AdsPreviewStateManager LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdsPreviewFragment.class, "adsPreviewStateManager", "getAdsPreviewStateManager()Lcom/ss/android/ugc/aweme/commercialize/preview/manager/AdsPreviewStateManager;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC2215921Bo6
    public final void HN() {
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
    }

    public final AdsPreviewStateManager MR() {
        AdsPreviewStateManager adsPreviewStateManager = this.LLILZ;
        if (adsPreviewStateManager == null) {
            synchronized (this) {
                adsPreviewStateManager = this.LLILZ;
                if (adsPreviewStateManager == null) {
                    AdsPreviewStateManager adsPreviewStateManager2 = new AdsPreviewStateManager();
                    this.LLILZ = adsPreviewStateManager2;
                    return adsPreviewStateManager2;
                }
            }
        }
        return adsPreviewStateManager;
    }

    @Override // X.InterfaceC2215921Bo6
    public final void c9() {
        Context context = getContext();
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (context == null || c1749280vcc == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = context.getResources().getString(2131825229);
        c1722300uv6.LJIIIIZZ = context.getResources().getString(2131825228);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_video;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZ(c419910GdJ);
        c1722300uv6.LJIIIZ = new AwS384S0200000_18(context, this, 25);
        c1749280vcc.setStatus(c1722300uv6);
    }

    @Override // X.InterfaceC2215921Bo6
    public final void gP() {
        MR().LLILLJJLI.LIZ(C11NZ.LJLJJLL(C0C47.LIZ().delayTimeInMillisecond, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS187S0100000_18(this, 6), new C09JN() { // from class: X.0gP2
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AdsPreviewFragment@968c.showPreviewSuccessView$2");
                C1C7U.LIZIZ("AdsPreviewFragment@968c.showPreviewSuccessView$2");
            }
        }));
    }

    @Override // X.InterfaceC2215921Bo6
    public final void hl() {
        boolean zLJFF = C804420Vh2.LJFF(getContext());
        Integer numValueOf = Integer.valueOf(R.attr.a1p);
        if (zLJFF) {
            Context context = getContext();
            C1749280vcc c1749280vcc = this.LLILLJJLI;
            if (context == null || c1749280vcc == null) {
                return;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = context.getResources().getString(2131825226);
            c1722300uv6.LJIIIIZZ = context.getResources().getString(2131825225);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_error_robot;
            c419910GdJ.LJ = numValueOf;
            c1722300uv6.LIZ(c419910GdJ);
            c1722300uv6.LJIIIZ = new AwS227S0300000_18(context, context, this, 10);
            c1749280vcc.setStatus(c1722300uv6);
            return;
        }
        Context context2 = getContext();
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (context2 == null || c1749280vcc2 == null) {
            return;
        }
        C1722300uv6 c1722300uv62 = new C1722300uv6();
        c1722300uv62.LJI = context2.getResources().getString(2131825222);
        c1722300uv62.LJIIIIZZ = context2.getResources().getString(2131825221);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_large_wifi_slash;
        c419910GdJ2.LJ = numValueOf;
        c1722300uv62.LIZ(c419910GdJ2);
        c1722300uv62.LJIIIZ = new AwS384S0200000_18(context2, this, 302);
        c1749280vcc2.setStatus(c1722300uv62);
    }

    @Override // X.InterfaceC2215921Bo6
    public final void xo() {
        Context context = getContext();
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (context == null || c1749280vcc == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = context.getResources().getString(2131825226);
        c1722300uv6.LJIIIIZZ = context.getResources().getString(2131825225);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_error_robot;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZ(c419910GdJ);
        c1722300uv6.LJIIIZ = new AwS227S0300000_18(context, context, this, 12);
        c1749280vcc.setStatus(c1722300uv6);
    }

    @Override // X.InterfaceC2215921Bo6
    public final void D9(String str) {
        Context context = getContext();
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (context != null && c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = str;
            c1722300uv6.LJIIIIZZ = context.getResources().getString(2131825225);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_error_robot;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZ(c419910GdJ);
            c1722300uv6.LJIIIZ = new AwS227S0300000_18(context, context, this, 11);
            c1749280vcc.setStatus(c1722300uv6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        View decorView;
        boolean z;
        super.onCreate(bundle);
        getLifecycle().addObserver(MR());
        AdsPreviewStateManager adsPreviewStateManagerMR = MR();
        String str = this.LL;
        adsPreviewStateManagerMR.LLILLL = this;
        C11PQ<AbstractC2215911Bo5> c11pq = adsPreviewStateManagerMR.LL;
        c11pq.getClass();
        adsPreviewStateManagerMR.LLILLJJLI.LIZ(new C19475711Hn(c11pq).LJJIFFI().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS203S0100000_34(adsPreviewStateManagerMR, 34), new C09JN() { // from class: X.00Nj
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AdsPreviewStateManager@b2cb.listenToStateChange$2");
                C1C7U.LIZIZ("AdsPreviewStateManager@b2cb.listenToStateChange$2");
            }
        }));
        if (str != null) {
            Uri uri = UriProtector.parse(str);
            String path = uri.getPath();
            String str2 = "";
            if (path == null) {
                path = "";
            }
            adsPreviewStateManagerMR.LLILZ = path;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "token");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            adsPreviewStateManagerMR.LLILZIL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ads_on_demand_query");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            }
            adsPreviewStateManagerMR.LLILZLL = str2;
            if (adsPreviewStateManagerMR.LLILZ.length() == 0) {
                adsPreviewStateManagerMR.LIZLLL(C1168050gV9.LIZ);
            } else {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("ads_on_demand_preview", true) && adsPreviewStateManagerMR.LLILZLL.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (adsPreviewStateManagerMR.LLILZIL.length() <= 0 && !z) {
                    adsPreviewStateManagerMR.LIZLLL(C1168050gV9.LIZ);
                } else {
                    adsPreviewStateManagerMR.LIZLLL(C1168060gVA.LIZ);
                    adsPreviewStateManagerMR.LLIZ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "search_query");
                }
            }
        } else {
            adsPreviewStateManagerMR.LIZLLL(C1168050gV9.LIZ);
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZLLL();
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(8192);
        }
        if (MR().LLILZLL.length() <= 0) {
            C20684815ws.onEventV3("ads_interface_qrcode_preview_scan");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.xzl);
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZ(c0om1, getString(2131825223), requireActivity());
        tuxNavBar.setNavActions(c0om1);
        this.LLILLL = (C1390410mHn) view.findViewById(R.id.nle);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w0t);
        c1749280vcc.LIZ(new InterfaceC1749320vcg() { // from class: X.0gV8
            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                C1390410mHn c1390410mHn = this.LIZ.LLILLL;
                if (c1390410mHn != null) {
                    c1390410mHn.LIZLLL();
                }
                C1390410mHn c1390410mHn2 = this.LIZ.LLILLL;
                if (c1390410mHn2 != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn2, 8);
                }
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                C1390410mHn c1390410mHn = this.LIZ.LLILLL;
                if (c1390410mHn != null) {
                    c1390410mHn.LIZJ();
                }
                C1390410mHn c1390410mHn2 = this.LIZ.LLILLL;
                if (c1390410mHn2 != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn2, 0);
                }
            }
        });
        this.LLILLJJLI = c1749280vcc;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c7z, viewGroup, false);
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
