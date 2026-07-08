package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C1508090pLb;
import X.C1748770vbn;
import X.C1756050vnX;
import X.C960603pE;
import X.C988803tm;
import X.InterfaceC1739450vMl;
import X.InterfaceC1748810vbr;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectFragment;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class ECAnimDowngradeFragment extends Fragment implements InterfaceC1739450vMl {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZyw8JSgjJ2EWCwQiICIXJzIiLj0yLCAKOy40JSAiPQ==";

    public boolean MR() {
        return this instanceof AddressSelectFragment;
    }

    @Override // X.InterfaceC1739450vMl
    public boolean Pp(Map<String, String> map) {
        return false;
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public final boolean NR() {
        return MR() && C1508090pLb.LIZIZ();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // X.InterfaceC1748820vbs
    public String getPageName() {
        return getClass().getSimpleName();
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    public final void OR(View view, Function0<Unit> function0, Function0<Unit> function02) {
        C1756050vnX.LIZJ(view, this, function0, function02);
    }
}
