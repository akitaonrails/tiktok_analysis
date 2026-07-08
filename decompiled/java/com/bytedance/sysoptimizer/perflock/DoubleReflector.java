package com.bytedance.sysoptimizer.perflock;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DoubleReflector {
    public static final Map<String, Field> FIELD_CACHE = new HashMap();

    public static boolean isAndroidPHigher() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0;
        }
        return true;
    }

    public static Constructor<?>[] getConstructor(Class<?> cls) {
        try {
            return (Constructor[]) Class.class.getDeclaredMethod("getDeclaredConstructors", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static Field getField(Class<?> cls, String str) {
        if (isAndroidPHigher()) {
            try {
                return getFieldInner(cls, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return getRealField(cls, str);
    }

    public static Field getFieldInner(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String getKey(Class<?> cls, String str) {
        return cls.toString() + "#" + str;
    }

    public static Field getRealField(Class<?> cls, String str) {
        Field field;
        String key = getKey(cls, str);
        Map<String, Field> map = FIELD_CACHE;
        synchronized (map) {
            try {
                field = map.get(key);
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = FIELD_CACHE;
                synchronized (map2) {
                    try {
                        map2.put(key, declaredField);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object readField(Object obj, String str) {
        try {
            return getField(obj.getClass(), str).get(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static Method getMethodInner(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
