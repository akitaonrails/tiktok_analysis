package com.bytedance.tux.sheet.selectsheet;

import X.AbstractC1177930gl5;
import X.C098200Yq;
import X.C0OM1;
import X.C1391180mJ2;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C747340TTg;
import X.C747370TTj;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS23S0101000_12;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
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
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class TuxMultiSelectionSheet extends BaseSheet {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDt9OyAgLCwnHELIOSOy0pLDt9HDA0BDo/PCwfLCM2KzElJiEAICApPQ==";
    public C0OM1 LLJJIII;
    public int LLJJIJI;
    public final int LLJJIJIIJIL = -1;
    public List<C747370TTj> LLJJIJIL;
    public Function2<? super Integer, ? super C747370TTj, Unit> LLJJJ;
    public Function1<? super List<C747370TTj>, Unit> LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public Function1<? super List<C747370TTj>, Unit> LLJJJJLIIL;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        boolean z;
        Window window;
        Context context = getContext();
        View viewTd = null;
        if (context != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxMultiSelectionSheet, R.attr.yb, 0);
            int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxMultiSelectionSheet__tux_multiSelectionSheetButtonSize, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxMultiSelectionSheet__tux_multiSelectionSheetButtonVariant, 0);
            int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxMultiSelectionSheet__tux_multiSelectionSheetViceButtonVariant, 0);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxMultiSelectionSheet__tux_multiSelectionSheetButtonDefaultText);
            if (strXd == null) {
                strXd = "";
            }
            typedArrayObtainStyledAttributes.recycle();
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gz, viewGroup, false);
            RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
            float f = BaseSheet.LLJJI;
            radiusLayout.LIZ(f, f, 0.0f, 0.0f);
            C1391180mJ2 c1391180mJ2 = (C1391180mJ2) viewTd.findViewById(R.id.ulk);
            c1391180mJ2.setFixedHeightPx(this.LLJJIJIIJIL);
            c1391180mJ2.setVariant(this.LLJJIJI);
            c1391180mJ2.setDismissFunc(new AwS560S0100000_16(this, 47));
            c1391180mJ2.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0e7C
                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i4, View view) {
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
                int i4 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().LIZJ) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                recyclerView.setAdapter(new C747340TTg(list, this.LLJJJ));
                C426750GoL.LJIIL(recyclerView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76))), 23);
                HandlerHook.viewPost(recyclerView, new ARunnableS23S0101000_12(i4, linearLayoutManager, 4));
            }
            C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.uki);
            C786410Ut5.LLLLLLJ(c197039127h, 0);
            c197039127h.setButtonSize(i);
            c197039127h.setButtonVariant(i2);
            String str = this.LLJJJJ;
            if (str != null) {
                strXd = str;
            }
            c197039127h.setText(strXd);
            C786410Ut5.U8(c197039127h, new ACListenerS151S0100000_16(this, 5));
            C197039127h c197039127h2 = (C197039127h) viewTd.findViewById(R.id.vice_button);
            String str2 = this.LLJJJJJIL;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C786410Ut5.LLLLLLJ(c197039127h2, 0);
                c197039127h2.setButtonSize(i);
                c197039127h2.setButtonVariant(i3);
                c197039127h2.setText(str2);
                C786410Ut5.U8(c197039127h2, new ACListenerS151S0100000_16(this, 6));
            } else {
                C786410Ut5.LLLLLLJ(c197039127h2, 8);
            }
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
                } else {
                    c19gs = null;
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
