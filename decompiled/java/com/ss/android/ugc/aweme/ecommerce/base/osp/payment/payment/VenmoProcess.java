package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment;

import X.AnonymousClass0317;
import X.C034S;
import X.C03XX;
import X.C0PEM;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1388190mED;
import X.C19EG;
import X.C1AQS;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2341109Fh;
import X.C385001ea;
import X.C919503ib;
import X.C921903iz;
import X.C922303j3;
import X.C923003jA;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.payments.IPipoExternalPaymentsService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S3200000_1;
import kotlin.jvm.internal.AwS24S0200100_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VenmoProcess {
    public static C19EG LIZIZ;
    public static Function1<? super String, Unit> LIZLLL;
    public static final VenmoProcess LIZ = new VenmoProcess();
    public static final LifecycleEventObserver LIZJ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.VenmoProcess$lifecycleEvent$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                VenmoProcess.LIZ.getClass();
                VenmoProcess.LIZ();
            }
        }
    };

    public static void LIZ() {
        C19EG c19eg = LIZIZ;
        if (c19eg != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C385001ea(c19eg, null), 2);
        }
        LIZIZ = null;
        LIZLLL = null;
    }

    public static void LIZLLL(String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("venmo deviceData gotten: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        Function1<? super String, Unit> function1 = LIZLLL;
        if (function1 != null) {
            function1.invoke(str);
        }
        LIZLLL = null;
    }

    public static void LIZIZ(Context context, boolean z, InterfaceC1631630sYr interfaceC1631630sYr) {
        LIZ();
        if (context != null) {
            if (((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJI()) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZ("requestNativeVenmoTokenAndRiskInfo installed");
                C921903iz.LIZ.getClass();
                C921903iz.LIZIZ(4, "requestNativeVenmoTokenAndRiskInfo installed", "VenmoProcess");
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    ((IPipoExternalPaymentsService) ServiceManager.get().getService(IPipoExternalPaymentsService.class)).LJ(c19egLIZIZ, null, null, new C922303j3(z, interfaceC1631630sYr), z);
                    return;
                }
                return;
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("requestNativeVenmoTokenAndRiskInfo not install");
            C921903iz.LIZ.getClass();
            C921903iz.LIZIZ(4, "requestNativeVenmoTokenAndRiskInfo not install", "VenmoProcess");
            Boolean bool = Boolean.FALSE;
            interfaceC1631630sYr.invoke(bool, null, null, bool);
        }
    }

    public static void LIZJ(Context context, String str, PaymentMethod paymentMethod, Boolean bool, InterfaceC1631620sYq interfaceC1631620sYq) {
        String str2;
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        String name;
        Lifecycle lifecycle;
        C19EG c19egLIZIZ;
        String str3;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("requestVenmoElementsAndRiskInfo");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        boolean z = false;
        if (Intrinsics.LJFF(str2, "pm_pi_ew_venmoonetime_c_d")) {
            C2341109Fh.LIZ("requestVenmoElementsAndRiskInfo onetime");
            if (Intrinsics.LJFF(C923003jA.LIZ().onetime, Boolean.TRUE)) {
                LIZIZ(context, false, new C03XX(jCurrentTimeMillis, paymentMethod, interfaceC1631620sYq));
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            Boolean bool2 = Boolean.FALSE;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis2);
            if (paymentMethod != null) {
                str3 = paymentMethod.id;
            } else {
                str3 = null;
            }
            C1018703yb.LIZLLL("rd_tiktokec_sdk_time", new AwS1S3200000_1(lValueOf, str3, "settings_not_enable", "native", bool2, 0));
            interfaceC1631620sYq.invoke(bool2, null, "");
            return;
        }
        C2341109Fh.LIZ("requestVenmoElementsAndRiskInfo get riskInfo");
        AwS24S0200100_1 awS24S0200100_1 = new AwS24S0200100_1(jCurrentTimeMillis, (long) paymentMethod, (PaymentMethod) interfaceC1631620sYq, (InterfaceC1631620sYq<? super Boolean, ? super List<PaymentElement>, ? super String, Unit>) 0);
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool3) && Intrinsics.LJFF(C923003jA.LIZ().riskInfo, bool3) && ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJI()) {
            C2341109Fh.LIZ("requestVenmoRiskInfoByConfig native");
            LIZ();
            if (context == null || !((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJI() || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                return;
            }
            ((IPipoExternalPaymentsService) ServiceManager.get().getService(IPipoExternalPaymentsService.class)).LIZIZ(c19egLIZIZ, null, new AwS615S0100000_1(awS24S0200100_1, 52));
            return;
        }
        C2341109Fh.LIZ("requestVenmoRiskInfoByConfig js");
        LIZ();
        if (context == null) {
            return;
        }
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
        LIZIZ = c19egLIZIZ2;
        if (c19egLIZIZ2 != null && (lifecycle = c19egLIZIZ2.getLifecycle()) != null) {
            lifecycle.addObserver(LIZJ);
        }
        LIZLLL = awS24S0200100_1;
        if (str == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/pipo_fe/ecom/checkout/venmo_payment");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = new HashMap();
        map.put("use_spark", "1");
        String string = C919503ib.LIZLLL(strLIZIZ, map).toString();
        if (((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LJIIJ("pm_pi_ew_venmo_c_d")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", string);
            ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LIZIZ(context, C919503ib.LIZLLL("aweme://webview", linkedHashMap).toString(), "tts_payin", false, -1, null, null, null);
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
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
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).bulletStart(context, string, null, null);
    }
}
