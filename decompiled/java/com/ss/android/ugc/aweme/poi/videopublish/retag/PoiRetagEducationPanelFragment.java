package com.ss.android.ugc.aweme.poi.videopublish.retag;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1709006me;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.zhiliaoapp.musically.R;
import irm.AkS76S0100000_4;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class PoiRetagEducationPanelFragment extends BasePage implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGElISEpJj8mKiklHELIOSOid9OiA4KCh9GColGyonKSIJLTowKTElJiEDKSspJQkhKSIhLCEn";
    public C1709006me LLIZLLLIL;
    public C1709006me LLJ;
    public C1709006me LLJI;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 189));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (C1709006me) view.findViewById(R.id.w3x);
        this.LLJ = (C1709006me) view.findViewById(R.id.w3y);
        this.LLJI = (C1709006me) view.findViewById(R.id.w3z);
        C1709006me c1709006me = this.LLIZLLLIL;
        if (c1709006me != null) {
            c1709006me.LIZIZ(1);
        }
        C1709006me c1709006me2 = this.LLJ;
        if (c1709006me2 != null) {
            c1709006me2.LIZIZ(2);
        }
        C1709006me c1709006me3 = this.LLJI;
        if (c1709006me3 != null) {
            c1709006me3.LIZIZ(3);
        }
        View viewFindViewById = view.findViewById(R.id.cqt);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS76S0100000_4(this, 2), viewFindViewById);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e76, viewGroup, false);
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
