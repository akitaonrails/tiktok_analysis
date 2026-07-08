package com.ss.android.ugc.aweme.component.components.countrylist;

import X.C08XD;
import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1266330j3f;
import X.C1685300txQ;
import X.C1717770unn;
import X.C1722370uvD;
import X.C1722410uvH;
import X.C1722430uvJ;
import X.C1749260vca;
import X.C1775980wJg;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21630719l3;
import X.C2188811AlT;
import X.C426750GoL;
import X.C443160HZi;
import X.C786410Ut5;
import X.EnumC1726100v1E;
import X.InterfaceC1713180ugO;
import X.InterfaceC1722420uvI;
import X.InterfaceC344240DeY;
import Y.AComparatorS523S0100000_26;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import u4.q0;

/* JADX INFO: loaded from: classes27.dex */
public final class MusCountryListSheetFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWEwJyg8JiE2JjHELIOSE/Zyw8PSs4OzY/ITY4ZwImOwYjPCEnOjwAIDwnGy0pLDsVOiQrJCo9PA==";
    public C1749260vca LLIZ;
    public RecyclerView LLIZLLLIL;
    public C21630719l3 LLJ;
    public InterfaceC1722420uvI LLJILJIL;
    public boolean LLJILLL;
    public final ArrayList<C1722410uvH> LLJI = new ArrayList<>();
    public final ArrayList<C1722410uvH> LLJIJIL = new ArrayList<>();
    public final ArrayList<Pair<String, String>> LLJILJILJ = new ArrayList<>();

    public final RecyclerView SR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv5) : null;
            this.LLIZLLLIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131840172);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 133));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public final C1749260vca UR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u78) : null;
            this.LLIZ = (C1749260vca) viewFindViewById;
        }
        return (C1749260vca) viewFindViewById;
    }

    public final C21630719l3 VR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vap) : null;
            this.LLJ = (C21630719l3) viewFindViewById;
        }
        return (C21630719l3) viewFindViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC1722420uvI interfaceC1722420uvI = this.LLJILJIL;
        if (interfaceC1722420uvI != null && !this.LLJILLL) {
            interfaceC1722420uvI.onExit();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List<C1722410uvH> listLJIIJJI = C1717770unn.LIZ().LJIIJJI(requireContext());
        ArrayList arrayList = new ArrayList();
        for (C1722410uvH c1722410uvH : listLJIIJJI) {
            for (Pair<String, String> pair : this.LLJILJILJ) {
                if (TextUtils.equals(pair.getFirst(), c1722410uvH.LIZJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('+');
                    sbLIZ.append(pair.getSecond());
                    if (TextUtils.equals(C2188811AlT.LIZIZ(sbLIZ), c1722410uvH.LIZLLL)) {
                        arrayList.add(c1722410uvH);
                    }
                }
            }
        }
        ArrayList<C1722410uvH> arrayList2 = new ArrayList(arrayList);
        for (C1722410uvH c1722410uvH2 : arrayList2) {
            c1722410uvH2.LIZIZ = getResources().getString(c1722410uvH2.LIZ).substring(0, 1);
        }
        C08XD.LJJ(arrayList2, new AComparatorS523S0100000_26(this, 2));
        this.LLJIJIL.addAll(arrayList2);
        this.LLJI.addAll(arrayList2);
        UR().setSearchBarHeight(EnumC1726100v1E.LOW);
        q0.LJIJ(UR().getEditTextView(), new C1266330j3f(4));
        UR().getEditTextView().addTextChangedListener(new C1775980wJg(this, 11));
        try {
            SR().setLayoutManager(new LinearLayoutManager(requireContext()));
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1722370uvD c1722370uvD = new C1722370uvD(this.LLJI);
        SR().setAdapter(c1722370uvD);
        c1722370uvD.LLILZIL = new C1722430uvJ(this);
        ArrayList arrayList3 = new ArrayList();
        Iterator<C1722410uvH> it2 = this.LLJIJIL.iterator();
        String str = "";
        while (it2.hasNext()) {
            String str2 = it2.next().LIZIZ;
            if (!TextUtils.equals(str2, str)) {
                arrayList3.add(str2);
                str = str2;
            }
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        VR().setIndexItems((String[]) Arrays.copyOf(strArr, strArr.length));
        C21630719l3 c21630719l3VR = VR();
        c21630719l3VR.setPosition(C426750GoL.LJ(c21630719l3VR) ? 1 : 0);
        VR().setOnSelectIndexItemListener(new InterfaceC1713180ugO() { // from class: X.0uvC
            @Override // X.InterfaceC1713180ugO
            public final void LIZ(String str3) {
                int size = this.LIZ.LLJI.size();
                for (int i = 0; i < size; i++) {
                    if (TextUtils.equals(((C1722410uvH) ListProtector.get(this.LIZ.LLJI, i)).LIZIZ, str3)) {
                        if (this.LIZ.SR().getLayoutManager() != null) {
                            ((LinearLayoutManager) this.LIZ.SR().getLayoutManager()).scrollToPositionWithOffset(i, 0);
                            return;
                        }
                        return;
                    }
                }
            }
        });
        try {
            C443160HZi c443160HZi = C443160HZi.LIZ;
            C0I7D editTextView = UR().getEditTextView();
            c443160HZi.getClass();
            KeyboardUtils.LIZIZ(editTextView);
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        requireActivity().getWindow().setSoftInputMode(48);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ace, viewGroup, false);
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
