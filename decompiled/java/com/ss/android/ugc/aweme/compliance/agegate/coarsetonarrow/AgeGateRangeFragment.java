package com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19298010eg;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS167S0100000_33;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class AgeGateRangeFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KSIpLiHELIOS4nLWsvJi4hOyA4JiEyOjcjPmESLyALKDs2GiQiLioVOiQrJCo9PA==";
    public C197039127h LLIZ;
    public C197039127h LLIZLLLIL;
    public C197039127h LLJ;
    public C197039127h LLJI;
    public C197039127h LLJIJIL;
    public C197039127h LLJILJIL;
    public C197039127h LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 422));

    public final C197039127h SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sq2) : null;
            this.LLIZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h UR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sq3) : null;
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sq4) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h WR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sq5) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h ZR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sq6) : null;
            this.LLJIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h aS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sq7) : null;
            this.LLJILJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h bS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sq8) : null;
            this.LLJILJILJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final AgeGateCTNViewModel cS() {
        return (AgeGateCTNViewModel) this.LLJILLL.getValue();
    }

    public final void dS() {
        SR().setClickable(false);
        UR().setClickable(false);
        VR().setClickable(false);
        WR().setClickable(false);
        ZR().setClickable(false);
        aS().setClickable(false);
        bS().setClickable(false);
        cS().vQ2(1);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (cS().LLIZLLLIL) {
            return;
        }
        cS().LLIZLLLIL = true;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("user_type", "existing", bundle);
        C19298010eg.LIZLLL("age_range_select_show", bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.U8(SR(), new ACListenerS167S0100000_33(this, 34));
        C786410Ut5.U8(UR(), new ACListenerS167S0100000_33(this, 35));
        C786410Ut5.U8(VR(), new ACListenerS167S0100000_33(this, 36));
        C786410Ut5.U8(WR(), new ACListenerS167S0100000_33(this, 37));
        C786410Ut5.U8(ZR(), new ACListenerS167S0100000_33(this, 38));
        C786410Ut5.U8(aS(), new ACListenerS167S0100000_33(this, 39));
        C786410Ut5.U8(bS(), new ACListenerS167S0100000_33(this, 40));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dxf, viewGroup, false);
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
