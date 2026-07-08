package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C843803Rk;
import X.C897703f5;
import X.C907803gi;
import X.C910503h9;
import X.InterfaceC911103hF;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MiniOspPayResultMsg;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSwitchPollManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentSwitchPollManager {
    public static C897703f5 LIZ;
    public static Function0<Unit> LIZIZ;
    public static volatile boolean LIZJ;
    public static LifecycleOwner LIZLLL;
    public static final LifecycleEventObserver LJ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSwitchPollManager$lifecycleEvent$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                PaymentSwitchPollManager.LIZ();
            }
        }
    };

    public static void LIZ() {
        LifecycleOwner lifecycleOwner = LIZLLL;
        if (lifecycleOwner != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C910503h9(null), 2);
        }
        LIZLLL = null;
        LIZ = null;
        Function0<Unit> function0 = LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static void LIZIZ(Function0 function0) {
        NewPayInfo newPayInfoLIZ;
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        if (function0 != null) {
            LIZIZ = function0;
        }
        C897703f5 c897703f5 = LIZ;
        if (c897703f5 != null) {
            final InterfaceC911103hF interfaceC911103hF = c897703f5.LJIILJJIL;
            NewPayInfo newPayInfo = c897703f5.LIZLLL;
            if (newPayInfo != null) {
                newPayInfoLIZ = NewPayInfo.LIZ(newPayInfo, PayResult.DONE);
            } else {
                newPayInfoLIZ = null;
            }
            c897703f5.LIZLLL = newPayInfoLIZ;
            c897703f5.LJIILJJIL = new InterfaceC911103hF() { // from class: X.03hB
                @Override // X.InterfaceC911103hF
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC911103hF
                public final void LJI(C03N1 c03n1, MiniOspPayResultMsg miniOspPayResultMsg, String str) {
                }

                @Override // X.InterfaceC911103hF
                public final void LJII() {
                }

                @Override // X.InterfaceC911103hF
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC911103hF
                public final void LIZ() {
                    InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
                    if (interfaceC911103hF2 != null) {
                        interfaceC911103hF2.LIZ();
                    }
                }

                @Override // X.InterfaceC911103hF
                public final void LIZIZ() {
                    InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
                    if (interfaceC911103hF2 != null) {
                        interfaceC911103hF2.LIZIZ();
                    }
                }

                @Override // X.InterfaceC911103hF
                public final void LIZJ() {
                    InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
                    if (interfaceC911103hF2 != null) {
                        interfaceC911103hF2.LIZJ();
                    }
                }

                @Override // X.InterfaceC911103hF
                public final void LJ() {
                    InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
                    if (interfaceC911103hF2 != null) {
                        interfaceC911103hF2.LJ();
                    }
                }

                @Override // X.InterfaceC911103hF
                public final void LJIIJ() {
                    InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
                    if (interfaceC911103hF2 != null) {
                        interfaceC911103hF2.LJIIJ();
                    }
                }

                @Override // X.InterfaceC911103hF
                public final void LJIIIZ(boolean z) {
                    InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
                    if (interfaceC911103hF2 != null) {
                        interfaceC911103hF2.LJIIIZ(z);
                    }
                }

                @Override // X.InterfaceC911103hF
                public final void LJFF(PayResult payResult, String str, String str2, String str3, Boolean bool, String str4) {
                    InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
                    if (interfaceC911103hF2 != null) {
                        interfaceC911103hF2.LJFF(payResult, str, str2, str3, null, null);
                    }
                    PaymentSwitchPollManager.LIZJ = false;
                }
            };
            C907803gi.LIZ.LJIJJLI(c897703f5, "start_payment_result_polling", false);
        }
    }

    public static void LIZJ(C897703f5 c897703f5) {
        LifecycleOwner lifecycleOwnerLIZ;
        Lifecycle lifecycle;
        Context context;
        LIZ();
        LIZ = c897703f5;
        if (c897703f5 != null && (context = c897703f5.LIZ) != null) {
            lifecycleOwnerLIZ = C843803Rk.LIZ(context);
        } else {
            lifecycleOwnerLIZ = null;
        }
        LIZLLL = lifecycleOwnerLIZ;
        if (lifecycleOwnerLIZ != null && (lifecycle = lifecycleOwnerLIZ.getLifecycle()) != null) {
            lifecycle.addObserver(LJ);
        }
    }
}
