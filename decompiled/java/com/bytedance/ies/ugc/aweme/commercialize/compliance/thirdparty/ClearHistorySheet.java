package com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C746410TPr;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS206S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ClearHistorySheet extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyHELIOSp9KyohOSM6KSsvLGEnICw+LT8yOjE1Zww/LSQ+ASYgPCo+MBw7LSA4";
    public C197039127h LL;
    public C197039127h LLILLJJLI;
    public C19EG LLILLL;
    public ComplianceVM LLILZ;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C19EG c19eg = this.LLILLL;
        if (c19eg == null) {
            c19eg = null;
        }
        String string = c19eg.getString(2131847756);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 353));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG c19eg = this.LLILLL;
        View viewFindViewById = null;
        if (c19eg == null) {
            c19eg = null;
        }
        ComplianceVM complianceVMLIZ = C746410TPr.LIZ(c19eg);
        this.LLILZ = complianceVMLIZ;
        if (complianceVMLIZ == null) {
            complianceVMLIZ = null;
        }
        complianceVMLIZ.LLILZ.observe(getViewLifecycleOwner(), new AObserverS206S0100000_2(this, 20));
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.e0a);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (C197039127h) viewFindViewById2;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById2, new ACListenerS147S0100000_12(this, 426));
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.e0_);
            }
            this.LLILLJJLI = (C197039127h) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.U8((C197039127h) view3, new ACListenerS147S0100000_12(this, 427));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ft3, viewGroup, false);
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
