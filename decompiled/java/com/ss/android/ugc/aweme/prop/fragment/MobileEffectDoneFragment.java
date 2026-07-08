package com.ss.android.ugc.aweme.prop.fragment;

import X.C098200Yq;
import X.C0WZX;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2204961BRm;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1737690vJv;
import Y.ACListenerS154S0100000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MobileEffectDoneFragment extends Fragment implements InterfaceC1737690vJv {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjHELIOSctLiI2JjFiBCAxISkpDCk1LSY4DSA9LQM+KCg+LSs4";

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJJ(activity, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A2iDFBuAUxrsQqZ8H6v+gJIllebglNlyb9dD+p3ZTvuqt", null));
        }
        C19EG activity2 = getActivity();
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EffectDoneInitState effectDoneInitState;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (effectDoneInitState = (EffectDoneInitState) arguments.getParcelable("mobile_effect_done_state")) != null) {
            C723850SaN.LIZ(this, false, null, new AwS385S0200000_19(this, effectDoneInitState, 40), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c91, viewGroup, false);
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 124), viewTd.findViewById(R.id.e1v));
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
