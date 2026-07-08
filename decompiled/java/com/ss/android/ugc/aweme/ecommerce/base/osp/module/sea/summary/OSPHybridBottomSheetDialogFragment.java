package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary;

import X.AnonymousClass0317;
import X.C034S;
import X.C098200Yq;
import X.C0OM1;
import X.C1120604Zw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1685300txQ;
import X.C189200o6;
import X.C1943307jL;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C786410Ut5;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OSPHybridBottomSheetDialogFragment extends CommerceBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGshJismJCHELIOSBiOioyZjY5JCIyOjxiBhwDADwuOyY3Cio4PSA+Gy0pLDsXISQgJigVOiQrJCo9PA==";
    public final String LLJI;
    public final String LLJIJIL;
    public TuxNavBar LLJILJIL;
    public FrameLayout LLJILJILJ;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    public OSPHybridBottomSheetDialogFragment(String str, String str2) {
        super(0);
        this.LLJI = str;
        this.LLJIJIL = str2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        View viewFindViewById;
        boolean z;
        String name;
        super.onViewCreated(view, bundle);
        View viewFindViewById2 = this.LLJILJIL;
        View viewFindViewById3 = null;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.y08);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJILJIL = (TuxNavBar) viewFindViewById2;
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LLJI;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 112));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        ((TuxNavBar) viewFindViewById2).setNavActions(c0om1);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        Uri uriLIZ = C1943307jL.LIZ(((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).bulletUriOrdToNew(this.LLJIJIL), "aweme");
        if (this.LLJILJILJ == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.vsu);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJILJ = (FrameLayout) viewFindViewById;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context contextRequireContext = requireContext();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(uriLIZ.toString());
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(contextRequireContext, sparkContext).LIZ(false);
        C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new FrameLayout.LayoutParams(-1, -1));
        View view4 = this.LLJILJILJ;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById3 = view5.findViewById(R.id.vsu);
            }
            this.LLJILJILJ = (FrameLayout) viewFindViewById3;
            view4 = viewFindViewById3;
        }
        ((ViewGroup) view4).addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.apv, viewGroup, false);
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
