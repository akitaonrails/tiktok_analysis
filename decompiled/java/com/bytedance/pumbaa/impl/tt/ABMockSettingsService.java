package com.bytedance.pumbaa.impl.tt;

import X.C04TD;
import X.C0C40;
import X.C0C54;
import X.C0C64;
import com.bytedance.pumbaa.base2.interfaces.ISettingsService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ABMockSettingsService implements ISettingsService {
    public final boolean LIZ = true;

    public static ISettingsService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ISettingsService.class, false);
        if (objLIZ != null) {
            return (ISettingsService) objLIZ;
        }
        if (C04TD.LJJJJZI == null) {
            synchronized (ISettingsService.class) {
                if (C04TD.LJJJJZI == null) {
                    C04TD.LJJJJZI = new ABMockSettingsService();
                }
            }
        }
        return C04TD.LJJJJZI;
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.ISettingsService
    public final Object LIZJ(Class cls, String str) {
        Object objLIZJ;
        Object objLIZLLL = C0C54.LIZJ.LIZLLL(str, false);
        if (objLIZLLL != null && (objLIZLLL instanceof n)) {
            if (Intrinsics.LJFF(cls, n.class)) {
                return objLIZLLL;
            }
            try {
                objLIZJ = C0C40.LIZ.LIZJ((k) objLIZLLL, cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLIZJ = null;
            }
            if (objLIZJ == null) {
                objLIZJ = null;
            }
            if (objLIZJ != null) {
                return objLIZJ;
            }
        }
        return null;
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.ISettingsService
    public final Object LIZ(Class cls, String str, Object obj) {
        Object objLJJIIJ = C0C64.LJIILLIIL().LJJIIJ(this.LIZ, str, 0, cls, obj, 2);
        if (objLJJIIJ == null) {
            return obj;
        }
        return objLJJIIJ;
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.ISettingsService
    public final Object LIZIZ(Class cls, String str, Object obj) {
        if (Intrinsics.LJFF(cls, String.class)) {
            String strLJJ = C0C64.LJIILLIIL().LJJ(0, str, (String) obj, this.LIZ);
            if (strLJJ == null) {
                return obj;
            }
            return strLJJ;
        }
        Class cls2 = Boolean.TYPE;
        if (!Intrinsics.LJFF(cls, cls2) && !Intrinsics.LJFF(cls, cls2)) {
            Class cls3 = Long.TYPE;
            if (!Intrinsics.LJFF(cls, cls3) && !Intrinsics.LJFF(cls, cls3)) {
                Class cls4 = Integer.TYPE;
                if (!Intrinsics.LJFF(cls, cls4) && !Intrinsics.LJFF(cls, cls4)) {
                    if (!Intrinsics.LJFF(cls, Double.TYPE) && !Intrinsics.LJFF(cls, Double.TYPE)) {
                        Class cls5 = Float.TYPE;
                        if (!Intrinsics.LJFF(cls, cls5) && !Intrinsics.LJFF(cls, cls5)) {
                            Object objLJJIIJ = C0C64.LJIILLIIL().LJJIIJ(this.LIZ, str, 0, cls, obj, 0);
                            if (objLJJIIJ == null) {
                                return obj;
                            }
                            return objLJJIIJ;
                        }
                        return Float.valueOf(C0C64.LJIILLIIL().LJIILL(0, str, this.LIZ, ((Float) obj).floatValue()));
                    }
                    return Double.valueOf(C0C64.LJIILLIIL().LJIIL(((Double) obj).doubleValue(), 0, str, this.LIZ));
                }
                return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(0, ((Integer) obj).intValue(), str, this.LIZ));
            }
            return Long.valueOf(C0C64.LJIILLIIL().LJIJJLI(0, ((Long) obj).longValue(), str, this.LIZ));
        }
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(0, str, this.LIZ, ((Boolean) obj).booleanValue()));
    }
}
