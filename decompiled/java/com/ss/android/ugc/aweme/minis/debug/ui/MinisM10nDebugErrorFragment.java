package com.ss.android.ugc.aweme.minis.debug.ui;

import X.AbstractC1882107Yt;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19398210uq;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C786410Ut5;
import X.InterfaceC19399710v5;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class MinisM10nDebugErrorFragment extends Fragment {
    public Context LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public C197039127h LLILZIL;
    public RecyclerView LLILZLL;
    public C19398210uq LLIZ;
    public InterfaceC19399710v5 LLIZLLLIL;
    public M10nMockDebugErrorInfo LLJ;
    public final ACListenerS163S0100000_29 LLJI = new ACListenerS163S0100000_29(this, 62);

    public abstract List<AbstractC1882107Yt> MR();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = requireContext();
        this.LLILLJJLI = view;
        View viewFindViewById = view.findViewById(R.id.jyv);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(this.LLJI, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.jzi);
        this.LLILZ = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(this.LLJI, viewFindViewById2);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.whh);
        this.LLILZIL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, this.LLJI);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.t0u);
        this.LLILZLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.LL));
        }
        C19398210uq c19398210uq = new C19398210uq(new AwS608S0100000_29(this, 535));
        this.LLIZ = c19398210uq;
        RecyclerView recyclerView2 = this.LLILZLL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c19398210uq);
        }
        int i = C2187451AjH.LIZ;
        List<AbstractC1882107Yt> listMR = MR();
        C19398210uq c19398210uq2 = this.LLIZ;
        if (c19398210uq2 != null) {
            ((ArrayList) c19398210uq2.LLILLJJLI).clear();
            ((ArrayList) c19398210uq2.LLILLJJLI).addAll(listMR);
            c19398210uq2.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dn1, viewGroup, false);
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
