package com.bytedance.common.jato.jit;

import X.C2104908Ml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class JitCodeCacheExpand {
    public int testField;

    public static native void enableSmallPattern();

    public static native void keepAlive();

    public static native void testSmallPattern();

    public void print() {
    }

    public JitCodeCacheExpand testReturnValue() {
        return this;
    }

    public float testReturnValue2() {
        return 0.0f;
    }

    public int testReturnValue3() {
        return 1;
    }

    public boolean testReturnValue4() {
        return false;
    }

    public void stubMethod() {
        System.err.println("stubMethod");
    }

    static {
        C2104908Ml.LIZIZ();
    }

    public JitCodeCacheExpand() {
    }

    public int testGetter() {
        return this.testField;
    }

    public JitCodeCacheExpand(int i) {
        this.testField = i;
    }

    public static boolean checkClassIsObject(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (obj instanceof Method) {
                if (((Method) obj).getDeclaringClass() != Object.class) {
                    return false;
                }
                return true;
            }
            if (!(obj instanceof Constructor) || ((Constructor) obj).getDeclaringClass() != Object.class) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean checkReturnTypeIsFloat(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (!(obj instanceof Method)) {
                return false;
            }
            Class<?> returnType = ((Method) obj).getReturnType();
            if (returnType != Float.class) {
                if (returnType != Float.TYPE) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean checkSuperClassIsObject(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (obj instanceof Method) {
                Method method = (Method) obj;
                if (method.getDeclaringClass() == null || method.getDeclaringClass().getSuperclass() != Object.class) {
                    return false;
                }
                return true;
            }
            if (!(obj instanceof Constructor)) {
                return false;
            }
            Constructor constructor = (Constructor) obj;
            if (constructor.getDeclaringClass() == null || constructor.getDeclaringClass().getSuperclass() != Object.class) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static long getMethodDexFile(Object obj) {
        Class<?> declaringClass;
        if (obj == null) {
            return -1L;
        }
        try {
            if (obj instanceof Method) {
                declaringClass = ((Method) obj).getDeclaringClass();
            } else {
                if (obj instanceof Constructor) {
                    declaringClass = ((Constructor) obj).getDeclaringClass();
                }
                return -1L;
            }
            if (declaringClass != null) {
                Field declaredField = Class.class.getDeclaredField("dexCache");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(declaringClass);
                Field declaredField2 = obj2.getClass().getDeclaredField("dexFile");
                declaredField2.setAccessible(true);
                return declaredField2.getLong(obj2);
            }
            return -1L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    public void testSetter(int i) {
        this.testField = i;
    }
}
