package com.ss.android.ugc.aweme.account.login.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1748570vbT;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20469080d;
import X.C2280601EOk;
import X.C786410Ut5;
import X.InterfaceC1748590vbV;
import X.InterfaceC344240DeY;
import Y.AComparatorS523S0100000_26;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CountryListSheetFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJSA0IStiPCZ9Cyo5JzshMQklOjsAICApPQkhKSIhLCEn";
    public RecyclerView LLIZ;
    public final ArrayList<C2280601EOk> LLIZLLLIL = new ArrayList<>();

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(R.string.f99);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 112));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2280601EOk c2280601EOk = C2280601EOk.LJFF;
        requireContext();
        C20469080d.LIZ();
        ArrayList<C2280601EOk> arrayList = new ArrayList(C2280601EOk.LJI);
        for (C2280601EOk c2280601EOk2 : arrayList) {
            c2280601EOk2.LIZIZ = getString(c2280601EOk2.LIZ).substring(0, 1);
        }
        Collections.sort(arrayList, new AComparatorS523S0100000_26(this, 3));
        this.LLIZLLLIL.addAll(arrayList);
        C1748570vbT c1748570vbT = new C1748570vbT(this.LLIZLLLIL);
        c1748570vbT.LLILZ = new InterfaceC1748590vbV() { // from class: X.0vbR
            @Override // X.InterfaceC1748590vbV
            public final void LIZ(C2280601EOk c2280601EOk3) {
                if (c2280601EOk3 != null) {
                    C1238280iKQ.LIZ(c2280601EOk3);
                }
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this.LIZ, C343970De7.LIZ);
            }
        };
        View viewFindViewById = this.LLIZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.f20);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (RecyclerView) viewFindViewById;
        }
        ((RecyclerView) viewFindViewById).setLayoutManager(new LinearLayoutManager(requireContext()));
        View view3 = this.LLIZ;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.f20);
            }
            this.LLIZ = (RecyclerView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        ((RecyclerView) view3).setAdapter(c1748570vbT);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.y2, viewGroup, false);
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
