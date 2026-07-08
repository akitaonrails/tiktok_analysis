package com.ss.android.ugc.aweme.journey.step.deeplink;

import X.C098200Yq;
import X.C10H5;
import X.C10Q3;
import X.C10QS;
import X.C10SU;
import X.C10SW;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1848530yCh;
import X.C1869040yjm;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.journey.events.ShowDeeplinkEvent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class DeeplinkComponent extends NUJComponentFragment {
    public static boolean LLJIJIL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiHELIOSOjs2OGsoLCojJCwiImEXLSA8JSY9IwYjJD88JiAiPQ==";
    public C1749280vcc LLJI;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String authority;
        Uri data;
        Uri data2;
        C10Q3 c10q3;
        View viewFindViewById = this.LLJI;
        Intent intent = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.nne);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (C1749280vcc) viewFindViewById;
        }
        C1749280vcc c1749280vcc = (C1749280vcc) viewFindViewById;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C1848530yCh.LIZLLL(this, "page_nuj_deeplink", null);
        C1869040yjm c1869040yjmPR = PR();
        if ((c1869040yjmPR instanceof C10Q3) && (c10q3 = (C10Q3) c1869040yjmPR) != null) {
            intent = c10q3.LIZIZ;
        }
        ShowDeeplinkEvent showDeeplinkEvent = new ShowDeeplinkEvent();
        if (intent == null || (data2 = intent.getData()) == null || (authority = data2.getAuthority()) == null) {
            authority = "";
        }
        showDeeplinkEvent.LJI(authority, "deeplink_uri");
        showDeeplinkEvent.LJIIIIZZ();
        if (intent != null && (data = intent.getData()) != null) {
            C10SW.LIZ.LJII(data);
        }
        C19EG activity = getActivity();
        if (intent != null && intent.getData() != null && activity != null) {
            LLJIJIL = true;
            C10SU.LIZ(activity, intent, new AwS572S0100000_28(this, 274));
        } else {
            NR(Boolean.TRUE);
            C10QS.LIZ.onEventV3(C10H5.DEEPLINK_EMPTY);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cz_, viewGroup, false);
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
