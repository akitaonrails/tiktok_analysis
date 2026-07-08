package com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
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
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateYearFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class AgeGateYearFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KSIpHELIOSLi4nLWsvJi4hOyA4JiEyOjcjPmESLyALKDs2ESAtOwkhKSIhLCEn";
    public GridView LLIZ;
    public C197039127h LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 423));

    public final AgeGateCTNViewModel SR() {
        return (AgeGateCTNViewModel) this.LLJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (SR().LLJ) {
            return;
        }
        SR().LLJ = true;
        C19298010eg.LIZJ("year");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList arrayList = new ArrayList();
        int min$pns_age_gate_compliance_release = SR().LLJILJILJ.getMin$pns_age_gate_compliance_release();
        int max$pns_age_gate_compliance_release = SR().LLJILJILJ.getMax$pns_age_gate_compliance_release();
        if (min$pns_age_gate_compliance_release <= max$pns_age_gate_compliance_release) {
            while (true) {
                arrayList.add(String.valueOf(Calendar.getInstance().get(1) - min$pns_age_gate_compliance_release));
                if (min$pns_age_gate_compliance_release == max$pns_age_gate_compliance_release) {
                    break;
                } else {
                    min$pns_age_gate_compliance_release++;
                }
            }
        }
        View viewFindViewById = this.LLIZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.yearGrid);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (GridView) viewFindViewById;
        }
        ((GridView) viewFindViewById).setAdapter((ListAdapter) new C1A4G(requireContext(), arrayList, requireActivity(), new C1A4I() { // from class: X.1A4L
            @Override // X.C1A4I
            public final void LIZ(String str) {
                this.LIZ.SR().LLILZIL = CastIntegerProtector.parseInt(str);
                AgeGateYearFragment ageGateYearFragment = this.LIZ;
                View viewFindViewById3 = ageGateYearFragment.LLIZLLLIL;
                if (viewFindViewById3 == null) {
                    View view3 = ageGateYearFragment.getView();
                    if (view3 != null) {
                        viewFindViewById3 = view3.findViewById(R.id.d6s);
                    } else {
                        viewFindViewById3 = null;
                    }
                    ageGateYearFragment.LLIZLLLIL = (C197039127h) viewFindViewById3;
                }
                viewFindViewById3.setClickable(false);
                C19298010eg.LIZIZ(1, "year");
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
        C786410Ut5.U8((C197039127h) view3, new ACListenerS167S0100000_33(this, 41));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dxg, viewGroup, false);
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
