package com.sun.jna;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Klass {
    public static <T> T newInstance(Class<T> cls) throws Throwable {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Can't create an instance of ");
            sbLIZ.append(cls);
            sbLIZ.append(", requires a public no-arg constructor: ");
            sbLIZ.append(e);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Can't create an instance of ");
            sbLIZ2.append(cls);
            sbLIZ2.append(", requires a public no-arg constructor: ");
            sbLIZ2.append(e);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2), e);
        } catch (InstantiationException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("Can't create an instance of ");
            sbLIZ22.append(cls);
            sbLIZ22.append(", requires a public no-arg constructor: ");
            sbLIZ22.append(e);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ22), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ222 = C2188811AlT.LIZ();
            sbLIZ222.append("Can't create an instance of ");
            sbLIZ222.append(cls);
            sbLIZ222.append(", requires a public no-arg constructor: ");
            sbLIZ222.append(e);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ222), e);
        } catch (SecurityException e5) {
            e = e5;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2222 = C2188811AlT.LIZ();
            sbLIZ2222.append("Can't create an instance of ");
            sbLIZ2222.append(cls);
            sbLIZ2222.append(", requires a public no-arg constructor: ");
            sbLIZ2222.append(e);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2222), e);
        } catch (InvocationTargetException e6) {
            TryCatchGuardChecker.doCheck(e6);
            if (e6.getCause() instanceof RuntimeException) {
                throw e6.getCause();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Can't create an instance of ");
            sbLIZ3.append(cls);
            sbLIZ3.append(", requires a public no-arg constructor: ");
            sbLIZ3.append(e6);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3), e6);
        }
    }
}
