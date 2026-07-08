package com.bytedance.tux.sheet.selectsheet;

import X.AbstractC1177930gl5;
import X.C098200Yq;
import X.C0OM1;
import X.C1391180mJ2;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C747320TTe;
import X.C747370TTj;
import X.C786410Ut5;
import Y.ARunnableS23S0101000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class TuxSingleSelectionSheet extends BaseSheet {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDt9OyAgLCwnHELIOSOy0pLDt9HDA0GiY9LykpGio/LSY4ICA9Gy0pLDs=";
    public C0OM1 LLJJIII;
    public int LLJJIJI;
    public final int LLJJIJIIJIL = -1;
    public List<C747370TTj> LLJJIJIL;
    public Function1<? super C747370TTj, Unit> LLJJJ;
    public Function1<? super Integer, Unit> LLJJJIL;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Window window;
        int i = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gz, viewGroup, false);
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
        float f = BaseSheet.LLJJI;
        radiusLayout.LIZ(f, f, 0.0f, 0.0f);
        C1391180mJ2 c1391180mJ2 = (C1391180mJ2) viewTd.findViewById(R.id.ulk);
        c1391180mJ2.setFixedHeightPx(this.LLJJIJIIJIL);
        c1391180mJ2.setVariant(this.LLJJIJI);
        c1391180mJ2.setDismissFunc(new AwS560S0100000_16(this, 48));
        c1391180mJ2.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0e7D
            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i2, View view) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f2) {
                Dialog dialog;
                Window window2;
                if (f2 <= 0.0f && (dialog = this.LIZ.getDialog()) != null && (window2 = dialog.getWindow()) != null) {
                    window2.setDimAmount((1 + f2) * BaseSheet.LLJJ);
                }
            }
        });
        TuxNavBar tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.ul8);
        tuxNavBar.setNavBackground(0);
        C0OM1 c0om1 = this.LLJJIII;
        if (c0om1 != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(2);
            window.setDimAmount(BaseSheet.LLJJ);
        }
        List<C747370TTj> list = this.LLJJIJIL;
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.uli);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(linearLayoutManager);
            Iterator<C747370TTj> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().LIZJ) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            recyclerView.setAdapter(new C747320TTe(this, list, i, this.LLJJJIL));
            HandlerHook.viewPost(recyclerView, new ARunnableS23S0101000_12(i, linearLayoutManager, 5));
        }
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
