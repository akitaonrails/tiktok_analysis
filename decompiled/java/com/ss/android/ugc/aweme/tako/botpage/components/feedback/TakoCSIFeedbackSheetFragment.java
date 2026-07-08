package com.ss.android.ugc.aweme.tako.botpage.components.feedback;

import X.AnonymousClass1425;
import X.C098200Yq;
import X.C11G4;
import X.C127K;
import X.C1360520lVa;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C419910GdJ;
import X.C444910HcX;
import X.C786410Ut5;
import Y.ACListenerS116S0200000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class TakoCSIFeedbackSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9Kio4OS40LWsvJiIjJyHELIOSspJzsgZiMpLCsxKSYnZxsyIyoPGgYVLSAoKy4wIxYkLConDjctLiI2JjE=";
    public String LL = "";
    public String LLILLJJLI = "";
    public Map<String, String> LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZLLL(context.getString(2131849658));
            C444910HcX c444910HcX = new C444910HcX(c1360520lVa.LIZ);
            c444910HcX.LIZ(42);
            C127K c127k = (C127K) view.findViewById(R.id.hvt);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_pen_on_doc;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c127k.setIcon(c419910GdJ);
            c127k.setTitle(c444910HcX);
            C11G4 c11g4 = new C11G4(context, null);
            c11g4.LJIILLIIL(false);
            c11g4.LJIILL(new ACListenerS116S0200000_12(this, context, 41));
            c127k.setAccessory(c11g4);
            C127K c127k2 = (C127K) view.findViewById(R.id.yi);
            if (c127k2 != null) {
                C786410Ut5.LLZLL(c127k2, 0);
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_info_circle;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                c127k2.setIcon(c419910GdJ2);
                C444910HcX c444910HcX2 = new C444910HcX(context.getString(2131849772));
                c444910HcX2.LIZ(42);
                c127k2.setTitle(c444910HcX2);
                C11G4 c11g42 = new C11G4(context, null);
                c11g42.LJIILLIIL(false);
                c11g42.LJIILL(new ACListenerS116S0200000_12(this, context, 42));
                c127k2.setAccessory(c11g42);
            }
            AnonymousClass1425.LIZ.getClass();
            AnonymousClass1425.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fob, viewGroup, false);
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
