package com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19298010eg;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C1A4G;
import X.C1A4I;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS167S0100000_33;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateCTNViewModel;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateMonthFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class AgeGateMonthFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KSIpLiHELIOS4nLWsvJi4hOyA4JiEyOjcjPmESLyALKDs2BSoiPScVOiQrJCo9PA==";
    public GridView LLIZ;
    public C197039127h LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 421));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (((AgeGateCTNViewModel) this.LLJ.getValue()).LLJI) {
            return;
        }
        ((AgeGateCTNViewModel) this.LLJ.getValue()).LLJI = true;
        C19298010eg.LIZJ("month");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final List listLJIIJJI = C1697810uHb.LJIIJJI(requireContext().getResources().getString(2131829579), requireContext().getResources().getString(2131829578), requireContext().getResources().getString(2131829582), requireContext().getResources().getString(2131829575), requireContext().getResources().getString(2131829583), requireContext().getResources().getString(2131829581), requireContext().getResources().getString(2131829580), requireContext().getResources().getString(2131829576), requireContext().getResources().getString(2131829586), requireContext().getResources().getString(2131829585), requireContext().getResources().getString(2131829584), requireContext().getResources().getString(2131829577));
        View viewFindViewById = this.LLIZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.j5r);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (GridView) viewFindViewById;
        }
        ((GridView) viewFindViewById).setAdapter((ListAdapter) new C1A4G(requireContext(), listLJIIJJI, requireActivity(), new C1A4I() { // from class: X.1A4E
            @Override // X.C1A4I
            public final void LIZ(String str) {
                ((AgeGateCTNViewModel) this.LIZ.LLJ.getValue()).LLILZLL = listLJIIJJI.indexOf(str);
                AgeGateMonthFragment ageGateMonthFragment = this.LIZ;
                View viewFindViewById3 = ageGateMonthFragment.LLIZLLLIL;
                if (viewFindViewById3 == null) {
                    View view3 = ageGateMonthFragment.getView();
                    if (view3 != null) {
                        viewFindViewById3 = view3.findViewById(R.id.d6s);
                    } else {
                        viewFindViewById3 = null;
                    }
                    ageGateMonthFragment.LLIZLLLIL = (C197039127h) viewFindViewById3;
                }
                viewFindViewById3.setClickable(false);
                C19298010eg.LIZIZ(1, "month");
            }
        }));
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.d6s);
            }
            this.LLIZLLLIL = (C197039127h) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.U8((C197039127h) view3, new ACListenerS167S0100000_33(this, 33));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dxe, viewGroup, false);
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
