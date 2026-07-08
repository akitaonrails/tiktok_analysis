package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.summary;

import X.AbstractC2173821A5s;
import X.C01GW;
import X.C03Z3;
import X.C098200Yq;
import X.C0DRA;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19EK;
import X.C19GS;
import X.C21660319pp;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC21660519pr;
import X.ViewOnLayoutChangeListenerC2189561Amg;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class PaymentSummaryPanelDialog extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGHELIOSs8KDY+LSs4ZzwmJSgtOzZ9GCQ1JCo9PBY5JCIyOjwcKCE2JAElKCM8Lw==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1912));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1910));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1913));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1914));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1907));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1911));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1909));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1915));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1908));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1916));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1917));
    public final C21660319pp LLJILJIL = new AbstractC2173821A5s() { // from class: X.19pp
        @Override // X.AbstractC2173821A5s
        public final void LIZIZ() {
            this.LIZLLL.closePanel();
        }

        {
            super(true);
        }
    };
    public C03Z3 LLJILJILJ;
    public ButtonStyle LLJILLL;
    public ButtonInfo LLJJ;
    public Integer LLJJI;
    public SpannableStringBuilder LLJJIII;
    public InterfaceC21660519pr LLJJIJI;
    public AwS545S0100000_1 LLJJIJIIJIL;
    public CharSequence LLJJIJIL;

    public final C197039127h MR() {
        return (C197039127h) this.LLILZIL.getValue();
    }

    public final BottomSheetBehavior<RadiusLayout> NR() {
        return (BottomSheetBehavior) this.LLILZ.getValue();
    }

    public final void OR() {
        BottomSheetBehavior<RadiusLayout> bottomSheetBehaviorNR;
        BottomSheetBehavior<RadiusLayout> bottomSheetBehaviorNR2;
        BottomSheetBehavior<RadiusLayout> bottomSheetBehaviorNR3 = NR();
        if (((bottomSheetBehaviorNR3 == null || bottomSheetBehaviorNR3.getState() != 4) && ((bottomSheetBehaviorNR = NR()) == null || bottomSheetBehaviorNR.getState() != 5)) || (bottomSheetBehaviorNR2 = NR()) == null) {
            return;
        }
        bottomSheetBehaviorNR2.setState(3);
    }

    public final void closePanel() {
        BottomSheetBehavior<RadiusLayout> bottomSheetBehaviorNR;
        BottomSheetBehavior<RadiusLayout> bottomSheetBehaviorNR2 = NR();
        if ((bottomSheetBehaviorNR2 == null || bottomSheetBehaviorNR2.getState() != 4) && (bottomSheetBehaviorNR = NR()) != null) {
            bottomSheetBehaviorNR.setState(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2189561Amg(this, 1));
            } else {
                OR();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            C0DRA.LIZ(window2, false);
            window2.setGravity(80);
            window2.setLayout(-1, -1);
            window2.setWindowAnimations(0);
            window2.setStatusBarColor(0);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.ab1);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        C19EK c19ek = new C19EK(requireContext(), getTheme());
        c19ek.LLILLL.LIZ(c19ek, this.LLJILJIL);
        Window window = c19ek.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(c19ek);
        return c19ek;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7 A[PHI: r0
      0x01b7: PHI (r0v43 java.lang.String) = (r0v42 java.lang.String), (r0v45 java.lang.String) binds: [B:112:0x01ca, B:106:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.summary.PaymentSummaryPanelDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ar1, viewGroup, false);
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
