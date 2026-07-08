package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku;

import X.C098200Yq;
import X.C09R4;
import X.C09RB;
import X.C0D8X;
import X.C0DD5;
import X.C0DDH;
import X.C0DGG;
import X.C11BJ;
import X.C1203340hQ4;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21578619ce;
import X.C23250099c;
import X.C333480D5m;
import X.C786410Ut5;
import X.InterfaceC1023590ck9;
import X.InterfaceC1670800ta2;
import X.InterfaceC333090D3z;
import Y.ACListenerS139S0100000_4;
import Y.ATListenerS438S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BaseBottomSheetFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SkuBottomSheetFragment extends BaseBottomSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjHELIOSZiwhOSN9PSxiOS40LTZiOiQmZhYnPA08PDEjJBw7LSA4Dz0yLygpJzs=";
    public PdpViewModel LLILLJJLI;
    public ImageView LLILLL;
    public RecyclerView LLILZ;
    public C0DGG LLILZIL;
    public C21578619ce LLILZLL;
    public C11BJ LLIZ;
    public float LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TextView LLJIJIL;
    public TextView LLJILJIL;
    public View LLJILJILJ;
    public TextView LLJILLL;
    public View LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public C1203340hQ4 LLJJIJI;
    public TextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public TextView LLJJJIL;
    public TextView LLJJJJ;
    public TextView LLJJJJJIL;
    public C0DD5 LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BaseBottomSheetFragment
    public final double NR() {
        return 0.85d;
    }

    public final InterfaceC333090D3z PR() {
        InterfaceC333090D3z interfaceC333090D3z = (InterfaceC333090D3z) C09RB.LJIIL(C09RB.LJIIIZ(C09R4.LJ(AFwS232S0000000_4.get$arr$(28), getParentFragment()), new Function1<Object, Boolean>() { // from class: X.0DDv
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof InterfaceC333090D3z);
            }
        }));
        if (interfaceC333090D3z != null) {
            return interfaceC333090D3z;
        }
        List<Fragment> listLJJLIIIJL = getParentFragmentManager().LJJLIIIJL();
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : listLJJLIIIJL) {
            if (fragment instanceof InterfaceC333090D3z) {
                arrayList.add(fragment);
            }
        }
        InterfaceC333090D3z interfaceC333090D3z2 = (InterfaceC333090D3z) C13LP.LJJJLL(arrayList);
        if (interfaceC333090D3z2 != null) {
            return interfaceC333090D3z2;
        }
        InterfaceC1670800ta2 activity = getActivity();
        if (activity instanceof InterfaceC333090D3z) {
            return (InterfaceC333090D3z) activity;
        }
        return null;
    }

    public final CommonAdData RR() {
        InterfaceC333090D3z interfaceC333090D3zPR = PR();
        if (interfaceC333090D3zPR != null) {
            return interfaceC333090D3zPR.ee();
        }
        return null;
    }

    public final InterfaceC1023590ck9 SR() {
        InterfaceC333090D3z interfaceC333090D3zPR = PR();
        if (interfaceC333090D3zPR != null) {
            return interfaceC333090D3zPR.g4();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        ViewModelStoreOwner viewModelStoreOwnerLIZ = C0DDH.LIZ(this);
        if (viewModelStoreOwnerLIZ == null) {
            return;
        }
        PdpViewModel pdpViewModel = (PdpViewModel) new ViewModelProvider(viewModelStoreOwnerLIZ).get(PdpViewModel.class);
        this.LLILLJJLI = pdpViewModel;
        if (pdpViewModel == null) {
            return;
        }
        if (view.findViewById(R.id.m7s) != null) {
            this.LLJJJJLIIL = new C0DD5(requireActivity(), view, pdpViewModel);
        } else {
            C0D8X.LIZIZ().e();
        }
        this.LLILZLL = (C21578619ce) view.findViewById(R.id.u2m);
        this.LLILLL = (ImageView) view.findViewById(R.id.lol);
        this.LLILZ = (RecyclerView) view.findViewById(R.id.tw1);
        this.LLIZ = (C11BJ) view.findViewById(R.id.skz);
        this.LLJ = (TuxTextView) view.findViewById(R.id.z5i);
        this.LLJI = (TuxTextView) view.findViewById(R.id.z51);
        this.LLJIJIL = (TextView) view.findViewById(R.id.z3i);
        this.LLJILJIL = (TextView) view.findViewById(R.id.z5o);
        this.LLJILJILJ = view.findViewById(R.id.n_w);
        this.LLJILLL = (TextView) view.findViewById(R.id.z42);
        this.LLJJ = view.findViewById(R.id.n_8);
        this.LLJJI = (TextView) view.findViewById(R.id.z5l);
        this.LLJJIII = (TextView) view.findViewById(R.id.z5u);
        this.LLJJIJI = (C1203340hQ4) view.findViewById(R.id.sre);
        this.LLJJIJIIJIL = (TextView) view.findViewById(R.id.z65);
        this.LLJJIJIL = view.findViewById(R.id.n_x);
        this.LLJJJ = view.findViewById(R.id.jt5);
        this.LLJJJIL = (TextView) view.findViewById(R.id.z2f);
        this.LLJJJJ = (TextView) view.findViewById(R.id.z2e);
        this.LLJJJJJIL = (TextView) view.findViewById(R.id.z2g);
        this.LLILZIL = new C0DGG();
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            recyclerView.setLayoutDirection(3);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
            recyclerView.setAdapter(this.LLILZIL);
            recyclerView.setOverScrollMode(2);
            recyclerView.setItemAnimator(null);
        }
        View viewFindViewById = view.findViewById(R.id.y91);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new ATListenerS438S0100000_4(this, 1));
        }
        C11BJ c11bj = this.LLIZ;
        if (c11bj != null) {
            c11bj.setQuantity(1);
            c11bj.setInputEnabled(true);
            c11bj.setOnTapMinus(new AwS548S0100000_4(this, 507));
            c11bj.setOnTapPlus(new AwS548S0100000_4(this, 508));
            c11bj.setOnQuantityChanged(new AwS583S0100000_4(this, 312));
            c11bj.setOnCommitInput(new AwS583S0100000_4(this, 313));
        }
        View viewFindViewById2 = view.findViewById(R.id.cp0);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS139S0100000_4(this, 95), viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.l5m);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS139S0100000_4(this, 96), viewFindViewById3);
        }
        PdpViewModel pdpViewModel2 = this.LLILLJJLI;
        if (pdpViewModel2 != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C333480D5m(pdpViewModel2, this, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i5k, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            viewTd.setLayoutDirection(3);
            viewTd.setTextDirection(5);
        } else {
            viewTd = null;
        }
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
