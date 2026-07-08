package com.ss.android.ugc.gamora.editor.sticker.read.instantvop;

import X.C01TT;
import X.C05HM;
import X.C098200Yq;
import X.C11VO;
import X.C1685300txQ;
import X.C189200o6;
import X.C19670811xi;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.CountDownTimerC19772612Xs;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InstantCloneRecordFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzdiOjs6Ky4pO2EhHELIOSLSQoZyY9OzEtJzslJzViACEgPCQiPQw/JyspGyowJzcoDz0yLygpJzs=";
    public C11VO LLILLJJLI;
    public CountDownTimerC19772612Xs LLILLL;
    public long LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public TuxIconView LLJI;
    public C19670811xi LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public String LL = "half_screen";
    public int LLILZ = 1;

    public final void MR() {
        try {
            C01TT.LIZLLL(new AwS573S0100000_29(this, 677));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void NR() {
        try {
            C01TT.LIZLLL(new AwS573S0100000_29(this, 678));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = view.findViewById(R.id.syf);
        this.LLJI = (TuxIconView) view.findViewById(R.id.sye);
        this.LLJ = view.findViewById(R.id.syb);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.szn);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.jow);
        this.LLJIJIL = (C19670811xi) view.findViewById(R.id.s9d);
        this.LLJILJIL = view.findViewById(R.id.s9e);
        this.LLJILJILJ = view.findViewById(R.id.s9f);
        TuxTextView tuxTextView = this.LLIZ;
        View view2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(C05HM.LIZIZ.LJJJJ());
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        Context context = getContext();
        if (context == null || (string = context.getString(2131858324)) == null) {
            string = "Tap to start recording";
        }
        tuxTextView2.setText(string);
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(0, view3);
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setIconRes(R.raw.icon_mic_fill);
        View view4 = this.LLJ;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.LJLLLLLL(8, view4);
        this.LLILZ = 1;
        View view5 = this.LLIZLLLIL;
        if (view5 == null) {
            view5 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 53), view5);
        C19670811xi c19670811xi = this.LLJIJIL;
        if (c19670811xi == null) {
            c19670811xi = null;
        }
        c19670811xi.setProgressColor(-7829368);
        c19670811xi.setUseCenterIfNeed(true);
        c19670811xi.setMaxProgress(100);
        C786410Ut5.G1(c19670811xi, 8);
        View view6 = this.LLJILJIL;
        if (view6 == null) {
            view6 = null;
        }
        C786410Ut5.LJLLLLLL(8, view6);
        View view7 = this.LLJILJILJ;
        if (view7 != null) {
            view2 = view7;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        View viewTd;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("view_mode")) == null) {
            string = "half_screen";
        }
        this.LL = string;
        if (Intrinsics.LJFF(string, "full_screen")) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ep4, viewGroup, false);
        } else if (Intrinsics.LJFF(this.LL, "half_screen")) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ep5, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ep5, viewGroup, false);
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
