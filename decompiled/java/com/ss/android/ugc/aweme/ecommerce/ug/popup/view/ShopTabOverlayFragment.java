package com.ss.android.ugc.aweme.ecommerce.ug.popup.view;

import X.C034S;
import X.C098200Yq;
import X.C1120604Zw;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1740300vO8;
import X.C1740370vOF;
import X.C1740450vON;
import X.C1766560w4U;
import X.C1766570w4V;
import X.C189200o6;
import X.C1896207bk;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2211621BhA;
import X.C2211631BhB;
import X.C2211641BhC;
import X.C786410Ut5;
import X.C948503nH;
import X.InterfaceC1713406nM;
import X.InterfaceC1740760vOs;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallLandingDeeplinkFallbackModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopTabOverlayFragment extends SAFTikTokFragment implements InterfaceC1740760vOs, InterfaceC1713406nM {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEmHELIOSL2s8Jj8mOGs6ICokZhYkJj8HKScDPyohJCQ1Dz0yLygpJzs=";
    public FrameLayout LLJILLL;

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "ShopTabOverlayFragment";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public ShopTabOverlayFragment() {
        aS(AFwS268S0000000_26.get$arr$(304));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C2211641BhC c2211641BhC;
        super.onResume();
        View view = getView();
        if (view != null) {
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, null);
            if (c2211641BhCLIZLLL == null || (c2211641BhC = C2211621BhA.LJ) == null || !c2211641BhC.LJJIIZ) {
                return;
            }
            c2211641BhCLIZLLL.LIZLLL(c2211641BhC);
            C2211621BhA.LJ = null;
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC1713406nM
    public final void Dc() {
        finish();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IECommerceHostService iECommerceHostService;
        String string;
        boolean z;
        String name;
        C2211631BhB.LJIIL(this, null);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(false);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        tuxImmersionBarLIZLLL.LIZLLL();
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.mek);
            } else {
                viewFindViewById = null;
            }
            this.LLJILLL = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 21), viewFindViewById);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        IApplicationDependencyService iApplicationDependencyService = (IApplicationDependencyService) iECommerceHostService;
        if (iApplicationDependencyService.isOffline() || iApplicationDependencyService.isRegressionTest()) {
            View viewFindViewById2 = this.LLJILLL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.mek);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILLL = (FrameLayout) viewFindViewById2;
            }
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
            TuxTextView tuxTextView = new TuxTextView(requireActivity(), null, 6, 0);
            tuxTextView.setText("ShopTabOverlayFragment");
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bt, tuxTextView.getContext());
            if (numLIZJ != null) {
                tuxTextView.setBackgroundColor(numLIZJ.intValue());
            }
            viewGroup.addView(tuxTextView, new ViewGroup.LayoutParams(-2, -2));
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("extra_landing_deeplink")) == null) {
            string = "";
        }
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.LJ(null, string);
        }
        EcUgMallLandingDeeplinkFallbackModel ecUgMallLandingDeeplinkFallbackModelLIZ = C1740370vOF.LIZ();
        if (ecUgMallLandingDeeplinkFallbackModelLIZ.enableMonitorLifecycleCallback) {
            C948503nH.LJIIIIZZ(this, new C1740450vON(ecUgMallLandingDeeplinkFallbackModelLIZ, this, string, null));
        } else {
            C1740300vO8 c1740300vO8 = C1740300vO8.LIZ;
            C19EG activity = getActivity();
            c1740300vO8.getClass();
            if (!C1740300vO8.LJFF(activity, string, true, true, false)) {
                finish();
            }
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1766570w4V c1766570w4V = C1766570w4V.LIZ;
            C1896207bk c1896207bk = new C1896207bk(activity2);
            c1766570w4V.getClass();
            C1766570w4V.LIZ(c1896207bk);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bsr, viewGroup, false);
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
