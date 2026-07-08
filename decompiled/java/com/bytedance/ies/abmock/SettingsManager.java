package com.bytedance.ies.abmock;

import X.C0C46;
import X.C0C59;
import X.C0C5P;
import X.C0C5U;
import X.C0C5Y;
import X.C1E77;
import X.C2188811AlT;
import X.C2503509rV;
import X.C309220CAe;
import X.InterfaceC2508609sK;
import X.InterfaceC304970BxP;
import X.InterfaceC308060C5s;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SettingsManager {
    public static volatile SettingsManager LIZLLL;
    public final String LIZ = "SettingsManager";
    public final List<InterfaceC304970BxP> LIZJ = new ArrayList();
    public final C2503509rV LIZIZ = new C2503509rV();

    public static SettingsManager LIZLLL() {
        if (LIZLLL == null) {
            synchronized (SettingsManager.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new SettingsManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public InterfaceC2508609sK getSettingsValueProvider() {
        return this.LIZIZ;
    }

    public final void LJIIIZ(InterfaceC304970BxP interfaceC304970BxP) {
        synchronized (this.LIZJ) {
            try {
                ((ArrayList) this.LIZJ).add(interfaceC304970BxP);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZ(String str, boolean z) {
        Boolean boolLIZ;
        if (C1E77.LIZIZ()) {
            C309220CAe.LIZ(Boolean.valueOf(z), Boolean.FALSE, str, true);
        }
        if (C0C5U.LIZIZ && (boolLIZ = C0C5U.LIZ(str)) != null) {
            return boolLIZ.booleanValue();
        }
        Boolean bool = (Boolean) C0C46.LIZ().LIZJ(str, Boolean.valueOf(z), null, new InterfaceC308060C5s() { // from class: X.0C5f
            @Override // X.InterfaceC308060C5s
            public final Object LIZ(Class cls, String str2, Object obj) {
                return Boolean.valueOf(C0C59.LJ().LIZIZ(str2, ((Boolean) obj).booleanValue(), false));
            }
        });
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public static double LIZIZ(String str, double d) {
        Double dLIZIZ;
        if (C1E77.LIZIZ()) {
            C309220CAe.LIZ(Double.valueOf(d), Double.valueOf(0.0d), str, true);
        }
        if (C0C5U.LIZIZ && (dLIZIZ = C0C5U.LIZIZ(str)) != null) {
            return dLIZIZ.doubleValue();
        }
        Double d2 = (Double) C0C46.LIZ().LIZJ(str, Double.valueOf(d), null, new InterfaceC308060C5s() { // from class: X.0C5a
            @Override // X.InterfaceC308060C5s
            public final Object LIZ(Class cls, String str2, Object obj) {
                C0C59 c0c59LJ = C0C59.LJ();
                double dDoubleValue = ((Double) obj).doubleValue();
                c0c59LJ.LJIILJJIL(0, false);
                return Double.valueOf(c0c59LJ.LIZJ(dDoubleValue, 0, str2, false));
            }
        });
        if (d2 == null) {
            return d;
        }
        return d2.doubleValue();
    }

    public static float LIZJ(String str, float f) {
        Float fLIZJ;
        if (C1E77.LIZIZ()) {
            C309220CAe.LIZ(Float.valueOf(f), Float.valueOf(0.0f), str, true);
        }
        if (C0C5U.LIZIZ && (fLIZJ = C0C5U.LIZJ(str)) != null) {
            return fLIZJ.floatValue();
        }
        Float f2 = (Float) C0C46.LIZ().LIZJ(str, Float.valueOf(f), null, new InterfaceC308060C5s() { // from class: X.0C5Z
            @Override // X.InterfaceC308060C5s
            public final Object LIZ(Class cls, String str2, Object obj) {
                C0C59 c0c59LJ = C0C59.LJ();
                float fFloatValue = ((Float) obj).floatValue();
                c0c59LJ.LJIILJJIL(0, false);
                return Float.valueOf(c0c59LJ.LIZLLL(0, str2, false, fFloatValue));
            }
        });
        if (f2 == null) {
            return f;
        }
        return f2.floatValue();
    }

    public static int LJ(String str, int i) {
        Integer numLIZLLL;
        if (C1E77.LIZIZ()) {
            C309220CAe.LIZ(Integer.valueOf(i), 0, str, true);
        }
        if (C0C5U.LIZIZ && (numLIZLLL = C0C5U.LIZLLL(str)) != null) {
            return numLIZLLL.intValue();
        }
        Integer num = (Integer) C0C46.LIZ().LIZJ(str, Integer.valueOf(i), null, new InterfaceC308060C5s() { // from class: X.0C5g
            @Override // X.InterfaceC308060C5s
            public final Object LIZ(Class cls, String str2, Object obj) {
                return Integer.valueOf(C0C59.LJ().LJI(str2, ((Integer) obj).intValue(), false));
            }
        });
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    public static long LJFF(String str, long j) {
        Long lLJ;
        if (C1E77.LIZIZ()) {
            C309220CAe.LIZ(Long.valueOf(j), 0L, str, true);
        }
        if (C0C5U.LIZIZ && (lLJ = C0C5U.LJ(str)) != null) {
            return lLJ.longValue();
        }
        Long l = (Long) C0C46.LIZ().LIZJ(str, Long.valueOf(j), null, new InterfaceC308060C5s() { // from class: X.0C5d
            @Override // X.InterfaceC308060C5s
            public final Object LIZ(Class cls, String str2, Object obj) {
                C0C59 c0c59LJ = C0C59.LJ();
                long jLongValue = ((Long) obj).longValue();
                c0c59LJ.LJIILJJIL(0, false);
                return Long.valueOf(c0c59LJ.LJII(0, jLongValue, str2, false));
            }
        });
        if (l == null) {
            return j;
        }
        return l.longValue();
    }

    public static String LJI(String str, String str2) {
        String strLJFF;
        if (C1E77.LIZIZ()) {
            C309220CAe.LIZ(str2, "", str, true);
        }
        if (C0C5U.LIZIZ && (strLJFF = C0C5U.LJFF(str)) != null) {
            return strLJFF;
        }
        return (String) C0C46.LIZ().LIZJ(str, str2, null, new InterfaceC308060C5s() { // from class: X.0C5h
            @Override // X.InterfaceC308060C5s
            public final Object LIZ(Class cls, String str3, Object obj) {
                C0C59 c0c59LJ = C0C59.LJ();
                c0c59LJ.LJIILJJIL(0, false);
                return c0c59LJ.LJIIIIZZ(0, str3, (String) obj, false);
            }
        });
    }

    public static Object LJII(String str, Class cls) {
        Object obj;
        if (C0C5P.LIZJ().LJFF() && C0C5P.LIZJ().LIZIZ.LIZ().enable() && (obj = C0C5P.LIZJ().LIZIZ.LIZ().get(str)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" use mock data!!");
            C0C5Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return obj;
        }
        if (cls == String[].class) {
            C0C59 c0c59LJ = C0C59.LJ();
            c0c59LJ.LJIILJJIL(0, false);
            return c0c59LJ.LJIIIZ(0, str, false);
        }
        C0C59 c0c59LJ2 = C0C59.LJ();
        c0c59LJ2.LJIILJJIL(0, false);
        c0c59LJ2.LJIILJJIL(0, false);
        return c0c59LJ2.LJIIJ(str, false, false, cls, 0);
    }

    public final <T> T LJIIIIZZ(String str, Class cls, Object obj) {
        return (T) C0C46.LIZ().LIZJ(str, obj, cls, new InterfaceC308060C5s() { // from class: X.0C5X
            @Override // X.InterfaceC308060C5s
            public final Object LIZ(Class cls2, String str2, Object obj2) {
                SettingsManager settingsManager = this.LIZ;
                settingsManager.getClass();
                Object objLJII = SettingsManager.LJII(str2, cls2);
                if (objLJII == null) {
                    settingsManager.LIZIZ.getClass();
                    if (C0C4Y.LIZJ.LJIIIZ().LJIIIZ(str2)) {
                        return obj2;
                    }
                }
                return objLJII;
            }
        });
    }
}
