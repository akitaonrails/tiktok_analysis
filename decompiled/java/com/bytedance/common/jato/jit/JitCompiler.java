package com.bytedance.common.jato.jit;

import X.C0WZX;
import X.C2104908Ml;
import X.C2204961BRm;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes4.dex */
public class JitCompiler {
    public static volatile boolean canForceSaveProfile;
    public static Field sArtMethodField;

    public static native boolean nativeCompile(int i, long j, String str);

    public static native void nativeForceSaveProfile();

    public static native boolean nativeHookProfileSaverBug();

    public static void forceSaveProfile() {
        if (canForceSaveProfile) {
            nativeForceSaveProfile();
        }
    }

    public static void hookProfileSaverBug() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return;
        }
        if (i < 31) {
            canForceSaveProfile = nativeHookProfileSaverBug();
        } else {
            canForceSaveProfile = true;
        }
    }

    public static boolean skip() {
        int i = Build.VERSION.SDK_INT;
        return i < 24 || i > 33;
    }

    static {
        if (skip() || !C2104908Ml.LIZIZ()) {
            return;
        }
        try {
            Field declaredField = Method.class.getSuperclass().getDeclaredField("artMethod");
            sArtMethodField = declaredField;
            declaredField.setAccessible(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean canForceSaveProfile() {
        return canForceSaveProfile;
    }

    public static boolean compile(Member member) {
        if (skip()) {
            return true;
        }
        Field field = sArtMethodField;
        if (field == null) {
            return false;
        }
        try {
            long jLongValue = ((Long) field.get(member)).longValue();
            if (member instanceof Method) {
                Method method = (Method) member;
                if (Modifier.isAbstract(method.getModifiers()) || Modifier.isNative(method.getModifiers())) {
                    return true;
                }
                if (Modifier.isStatic(method.getModifiers())) {
                    resolveStaticMethod(method);
                }
            }
            return nativeCompile(Build.VERSION.SDK_INT, jLongValue, member.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean resolveStaticMethod(Method method) {
        try {
            method.setAccessible(true);
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes != null && parameterTypes.length != 0) {
                C2204961BRm.a0(method, "", new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD+h5EBjvDiKgtAKgZHI7Y=", null));
                return true;
            }
            C2204961BRm.a0(method, "", new Object[]{""}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD+h5EBjvDiKgtAKgZHI7Y=", null));
            return true;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
