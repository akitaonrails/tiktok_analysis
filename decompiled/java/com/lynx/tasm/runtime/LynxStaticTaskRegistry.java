package com.lynx.tasm.runtime;

import X.C0WZX;
import X.C1977707ot;
import X.C2188811AlT;
import X.C2204961BRm;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LynxStaticTaskRegistry {
    public static final ConcurrentHashMap<String, C1977707ot> LIZ = new ConcurrentHashMap<>();

    public static Method LIZ(Object obj) {
        for (Method method : obj.getClass().getMethods()) {
            if ("invoke".equals(method.getName()) && method.getParameterTypes().length == 1) {
                return method;
            }
        }
        return null;
    }

    public static Object LIZIZ(Class<?> cls) throws Throwable {
        Object objA0;
        try {
            objA0 = C2204961BRm.a0(cls.getMethod("getTask", new Class[0]), null, new Object[0], new C0WZX("dzBzEg4jUdKSQVYySFyWc3rmCI0igKBz1butMLo5NnJ2cLrjj355KPdeAH0=", null));
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                objA0 = cls.getField("task").get(null);
            } catch (NoSuchFieldException e2) {
                TryCatchGuardChecker.doCheck(e2);
                objA0 = null;
            }
        }
        if (objA0 != null) {
            return objA0;
        }
        Object obj = cls.getField("Companion").get(null);
        try {
            return C2204961BRm.a0(obj.getClass().getMethod("getTask", new Class[0]), obj, new Object[0], new C0WZX("dzBzEg4jUdKSQVYySFyWc3rmCI0igKBz1butMLo5NnJ2cLrjj355KPdeAH0=", null));
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return obj.getClass().getField("task").get(obj);
        }
    }

    public static boolean LIZJ(C1977707ot c1977707ot, long j) throws Throwable {
        try {
            C2204961BRm.a0(c1977707ot.LIZIZ, c1977707ot.LIZ, new Object[]{Long.valueOf(j)}, new C0WZX("dzBzEg4jUdKSQVYySFyWc3rmCI0igKBz1butMLo5NnJ2cLrjj355KPdeAH0=", null));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to invoke native task: ");
            sbLIZ.append(e.getMessage());
            LynxLog.w("LynxStaticTaskRegistry", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static boolean executeTaskForId(String str, long j) throws Throwable {
        if (!TextUtils.isEmpty(str) && j != 0) {
            ConcurrentHashMap<String, C1977707ot> concurrentHashMap = LIZ;
            C1977707ot c1977707ot = concurrentHashMap.get(str);
            if (c1977707ot != null) {
                return LIZJ(c1977707ot, j);
            }
            try {
                Object objLIZIZ = LIZIZ(Class.forName(str));
                if (objLIZIZ == null) {
                    return false;
                }
                Method methodLIZ = LIZ(objLIZIZ);
                if (methodLIZ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No invoke method found on native task: ");
                    sbLIZ.append(objLIZIZ.getClass().getName());
                    LynxLog.w("LynxStaticTaskRegistry", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                C1977707ot c1977707ot2 = new C1977707ot(objLIZIZ, methodLIZ);
                C1977707ot c1977707otPutIfAbsent = concurrentHashMap.putIfAbsent(str, c1977707ot2);
                if (c1977707otPutIfAbsent != null) {
                    c1977707ot2 = c1977707otPutIfAbsent;
                }
                return LIZJ(c1977707ot2, j);
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to resolve static task for id ");
                sbLIZ2.append(str);
                sbLIZ2.append(": ");
                sbLIZ2.append(e2.getMessage());
                LynxLog.w("LynxStaticTaskRegistry", C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
        }
        return false;
    }
}
