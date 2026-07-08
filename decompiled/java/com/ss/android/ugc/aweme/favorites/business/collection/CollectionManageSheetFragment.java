package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C419910GdJ;
import X.C786410Ut5;
import X.InterfaceC1172050gbb;
import Y.ACListenerS153S0100000_18;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionManageSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyogHELIOSO2svJiM/LSY4ICA9ZgYjJSM2KzElJiEeKSstLioAICApPQkhKSIhLCEn";
    public InterfaceC1172050gbb LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z4 = false;
        if (arguments != null) {
            z = arguments.getBoolean("key_is_collection_public");
        } else {
            z = false;
        }
        this.LLILZIL = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("key_is_empty_collection");
        } else {
            z2 = false;
        }
        this.LLILLJJLI = z2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z3 = arguments3.getBoolean("key_is_collaborative_collection");
        } else {
            z3 = false;
        }
        this.LLILLL = z3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z4 = arguments4.getBoolean("key_is_want_to_go");
        }
        this.LLILZ = z4;
        View viewFindViewById = view.findViewById(R.id.aew);
        View viewFindViewById2 = view.findViewById(R.id.ulg);
        View viewFindViewById3 = view.findViewById(R.id.dnn);
        View viewFindViewById4 = view.findViewById(R.id.dnv);
        View viewFindViewById5 = view.findViewById(R.id.fkt);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jzd);
        TextView textView = (TextView) view.findViewById(R.id.xlg);
        if (this.LLILZIL) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_lock_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
            textView.setText(2131828945);
        }
        if (this.LLILLJJLI) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.ulh));
        }
        if (this.LLILLL) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.dnw));
        }
        if (this.LLILZ) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.dno));
            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.fks));
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 13), viewFindViewById);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 14), viewFindViewById2);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 15), viewFindViewById3);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 16), viewFindViewById4);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 17), viewFindViewById5);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c6w, viewGroup, false);
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
