package com.ss.android.ugc.aweme.publicgroup.fragment;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19737012Ka;
import X.C19EG;
import X.C19GS;
import X.C492360JSo;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS74S0300000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class AccessCriteriaPickerFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU5KyM6KyI+JjojZiHELIOSM+KCg+LSs4Zw4wKyA/OgwhITEpOyYyGCwvIiohDjctLiI2JjE=";
    public C492360JSo LL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String str;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        C492360JSo c492360JSo = this.LL;
        if (c492360JSo == null || (str = c492360JSo.LIZJ) == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS551S0100000_7(this, 414));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ci0, viewGroup, false);
        C492360JSo c492360JSo = this.LL;
        if (c492360JSo != null) {
            C19737012Ka c19737012Ka = (C19737012Ka) viewTd.findViewById(R.id.qff);
            c19737012Ka.LIZLLL(c492360JSo.LIZ);
            C492360JSo c492360JSo2 = this.LL;
            if (c492360JSo2 != null) {
                c19737012Ka.LJI(c492360JSo2.LJI);
            }
            C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.clq);
            c197039127h.setButtonVariant(c492360JSo.LJ);
            c197039127h.setButtonSize(c492360JSo.LJFF);
            c197039127h.setText(c492360JSo.LIZLLL);
            C786410Ut5.U8(c197039127h, new ACListenerS74S0300000_7(c492360JSo, c19737012Ka, this, 3));
        }
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
