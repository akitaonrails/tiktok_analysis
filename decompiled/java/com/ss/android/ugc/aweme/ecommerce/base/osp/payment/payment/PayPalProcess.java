package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment;

import X.AnonymousClass0317;
import X.C034S;
import X.C0PEM;
import X.C1120604Zw;
import X.C1388190mED;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C19EG;
import X.C1AF0;
import X.C1AQS;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C893003eK;
import X.C919503ib;
import X.C922403j4;
import X.EnumC922503j5;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.payments.IPipoExternalPaymentsService;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS471S0200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PayPalProcess {
    public static InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> LIZIZ;
    public static PaymentInfo LIZJ;
    public static C19EG LIZLLL;
    public static final PayPalProcess LIZ = new PayPalProcess();
    public static final LifecycleEventObserver LJ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess$lifecycleEvent$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                PayPalProcess.LIZ.getClass();
                C19EG c19eg = PayPalProcess.LIZLLL;
                if (c19eg != null) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C922403j4(null), 2);
                }
                PayPalProcess.LIZLLL = null;
                PayPalProcess.LIZIZ = null;
                PayPalProcess.LIZJ = null;
            }
        }
    };

    public static void LIZ(String str, String str2) {
        PaymentMethodInfo paymentMethodInfo;
        if (str != null && str2 != null) {
            Boolean bool = Boolean.FALSE;
            PaymentElement paymentElement = new PaymentElement("eg_pi_ew_paypal_c_d_global_paypal_payin_paypal_access_token", "access_token", str, bool, bool);
            PaymentElement paymentElement2 = new PaymentElement("eg_pi_ew_paypal_c_d_global_paypal_payin_paypal_client_metadata_id", "client_metadata_id", str2, bool, bool);
            PaymentInfo paymentInfo = LIZJ;
            if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
                Collection collection = paymentMethodInfo.paymentElements;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                paymentMethodInfo.setPaymentElements(C13LP.LJLIL(C1697810uHb.LJIIJJI(paymentElement, paymentElement2), collection));
            }
            InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> interfaceC1631620sYq = LIZIZ;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(Boolean.TRUE, LIZJ, null);
            }
        } else {
            InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> interfaceC1631620sYq2 = LIZIZ;
            if (interfaceC1631620sYq2 != null) {
                interfaceC1631620sYq2.invoke(Boolean.FALSE, null, null);
            }
        }
        LIZIZ = null;
    }

    public static void LJ(Context context, String str, String str2) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        String name;
        if (str2 == null) {
            return;
        }
        if (((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LJIIJ(str2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LIZIZ(context, C919503ib.LIZLLL("aweme://webview", linkedHashMap).toString(), "tts_payin", false, -1, null, null, null);
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).bulletStart(context, str, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r13, java.lang.String r14, java.lang.String r15, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r16, boolean r17, kotlin.jvm.functions.Function1 r18, X.InterfaceC1631620sYq r19) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess.LIZIZ(android.content.Context, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean, kotlin.jvm.functions.Function1, X.0sYq):void");
    }

    public static void LIZLLL(Context context, String str, String str2, boolean z, EnumC922503j5 enumC922503j5, PaymentInfo paymentInfo, Function1 function1) {
        boolean z2;
        PaymentMethod paymentMethod;
        BindInfo bindInfo;
        String str3;
        String str4;
        Lifecycle lifecycle;
        try {
            boolean z3 = true;
            if (enumC922503j5 == EnumC922503j5.CHECKOUT_PAY_LATER) {
                z2 = true;
            } else {
                z2 = false;
            }
            IPipoService iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService != null && iPipoService.LJI() && (C893003eK.LIZ().enable || z)) {
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    ((IPipoExternalPaymentsService) ServiceManager.get().getService(IPipoExternalPaymentsService.class)).LJFF(c19egLIZIZ, str, str2, enumC922503j5, null, null, null, new AwS471S0200000_1(enumC922503j5, paymentInfo, 10));
                    return;
                }
                return;
            }
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            LIZLLL = c19egLIZIZ2;
            if (c19egLIZIZ2 != null && (lifecycle = c19egLIZIZ2.getLifecycle()) != null) {
                lifecycle.addObserver(LJ);
            }
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null && (bindInfo = paymentMethod.bindInfo) != null && (str3 = bindInfo.schema) != null) {
                HashMap map = new HashMap();
                map.put("use_spark", "1");
                if (z2) {
                    z3 = false;
                }
                map.put("shouldRequestBillingAgreement", Boolean.valueOf(z3));
                if (z2) {
                    map.put("shouldOfferPayLater", Boolean.TRUE);
                }
                map.put("amount", str);
                map.put("currency", str2);
                map.put("isBound", Boolean.FALSE);
                map.put("flow", "checkout");
                String string = C919503ib.LIZLLL(str3, map).toString();
                PayPalProcess payPalProcess = LIZ;
                PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
                if (paymentMethod2 != null) {
                    str4 = paymentMethod2.id;
                } else {
                    str4 = null;
                }
                payPalProcess.getClass();
                LJ(context, string, str4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "PayPalProcessError");
        }
    }
}
