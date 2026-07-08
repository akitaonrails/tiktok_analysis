package com.ss.android.ugc.aweme.pipo.postpayment.impl;

import X.C098200Yq;
import X.C1211110hcb;
import X.C128Y;
import X.C1308910kAL;
import X.C1389880mGw;
import X.C1706730uVz;
import X.C1707420uX6;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1721330utX;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C2188811AlT;
import X.C432090Gwx;
import X.C786410Ut5;
import X.EnumC1706740uW0;
import X.EnumC1721320utW;
import X.InterfaceC1244130iTr;
import X.InterfaceC1702850uPj;
import X.InterfaceC1712820ufo;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPostPaymentGuideFragment extends Fragment implements InterfaceC1702850uPj {
    public static final int LLILZIL = Color.rgb(22, 24, 35);
    public static final int LLILZLL = Color.rgb(143, 149, 158);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9OCo/PT8yMSHELIOSgpJzt9ISg8JWEDITUjGSAgPBUtMCI2JjELPCY3LQM+KCg+LSs4";
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public InterfaceC1712820ufo LLILLJJLI = C1707420uX6.LIZ(null);
    public C1211110hcb LLILLL;
    public C197039127h LLILZ;

    public final void SR() {
        C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
    }

    @Override // X.InterfaceC1702850uPj
    public final boolean nF() {
        return this.LL.get();
    }

    @Override // X.InterfaceC1702850uPj
    public final boolean Ch() {
        return isAdded() && getView() != null;
    }

    public final String MR() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg_action_type")) == null) {
            return null;
        }
        return string.toUpperCase(Locale.ROOT);
    }

    @Override // X.InterfaceC1702850uPj
    public final C1211110hcb xj() {
        return this.LLILLL;
    }

    public static CharSequence PR(String str) {
        SpannableString spannableStringLIZ = C432090Gwx.LIZ(str, null, null, new C1721330utX(Collections.singleton(EnumC1721320utW.BOLD), 2), 14);
        if (spannableStringLIZ != null) {
            return spannableStringLIZ;
        }
        return str;
    }

    @Override // X.InterfaceC1702850uPj
    public final void I7(String str) {
        OR(str);
    }

    public final int NR(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public final void OR(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLSPostPaymentGuide, ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int RR(EnumC1706740uW0 enumC1706740uW0) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        int i = C1706730uVz.LIZ[enumC1706740uW0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Context context = getContext();
                    if (context != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
                        return numLIZJ3.intValue();
                    }
                    return LLILZLL;
                }
                throw new C1954807lC();
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context2)) != null) {
                return numLIZJ2.intValue();
            }
            return LLILZLL;
        }
        Context context3 = getContext();
        if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context3)) != null) {
            return numLIZJ.intValue();
        }
        return LLILZIL;
    }

    @Override // X.InterfaceC1702850uPj
    public final void Sb(boolean z) {
        C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            c197039127h.setLoading(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        C1211110hcb c1211110hcb = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("arg_post_payment_context");
        } else {
            serializable = null;
        }
        if (serializable instanceof C1211110hcb) {
            c1211110hcb = (C1211110hcb) serializable;
        }
        this.LLILLL = c1211110hcb;
        InterfaceC1712820ufo interfaceC1712820ufoLIZ = C1707420uX6.LIZ(MR());
        this.LLILLJJLI = interfaceC1712820ufoLIZ;
        interfaceC1712820ufoLIZ.LIZ(this);
    }

    @Override // X.InterfaceC1702850uPj
    public final void M8(String str, boolean z) {
        Object c098200Yq;
        if (a0.LJJJIL(str)) {
            return;
        }
        try {
            C1389880mGw c1389880mGw = new C1389880mGw(this);
            c1389880mGw.LJIIIZ(str);
            if (z) {
                c1389880mGw.LJ(R.raw.icon_tick);
            }
            c1389880mGw.LJIIJ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C786410Ut5.re(Toast.makeText(requireContext(), str, 0));
        }
    }

    @Override // X.InterfaceC1702850uPj
    public final boolean Ur(String str, boolean z) {
        InterfaceC1244130iTr interfaceC1244130iTr;
        if (!this.LL.compareAndSet(false, true)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action complete: ");
        sbLIZ.append(str);
        OR(C2188811AlT.LIZIZ(sbLIZ));
        C128Y parentFragment = getParentFragment();
        if (!(parentFragment instanceof InterfaceC1244130iTr) || (interfaceC1244130iTr = (InterfaceC1244130iTr) parentFragment) == null) {
            return false;
        }
        return interfaceC1244130iTr.ip(str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.postpayment.impl.PipoPostPaymentGuideFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
