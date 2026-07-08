package com.ss.android.ugc.aweme.journey.step.privatetips;

import X.C098200Yq;
import X.C10U5;
import X.C1685300txQ;
import X.C1848530yCh;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C616540OGe;
import X.InterfaceC341040DYo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivateAccountTipsFragment extends NUJComponentFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGs8HELIOSOyYlKTEpPSYjO2scOyYlKTEpCCwwJzAiPRs6ODYKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C10U5.LIZIZ.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PrivateAccountTipsFragment.class.getName());
        }
        super.onResume();
        C10U5.LIZIZ.onResume();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C10U5.LIZIZ.onStop();
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10U5.LIZIZ.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1848530yCh.LIZLLL(this, "page_nuj_private_account_hint", null);
        C10U5.LIZIZ.LIZIZ(view, new InterfaceC341040DYo() { // from class: X.10U7
            @Override // X.InterfaceC341040DYo
            public final void next() {
                this.LIZ.NR(null);
            }
        });
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ = C10U5.LIZIZ.LIZ(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
