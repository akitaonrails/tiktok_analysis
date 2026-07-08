package com.bytedance.sysoptimizer.java;

import X.C0WZX;
import X.C2204961BRm;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectionUtils {
    public static HashMap<String, Field> sCacheFiled = new HashMap<>();
    public static HashMap<String, Method> sCacheMethod = new HashMap<>();
    public static Method sGetDeclaredField;
    public static Method sGetDeclaredMethod;
    public static boolean sIsInit;

    public static native boolean changeTargetSuperClassToSpecificClassOnDalvik(Class<?> cls, Class<?> cls2, String str);

    public static native boolean setModifiersForDalvik(Class<?> cls, int i, int i2, int i3, String str);

    static {
        sGetDeclaredField = null;
        sGetDeclaredMethod = null;
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            sGetDeclaredMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            sGetDeclaredField = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static boolean isAndroidPHigher() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0;
        }
        return true;
    }

    public static boolean isArt() {
        String property = System.getProperty("java.vm.version");
        return property != null && property.startsWith("2");
    }

    public static String getSuperClassNameInDescriptor(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            return "";
        }
        return "L" + superclass.getName().replaceAll("[.]", "/") + ";";
    }

    public static void removeFinal(Field field) {
        if (field == null) {
            return;
        }
        changeAccessFlagsAboveL(field, field.getModifiers() & (-17));
    }

    public static Field androidPHigherGetField(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void changeAccessFlagsAboveL(Field field, int i) {
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.setInt(field, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void changeAccessFlagsBelowLForArt(Field field, int i) {
        try {
            Field declaredField = Field.class.getDeclaredField("artField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(field);
            Field declaredField2 = obj.getClass().getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(obj, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void changeAccessFlagsBelowLForDalvik(Field field, int i) {
        if (!sIsInit) {
            sIsInit = SysOptimizer.loadOptimizerLibrary(null);
        }
        if (sIsInit) {
            try {
                Field declaredField = Field.class.getDeclaredField("slot");
                declaredField.setAccessible(true);
                declaredField.getInt(field);
                Field declaredField2 = Field.class.getDeclaredField("declaringClass");
                declaredField2.setAccessible(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void changeIfTableFrom(Object obj, Object obj2) {
        if (obj2 != null && obj != null) {
            try {
                Class<?> cls = obj2.getClass();
                Class<?> cls2 = obj.getClass();
                Field declaredField = Class.class.getDeclaredField("ifTable");
                declaredField.setAccessible(true);
                Object[] objArr = (Object[]) declaredField.get(cls);
                if (!Arrays.equals(objArr, (Object[]) declaredField.get(cls2))) {
                    declaredField.set(cls2, objArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void changeSuperClass(Class<?> cls, Class<?> cls2) throws IllegalAccessException, NoSuchFieldException {
        if (isAndroidPHigher()) {
            Field fieldAndroidPHigherGetField = androidPHigherGetField(Class.class, "superClass");
            if (fieldAndroidPHigherGetField != null) {
                fieldAndroidPHigherGetField.setAccessible(true);
                fieldAndroidPHigherGetField.set(cls, cls2);
                return;
            }
            return;
        }
        Field declaredField = Class.class.getDeclaredField("superClass");
        declaredField.setAccessible(true);
        declaredField.set(cls, cls2);
    }

    public static Field getClassField(Class cls, String str) {
        String str2 = cls.getName() + e3.d + str;
        if (sCacheFiled.containsKey(str2)) {
            return sCacheFiled.get(str2);
        }
        Field declaredField = null;
        while (cls != null && cls != Object.class) {
            try {
                Method method = sGetDeclaredField;
                if (method != null) {
                    declaredField = (Field) C2204961BRm.a0(method, cls, new Object[]{str}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xq2t2hYoIAnEMwe8BxNRkq+AZBT4=", null));
                } else {
                    declaredField = cls.getDeclaredField(str);
                }
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (declaredField != null) {
                sCacheFiled.put(str2, declaredField);
                return declaredField;
            }
            cls = cls.getSuperclass();
        }
        sCacheFiled.put(str2, null);
        return null;
    }

    public static Method getClassMethod(Class cls, String str) {
        return getClassMethod(cls, str, null);
    }

    public static Object getFieldObject(String str, Object obj) {
        Field classField = getClassField(obj.getClass(), str);
        if (classField != null) {
            try {
                return classField.get(obj);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static Object getStaticFieldObject(String str, Class cls) {
        Field classField = getClassField(cls, str);
        if (classField != null) {
            try {
                return classField.get(null);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static Object invokeStaticMethod(String str, String str2) {
        try {
            return invokeStaticMethod(Class.forName(str), str2);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object invokeStaticMethod(Class<?> cls, String str) {
        return invokeStaticMethod(cls, str, null, null);
    }

    public static Method getClassMethod(Class cls, String str, Class<?>... clsArr) {
        if (cls != null && str != null) {
            String str2 = cls.getName() + e3.d + str;
            if (sCacheMethod.containsKey(str2)) {
                return sCacheMethod.get(str2);
            }
            Method declaredMethod = null;
            while (cls != null && cls != Object.class) {
                try {
                    Method method = sGetDeclaredMethod;
                    if (method != null) {
                        declaredMethod = (Method) C2204961BRm.a0(method, cls, new Object[]{str, clsArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xq2t2hYoIAnEMwe8BxNRkq+AZBT4=", null));
                    } else {
                        declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    }
                    declaredMethod.setAccessible(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (declaredMethod != null) {
                    sCacheMethod.put(str2, declaredMethod);
                    return declaredMethod;
                }
                cls = cls.getSuperclass();
            }
            sCacheMethod.put(str2, null);
        }
        return null;
    }

    public static Object getFieldObject(String str, String str2, Object obj) {
        try {
            Field classField = getClassField(Class.forName(str), str2);
            if (classField != null) {
                try {
                    return classField.get(obj);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object invokeVoidMethod(Class<?> cls, String str, Object obj) {
        return invokeMethod(cls, str, null, null, obj);
    }

    public static void setFieldObject(Object obj, String str, Object obj2) {
        Field classField = getClassField(obj.getClass(), str);
        if (classField != null) {
            try {
                classField.set(obj, obj2);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static Object getFieldObject(Class cls, String str, Object obj) {
        Field classField = getClassField(cls, str);
        if (classField != null) {
            try {
                return classField.get(obj);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static void changeField2Target(Object obj, Field field, Object obj2, Object obj3) {
        if (field != null && obj != null && obj2 != null && obj3 != null) {
            try {
                Class<?> cls = obj3.getClass();
                Class<?> cls2 = obj2.getClass();
                if (!cls2.equals(cls)) {
                    changeSuperClass(cls, cls2);
                }
                field.set(obj, obj3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static Object invokeStaticMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            try {
                Method classMethod = getClassMethod(cls, str, clsArr);
                if (classMethod == null) {
                    return null;
                }
                classMethod.setAccessible(true);
                return C2204961BRm.a0(classMethod, null, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xq2t2hYoIAnEMwe8BxNRkq+AZBT4=", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public static void setFieldObject(Class cls, String str, Object obj, Object obj2) {
        Field classField = getClassField(cls, str);
        if (classField != null) {
            try {
                classField.set(obj, obj2);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static Object invokeMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object obj) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            try {
                Method classMethod = getClassMethod(cls, str, clsArr);
                if (classMethod == null) {
                    return null;
                }
                classMethod.setAccessible(true);
                return C2204961BRm.a0(classMethod, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xq2t2hYoIAnEMwe8BxNRkq+AZBT4=", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
