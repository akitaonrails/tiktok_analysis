package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC446950Hfp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService;
import com.ss.android.ugc.tiktok.privacy.api.phl.vm.PhlViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes7.dex */
public final class PhlAccountFlowFragment extends BaseAccountFlowFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZhUkJQ4wKyo5JzsVJCo7Dz0yLygpJzs=";
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 24));

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "PhlAccountFlowFragment";
    }

    @Override // X.C0XYD
    public final void dk(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC446950Hfp interfaceC446950Hfp;
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("phl_fragment");
        Fragment fragment = fragmentLJJJJZI;
        if (fragmentLJJJJZI == null) {
            IPrivacyHighlightService iPrivacyHighlightService = (IPrivacyHighlightService) PluggableExtentionKt.pluggableSpi$default(IPrivacyHighlightService.class, false, false, false, 14, null);
            if (iPrivacyHighlightService != null) {
                Fragment fragmentLJ = iPrivacyHighlightService.LJ();
                fragment = fragmentLJ;
                if (fragmentLJ == null) {
                    return;
                }
            } else {
                return;
            }
        }
        if (fragment.isAdded()) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJJIFFI(fragment);
            c19ehLJIIJ.LJIIJ();
        } else {
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ2.LIZJ(R.id.tqy, fragment, "phl_fragment");
            c19ehLJIIJ2.LJIIJ();
        }
        if ((fragment instanceof InterfaceC446950Hfp) && (interfaceC446950Hfp = (InterfaceC446950Hfp) fragment) != null) {
            interfaceC446950Hfp.Oc(new AwS557S0100000_13(this, 80));
        }
        ((PhlViewModel) this.LLJJJJ.getValue()).vQ2();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.y9, viewGroup, false);
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
