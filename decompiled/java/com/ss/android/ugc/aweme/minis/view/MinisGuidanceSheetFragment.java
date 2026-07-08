package com.ss.android.ugc.aweme.minis.view;

import X.C098200Yq;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2195221Avo;
import X.C2196701AyC;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1379020lzQ;
import X.InterfaceC2197251Az5;
import Y.ACListenerS168S0100000_34;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisGuidanceSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjHELIOSMlLDh9BSwiIDwUPSwoKCEwLRYkLConDjctLiI2JjE=";
    public C1294720jnS LL;
    public C197039127h LLILLJJLI;
    public C1295960jpS LLILLL;
    public TuxIconView LLILZ;
    public InterfaceC2197251Az5 LLILZIL;
    public Boolean LLILZLL;
    public final boolean LLIZ;

    public MinisGuidanceSheetFragment() {
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        boolean z = false;
        if (minisMetaResp != null) {
            Integer num = minisMetaResp.minisType;
            int iOrdinal = EnumC1379020lzQ.MINIS_TYPE_GAME.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                z = true;
            }
        }
        this.LLIZ = z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
            return;
        }
        if (!this.LLIZ) {
            C2196701AyC c2196701AyC = C2196701AyC.LIZ;
            C19EG activity = getActivity();
            boolean z = (activity == null || C960203pA.LIZIZ(activity)) ? false : true;
            c2196701AyC.getClass();
            C2196701AyC.LJIIIIZZ("", "swipe down", z);
        }
        C2196701AyC c2196701AyC2 = C2196701AyC.LIZ;
        C19EG activity2 = getActivity();
        boolean z2 = (activity2 == null || C960203pA.LIZIZ(activity2)) ? false : true;
        c2196701AyC2.getClass();
        C2196701AyC.LJ("swipe_down", z2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = (C1295960jpS) view.findViewById(R.id.noi);
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS != null) {
            View view2 = getView();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C1295960jpS c1295960jpS = this.LLILLL;
            if (c1295960jpS != null) {
                c1295960jpS.setComposition(c1294720jnS);
            }
            C1295960jpS c1295960jpS2 = this.LLILLL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.playAnimation();
            }
        }
        this.LLILLJJLI = (C197039127h) view.findViewById(R.id.j42);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.e2i);
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS168S0100000_34(this, 15));
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS168S0100000_34(this, 16));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dmy, viewGroup, false);
        if (viewTd != null) {
            C786410Ut5.LJLLLLLL(8, viewTd);
        }
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
