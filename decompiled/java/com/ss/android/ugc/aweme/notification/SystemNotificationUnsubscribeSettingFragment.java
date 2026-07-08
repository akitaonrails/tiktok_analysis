package com.ss.android.ugc.aweme.notification;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C0DXR;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C344700DfI;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC836760Ws6;
import Y.ACListenerS139S0100000_4;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC836760Ws6
public final class SystemNotificationUnsubscribeSettingFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8JmsfMDwnHELIOSLSgCJjs6LiwvKDs6JysZJzwmKjYvOyYxLRYpPTs6JiIKOy40JSAiPQ==";
    public TuxIconView LL;
    public RecyclerView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1745));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 180));

    public final RecyclerView MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LLILLJJLI = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            view2.setPadding(0, C497820Jfg.LIZJ(requireActivity()), 0, 0);
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LJ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.bn0);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById, new ACListenerS139S0100000_4(this, 111));
        MR().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerViewMR = MR();
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        recyclerViewMR.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0DfH
            public final int LL;

            {
                this.LL = iLIZIZ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view4, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                rect.bottom = this.LL;
            }
        });
        MR().setAdapter((AbstractC21673619ry) this.LLILZ.getValue());
        C344700DfI c344700DfI = (C344700DfI) this.LLILZ.getValue();
        c344700DfI.LLILLJJLI = (List) this.LLILLL.getValue();
        c344700DfI.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.abc, viewGroup, false);
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
