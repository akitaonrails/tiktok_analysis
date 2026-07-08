package com.ss.android.ugc.aweme.share.silent;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1361400lX0;
import X.C15438062q;
import X.C1685300txQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21458918yR;
import X.C21660919pv;
import X.C21661419q0;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C786760Ute;
import X.C814420VxA;
import X.EnumC1377930lxf;
import X.InterfaceC197023126r;
import X.InterfaceC21459018yS;
import X.InterfaceC21661219py;
import X.InterfaceC21661319pz;
import X.InterfaceC21661619q2;
import X.InterfaceC344240DeY;
import Y.ACListenerS135S0200000_33;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes34.dex */
public final class ShareSelectorPanelFragment extends Fragment implements InterfaceC21661319pz, InterfaceC344240DeY, InterfaceC21661219py, InterfaceC21661619q2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZjYlHELIOSJSo9PGsfIS4hLRYpJSowPCo+GS49LSkKOy40JSAiPQ==";
    public RecyclerView LL;
    public C21660919pv LLILLJJLI;
    public TuxTextView LLILLL;
    public final List<C21661419q0> LLILZ;
    public View LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;
    public C21458918yR LLIZLLLIL;
    public InterfaceC21661319pz LLJ;
    public InterfaceC21661219py LLJI;
    public EnumC1377930lxf LLJIJIL;
    public InterfaceC21661619q2 LLJILJIL;

    public final boolean MR() {
        boolean z;
        List<C21661419q0> list = this.LLILZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<C21661419q0> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ.getSaveType() == EnumC1377930lxf.SAVE_LOCAL.getSaveType()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return ((ArrayList) this.LLILZ).size() == 1 && z;
    }

    public final void PR() {
        Object next;
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, MR() ? 8 : 0);
        }
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, MR() ? 8 : 0);
        }
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((C21661419q0) next).LIZ.getSaveType() == EnumC1377930lxf.SAVE_LOCAL.getSaveType()) {
                    break;
                }
            }
        }
        C21661419q0 c21661419q0 = (C21661419q0) next;
        if (c21661419q0 == null) {
            View view = this.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        final EnumC1377930lxf enumC1377930lxf = c21661419q0.LIZ;
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            tuxIconView.setTag(c21661419q0);
        }
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setContentDescription(enumC1377930lxf.getKey());
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if (tuxIconView3 != null) {
            tuxIconView3.setIconRes(enumC1377930lxf.getCheckedIconRes());
        }
        TuxIconView tuxIconView4 = this.LLILZLL;
        if (tuxIconView4 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = enumC1377930lxf.getCheckedIconRes();
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1q);
            tuxIconView4.setTuxIcon(c419910GdJ);
        }
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(enumC1377930lxf.getLabel());
        }
        C21458918yR c21458918yR = this.LLIZLLLIL;
        if (c21458918yR != null) {
            c21458918yR.setChecked(c21661419q0.LIZIZ);
        }
        View view3 = this.LLILZIL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS135S0200000_33(this, enumC1377930lxf, 5), view3);
        }
        C21458918yR c21458918yR2 = this.LLIZLLLIL;
        if (c21458918yR2 != null) {
            CompoundButton.OnCheckedChangeListener c786760Ute = new CompoundButton.OnCheckedChangeListener() { // from class: X.19q1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C21458918yR c21458918yR3 = this.LL.LLIZLLLIL;
                    if (c21458918yR3 != null) {
                        this.LL.dx(enumC1377930lxf, c21458918yR3);
                    }
                }
            };
            if (C1848410yCV.LIZ) {
                c786760Ute = new C786760Ute(c786760Ute);
            }
            c21458918yR2.setOnCheckedChangeListener(c786760Ute);
        }
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.15Oh
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this.LIZ, C343980De8.LIZ);
            }
        };
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        Context context = getContext();
        if (context == null || (string = context.getString(R.string.tba)) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        return c0om1;
    }

    public ShareSelectorPanelFragment(List<? extends EnumC1377930lxf> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends EnumC1377930lxf> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C21661419q0(it2.next()));
        }
        this.LLILZ = arrayList;
    }

    @Override // X.InterfaceC21661619q2
    public final List<InterfaceC21459018yS> KI(int i) {
        List<InterfaceC21459018yS> listKI;
        InterfaceC21661619q2 interfaceC21661619q2 = this.LLJILJIL;
        if (interfaceC21661619q2 == null || (listKI = interfaceC21661619q2.KI(i)) == null) {
            return new ArrayList();
        }
        return listKI;
    }

    public final void NR(EnumC1377930lxf enumC1377930lxf) {
        C21661419q0 next;
        this.LLJIJIL = enumC1377930lxf;
        Iterator<C21661419q0> it2 = this.LLILZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C21661419q0 c21661419q0 = next;
                if (enumC1377930lxf != null && c21661419q0.LIZ.getSaveType() == enumC1377930lxf.getSaveType()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C21661419q0 c21661419q02 = next;
        if (c21661419q02 != null) {
            c21661419q02.LIZIZ = true;
        }
        C21660919pv c21660919pv = this.LLILLJJLI;
        if (c21660919pv != null) {
            c21660919pv.notifyDataSetChanged();
        }
        PR();
    }

    public final void OR(boolean z) {
        List<C21661419q0> list = this.LLILZ;
        if (list != null && ((ArrayList) list).size() != 0) {
            EnumC1377930lxf enumC1377930lxf = this.LLJIJIL;
            if (enumC1377930lxf != null && enumC1377930lxf.getSaveType() == 1 && !z) {
                NR(null);
            }
            for (C21661419q0 c21661419q0 : (ArrayList) this.LLILZ) {
                if (c21661419q0.LIZ.getSaveType() == 1) {
                    if (c21661419q0.LIZIZ == z) {
                        return;
                    } else {
                        c21661419q0.LIZIZ = z;
                    }
                } else if (z) {
                    if (c21661419q0.LIZIZ) {
                        c21661419q0.LIZIZ = false;
                    } else {
                        return;
                    }
                }
                RecyclerView recyclerView = this.LL;
                if (recyclerView != null && !recyclerView.isComputingLayout()) {
                    C21660919pv c21660919pv = this.LLILLJJLI;
                    if (c21660919pv != null) {
                        c21660919pv.notifyDataSetChanged();
                    }
                } else {
                    RecyclerView recyclerView2 = this.LL;
                    if (recyclerView2 != null) {
                        HandlerHook.viewPost(recyclerView2, new ARunnableS133S0100000_33(this, 125));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC21661219py
    public final void bL(EnumC1377930lxf enumC1377930lxf, C21458918yR c21458918yR) {
        C21661419q0 next;
        List<InterfaceC21459018yS> listKI;
        Iterator<C21661419q0> it2 = this.LLILZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ.getSaveType() == enumC1377930lxf.getSaveType()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C21661419q0 c21661419q0 = next;
        if (c21661419q0 == null) {
            return;
        }
        InterfaceC21661619q2 interfaceC21661619q2 = this.LLJILJIL;
        if (interfaceC21661619q2 != null && (listKI = interfaceC21661619q2.KI(c21661419q0.LIZ.getSaveType())) != null) {
            boolean z = true;
            for (InterfaceC21459018yS interfaceC21459018yS : listKI) {
                if (interfaceC21459018yS != null && interfaceC21459018yS.LIZ(c21458918yR)) {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
        }
        c21458918yR.setChecked(!c21458918yR.isChecked());
        InterfaceC21661219py interfaceC21661219py = this.LLJI;
        if (interfaceC21661219py != null) {
            interfaceC21661219py.bL(enumC1377930lxf, c21458918yR);
        }
    }

    @Override // X.InterfaceC21661319pz
    public final void dx(EnumC1377930lxf enumC1377930lxf, C21458918yR c21458918yR) {
        C21661419q0 next;
        Iterator<C21661419q0> it2 = this.LLILZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ.getSaveType() == enumC1377930lxf.getSaveType()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C21661419q0 c21661419q0 = next;
        if (c21661419q0 == null) {
            return;
        }
        c21661419q0.LIZIZ = c21458918yR.isChecked();
        for (C21661419q0 c21661419q02 : this.LLILZ) {
            if (c21661419q02.LIZ.getSaveType() != c21661419q0.LIZ.getSaveType()) {
                c21661419q02.LIZIZ = false;
            }
        }
        if (c21458918yR.isChecked()) {
            Iterator<C21661419q0> it3 = this.LLILZ.iterator();
            while (it3.hasNext()) {
                if (it3.next().LIZ.getSaveType() != enumC1377930lxf.getSaveType()) {
                    RecyclerView recyclerView = this.LL;
                    if (recyclerView != null && !recyclerView.isComputingLayout()) {
                        C21660919pv c21660919pv = this.LLILLJJLI;
                        if (c21660919pv != null) {
                            c21660919pv.notifyDataSetChanged();
                        }
                    } else {
                        RecyclerView recyclerView2 = this.LL;
                        if (recyclerView2 != null) {
                            HandlerHook.viewPost(recyclerView2, new ARunnableS133S0100000_33(this, 72));
                        }
                    }
                }
            }
        }
        InterfaceC21661319pz interfaceC21661319pz = this.LLJ;
        if (interfaceC21661319pz != null) {
            interfaceC21661319pz.dx(enumC1377930lxf, c21458918yR);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int iLIZIZ;
        int marginStart;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onViewCreated(view, bundle);
        this.LLILZIL = view.findViewById(R.id.tzp);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.tzu);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.tzq);
        this.LLIZLLLIL = (C21458918yR) view.findViewById(R.id.tzn);
        this.LL = (RecyclerView) view.findViewById(R.id.t0q);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.wlq);
        Context contextRequireContext = requireContext();
        List<C21661419q0> list = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C21661419q0) next).LIZ.getSaveType() != EnumC1377930lxf.SAVE_LOCAL.getSaveType()) {
                arrayList.add(next);
            }
        }
        this.LLILLJJLI = new C21660919pv(arrayList, contextRequireContext, this, this);
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLILLJJLI);
        }
        RecyclerView recyclerView3 = this.LL;
        if (recyclerView3 != null) {
            if (((ArrayList) this.LLILZ).size() <= 1) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            ViewGroup.LayoutParams layoutParams2 = recyclerView3.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i2 = marginLayoutParams2.topMargin;
            } else {
                i2 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i2);
            ViewGroup.LayoutParams layoutParams3 = recyclerView3.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i = marginLayoutParams.rightMargin;
            }
            C426750GoL.LJIIIZ(recyclerView3, numValueOf, numValueOf2, Integer.valueOf(i), Integer.valueOf(iLIZIZ), false, 16);
        }
        PR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(getContext(), R.style.my)), R.layout.f8e, viewGroup, false);
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
