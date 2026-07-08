package com.bytedance.simba.utils;

import X.C2188811AlT;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectHelper {
    public static Constructor getNoArgsConstructor(String str) {
        try {
            return Class.forName(str).getDeclaredConstructors()[0];
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<?>[] getParamsType(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                try {
                    clsArr[i] = Class.forName((String) obj);
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            } else if (obj instanceof Class) {
                clsArr[i] = obj;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("not support params type :");
                sbLIZ.append(obj.getClass().getName());
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return clsArr;
    }

    public static boolean isDebugApk(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void loadClass(String str) {
        try {
            Class.forName(str);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static Constructor getNoArgsConstructor(Class cls) {
        return cls.getDeclaredConstructors()[0];
    }

    public static Constructor getConstructorWithArgs(Class cls, Class... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Method getMethod(Class cls, String str, Object... objArr) {
        try {
            return cls.getDeclaredMethod(str, getParamsType(objArr));
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return getMethodByPassHiddenApi(cls, str, getParamsType(objArr));
        }
    }

    public static Method getMethodByPassHiddenApi(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Method getMethod(String str, String str2, Object... objArr) {
        try {
            return getMethod(Class.forName(str), str2, objArr);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
