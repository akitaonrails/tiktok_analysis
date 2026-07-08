package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.AbstractC1636650sgx;
import X.C098200Yq;
import X.C0DXR;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11NZ;
import X.C11RK;
import X.C1630880sXe;
import X.C1631250sYF;
import X.C1636000sfu;
import X.C1636010sfv;
import X.C1636150sg9;
import X.C1636320sgQ;
import X.C1636520sgk;
import X.C1685300txQ;
import X.C189200o6;
import X.C19475711Hn;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C425210Glr;
import X.C571890Mbr;
import X.C786410Ut5;
import X.EnumC1641470soj;
import X.InterfaceC1624480sNK;
import X.InterfaceC1631590sYn;
import X.InterfaceC1635560sfC;
import X.InterfaceC1640430sn3;
import Y.AsS51S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractStickerFragment<ADAPTER extends AbstractC1636650sgx<Effect>> extends Fragment implements InterfaceC1631590sYn<Fragment> {
    public RecyclerView LL;
    public LinearLayoutManager LLILLJJLI;
    public InterfaceC1640430sn3<EnumC1641470soj> LLILLL;
    public C1636320sgQ LLILZ;
    public int LLILZIL;
    public RecyclerView.RecycledViewPool LLILZLL;
    public InterfaceC1624480sNK LLIZ;
    public C1631250sYF LLIZLLLIL;
    public C1630880sXe LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C11RK<Integer> LLJILJIL = new C11RK<>();

    @Override // X.InterfaceC1631590sYn
    public final Fragment LJJZZI() {
        return this;
    }

    public String SR() {
        return "abstract";
    }

    public void WR() {
    }

    public abstract void ZR();

    @Override // X.InterfaceC1625800sPS
    public final C11NZ<Integer> Cm() {
        C11RK<Integer> c11rk = this.LLJILJIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final RecyclerView LLII() {
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    public final LinearLayoutManager NR() {
        LinearLayoutManager linearLayoutManager = this.LLILLJJLI;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        return null;
    }

    public final C1631250sYF OR() {
        C1631250sYF c1631250sYF = this.LLIZLLLIL;
        if (c1631250sYF != null) {
            return c1631250sYF;
        }
        return null;
    }

    public final C1630880sXe PR() {
        C1630880sXe c1630880sXe = this.LLJ;
        if (c1630880sXe != null) {
            return c1630880sXe;
        }
        return null;
    }

    public final InterfaceC1624480sNK RR() {
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLIZ;
        if (interfaceC1624480sNK != null) {
            return interfaceC1624480sNK;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean VR() {
        return this.LLIZ != null;
    }

    public C0DXR MR() {
        C1636520sgk c1636520sgk;
        C1630880sXe c1630880sXePR = PR();
        return (c1630880sXePR == null || (c1636520sgk = c1630880sXePR.LJFF) == null || c1636520sgk.LIZ != 4) ? new C1636010sfv(0) : new C1636000sfu(0);
    }

    public final InterfaceC1635560sfC UR() {
        return PR().LJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (VR()) {
            LLII().clearOnScrollListeners();
            LLII().clearOnChildAttachStateChangeListeners();
        }
    }

    public LinearLayoutManager aS(View view) {
        int i;
        if (!VR()) {
            i = 4;
        } else {
            i = PR().LJFF.LIZ;
        }
        return new GridLayoutManager(i, 1, view.getContext(), false);
    }

    public InterfaceC1640430sn3<EnumC1641470soj> bS(View view) {
        C1636150sg9 c1636150sg9 = new C1636150sg9(view.getContext(), C2097608Jq.LJIIIIZZ(new Pair(EnumC1641470soj.LOADING, new AwS604S0100000_25(this, 309)), new Pair(EnumC1641470soj.EMPTY, new AwS604S0100000_25(this, 310)), new Pair(EnumC1641470soj.ERROR, new AwS604S0100000_25(this, 311))), EnumC1641470soj.NONE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        C786410Ut5.q7(c1636150sg9, layoutParams);
        ((ViewGroup) getView()).addView(c1636150sg9);
        return c1636150sg9;
    }

    @Override // X.InterfaceC1625800sPS
    public final void in(boolean z) {
        if (this.LLILZ == null) {
            return;
        }
        if (z) {
            LLII().smoothScrollToPosition(0);
        } else {
            LLII().scrollToPosition(0);
        }
    }

    @Override // X.InterfaceC1625800sPS
    public final void qB(Effect effect) {
        int iLLLI;
        C1636320sgQ c1636320sgQ = this.LLILZ;
        if (c1636320sgQ != null && (iLLLI = c1636320sgQ.LLLI(effect)) >= 0) {
            LLII().smoothScrollToPosition(iLLLI);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/AbstractStickerFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT8Yr+kSnfiy0XURUWbVwvh/Rt/+/rzMAe78H+V0SmEFtu3VxeHdIVF8J3rqmbEYer4w==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        this.LLJI = z;
        if (PR().LJFF.LJIIZILJ && this.LLILLJJLI != null) {
            NR().mRecycleChildrenOnDetach = !z;
        }
        if (this.LLJIJIL) {
            WR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C425210Glr c425210Glr;
        float f;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = aS(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.w6_);
        if (VR() && RR().LJJLIIIJJIZ().LJIILL) {
            if (!VR()) {
                i = 4;
            } else {
                i = PR().LJFF.LIZ;
            }
        } else if (!VR()) {
            i = 5;
        } else {
            i = PR().LJFF.LIZIZ;
        }
        recyclerView.setItemViewCacheSize(i);
        if (!PR().LJFF.LJIJ) {
            recyclerView.setRecycledViewPool(this.LLILZLL);
        }
        recyclerView.setHasFixedSize(true);
        if (this.LLJ != null) {
            PR();
        }
        recyclerView.setLayoutManager(NR());
        recyclerView.addOnScrollListener(new AsS51S0100000_25(this, 2));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.setVerticalFadingEdgeEnabled(true);
            recyclerView.setFadingEdgeLength(20);
            recyclerView.addItemDecoration(MR());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tool_sticker_scroll_");
        sbLIZ.append(SR());
        recyclerView.addOnScrollListener(new C571890Mbr(C2188811AlT.LIZIZ(sbLIZ)));
        this.LL = recyclerView;
        RecyclerView recyclerViewLLII = LLII();
        if ((recyclerViewLLII instanceof C425210Glr) && (c425210Glr = (C425210Glr) recyclerViewLLII) != null) {
            if (!VR()) {
                f = 1.0f;
            } else {
                f = PR().LJFF.LIZJ;
            }
            c425210Glr.setFlingYRatio(f);
        }
        this.LLILLL = bS(view);
        this.LLJIJIL = true;
        if (this.LLJI) {
            WR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cwk, viewGroup, false);
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

    public final void cS(int i, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, RecyclerView.RecycledViewPool recycledViewPool) {
        this.LLILZIL = i;
        this.LLIZ = c1630880sXe.LIZ;
        this.LLJ = c1630880sXe;
        this.LLIZLLLIL = c1631250sYF;
        this.LLILZLL = recycledViewPool;
    }
}
