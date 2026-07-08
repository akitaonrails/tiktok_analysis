package com.ss.android.ugc.aweme.purchasepanel.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C11NJ;
import X.C13LE;
import X.C1614260s6q;
import X.C1615420s8i;
import X.C1615430s8j;
import X.C1616700sAm;
import X.C1616720sAo;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C2252321DDq;
import X.C23250099c;
import X.C336720DHy;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.EnumC452301pR;
import X.InterfaceC344240DeY;
import Y.AfS50S1100000_18;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PurchasePanelFragment extends Fragment implements InterfaceC344240DeY {
    public static final C1615420s8i LLILZIL = new C1615420s8i(0);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU5Oyw7KTYpOSHELIOS49LSliLz0yLygpJzt9GDA+KicyOyAcKCE2JAM+KCg+LSs4";
    public final Function0<Unit> LL = null;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 838));
    public final ViewModelLazy LLILLL;
    public final C11NJ LLILZ;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        return (C0OM1) this.LLILLJJLI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLILZ.dispose();
        super.onDestroy();
    }

    public PurchasePanelFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS568S0100000_24(new AwS568S0100000_24((Fragment) this, 1742), (Function0<Unit>) 1743));
        this.LLILLL = C336720DHy.LIZ(this, C13LE.LIZ(PurchasePanelViewModel.class), new AwS568S0100000_24(c01gwLIZ, 1744), new AwS405S0200000_4((Function0) null, c01gwLIZ, 42), new AwS405S0200000_4(this, c01gwLIZ, 43));
        this.LLILZ = new C11NJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxSheet tuxSheet;
        String string;
        super.onViewCreated(view, bundle);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.eoa);
        PurchasePanelViewModel purchasePanelViewModel = (PurchasePanelViewModel) this.LLILLL.getValue();
        C1615420s8i c1615420s8i = LLILZIL;
        C2252321DDq c2252321DDq = purchasePanelViewModel.LL;
        c2252321DDq.setValue(C1615430s8j.LIZ((C1615430s8j) c2252321DDq.getValue(), null, null, null, null, null, null, null, null, c1615420s8i, 511));
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("product_id")) != null) {
            C1614260s6q.LIZ.getClass();
            this.LLILZ.LIZ(C1614260s6q.LIZLLL.LJJLJLI(new AfS50S1100000_18(this, string, 5)));
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-454048477, new C1616700sAm(this, string), true));
        }
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && (tuxSheet = (TuxSheet) parentFragment) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1616720sAo(tuxSheet, this, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.duj, viewGroup, false);
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
