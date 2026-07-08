package com.bytedance.covode.number;

import X.C0VSJ;
import X.C0VSV;
import X.C1324430kZN;
import X.C1324440kZO;
import X.C741140T5k;
import X.InterfaceC1324450kZP;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Covode {
    public static C1324440kZO clazzBitmap;
    public static final int maxClsIndex;
    public static final int maxIndexSize;
    public static final int maxNativeIndex;
    public static Class nativeClass;
    public static Method nativeMethod;

    public abstract boolean report(InterfaceC1324450kZP interfaceC1324450kZP);

    public abstract boolean start(C741140T5k c741140T5k);

    public static void save() throws Throwable {
        C0VSV c0vsv;
        C1324440kZO c1324440kZO = clazzBitmap;
        c1324440kZO.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= c1324440kZO.LIZ; i++) {
            if ((c1324440kZO.LIZIZ[i] & 1) == 1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C1324430kZN impl = getImpl();
        try {
            if (nativeMethod == null || nativeClass == null) {
                Class<?> cls = Class.forName("com.bytedance.coverage.NativeCoverage");
                nativeClass = cls;
                nativeMethod = cls.getDeclaredMethod("getList", new Class[0]);
            }
            for (int i2 : (int[]) nativeMethod.invoke(nativeClass, new Object[0])) {
                arrayList.add(Integer.valueOf(Integer.valueOf(i2).intValue() + MaxIndexGetter.getMaxIndex()));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C0VSJ c0vsj = impl.LIZIZ;
        if (c0vsj == null || !c0vsj.exists()) {
            return;
        }
        int i3 = maxIndexSize;
        byte[] bArrLIZ = C1324430kZN.LIZ(impl.LIZIZ);
        if (bArrLIZ == null || bArrLIZ.length <= 0) {
            bArrLIZ = new byte[(i3 / 8) + (i3 % 8 != 0 ? 1 : 0)];
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            int i4 = iIntValue / 8;
            bArrLIZ[i4] = (byte) ((1 << ((byte) (iIntValue % 8))) | bArrLIZ[i4]);
        }
        C0VSV c0vsv2 = null;
        try {
            try {
                try {
                    c0vsv = new C0VSV(impl.LIZIZ);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                c0vsv.write(bArrLIZ);
                c0vsv.close();
            } catch (Exception e2) {
                e = e2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(e);
                c0vsv2.close();
            } catch (Throwable th3) {
                th = th3;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(th);
                try {
                    c0vsv2.close();
                    throw th;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw th;
                }
            }
        } catch (IOException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    static {
        int maxIndex = MaxIndexGetter.getMaxIndex() > 0 ? MaxIndexGetter.getMaxIndex() : 0;
        maxClsIndex = maxIndex;
        int nativeIndex = MaxIndexGetter.getNativeIndex() > 0 ? MaxIndexGetter.getNativeIndex() : 0;
        maxNativeIndex = nativeIndex;
        int i = maxIndex + nativeIndex;
        maxIndexSize = i;
        clazzBitmap = new C1324440kZO(i);
    }

    public static C1324430kZN getImpl() {
        return C1324430kZN.LJ;
    }

    public static void recordClassIndex(int i) {
        C1324440kZO c1324440kZO = clazzBitmap;
        if (c1324440kZO.LIZ > 0) {
            c1324440kZO.LIZIZ[i] = 1;
        }
    }

    public static boolean reportCollections(InterfaceC1324450kZP interfaceC1324450kZP) {
        return getImpl().report(interfaceC1324450kZP);
    }

    public static boolean startCollecting(C741140T5k c741140T5k) {
        return getImpl().start(c741140T5k);
    }
}
