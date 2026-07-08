package kotlin.jvm.internal;

import X.C1501730pBL;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public class Intrinsics {
    public static int LJI(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int LJII(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void LJIIL() {
        C1501730pBL c1501730pBL = new C1501730pBL();
        LJIIJ(c1501730pBL);
        throw c1501730pBL;
    }

    public static void LJIILIIL() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static String LJIIIIZZ(String str) {
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parameter specified as non-null is null: method ");
        sbLIZ.append(className);
        sbLIZ.append(e3.d);
        sbLIZ.append(methodName);
        sbLIZ.append(", parameter ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJ(Throwable th) {
        LJIIIZ(Intrinsics.class.getName(), th);
    }

    public static boolean LIZ(float f, Float f2) {
        if (f2 != null && f == f2.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Double d, double d2) {
        if (d != null && d.doubleValue() == d2) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
            return false;
        }
        if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Float f, float f2) {
        if (f != null && f.floatValue() == f2) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
            return false;
        }
        if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void LJIIIZ(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String LJIIJJI(Object obj, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(obj);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" must not be null");
        NullPointerException nullPointerException = new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        LJIIJ(nullPointerException);
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(LJIIIIZZ(str));
        LJIIJ(nullPointerException);
        throw nullPointerException;
    }
}
