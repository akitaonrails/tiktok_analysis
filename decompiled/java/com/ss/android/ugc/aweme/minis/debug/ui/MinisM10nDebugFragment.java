package com.ss.android.ugc.aweme.minis.debug.ui;

import X.AnonymousClass1260;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1749140vcO;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
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

/* JADX INFO: loaded from: classes30.dex */
public abstract class MinisM10nDebugFragment extends Fragment {
    public Context LL;
    public View LLILLJJLI;
    public C1749140vcO LLILLL;
    public String LLILZ;
    public AnonymousClass1260 LLILZIL;
    public final ACListenerS163S0100000_29 LLILZLL = new ACListenerS163S0100000_29(this, 63);

    public abstract String MR();

    public abstract String NR();

    public abstract void OR();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = requireContext();
        this.LLILLJJLI = view;
        requireActivity();
        C1749140vcO c1749140vcO = (C1749140vcO) view.findViewById(R.id.ukp);
        this.LLILLL = c1749140vcO;
        if (c1749140vcO != null) {
            C786410Ut5.X8(c1749140vcO, this.LLILZLL);
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_sub_title);
        String str = "";
        if (textView != null) {
            String strMR = MR();
            if (strMR == null) {
                strMR = "";
            }
            textView.setText(strMR);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jzi);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, this.LLILZLL);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.inl);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, this.LLILZLL);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_sub_title_detail);
        if (textView2 != null) {
            String strNR = NR();
            if (strNR != null) {
                str = strNR;
            }
            textView2.setText(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f896dn3, viewGroup, false);
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
