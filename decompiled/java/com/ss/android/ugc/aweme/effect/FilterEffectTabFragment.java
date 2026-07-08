package com.ss.android.ugc.aweme.effect;

import X.C01GW;
import X.C0CHQ;
import X.C0EZX;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C112W;
import X.C112X;
import X.C113I;
import X.C1330280kio;
import X.C1659630tI1;
import X.C1848410yCV;
import X.C194355112b;
import X.C194356112c;
import X.C194358112e;
import X.C194359112f;
import X.C19471411Fw;
import X.C20012313Rx;
import X.C201955140j;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C21341918fZ;
import X.C2200821BBo;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C377010EqJ;
import X.C424200GkE;
import X.C425240Glu;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.AsS55S0100000_29;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import mf.a;

/* JADX INFO: loaded from: classes30.dex */
public final class FilterEffectTabFragment extends EditEffectTabFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAqLyHELIOSowPGsKICMnLTcJLyk2KzEYKC0VOiQrJCo9PA==";
    public C424200GkE LLJJ;
    public C19471411Fw LLJJI;
    public C112W LLJJIII;
    public EditEffectVideoModel LLJJIJI;
    public C194358112e LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public C194356112c LLJJJIL;
    public final C377010EqJ LLJJJJ = new C377010EqJ(new LinkedHashSet());
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(74));
    public boolean LLJJJJLIIL;

    @Override // X.InterfaceC19347710mh
    public final void zf(Effect effect, int i) {
    }

    public final C424200GkE WR() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z3b) : null;
            this.LLJJ = (C424200GkE) viewFindViewById;
        }
        return (C424200GkE) viewFindViewById;
    }

    @Override // X.InterfaceC19557211fO
    public final void XC() {
        C194358112e c194358112e = this.LLJJIJIIJIL;
        if (c194358112e == null) {
            c194358112e = null;
        }
        Iterator<Map.Entry<Integer, C194359112f>> it2 = c194358112e.LLILLJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZJ = false;
        }
    }

    public final boolean ZR() {
        if (this.LLJILLL.size() < 5) {
            return false;
        }
        TreeMap treeMap = new TreeMap();
        C2097608Jq.LJIILL(treeMap, new Pair[0]);
        for (EffectPointModel effectPointModel : this.LLJILLL) {
            ArrayList arrayList = (ArrayList) treeMap.get(Integer.valueOf(effectPointModel.getUiStartPoint()));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = (ArrayList) treeMap.get(Integer.valueOf(effectPointModel.getUiEndPoint()));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            Integer numValueOf = Integer.valueOf(effectPointModel.getUiStartPoint());
            arrayList.add(1);
            treeMap.put(numValueOf, arrayList);
            Integer numValueOf2 = Integer.valueOf(effectPointModel.getUiEndPoint());
            arrayList2.add(-1);
            treeMap.put(numValueOf2, arrayList2);
        }
        Iterator it2 = treeMap.entrySet().iterator();
        int iLIZ = 0;
        int iIntValue = 0;
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) ((Map.Entry) it2.next()).getValue()).iterator();
            while (it3.hasNext()) {
                iIntValue += ((Number) it3.next()).intValue();
                iLIZ = C1330280kio.LIZ(iIntValue, iLIZ);
            }
        }
        return iLIZ >= 5;
    }

    public FilterEffectTabFragment() {
        new C377010EqJ(new ArrayList());
        new C377010EqJ(new ArrayList());
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // X.InterfaceC19347710mh
    public final void Iz(Effect effect) {
        int iIndexOf;
        if (effect != null && (iIndexOf = NR().indexOf(effect)) >= 0) {
            C112W c112w = this.LLJJIII;
            if (c112w == null) {
                c112w = null;
            }
            c112w.LLLFZ(iIndexOf, 32);
        }
    }

    public final void VR(boolean z) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        LinearLayoutManager linearLayoutManager = this.LLILZIL;
        if (linearLayoutManager == null) {
            linearLayoutManager = null;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        LinearLayoutManager linearLayoutManager2 = this.LLILZIL;
        if (linearLayoutManager2 == null) {
            linearLayoutManager2 = null;
        }
        int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            C425240Glu c425240GluOR = OR();
            if (c425240GluOR != null) {
                viewHolderFindViewHolderForAdapterPosition = c425240GluOR.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            } else {
                viewHolderFindViewHolderForAdapterPosition = null;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof C112X) {
                ((C112X) viewHolderFindViewHolderForAdapterPosition).LLILLL.LIZJ(z);
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC19347710mh
    public final void Vs(Effect effect) {
        C0CHQ.LIZ().getApplicationService().getClass();
        int iIndexOf = NR().indexOf(effect);
        if (iIndexOf >= 0) {
            C112W c112w = this.LLJJIII;
            if (c112w == null) {
                c112w = null;
            }
            c112w.LLLFZ(iIndexOf, 16);
            C194356112c c194356112c = this.LLJJJIL;
            if (c194356112c == null) {
                c194356112c = null;
            }
            if (iIndexOf == c194356112c.LIZIZ && c194356112c.LIZ == 0 && !((Set) this.LLJJJJ.getValue()).contains(effect)) {
                C194356112c c194356112c2 = this.LLJJJIL;
                if (c194356112c2 == null) {
                    c194356112c2 = null;
                }
                Integer numValueOf = Integer.valueOf(c194356112c2.LIZ);
                C194356112c c194356112c3 = this.LLJJJIL;
                if (c194356112c3 == null) {
                    c194356112c3 = null;
                }
                UR(numValueOf, c194356112c3.LIZJ);
                C194356112c c194356112c4 = this.LLJJJIL;
                ((Set) this.LLJJJJ.getValue()).add(effect);
                C0CHQ.LIZ().getApplicationService().getClass();
            }
        }
    }

    @Override // X.InterfaceC19347710mh
    public final void g(Effect effect) {
        int iIndexOf = NR().indexOf(effect);
        if (iIndexOf >= 0) {
            C112W c112w = this.LLJJIII;
            if (c112w == null) {
                c112w = null;
            }
            c112w.LLLFZ(iIndexOf, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJ = true;
        if (getActivity() != null) {
            EditEffectVideoModel editEffectVideoModel = null;
            EditEffectVideoModel editEffectVideoModel2 = (EditEffectVideoModel) C1659630tI1.LJII(getView(), null, 6).get(EditEffectVideoModel.class);
            this.LLJJIJI = editEffectVideoModel2;
            if (editEffectVideoModel2 != null) {
                editEffectVideoModel = editEffectVideoModel2;
            }
            editEffectVideoModel.vQ2().LIZLLL().observe(this, new AObserverS231S0100000_29(this, 43));
            ((LiveData) this.LLJJJJJIL.getValue()).observe(this, new AObserverS231S0100000_29(this, 44));
            ((LiveData) this.LLJJJJJIL.getValue()).setValue(Boolean.valueOf(true ^ ZR()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/effect/FilterEffectTabFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+uZZrNyHwgyE2Q6mYc68XgF9rVL5NmXgCrALGvsw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (this.LLJJJ) {
            if (z) {
                VR(true);
            } else {
                VR(false);
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(FilterEffectTabFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void PR(C21341918fZ c21341918fZ, List<? extends EffectModel> list) {
        C112W c112w = this.LLJJIII;
        C112W c112w2 = null;
        if (c112w == null) {
            c112w = null;
        }
        c21341918fZ.LIZJ(c112w);
        this.LLIZ = list;
        C112W c112w3 = this.LLJJIII;
        if (c112w3 != null) {
            c112w2 = c112w3;
        }
        c112w2.LLLI(list);
    }

    public final void UR(Integer num, EffectModel effectModel) {
        if (num != null) {
            num.intValue();
            if (effectModel == null) {
                return;
            }
            EditEffectVideoModel editEffectVideoModel = this.LLJJIJI;
            EditEffectVideoModel editEffectVideoModel2 = null;
            if (editEffectVideoModel == null) {
                editEffectVideoModel = null;
            }
            editEffectVideoModel.xQ2().setValue(VEEffectSelectOp.selectFilter(num.intValue(), effectModel));
            EditEffectVideoModel editEffectVideoModel3 = this.LLJJIJI;
            if (editEffectVideoModel3 != null) {
                editEffectVideoModel2 = editEffectVideoModel3;
            }
            ArrayList<EffectPointModel> arrayListDt = editEffectVideoModel2.vQ2().dt();
            if (!arrayListDt.isEmpty()) {
                this.LLJILLL.add((EffectPointModel) ListProtector.get(arrayListDt, arrayListDt.size() - 1));
            } else {
                C201955140j.LJII(C20012313Rx.LIZIZ, "add effect failed");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = new C194356112c();
        this.LLJJIJIIJIL = new C194358112e(getActivity());
        OR();
        C112W c112w = new C112W(this.LLJI);
        this.LLJJIII = c112w;
        c112w.LLLI(this.LLIZ);
        C112W c112w2 = this.LLJJIII;
        View viewFindViewById = null;
        if (c112w2 == null) {
            c112w2 = null;
        }
        c112w2.LLILZ = new C194355112b(this);
        C425240Glu c425240GluOR = OR();
        C112W c112w3 = this.LLJJIII;
        if (c112w3 == null) {
            c112w3 = null;
        }
        c425240GluOR.setAdapter(c112w3);
        OR().addOnScrollListener(new AsS55S0100000_29(this, 2));
        String str = this.LLILLL;
        if (str == null) {
            str = null;
        }
        if (C113I.LJ(str)) {
            View view2 = this.LLJJI;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.z4_);
                }
                this.LLJJI = (C19471411Fw) viewFindViewById;
                view2 = viewFindViewById;
            }
            ((TextView) view2).setText(getString(2131833751));
        } else {
            String str2 = this.LLILLL;
            if (str2 == null) {
                str2 = null;
            }
            if (C113I.LIZIZ(str2)) {
                View view4 = this.LLJJI;
                if (view4 == null) {
                    View view5 = getView();
                    if (view5 != null) {
                        viewFindViewById = view5.findViewById(R.id.z4_);
                    }
                    this.LLJJI = (C19471411Fw) viewFindViewById;
                    view4 = viewFindViewById;
                }
                ((TextView) view4).setText(getString(2131837472));
            }
        }
        C0EZX.LIZIZ(WR(), 0.5f);
        C424200GkE c424200GkEWR = WR();
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 41);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c424200GkEWR);
        }
        c424200GkEWR.setOnClickListener(aVar);
        MR();
    }

    public static final FilterEffectTabFragment aS(String str, List list, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIL(bundle, "effect_list", new ArrayList(list));
        C786410Ut5.LJJJI("effect_category", str, bundle);
        bundle.putBoolean("motio_toast", z);
        bundle.putBoolean("show_goto_capcut_effect", z2);
        FilterEffectTabFragment filterEffectTabFragment = new FilterEffectTabFragment();
        filterEffectTabFragment.setArguments(bundle);
        return filterEffectTabFragment;
    }
}
