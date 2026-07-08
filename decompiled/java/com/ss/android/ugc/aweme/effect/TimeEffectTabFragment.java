package com.ss.android.ugc.aweme.effect;

import X.C098200Yq;
import X.C0F4X;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C189200o6;
import X.C19394710uH;
import X.C19415110xZ;
import X.C19415210xa;
import X.C19471411Fw;
import X.C19558011fW;
import X.C19EG;
import X.C19GS;
import X.C424200GkE;
import X.C425240Glu;
import X.C786410Ut5;
import X.InterfaceC1452170ntP;
import X.InterfaceC19558511fb;
import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public final class TimeEffectTabFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAqHELIOSLyowPGsYICI2DSMqLCwnHCQuDz0yLygpJzs=";
    public C424200GkE LL;
    public C425240Glu LLILLJJLI;
    public C19471411Fw LLILLL;
    public boolean LLILZ = true;
    public C19415210xa LLILZIL;
    public EditEffectVideoModel LLILZLL;

    public final int NR() {
        LiveData<InterfaceC1452170ntP> liveDataLIZIZ;
        InterfaceC1452170ntP value;
        EditEffectVideoModel editEffectVideoModel = this.LLILZLL;
        if (editEffectVideoModel == null) {
            editEffectVideoModel = null;
        }
        InterfaceC19558511fb interfaceC19558511fbVQ2 = editEffectVideoModel.vQ2();
        if (interfaceC19558511fbVQ2 == null || (liveDataLIZIZ = interfaceC19558511fbVQ2.LIZIZ()) == null || (value = liveDataLIZIZ.getValue()) == null) {
            return 0;
        }
        return value.mo51if();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    public final void MR(boolean z, boolean z2) {
        C19415210xa c19415210xa = this.LLILZIL;
        if (c19415210xa != null) {
            ArrayList<EffectModel> arrayListLJ = C0F4X.LJ();
            c19415210xa.LL = arrayListLJ;
            ((EffectModel) ListProtector.get(arrayListLJ, 1)).isEnabled = z;
            ((EffectModel) ListProtector.get(c19415210xa.LL, 2)).isEnabled = z2;
            ((EffectModel) ListProtector.get(c19415210xa.LL, 3)).isEnabled = z2;
            c19415210xa.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EditEffectVideoModel editEffectVideoModel = null;
        this.LLILZLL = (EditEffectVideoModel) C1659630tI1.LJII(view, null, 6).get(EditEffectVideoModel.class);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.z3b);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C424200GkE) viewFindViewById;
        }
        C786410Ut5.d1((C424200GkE) viewFindViewById, 8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(0);
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.t11);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (C425240Glu) viewFindViewById2;
        }
        ((RecyclerView) viewFindViewById2).setLayoutManager(linearLayoutManager);
        C19415210xa c19415210xa = new C19415210xa();
        this.LLILZIL = c19415210xa;
        boolean zLJ = C19558011fW.LJ(NR());
        ArrayList<EffectModel> arrayListLJ = C0F4X.LJ();
        c19415210xa.LL = arrayListLJ;
        if (zLJ) {
            ((EffectModel) ListProtector.get(arrayListLJ, 2)).isEnabled = false;
            ((EffectModel) ListProtector.get(c19415210xa.LL, 3)).isEnabled = false;
        }
        c19415210xa.LLILLJJLI = new C19415110xZ(this);
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.t11);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (C425240Glu) viewFindViewById3;
        }
        ((RecyclerView) viewFindViewById3).setAdapter(c19415210xa);
        if (getActivity() != null) {
            EditEffectVideoModel editEffectVideoModel2 = this.LLILZLL;
            if (editEffectVideoModel2 == null) {
                editEffectVideoModel2 = null;
            }
            editEffectVideoModel2.CQ2().observe(this, new AObserverS231S0100000_29(this, 47));
            EditEffectVideoModel editEffectVideoModel3 = this.LLILZLL;
            if (editEffectVideoModel3 == null) {
                editEffectVideoModel3 = null;
            }
            editEffectVideoModel3.CQ2().setValue(new C19394710uH(NR(), 0));
            EditEffectVideoModel editEffectVideoModel4 = this.LLILZLL;
            if (editEffectVideoModel4 == null) {
                editEffectVideoModel4 = null;
            }
            editEffectVideoModel4.vQ2().LJII().observe(this, new AObserverS231S0100000_29(c19415210xa, 48));
            EditEffectVideoModel editEffectVideoModel5 = this.LLILZLL;
            if (editEffectVideoModel5 != null) {
                editEffectVideoModel = editEffectVideoModel5;
            }
            editEffectVideoModel.vQ2().LJIIIZ().observe(this, new AObserverS231S0100000_29(c19415210xa, 49));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8l, viewGroup, false);
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
