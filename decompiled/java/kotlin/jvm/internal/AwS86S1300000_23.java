package kotlin.jvm.internal;

import X.C08ML;
import X.C08W6;
import X.C08W7;
import X.C098200Yq;
import X.C09AY;
import X.C1397705dX;
import X.C1491980ovc;
import X.C1507560pKk;
import X.C1507770pL5;
import X.C1507780pL6;
import X.C1523320pkA;
import X.C189200o6;
import X.C786410Ut5;
import X.InterfaceC1491850ovP;
import X.InterfaceC1491880ovS;
import android.os.Looper;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS86S1300000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS86S1300000_23 awS86S1300000_23) {
        TemplateData templateData;
        ((LynxView) awS86S1300000_23.l1).updateData((Map<String, Object>) awS86S1300000_23.l2);
        C1523320pkA c1523320pkA = C1523320pkA.LL;
        C1507770pL5 c1507770pL5 = (C1507770pL5) awS86S1300000_23.l3;
        C1507780pL6 c1507780pL6 = c1507770pL5.LJFF;
        if (c1507780pL6 != null) {
            templateData = c1507780pL6.LIZ;
        } else {
            templateData = null;
        }
        c1523320pkA.getClass();
        Map mapLJFF = C1523320pkA.LJFF(c1507770pL5, templateData);
        ConcurrentHashMap<String, C08W7> concurrentHashMap = C08W6.LIZ;
        C08W6.LIZIZ(awS86S1300000_23.s0, new AwS546S0100000_2(mapLJFF, (Map<String, C1397705dX>) 175));
        new AwS567S0100000_23((Map) awS86S1300000_23.l2, (Map<String, ? extends Object>) 93);
        C1507560pKk.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS86S1300000_23 awS86S1300000_23) {
        LynxView lynxView = (LynxView) awS86S1300000_23.l1;
        C1523320pkA c1523320pkA = C1523320pkA.LL;
        TemplateData templateData = (TemplateData) awS86S1300000_23.l2;
        c1523320pkA.getClass();
        templateData.LJIILIIL("dataFrom", "update_network");
        templateData.LJ = true;
        lynxView.updateData(templateData);
        Map mapLJFF = C1523320pkA.LJFF((C1507770pL5) awS86S1300000_23.l3, (TemplateData) awS86S1300000_23.l2);
        ConcurrentHashMap<String, C08W7> concurrentHashMap = C08W6.LIZ;
        C08W6.LIZIZ(awS86S1300000_23.s0, new AwS546S0100000_2(mapLJFF, (Map<String, C1397705dX>) 176));
        new AwS567S0100000_23((C1507770pL5) awS86S1300000_23.l3, 94);
        C1507560pKk.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS86S1300000_23 awS86S1300000_23) {
        TemplateData templateData;
        ((LynxView) awS86S1300000_23.l1).updateData((Map<String, Object>) awS86S1300000_23.l2);
        C1523320pkA c1523320pkA = C1523320pkA.LL;
        C1507770pL5 c1507770pL5 = (C1507770pL5) awS86S1300000_23.l3;
        C1507780pL6 c1507780pL6 = c1507770pL5.LJFF;
        if (c1507780pL6 != null) {
            templateData = c1507780pL6.LIZ;
        } else {
            templateData = null;
        }
        c1523320pkA.getClass();
        Map mapLJFF = C1523320pkA.LJFF(c1507770pL5, templateData);
        ConcurrentHashMap<String, C08W7> concurrentHashMap = C08W6.LIZ;
        C08W6.LIZIZ(awS86S1300000_23.s0, new AwS546S0100000_2(mapLJFF, (Map<String, C1397705dX>) 1112));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS86S1300000_23 awS86S1300000_23) {
        LynxView lynxView = (LynxView) awS86S1300000_23.l1;
        C1523320pkA c1523320pkA = C1523320pkA.LL;
        TemplateData templateData = (TemplateData) awS86S1300000_23.l2;
        c1523320pkA.getClass();
        templateData.LJIILIIL("dataFrom", "internal_load_network");
        templateData.LJ = true;
        lynxView.updateData(templateData);
        Map mapLJFF = C1523320pkA.LJFF((C1507770pL5) awS86S1300000_23.l3, (TemplateData) awS86S1300000_23.l2);
        ConcurrentHashMap<String, C08W7> concurrentHashMap = C08W6.LIZ;
        C08W6.LIZIZ(awS86S1300000_23.s0, new AwS546S0100000_2(mapLJFF, (Map<String, C1397705dX>) 1113));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS86S1300000_23 awS86S1300000_23) {
        Function0 function0;
        int iIntValue;
        System.currentTimeMillis();
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc c1491980ovc = C1491980ovc.LIZ;
            c1491980ovc.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS = C1491980ovc.LJI;
            if (interfaceC1491880ovS != null) {
                c1491980ovc.LIZJ();
                interfaceC1491880ovS.LIZ();
            }
        }
        Integer num = (Integer) awS86S1300000_23.l1;
        if (num != null && (iIntValue = num.intValue()) >= -20 && iIntValue <= 19) {
            C08ML.LIZIZ(Process.myTid(), iIntValue);
        }
        Function0 function02 = (Function0) awS86S1300000_23.l2;
        if ((function02 == null || function02.invoke() == null) && (function0 = (Function0) awS86S1300000_23.l3) != null) {
            function0.invoke();
        }
        C08ML.LIZ();
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc.LIZ.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS2 = C1491980ovc.LJI;
            if (interfaceC1491880ovS2 != null) {
                System.currentTimeMillis();
                interfaceC1491880ovS2.end();
                return Unit.LIZ;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$5(AwS86S1300000_23 awS86S1300000_23) throws InterruptedException {
        Object objInvoke;
        long jIntValue;
        System.currentTimeMillis();
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc c1491980ovc = C1491980ovc.LIZ;
            c1491980ovc.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS = C1491980ovc.LJI;
            if (interfaceC1491880ovS != null) {
                c1491980ovc.LIZJ();
                interfaceC1491880ovS.LIZ();
            }
        }
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            Integer num = (Integer) awS86S1300000_23.l1;
            if (num != null) {
                jIntValue = num.intValue();
            } else {
                jIntValue = 0;
            }
            Thread.sleep(jIntValue);
        }
        Function0 function0 = (Function0) awS86S1300000_23.l2;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            Function0 function02 = (Function0) awS86S1300000_23.l3;
            if (function02 != null) {
                objInvoke = function02.invoke();
            } else {
                objInvoke = null;
            }
        }
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc.LIZ.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS2 = C1491980ovc.LJI;
            if (interfaceC1491880ovS2 != null) {
                System.currentTimeMillis();
                interfaceC1491880ovS2.end();
            }
        }
        return objInvoke;
    }

    public static final Object invoke$6(AwS86S1300000_23 awS86S1300000_23) {
        Object c098200Yq;
        System.currentTimeMillis();
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc c1491980ovc = C1491980ovc.LIZ;
            c1491980ovc.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS = C1491980ovc.LJI;
            if (interfaceC1491880ovS != null) {
                c1491980ovc.LIZJ();
                interfaceC1491880ovS.LIZ();
            }
        }
        C1491980ovc.LIZ.getClass();
        InterfaceC1491850ovP interfaceC1491850ovP = (InterfaceC1491850ovP) ((LinkedHashMap) C1491980ovc.LJII).get(awS86S1300000_23.s0);
        if (interfaceC1491850ovP != null) {
            try {
                c098200Yq = ((Function0) awS86S1300000_23.l1).invoke();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                interfaceC1491850ovP.LIZ();
            }
        } else {
            ((Function0) awS86S1300000_23.l1).invoke();
        }
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc.LIZ.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS2 = C1491980ovc.LJI;
            if (interfaceC1491880ovS2 != null) {
                System.currentTimeMillis();
                interfaceC1491880ovS2.end();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS86S1300000_23 awS86S1300000_23) {
        Object c098200Yq;
        System.currentTimeMillis();
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc c1491980ovc = C1491980ovc.LIZ;
            c1491980ovc.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS = C1491980ovc.LJI;
            if (interfaceC1491880ovS != null) {
                c1491980ovc.LIZJ();
                interfaceC1491880ovS.LIZ();
            }
        }
        C1491980ovc.LIZ.getClass();
        InterfaceC1491850ovP interfaceC1491850ovP = (InterfaceC1491850ovP) ((LinkedHashMap) C1491980ovc.LJII).get(awS86S1300000_23.s0);
        if (interfaceC1491850ovP != null) {
            try {
                c098200Yq = ((Function0) awS86S1300000_23.l1).invoke();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                interfaceC1491850ovP.LIZ();
            }
        } else {
            ((Function0) awS86S1300000_23.l1).invoke();
        }
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc.LIZ.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS2 = C1491980ovc.LJI;
            if (interfaceC1491880ovS2 != null) {
                System.currentTimeMillis();
                interfaceC1491880ovS2.end();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS86S1300000_23 awS86S1300000_23) {
        Object objInvoke;
        int iIntValue;
        System.currentTimeMillis();
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc c1491980ovc = C1491980ovc.LIZ;
            c1491980ovc.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS = C1491980ovc.LJI;
            if (interfaceC1491880ovS != null) {
                c1491980ovc.LIZJ();
                interfaceC1491880ovS.LIZ();
            }
        }
        Integer num = (Integer) awS86S1300000_23.l1;
        if (num != null && (iIntValue = num.intValue()) >= -20 && iIntValue <= 19) {
            C08ML.LIZIZ(Process.myTid(), iIntValue);
        }
        Function0 function0 = (Function0) awS86S1300000_23.l2;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            Function0 function02 = (Function0) awS86S1300000_23.l3;
            if (function02 != null) {
                objInvoke = function02.invoke();
            } else {
                objInvoke = null;
            }
        }
        C08ML.LIZ();
        if (awS86S1300000_23.s0 != null) {
            C1491980ovc.LIZ.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS2 = C1491980ovc.LJI;
            if (interfaceC1491880ovS2 != null) {
                System.currentTimeMillis();
                interfaceC1491880ovS2.end();
            }
        }
        return objInvoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1300000_23(LynxView lynxView, TemplateData templateData, C1507770pL5 c1507770pL5, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = lynxView;
        this.l2 = templateData;
        this.l3 = c1507770pL5;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1300000_23(LynxView lynxView, LynxView lynxView2, Map<String, ? extends Object> map, C1507770pL5 c1507770pL5, String str) {
        super(0);
        this.$t = str;
        this.l1 = lynxView;
        this.l2 = lynxView2;
        this.l3 = map;
        this.s0 = c1507770pL5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1300000_23(Integer num, String str, Function0 function0, Function0 function02, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
        this.l2 = function0;
        this.l3 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1300000_23(String str, String str2, Function0<Object> function0, Function0<Object> function02, Function0<Object> function03) {
        super(0);
        this.$t = function03;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = function0;
        this.l3 = function02;
    }
}
