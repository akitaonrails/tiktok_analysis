package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1708610uZ1;
import X.C1709570uaZ;
import X.C1710070ubN;
import X.C1710390ubt;
import X.C1710830ucb;
import X.C1710870ucf;
import X.C189200o6;
import X.C1906580ziK;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.EnumC1710440uby;
import X.EnumC1710490uc3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierIndependentCVVFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmsvKDHELIOSw7ISA+ZywwLCZiCi4gICwpOwY9LCA8LCE3LSs4ChkFDjctLiI2JjE=";
    public C1709570uaZ LL;
    public PaymentOption LLILLJJLI;
    public C1710390ubt LLILLL;
    public Function0<Unit> LLILZLL;
    public C1710070ubN LLIZ;
    public long LLIZLLLIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public String LLILZ = "order_submit";
    public String LLILZIL = "";
    public String LLJ = "return";

    static {
        new C1710870ucf();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (C1906580ziK.LJI()) {
            this.LLJ = "close";
        }
        if (this.LLJI || this.LLIZLLLIL == 0) {
            return;
        }
        C1710070ubN c1710070ubN = this.LLIZ;
        if (c1710070ubN != null) {
            C1708610uZ1.LIZIZ(c1710070ubN.LJ).LJII(System.currentTimeMillis() - this.LLIZLLLIL, "independent_cvv", this.LLJ, c1710070ubN.LIZ(this.LLJIJIL), true);
        }
        this.LLJI = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01e5 A[PHI: r7
      0x01e5: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v0 java.lang.String), (r7v13 java.lang.String), (r7v13 java.lang.String) binds: [B:39:0x00dc, B:46:0x00f9, B:48:0x00fd, B:50:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CashierIndependentCVVFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void MR(C197039127h c197039127h, PaymentOption paymentOption, String str) {
        boolean z = true;
        boolean z2 = false;
        if (str != null && !a0.LJJJIL(str)) {
            if (NR(paymentOption, str, EnumC1710440uby.SUBMIT) != null) {
                z = false;
            }
            z2 = z;
        }
        c197039127h.setEnabled(z2);
    }

    public final C1710830ucb NR(PaymentOption paymentOption, String str, EnumC1710440uby enumC1710440uby) {
        C1710390ubt c1710390ubt = this.LLILLL;
        if (c1710390ubt != null) {
            return c1710390ubt.LIZJ(EnumC1710490uc3.CVV, paymentOption, str, enumC1710440uby, null);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvj, viewGroup, false);
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
