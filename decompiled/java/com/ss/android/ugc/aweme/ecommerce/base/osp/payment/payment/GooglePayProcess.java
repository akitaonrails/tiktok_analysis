package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment;

import X.AnonymousClass0317;
import X.C034S;
import X.C03Y9;
import X.C03YA;
import X.C03ZX;
import X.C1120604Zw;
import X.C1280004ze;
import X.C13BV;
import X.C13LQ;
import X.C15438062q;
import X.C1697810uHb;
import X.C1AF0;
import X.C1AQS;
import X.C2188811AlT;
import X.C7879035x;
import X.C834270Wo5;
import X.C834380WoG;
import X.C910403h8;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcOspPaymentPreloadOptimizationSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class GooglePayProcess {
    public static C834380WoG LIZIZ;
    public static LifecycleOwner LIZJ;
    public static List<String> LIZLLL;
    public static List<PaymentElement> LJ;
    public static final GooglePayProcess LIZ = new GooglePayProcess();
    public static final List<C03YA> LJFF = C1697810uHb.LJIIJJI(C03YA.ParameterError, C03YA.GoogleAPIError, C03YA.LaunchActivityError, C03YA.ParseError);
    public static final GooglePayProcess$lifecycleObserver$1 LJI = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            Lifecycle lifecycle;
            GooglePayProcess.LIZ.getClass();
            LifecycleOwner lifecycleOwner = GooglePayProcess.LIZJ;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(GooglePayProcess.LJI);
            }
            GooglePayProcess.LIZJ = null;
            GooglePayProcess.LIZIZ = null;
            GooglePayProcess.LIZLLL = null;
            GooglePayProcess.LJ = null;
        }
    };

    public static boolean LIZIZ() {
        C834380WoG c834380WoG;
        AtomicBoolean atomicBoolean;
        boolean z = (C7879035x.LIZLLL() || C7879035x.LJ()) && (c834380WoG = LIZIZ) != null && ((Keva) c834380WoG.LIZJ.getValue()).getBoolean("force_gp_enable", false);
        C834380WoG c834380WoG2 = LIZIZ;
        return !(c834380WoG2 == null || (atomicBoolean = c834380WoG2.LIZ) == null || !atomicBoolean.get()) || z;
    }

    public static boolean LIZLLL() {
        C834380WoG c834380WoG;
        AtomicBoolean atomicBoolean;
        boolean z = (C7879035x.LIZLLL() || C7879035x.LJ()) && (c834380WoG = LIZIZ) != null && ((Keva) c834380WoG.LIZJ.getValue()).getBoolean("force_gp_enable", false);
        C834380WoG c834380WoG2 = LIZIZ;
        return !(c834380WoG2 == null || (atomicBoolean = c834380WoG2.LIZIZ) == null || !atomicBoolean.get()) || z;
    }

    public static List LIZ(List list) {
        boolean zLIZIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                LIZ.getClass();
                if (LJIIIIZZ(paymentMethod)) {
                    zLIZIZ = LIZIZ();
                } else if (!LJI(paymentMethod)) {
                    arrayList.add(obj);
                } else if (C03ZX.LIZ()) {
                    zLIZIZ = LIZLLL();
                }
                if (zLIZIZ) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static List LIZJ(PaymentMethodsData paymentMethodsData) {
        List<PaymentMethod> list;
        List<PaymentMethod> listLJIJI;
        List<String> list2;
        List[] listArr = new List[2];
        Object obj = null;
        if (paymentMethodsData != null) {
            list = paymentMethodsData.paymentMethods;
        } else {
            list = null;
        }
        listArr[0] = list;
        if (paymentMethodsData != null) {
            listLJIJI = paymentMethodsData.LJIJI();
        } else {
            listLJIJI = null;
        }
        listArr[1] = listLJIJI;
        Iterator it2 = ((ArrayList) C15438062q.LJIJJLI(C13LQ.LJIJI(listArr))).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            LIZ.getClass();
            if (LJIIIIZZ((PaymentMethod) next)) {
                obj = next;
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        if (paymentMethod == null || (list2 = paymentMethod.supportCardList) == null) {
            list2 = C13BV.INSTANCE;
        }
        LIZLLL = list2;
        return list2;
    }

    public static boolean LJ(PaymentMethodInfo paymentMethodInfo) {
        List<PaymentElement> list;
        List<PaymentElement> list2 = LJ;
        if (list2 == null || paymentMethodInfo == null || (list = paymentMethodInfo.paymentElements) == null || list.size() != list2.size()) {
            return false;
        }
        int size = list2.size() - 1;
        if (size >= 0) {
            for (int i = 0; Intrinsics.LJFF(ListProtector.get(list, i), ListProtector.get(list2, i)); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return !list.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(Context context) {
        try {
            if (Intrinsics.LJFF(LIZJ, (LifecycleOwner) context)) {
                return;
            }
            LIZJ = (LifecycleOwner) context;
            ((LifecycleOwner) context).getLifecycle().addObserver(LJI);
            if (Intrinsics.LJFF(EcOspPaymentPreloadOptimizationSettings.LIZ().enableGPPreInit, Boolean.TRUE)) {
                if (LIZIZ == null) {
                    LIZIZ = new C834380WoG(context);
                    return;
                }
                return;
            }
            LIZIZ = new C834380WoG(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GooglePayProcess.init failed : ");
            sbLIZ.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LJI(PaymentMethod paymentMethod) {
        if (paymentMethod != null && Intrinsics.LJFF(paymentMethod.id, "pm_pi_ptw_pixgooglepay_c_d")) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(PaymentMethod paymentMethod) {
        if (paymentMethod != null && Intrinsics.LJFF(paymentMethod.id, "pm_pi_ptw_googlepay_c_d")) {
            return true;
        }
        return false;
    }

    public static PaymentInfo LJII(PaymentInfo paymentInfo, JSONArray jSONArray) {
        String str;
        String str2;
        List<PaymentElement> list;
        PaymentInfo paymentInfo2 = null;
        if (LIZJ == null || paymentInfo == null) {
            return null;
        }
        try {
            List<PaymentElement> list2 = (List) C1280004ze.LIZIZ(jSONArray.toString(), new TypeToken<List<? extends PaymentElement>>() { // from class: X.03YD
            }.getType());
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.id;
                str2 = paymentMethod.token;
            } else {
                str = null;
                str2 = null;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (PaymentElement paymentElement : list2) {
                arrayList.add(paymentElement.copy(paymentElement.element, paymentElement.paramName, paymentElement.paramValue, Boolean.FALSE, paymentElement.isEncrypted));
            }
            paymentInfo2 = null;
            PaymentInfo paymentInfoLIZ = PaymentInfo.LIZ(paymentInfo, new PaymentMethodInfo(str, str2, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, null, null, null, null, 2046);
            PaymentMethodInfo paymentMethodInfo = paymentInfoLIZ.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                list = paymentMethodInfo.paymentElements;
            } else {
                list = null;
            }
            LJ = list;
            return paymentInfoLIZ;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GooglePayProcess.mergePaymentInfo:Google Pay merge PaymentInfo error : ");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(' ');
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return paymentInfo2;
        }
    }

    public static void LJIIIZ(C03Y9 c03y9, Function1 function1) {
        C834380WoG c834380WoG;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        String name;
        if (LIZJ != null && (c834380WoG = LIZIZ) != null) {
            c834380WoG.LJ = function1;
            if (c834380WoG.LIZLLL != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = false;
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    }
                    String name2 = ILocationDependencyService.class.getName();
                    if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
                }
                c03y9.LIZIZ = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT);
                List<String> list = LIZLLL;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                c03y9.LIZLLL = list;
                C834270Wo5.LIZLLL(c03y9);
            }
        }
    }

    public static void LJIIJ(Boolean bool, List list) {
        C834380WoG c834380WoG;
        if (LIZJ == null) {
            return;
        }
        if (C03ZX.LIZ() && Intrinsics.LJFF(bool, Boolean.FALSE) && (c834380WoG = LIZIZ) != null) {
            c834380WoG.LIZ(null);
        }
        C834380WoG c834380WoG2 = LIZIZ;
        if (c834380WoG2 != null && c834380WoG2.LIZLLL != null) {
            C834270Wo5.LIZJ(list);
        }
    }

    public static void LJIIJJI(C03Y9 c03y9, C910403h8 c910403h8) {
        LJIIIZ(c03y9, new AwS580S0100000_1(c910403h8, 178));
    }
}
